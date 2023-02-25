package NinjaChat.parcel;
import java.util.ArrayList;

public class ParcelList {
    private ArrayList<Parcel> parcelArrayList;

    public ParcelList() {
        this.parcelArrayList = new ArrayList<>();
        parcelArrayList.add(new Parcel("food", "2022-01-01", 2, "in progress"));
        parcelArrayList.add(new Parcel("zara", "2022-01-03", 2, "in progress"));

    }


    public void set(int index, Parcel parcel) throws ArrayIndexOutOfBoundsException {
        try {
            this.parcelArrayList.set(index, parcel);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public int size() {
        return parcelArrayList.size();
    }

    public Parcel get(int index) {
        return parcelArrayList.get(index);
    }
    public String printParcels() {
        String toPrintTasks = "";
        for (int i = 0; i < parcelArrayList.size(); i++) {
            toPrintTasks += String.format("%d. %s", (i + 1), parcelArrayList.get(i).toString()) + "\n";
        }
        return toPrintTasks;
    }


}
