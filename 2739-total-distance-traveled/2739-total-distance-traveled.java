class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int tot_dist = 0;
        while(mainTank >= 5){
            mainTank -= 5;
            tot_dist += 50;

            if(additionalTank > 0){
                additionalTank--;
                mainTank++;
            }
        }
        tot_dist += mainTank * 10;
        return tot_dist;

    }
}