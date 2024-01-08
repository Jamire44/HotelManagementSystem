package HotelManagementSystem;

import java.util.Random;

public class GenerateRoomCode {

    public static String generateRoomCode() {
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        return "Room: " + randomNumber;
    }
}
