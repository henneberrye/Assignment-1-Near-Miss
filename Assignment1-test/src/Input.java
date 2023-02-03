import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Input {
    public static void userInput() throws InterruptedException {
        int k = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (k < 10) {
            System.out.print("Please enter a value for k, greater than or equal to 10: ");
            k = sc.nextInt();
        }

        while (n < 2 && n > 12) {
            System.out.print("Please enter a value for n greater than 2 and less than 12: ");
            n = sc.nextInt();
        }

        Find.findNearMisses(k, n);
    }
}
