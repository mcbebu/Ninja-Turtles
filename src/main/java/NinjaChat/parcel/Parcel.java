package NinjaChat.parcel;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.UUID;

/**
 * Represents a Parcel to be delivered.
 */
public class Parcel {
    private String description;
    private LocalDate deliveryDate;
    private int recipientID;
    private String status;

    public Parcel(String description, String deliveryDate, int recipientID, String status) {
        this.description = description;
        try {
            this.deliveryDate = LocalDate.parse(deliveryDate.trim());
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        this.recipientID = recipientID;
        this.status = status;
    }


    public int getRecipientID() {
        return recipientID;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s", description, deliveryDate, status);
    }
}
