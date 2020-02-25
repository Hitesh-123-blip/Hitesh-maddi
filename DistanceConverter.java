import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        System.out.print("Enter distance in miles:");
        Scanner s = new Scanner(System.in);

        double distanceInMiles = s.nextDouble();

        System.out.println(distanceInMiles + " miles = " + milesTokm(distanceInMiles) + " km");



        s.close();

    }

    private static double milesTokm(double distanceInMiles) {
        return distanceInMiles * 1.60934;
    }

    
}