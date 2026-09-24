import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> num = new HashSet<>();

        while(n!=1){
            if(num.contains(n)){
                return false;
            }
            num.add(n);

            int totSum = 0;
            while(n > 0){
                int digits = n%10;
                totSum += digits * digits;
                n = n/10;
            }

            n = totSum;
        }
        return true;
    }
}