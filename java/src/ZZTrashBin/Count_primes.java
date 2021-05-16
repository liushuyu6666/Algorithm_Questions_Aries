package ZZTrashBin;

public class Count_primes {
    public int countPrimes(int n){
        if(n == 0) return 0;
        if(n == 1) return 0;
        boolean[] primes = new boolean[n];
        for(int i = 0; i < n; i++) primes[i] = true;
        primes[0] = false;
        primes[1] = false;
        int i = 2, sum = 0, multiple = 2;
        while(i < n){

            // judge if primes[i] is true
            if(primes[i]){
                sum += 1;

                // judge others
                multiple = 2;
                while(multiple * i < n){
                    primes[multiple * i] = false;
                    multiple++;
                }
            }

            i++;
        }

        return sum;
    }

    public static void main(String args[]){
        Count_primes s = new Count_primes();
        System.out.println(s.countPrimes(2));
    }
}
