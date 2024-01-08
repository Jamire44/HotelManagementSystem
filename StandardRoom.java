package HotelManagementSystem;/*
//Jamie Doyle
//17:50:18/12/2023
//Project : Hotel Management System that Incorporates Reading in CSV Files*/

class StandardRoom extends AbstractHotelRoom{

    String roomBed;
    String roomWindow;

    public StandardRoom(){
        super();
    }

    public StandardRoom(int roomNumber, String guestName, int guestNumber, double rates, String roomBed, String roomWindow){
        super(roomNumber, guestName, guestNumber, rates);
        this.roomBed = roomBed;
        this.roomWindow = roomWindow;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBed: " + getRoomBed() +
                "\nWindow: " + getRoomWindow() +
                "\n" + generateRoomCode() ;
    }

    @Override
    public double getBaseRate() {
        return getRates();
    }

    public String getRoomBed() {
        return roomBed;
    }

    public void setRoomBed(String roomBed) {
        this.roomBed = roomBed;
    }

    public String getRoomWindow() {
        return roomWindow;
    }

    public void setRoomWindow(String roomWindow) {
        this.roomWindow = roomWindow;
    }

}//class
