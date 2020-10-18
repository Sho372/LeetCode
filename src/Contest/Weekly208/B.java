package Contest.Weekly208;

public class B {

    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {

        int profit = 0;
        int rotate = 0;
        int maxRotate = 0;
        
        for (int g: customers) {

            int r = g / 4;
            int m = g % 4;
            if(r == 0 || (r == 1 && m == 0)) {
                rotate++;
                maxRotate = g * boardingCost - rotate * runningCost > profit ? rotate : maxRotate;
                profit += Math.max(g * boardingCost - rotate * runningCost, profit);
                continue;
            }

            if(m != 0) r++;
            for (int i = 0; i < r; i++) {
                rotate++;
                if(g > 4) {
                    g -= 4;
                    maxRotate = 4 * boardingCost - rotate * runningCost > profit ? rotate : maxRotate;
                    profit += Math.max(profit,4 * boardingCost - rotate * runningCost);
                } else {
                    maxRotate = g * boardingCost - rotate * runningCost > profit ? rotate : maxRotate;
                    profit += Math.max(profit,g * boardingCost - rotate * runningCost);
                }
            }
        }
        return rotate;
    }

}
