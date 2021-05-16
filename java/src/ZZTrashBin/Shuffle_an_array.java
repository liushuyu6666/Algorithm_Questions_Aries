package ZZTrashBin;

import java.util.Random;

public class Shuffle_an_array {
    private int[] array;
    private int[] original;

    Random rand = new Random();

    // [min, max)
    private int randRange(int min, int max){
        return min + rand.nextInt(max - min);
    }

    private void swapAt(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // initialize
    public Shuffle_an_array(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array = original.clone();
        return array;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i = 0; i < array.length; i++){
            swapAt(i, randRange(i, array.length));
        }
        return array;
    }

    public static void main(String args[]){
        Shuffle_an_array s = new Shuffle_an_array(new int[] {1, 2, 3, 4, 5});

    }
}
