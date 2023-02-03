/*
This class prints the output form the miss class and outputs it to the user.
*/

import java.util.concurrent.TimeUnit;

public class Print extends assignment1 {

    public static void printMiss(int x, int y, double z, int n, double relativeMiss, double actualMiss) throws InterruptedException {
        // PRINT OUT THE SMALLEST MISS AND WAIT FOR USER TO CONTINUE
        System.out.println("(" + x + ", " + y + ", " + z + ", " + n + ") is a near miss");
        System.out.println("The actual miss is: " + actualMiss);
        System.out.println("The relative miss is: " + relativeMiss);
        TimeUnit.SECONDS.sleep(1);
    }

}
