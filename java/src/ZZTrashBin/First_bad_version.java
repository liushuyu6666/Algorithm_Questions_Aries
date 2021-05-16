package ZZTrashBin;

public class First_bad_version {
    int[] nums = {1, 2, 3};
    int bad = 3;
    public int firstBadVersion(int n){
        if(isBadVersion(1)) return 1;
        int begin = 1, end = n, j = n;
        while(begin != end - 1){
            j = begin + (end - begin + 1) / 2;
            if(isBadVersion(j)){
                end = j;
            }
            else{
                begin = j;
            }
        }
        if(!isBadVersion(j)) j++;
        return j;
    }

    boolean isBadVersion(int version){
        if(version >= this.bad) return true;
        else return false;
    }

    public static void main(String args[]){
        First_bad_version s = new First_bad_version();
        System.out.println(s.firstBadVersion(3));
    }
}
