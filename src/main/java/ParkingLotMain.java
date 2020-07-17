import java.util.HashMap;
import java.util.Map;

public class ParkingLotMain {
    public static void main(String[] args) throws NoSuchMethodException {
        Map map = new HashMap();

        map.put("create_parking_lot", ParkingLot.class.getMethod("createParkingLot", String.class));
        map.put("park", ParkingLot.class.getMethod("park", String.class, String.class));
        map.put("leave", ParkingLot.class.getMethod("leave", String.class));
        map.put("status", ParkingLot.class.getMethod("status"));
        map.put("registration_numbers_for_cars_with_colour", ParkingLot.class.getMethod("getRegistrationNumbersFromColor", String.class));
        map.put("slot_numbers_for_cars_with_colour", ParkingLot.class.getMethod("getSlotNumbersFromColor", String.class));
        map.put("slot_number_for_registration_number", ParkingLot.class.getMethod("getSlotNumberFromRegNo", String.class));
    }
}
