package NinjaChat;


import java.io.IOException;
import java.util.Iterator;

import NinjaChat.parcel.ParcelList;
import org.json.*;
public class NinjaBot {

    private ParcelList pc = new ParcelList();
    private Ui ui = new Ui();
    String getResponse(String input) throws IOException, InterruptedException {
        try {
            HttpClientNinja hcn = new HttpClientNinja();
            String output = hcn.callApi(input);
            if (output.equals("sorry")) {
                return ui.printSorry();
            } else if (output.equals("change")) {
                return ui.printRescheduleFormat();
            } else if (output.equals("track")) {
                return ui.printClickOnTrack();
            } else {
                Logic logic = new Logic(pc);
                return logic.parseLogic(input);
            }
        } catch (IOException e){
            return e.toString();
        } catch (InterruptedException er){
            return er.toString();
        }

    }
}

