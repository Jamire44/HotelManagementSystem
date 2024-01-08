package HotelManagementSystem;
import java.util.Random;

public interface Operations {

    double getBaseRate();
    String generateRoomCode();


    public class StringsConcat {

        public String manipulatingStrings(String string1, String string2) {
            return string1.concat(string2);
        }
    }
}
