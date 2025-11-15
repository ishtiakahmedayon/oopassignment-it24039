public class RandomNumberGenerator {
    
    private static long seed = System.nanoTime();
    private static final long a = 1103515245L;
    private static final long c = 12345L;
    private static final long m = 2147483648L;
    
    private static void nextSeed() {
        seed = (a * seed + c) % m;
    }
    
    public static int generateRandom() {
        nextSeed();
        return (int) Math.abs(seed);
    }
    
    public static int generateRandom(int max) {
        nextSeed();
        return (int) (Math.abs(seed) % max);
    }
    
    public static int generateRandom(int min, int max) {
        return min + generateRandom(max - min);
    }
    
    public static double generateRandom(double d) {
        nextSeed();
        return (Math.abs(seed) / (double) m) * d;
    }
    
    public static double generateRandom(double min, double max) {
        nextSeed();
        return min + (Math.abs(seed) / (double) m) * (max - min);
    }
    
    public static float generateRandom(float max) {
        nextSeed();
        return (Math.abs(seed) / (float) m) * max;
    }
    
    public static float generateRandom(float min, float max) {
        nextSeed();
        return min + (Math.abs(seed) / (float) m) * (max - min);
    }
    
    public static long generateRandom(long l) {
        nextSeed();
        return Math.abs(seed) % l;
    }
    
    public static long generateRandom(long min, long max) {
        nextSeed();
        return min + Math.abs(seed) % (max - min);
    }
}
