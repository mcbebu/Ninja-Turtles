package NinjaChat.command;

import NinjaChat.Ui;
import NinjaChat.parcel.ParcelList;

public abstract class Command {
    protected Ui ui;
    protected ParcelList parcelList;

    /**
     * Constructor for command
     * @param ui processes output to user based on input
     * @param parcelList contains all present tasks
     */
    public Command(Ui ui, ParcelList parcelList) {
        this.ui = ui;
        this.parcelList = parcelList;
    }

    public abstract String executeCommand(String userInput);
}
