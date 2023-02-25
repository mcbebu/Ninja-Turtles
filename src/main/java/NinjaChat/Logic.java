package NinjaChat;

import NinjaChat.command.Command;
import NinjaChat.command.ListCommand;
import NinjaChat.command.RescheduleCommand;
import NinjaChat.parcel.ParcelList;

public class Logic {
    enum Types {RESCHEDULE, LIST}

    private ParcelList parcelList;
    public Logic(ParcelList ps) {
        this.parcelList = ps;
    }
    String parseLogic(String inputString) {
        try {
            String[] input = inputString.split(" ");
            switch (Enum.valueOf(Types.class, input[0].toUpperCase())) {
            case RESCHEDULE:
                Command newCommand = new RescheduleCommand(new Ui(), parcelList);
                return newCommand.executeCommand(inputString);
            case LIST:
                newCommand = new ListCommand(new Ui(), parcelList);
                return newCommand.executeCommand(inputString);
            default:
                return "Please click the button below to speak to our customer service manager";
            }
        } catch (IllegalArgumentException e) {
            return e.toString();
        }

    }
}


