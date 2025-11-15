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