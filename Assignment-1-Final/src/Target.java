/*
This class takes values from the user and calculates what the Z variable or "Target" number is. 
*/

public class Target extends assignment1 {
    public static double calcTarget(int x, int y, int n) {
        // Calcualte x^n + y^n
        return Math.pow(x, n) + Math.pow(y, n);
    }
}
