package solutions.conditional_loops;

public class ElectricityBil {
    public static double electricityBil(double meter) {
        if(meter <= 100) {
            return meter*10;
        } else if(meter <= 200) {
            return 100*10 + (meter-100)*15;
        } else if(meter <= 300) {
            return 100*10 + 100*15 + (meter-200)*20;
        } else if(meter > 300) {
            return 100*10 + 100*15 + 100*20 + (meter-300)*25;
        }
        return 0;
    }
    public static void main(String[] args) {
        /*1 to 100 units - Rs.10/unitRs.10/unit
        100 to 200 units - Rs.15/unitRs.15/unit
        200 to 300 units - Rs.20/unitRs.20/unit
        above 300 units - Rs.25/unitRs.25/unit*/
        double meter1 = 95.5;
        double meter2 = 125;
        double meter3 = 270.9;
        double meter4 = 350;
        double electricityBil = electricityBil(meter1);
        double electricityBil2 = electricityBil(meter2);
        double electricityBil3 = electricityBil(meter3);
        double electricityBil4 = electricityBil(meter4);
        System.out.println("The electricity bil for meter 1 is: " + electricityBil);
        System.out.println("The electricity bil for meter 2 is: " + electricityBil2);
        System.out.println("The electricity bil for meter 3 is: " + electricityBil3);
        System.out.println("The electricity bil for meter 4 is: " + electricityBil4);

    }
}
