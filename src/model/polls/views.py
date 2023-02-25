from django.shortcuts import render
from django.http import HttpResponse
import json

from django.views.decorators.csrf import csrf_exempt

@csrf_exempt
def index(request):
    print(request)
    """ json_data = json.loads(request.body)
    try: 
        data = json_data['name']
        print(data)
    except KeyError:
        HttpResponseServerError("Bad data") """
    #request_json = request.body.decode('utf-8')
    #print(request_json["name"])
    return HttpResponse(request)