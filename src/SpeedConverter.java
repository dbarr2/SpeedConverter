public class SpeedConverter {

    public static void main(String[] args) {

        double kilometersPerHour  = 50;
        System.out.println(kilometersPerHour + " km/h is converted to " +
                toMilesPerHour(kilometersPerHour) + "mi/h");

        printConversion(100); //Expected output => " 100.0 km/h = 62.0 mi/h "
        printConversion(-1); //Expected output ==> " Invalid Value "
        printConversion(-100); //Expected output ==> " Invalid Value "
    }

    //Convert kilometers Per Hour to Miles per hour
    public static double toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            return -1;
        }
        double convertToMPH = Math.round(kilometersPerHour / 1.609); //Round the conversion
        return convertToMPH;
    }

    //Print the conversion in a better format
    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        } else {

            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
