package HotelManagementSystem;/*
//Jamie Doyle
//19:37:04/01/2024
//Project : Hotel Management System that Incorporates Reading in CSV Files
*/

import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

public class MainHotelManagementApp{
    public static void main(String[] args) {

        List<AbstractHotelRoom> rooms = HotelFileReader.readHotelDataFromFile("/Users/jamiedoyle499/Desktop/CiaraVS/src/HotelManagementSystem/hotel_data.csv");
        List<AbstractHotelRoom> moreRooms = HotelFileReader.readHotelDataFromFile("/Users/jamiedoyle499/Desktop/CiaraVS/src/HotelManagementSystem/hotel_data2.csv");


        for (AbstractHotelRoom room : rooms){
            System.out.println(room);
            System.out.println("-----------------------");
        }

        for (AbstractHotelRoom room : moreRooms){
            System.out.println(room);
            System.out.println("-----------------------");
        }




    }//main
}//class
