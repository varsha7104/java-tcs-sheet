 import java.util.*;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public void sethotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int gethotelId() {
        return hotelId;
    }

    public void sethotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String gethotelName() {
        return hotelName;
    }

    public void setdateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public String getdateOfBooking() {
        return dateOfBooking;
    }

    public void setnoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public int getnoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public void setwifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public String getwifiFacility() {
        return wifiFacility;
    }

    public void settotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public double gettotalBill() {
        return totalBill;
    }
}

class MyClass {

    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotel, String month) {

        int sum = 0;

        for (Hotel h : hotel) {

            String date = h.getdateOfBooking();

            String mon = date.split("-")[1];

            if (mon.equalsIgnoreCase(month)) {
                sum += h.getnoOfRoomsBooked();
            }
        }

        return sum;
    }

    public static Hotel searchHotelByWifiOption(Hotel[] hotel, String wifi) {

        Hotel ans = null;
        double maxBill = -1;

        for (Hotel h : hotel) {

            if (h.getwifiFacility().equalsIgnoreCase(wifi)) {

                if (h.gettotalBill() > maxBill) {
                    maxBill = h.gettotalBill();
                    ans = h;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel[] a = new Hotel[4];

        for (int i = 0; i < 4; i++) {

            a[i] = new Hotel();

            a[i].sethotelId(sc.nextInt());
            sc.nextLine();

            a[i].sethotelName(sc.nextLine());

            a[i].setdateOfBooking(sc.next());

            a[i].setnoOfRoomsBooked(sc.nextInt());

            a[i].setwifiFacility(sc.next());

            a[i].settotalBill(sc.nextDouble());
        }

        String month = sc.next();

        String wifi = sc.next();

        int rooms = noOfRoomsBookedInGivenMonth(a, month);

        if (rooms > 0) {
            System.out.println(rooms);
        } else {
            System.out.println("No rooms booked in the given month");
        }

        Hotel h = searchHotelByWifiOption(a, wifi);

        if (h == null) {
            System.out.println("No hotel found");
        } else {
            System.out.println(h.gethotelId());
        }
    }
}
