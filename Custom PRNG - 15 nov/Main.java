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