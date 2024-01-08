package HotelManagementSystem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

/*
//Jamie Doyle
//22:23:03/01/2024
//Project : Hotel Management System that Incorporates Reading in CSV Files*/

public class HotelFileReader{

    public static List<AbstractHotelRoom> readHotelDataFromFile(String filePath){

        List<AbstractHotelRoom> rooms = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null) {    // Loops until there is no more lines to read
                String[] data = line.split(","); // Puts Strings into substrings
                if (line.trim().startsWith("#")){
                    continue; // This skips the #, So I can comment in the csv file
                }

                int roomNumber = Integer.parseInt(data[0].trim()); // Puts data into variables
                String guestName = data[1].trim();
                int guestNumber = Integer.parseInt(data[2].trim());
                double rates = Double.parseDouble(data[3].trim());
                String additionalInfo = data[4].trim();

                AbstractHotelRoom room; // Calls Class
                if(data.length > 6 && data[6].trim().equalsIgnoreCase("Corporate Room")){

                    int numberOfChairs = Integer.parseInt(data[5].trim());
                    int numberOfBathrooms = Integer.parseInt(data[6].trim());
                    room = new CorpRoom(roomNumber, guestName, guestNumber, rates, numberOfChairs, numberOfBathrooms);
                } else {
                    String roomBed = data[5].trim();
                    String numberOfWindows = data[6].trim();

                    room = new StandardRoom(roomNumber, guestName, guestNumber,rates, roomBed, numberOfWindows);
                }
                rooms.add(room);
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }

        return rooms;
    }
}//class
