package bmt;

public class App {
    public static double power(Integer A , Integer N) {
        double S = 1.0;
        if (A == null || N == null){
            throw new IllegalArgumentException("Exception");
        }else{
            if (N < 0) {
                for (int i = 0; i < N; i++) {
                    S = S / A; 
                }
            } else if (N > 0) {
                for (int i = 0; i < N; i++) {
                    S = S * A; 
                }
            } else {
                return S;
            }
        }      
        return S;
    }
    public static void main(String[] args) {
        // Example usage of the power method
        Integer base = 2;
        Integer exponent = 3;
        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
