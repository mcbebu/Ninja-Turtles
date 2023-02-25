package NinjaChat;

import java.time.LocalDate;

/**
 * Represents a Parcel to be delivered.
 */
public class Parcel {

    enum Status { NOT_SHIPPED_OUT, AT_WAREHOUSE, OUT_FOR_DElIVERY, DELIVERED }
    private String description;
    private LocalDate deliveryDate;
    private int recipientID;
    private Status status;

    Parcel(String description, LocalDate deliveryDate, int recipientID, String status) {
        this.description = description;
        this.deliveryDate = deliveryDate;
        this.recipientID = recipientID;
        this.status = Enum.valueOf(Status.class, status.toUpperCase());
    }


}
