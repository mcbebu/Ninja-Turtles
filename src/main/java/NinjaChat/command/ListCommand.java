package NinjaChat.command;

import NinjaChat.Ui;
import NinjaChat.parcel.ParcelList;

public class ListCommand extends Command {

    public ListCommand(Ui ui, ParcelList parcelList) {
        super(ui, parcelList);
    }

    public String executeCommand(String userInput) {
        return parcelList.printParcels();
    }
}
