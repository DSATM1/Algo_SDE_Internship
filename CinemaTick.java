public class CinemaTick {
    public static void main(String[] args) 
    {

        int audience = 125;
        int seatsPerRow = 12;

        int completeRows = audience / seatsPerRow;
        int peopleInLastRow = audience % seatsPerRow;

        System.out.println("Complete Rows = " + completeRows);
        System.out.println("People in Last Row = " + peopleInLastRow);
    }
}
