package ZZTrashBin;

public class Reverse_bits {
    public int reverseBits(int n){
        int reverseBits = 0, count = 0;
        while(count < 32){
            reverseBits <<= 1;
            reverseBits |= (n & 1);
            n >>= 1;
            count++;
        }
        return reverseBits;
    }

    public static void main(String args[]){
        Reverse_bits s = new Reverse_bits();
        int a = s.reverseBits(43261596);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
    }
}
