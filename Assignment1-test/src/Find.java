public class Find extends Input {

    public static void findNearMisses(int k, int n) throws InterruptedException {
        double[] firstMiss = Miss.calcMiss(Target.calcTarget(10, 10, n), n);
        double smallestMiss = firstMiss[2];
        Print.printMiss(10, 10, firstMiss[0], n, smallestMiss, firstMiss[1]);
        for (int x = 10; x <= k; x++) {
            for (int y = 10; y <= k; y++) {
                // Calculate Target
                double target = Target.calcTarget(x, y, n);

                // CALCULATE Z and Relative Miss
                double[] miss = Miss.calcMiss(target, n);

                // Check if Z is smaller than current near miss
                // OUTPUT if it is a new nearest miss
                if (miss[2] < smallestMiss) {
                    smallestMiss = miss[2];
                    Print.printMiss(x, y, miss[0], n, smallestMiss, miss[1]);
                }
            }
        }
    }
}
