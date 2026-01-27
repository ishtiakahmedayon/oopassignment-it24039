# Random Number Generator

Custom random generator using Linear Congruential Generator (LCG) algorithm.

## Algorithm

**Formula:** `X(n+1) = (a × X(n) + c) mod m`

- a = 1103515245
- c = 12345  
- m = 2³¹

## Compile & Run

```bash
javac RandomNumberGenerator.java Main.java
java Main
```
## Code:
### RandomNumberGenerator.java
```
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
```

### Main.java
```
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Random Integer: " + RandomNumberGenerator.generateRandom());
        System.out.println("Random Int [0-100): " + RandomNumberGenerator.generateRandom(100));
        System.out.println("Random Int [50-150): " + RandomNumberGenerator.generateRandom(50, 150));
        System.out.println();
        
        System.out.println("Random Double [0-100): " + RandomNumberGenerator.generateRandom(100.0));
        System.out.println("Random Double [25.5-75.5): " + RandomNumberGenerator.generateRandom(25.5, 75.5));
        System.out.println();
        
        System.out.println("Random Float [0-50): " + RandomNumberGenerator.generateRandom(50.0f));
        System.out.println("Random Float [10.5-20.5): " + RandomNumberGenerator.generateRandom(10.5f, 20.5f));
        System.out.println();
        
        System.out.println("Random Long [0-1000): " + RandomNumberGenerator.generateRandom(1000L));
        System.out.println("Random Long [5000-10000): " + RandomNumberGenerator.generateRandom(5000L, 10000L));
        System.out.println();
        

        

    }
}
```
## Usage

```java
RandomNumberGenerator.generateRandom()              // int
RandomNumberGenerator.generateRandom(100)           // int [0-100)
RandomNumberGenerator.generateRandom(10, 50)        // int [10-50)
RandomNumberGenerator.generateRandom(100.0)         // double [0-100)
RandomNumberGenerator.generateRandom(10.0, 50.0)    // double [10-50)
RandomNumberGenerator.generateRandom(100.0f)        // float [0-100)
RandomNumberGenerator.generateRandom(10.0f, 50.0f)  // float [10-50)
RandomNumberGenerator.generateRandom(1000L)         // long [0-1000)
RandomNumberGenerator.generateRandom(100L, 500L)    // long [100-500)
```

## Features

- Static methods (no object creation)
- Method overloading (9 variations)
- Supports: int, double, float, long
