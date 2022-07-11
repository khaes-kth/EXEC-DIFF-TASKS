package se.kth.execdiff.tasks.two;

public class PrimeDetector {
    public static int getSmallestPrimeFactor(int t){
        int smallestFactor = 1000000000;
        for(int i = (int) Math.sqrt(t); i > 1; i--){
            if(t % i == 0){
                smallestFactor = i;
            }
        }
        return smallestFactor;
    }
}
