import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Input {
    public static void userInput() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a value for k: ");
        int k = sc.nextInt();
        System.out.print("Please enter a value for n: ");
        int n = sc.nextInt();
        Find.findNearMisses(k, n);
    }
}


