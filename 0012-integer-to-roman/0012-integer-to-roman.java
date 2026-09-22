class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder res = new StringBuilder();

        for(int i=0;i<values.length;i++){
            while(num >= values[i]) {
                res.append(sym[i]);
                num -= values[i];
            }
            if(num == 0){
                break;
            }
        }

        return res.toString();


    }
}