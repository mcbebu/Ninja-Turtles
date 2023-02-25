from django.shortcuts import render
from django.http import HttpResponse
import json
import spacy
from spacy.matcher import Matcher
from spacy.tokens import Span

from django.views.decorators.csrf import csrf_exempt

@csrf_exempt
def index(request):
    request_json = request.body.decode('utf-8')
    print(request_json)
    print(type(request_json))
    """"
    print(request)
    print(find_match(request)) """
    return HttpResponse(find_match(request_json))

def create_model():
    reply = "sorry"
    replypattern = [[{"LOWER":"inefficient"}], [{"LOWER":"dumb"}], [{"LOWER":"angry"}], [{"LOWER":"useless"}], [{"LOWER":"stupid"}]]
    reschedule_Action = "change"
    reschedpattern = [[{"LOWER":"reschedule"}], [{"LOWER":"home"}], [{"LOWER":"unavailable"}], [{"LOWER":"change"}],[{"LOWER":"swap"}], [{"LOWER":"available"}]]
    trackmsg = "track"
    tracepattern = [[{"LOWER":"locate"}], [{"LOWER":"where"}], [{"LOWER":"happen"}], [{"LOWER":"receive"}]]
    nlp = spacy.load("en_core_web_sm")
    matcher = Matcher(nlp.vocab)
    matcher.add(reply,replypattern)
    matcher.add(reschedule_Action, reschedpattern)
    matcher.add(trackmsg, tracepattern)
    return (matcher, nlp)

def convert_text(text, nlp):
    doc = nlp(text)
    tokens = [token.lemma_ for token in doc]
    clean_text = ' '.join(tokens)
    return clean_text

def find_match(argument):
    matcher, nlp = create_model()
    argument = convert_text(argument, nlp)
    doc = nlp(argument)
    matches = matcher(doc)
    for match_id, start, end in matches:
        string_id = nlp.vocab.strings[match_id]  # Get string representation
        span = doc[start:end]  # The matched span
        return string_id
    
