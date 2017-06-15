import java.util.ArrayList;
import java.util.List;

public class ProjectEuler10 {
    public static final int height = 2000000;
    public static void main(String[] args){
        List<Integer> primes = new ArrayList<>();
        primes.add(2);//2 is a prime
        primes.add(3);//3 is a prime
        double sum = 5;
        for (int i = 5; i <= height; i+= 2) {
            boolean isAPrime = true;
            for (int prime : primes) {
                if (i % prime == 0) {
                    isAPrime = false;
                    break;
                }
            }

            if (isAPrime) {
                primes.add(i);
                sum += i;
                System.out.println(i);
            }
        }
        System.out.printf("%.1f", sum);
    }
}
