
import java.util.Scanner;

public class HotelManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel a = new Hotel();
        a.hotelDetails();
        System.out.println("Enter the number of Single rooms available: ");
        int avaRooms = sc.nextInt();
        System.out.println("Enter the price for the single rooms: ");
        int Price = sc.nextInt();
        Room s = new Room(avaRooms, Price, "single");
        System.out.println("Enter number of suite rooms are available: ");
        int ava = sc.nextInt(); 
        System.out.println("Enter the price for the suite rooms: ");
        int price = sc.nextInt();
        Room su = new Room(ava, price, "suite");
        System.out.println("Enter number of Single rooms to book: ");
        int bookSingle = sc.nextInt();
        System.out.println("Enter number of Suite rooms to book: ");
        int bookSuite = sc.nextInt();
        s.bookRoom(bookSingle);
        su.bookRoom(bookSuite);
        System.out.println("Enter customer name: ");
        String customerName = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter contact number: ");
        String contactNumber = sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        System.out.println("Enter customer age: ");
        int customerAge = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter check-in date (YYYY-MM-DD): ");
        String checkInDate = sc.nextLine();
        System.out.println("Enter check-out date (YYYY-MM-DD): ");
        String checkOutDate = sc.nextLine();
        System.out.println("Enter number of guests: ");
        int numberOfGuests = sc.nextInt();
        System.out.println("Enter number of rooms: ");
        int numberOfRooms = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter room type (single/suite): ");
        String roomType = sc.nextLine();
        System.out.println("Enter stay duration (in days): ");
        int stayDuration = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter payment method (cash/card/upi): ");
        String paymentMethod = sc.nextLine();
        sc.nextLine();
        Reservation res = new Reservation(customerName,contactNumber,email,customerAge,checkInDate,checkOutDate,numberOfGuests,numberOfRooms,roomType,stayDuration,paymentMethod);
        res.displayDetails();
        switch (paymentMethod) {
            case "cash" -> {
                BookingMethod bm = new cash();
        bm.book(numberOfRooms, roomType);
            }
            case "card"-> {
                BookingMethod h = new  card();
        h.book(numberOfRooms, roomType);
            }
            case "upi"->{
                BookingMethod k = new UPI();
        k.book(numberOfRooms, roomType);
            }

            default -> throw new AssertionError();
        }
        
        
        

    }
}
