public class Cinema {
    public static void main(String[] args) 
    {

        int audience = 130;
        int seatsPerRow = 12;

        int fullRows = audience / seatsPerRow;
        int remainingSeats = audience % seatsPerRow;

        System.out.println("Full Rows: " + fullRows);
        System.out.println("Remaining Seats: " + remainingSeats);
    }
}
