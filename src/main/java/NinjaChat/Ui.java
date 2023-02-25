package NinjaChat;

public class Ui {

    public String printGreetingMessage() {
        return "Hello, this is ninjabot! How may I help you?";
    }

    public String printReschedule(String s) {
        return String.format("Reschedule successful \n %s", s);
    }

    public String printSorry() {
        return "We are very sorry for the inconvenience caused";
    }

    public String printRescheduleFormat() {
        return "From what I understand, you would like to reschedule your parcel. " +
                "Please enter your parcel details as follow: reschedule {parcel_id} to {YYYY-MM-DD} ";
    }

    public String printClickOnTrack() {
        return "Please click on the track my parcel option to learn more about your parcel details " +
                "and progress";
    }
}
