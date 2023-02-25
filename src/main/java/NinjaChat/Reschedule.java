package NinjaChat;

import java.time.LocalDate;

/**
 * Represents intent to reschedule a parcel delivery
 */
public class Reschedule {
    private Parcel parcel;
    private LocalDate dateToRescehdule;

    Reschedule(Parcel parcel, LocalDate date) {
        this.parcel = parcel;
        this.dateToRescehdule = date;
    }

    /**
     * Executes rescheduling when method is invoked
     */
    public void execute() {
        parcel.reschedule(dateToRescehdule);
    }
}
