public class Miss extends assignment1 {
    public static double[] calcMiss(double target, int n) {
        // CALCUATE Z AND FIND THE CLOSEST MISS
        double[] miss = new double[3];
        double z = Math.round(Math.pow(target, 1.0 / n));
        double zBottom = Math.floor(z);
        double zTop = z + 1;
        double missBottom = Math.abs(Math.pow(zBottom, n) - target);
        double missTop = Math.abs(Math.pow(zTop, n) - target);

        // miss = z, actual miss, relative miss
        // miss[0] = z
        // miss[1] = actual miss
        // miss[2] = relative miss
        if (missBottom < missTop) {
            miss[0] = zBottom;
        } else {
            miss[0] = zTop;
        }
        miss[1] = Math.min(missBottom, missTop);

        miss[2] = Math.min(missBottom, missTop) / target;

        return (miss);
    }

}
