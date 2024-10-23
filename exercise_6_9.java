//This code will display conversion from feet to meters for 10 feet
//Then it will show converstion from 20 to 65 meters to feet by 5's.

public class exercise_6_9 {
    public static void main(String[] args) {
        //Display table
        System.out.println(
            "\nFeet     Meters        |    Meters        Feet\n" + 
            "-------------------------------------------------");
            
        //For loop to run through printing out the conversion information
        for(double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5)
        {
            System.out.printf("%4.1f    ", feet);
            System.out.printf("%6.3f    ", footToMeter(feet));
	    System.out.printf("     |     ");
	    System.out.printf("%-11.1f", meters);
            System.out.printf("%7.3f\n", meterToFoot(meters));
        }
    }

    public static double footToMeter(double foot){
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
