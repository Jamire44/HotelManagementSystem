package HotelManagementSystem;/*
//Jamie Doyle
//17:50:18/12/2023
//Project : Hotel Management System that Incorporates Reading in CSV Files
*/

public class CorpRoom extends AbstractHotelRoom {

    int numberOfChairs;
    int numberOfBathrooms;

    public CorpRoom(){
        super();
    }

    public CorpRoom(int roomNumber, String guestName, int guestNumber, double rates, int numberOfChairs, int numberOfBathrooms){
        super(roomNumber, guestName, guestNumber, rates);
        this.numberOfChairs = numberOfChairs;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
                "\nNumber of chairs: " + getNumberOfChairs() +
                "\nNumber of bathrooms: " + getNumberOfBathrooms() +
                "\n" + generateRoomCode() ;
    }

    @Override
    public double getBaseRate() {
        return getRates();
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }
}//class
