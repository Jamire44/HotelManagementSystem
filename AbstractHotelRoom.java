package HotelManagementSystem;/*
//Jamie Doyle
//17:46:18/12/2023
//Project : Hotel Management System that Incorporates Reading in CSV Files
*/

public abstract class AbstractHotelRoom implements Operations {

    protected int roomNumber;
    protected String guestName;
    protected int guestNumber;
    protected double rates;

    public AbstractHotelRoom(){

    }

    public AbstractHotelRoom(int roomNumber, String guestName, int guestNumber, double rates){
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.guestNumber = guestNumber;
        this.rates = rates;
    }


    @Override
    public String toString() {
        return "Room Number: " + roomNumber +
                "\nGuest Name: " + guestName +
                "\nGuest Number: " + guestNumber +
                "\nRates: %" + rates;
    }



    @Override
    public double getBaseRate() {
        return rates;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(int guestNumber) {
        this.guestNumber = guestNumber;
    }

    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }

    public String generateRoomCode() {
        return GenerateRoomCode.generateRoomCode();
    }
}


