package Prime;

import java.util.Arrays;

public class Eratosthenes {

    public boolean isPrime(int m){
        if(m == 1) return false;
        for(int i = 2; i * i <= m; i++){
            if(m % i == 0) return false;
        }
        return true;
    }

    // Eeatosthese counts the number of prime before m,
    // not just judge if m is a prime or not,
    // that's why it has no time advantage comparing with standard prime
    public boolean Eeatosthese(int m){
        int count = 0;
        boolean[] prime = new boolean[m + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        if(m == 1) return false;
        for(int i = 2; i * i <= m; i++){
            if(prime[i]){
                count++;
                for(int j = i * i; j <= m; j = j + i){
                    prime[j] = false;
                }
            }
        }
        return prime[m];
    }

    public boolean isPrimeStandard(int num){
        if(num == 1) return false;
        if(num < 4) return true;
        for (int i = 2; i <= num / 2; i++) {
            // condition for non-prime number
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Eratosthenes eratosthenes = new Eratosthenes();
        long startTime, endTime, duration;
        int caseCount = 100000;

//        System.out.println(test_isPrime.Eeatosthese(53));

        // test time of isPrime
//        startTime = System.nanoTime();
//        for(int i = 1; i <= Integer.MAX_VALUE; i++){
//            eeatosthese.isPrime(i);
//        }
//        endTime = System.nanoTime();
//        duration = (endTime - startTime) / 1000000;
//        System.out.println("time of isPrime(ms): " + duration);


        // test time of Eeatosthese
        startTime = System.nanoTime();
        for(int i = 1; i <= caseCount; i++){
            eratosthenes.Eeatosthese(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("time of Eeatosthese(ms): " + duration);

        // test time of isPrimeStandard
        startTime = System.nanoTime();
        for(int i = 1; i <= caseCount; i++){
            eratosthenes.isPrimeStandard(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("time of isPrimeStandard(ms): " + duration);

//         test the accuracy
        for(int i = 1; i <= caseCount; i++){
            if(eratosthenes.isPrime(i) != eratosthenes.isPrimeStandard(i)){
                System.out.println(i + ": isPrime: " + eratosthenes.isPrime(i) +
                ", isPrimeStandard: " + eratosthenes.isPrimeStandard(i));
            }
            if(i%caseCount == 0) System.out.println(i + " finished;");
        }

    }
}
