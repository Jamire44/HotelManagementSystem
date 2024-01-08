package HotelManagementSystem;/*
//Jamie Doyle
//19:37:04/01/2024
//Project : Hotel Management System that Incorporates Reading in CSV Files
*/

import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

public class MainHotelManagementApp{
    public static void main(String[] args) {

        String filePath = "/Users/jamiedoyle499/Desktop/CiaraVS/src/HotelManagementSystem/hotel_data.csv";
        List<AbstractHotelRoom> rooms = HotelFileReader.readHotelDataFromFile(filePath);


        for (AbstractHotelRoom room : rooms){
            System.out.println(room);
            System.out.println("-----------------------");
        }




    }//main
}//class
