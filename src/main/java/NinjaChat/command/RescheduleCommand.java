
package NinjaChat.command;

import NinjaChat.Ui;
import NinjaChat.parcel.Parcel;
import NinjaChat.parcel.ParcelList;

public class RescheduleCommand extends Command {

    public RescheduleCommand(Ui ui, ParcelList parcelList) {
        super(ui, parcelList);
    }

    public String executeCommand(String inputString) {
        String[] input = inputString.split(" ");
        int taskNum = Integer.parseInt(input[1]);
        String date = input[3];
        Parcel currParcel = parcelList.get(taskNum - 1);
        Parcel newParcel = new Parcel(currParcel.getDescription(), date, currParcel.getRecipientID(),
                currParcel.getStatus());
        parcelList.set(taskNum - 1, newParcel);
        return ui.printReschedule(newParcel.toString());

    }
}
