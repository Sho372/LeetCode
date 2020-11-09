package BackTracking;

import java.util.ArrayList;

public class RollingDiceSum {
    public static void main(String[] args) {
        RollingDiceSum r = new RollingDiceSum();
        r.rollingDiceSum(2, 5,  new ArrayList<>());
    }

    // Inefficiency
    public void rollingDiceSum(int dice, int sum, ArrayList<Integer> res) {
        if(dice == 0) {
            if(sum(res) == sum)
            System.out.println(res);

        } else {
            for (int i = 1; i <= 6; i++) {
                res.add(i); // Choice
                rollingDiceSum(dice-1, sum, res); // Explore -> roll dice again ... (Move to next decision tree)
                res.remove(res.size() - 1); // Backtracking
            }
        }
    }

    // Prune to optimize
    public void rollingDiceSum2(int dice, int sum, ArrayList<Integer> res) {
        if(dice == 0) {
            if(sum(res) == sum)
                System.out.println(res);

        } else {
            for (int i = 1; i <= 6; i++) {
                res.add(i); // Choice
                //TODO: Check

                rollingDiceSum(dice-1, sum, res); // Explore -> roll dice again ... (Move to next decision tree)
                res.remove(res.size() - 1); // Backtracking
            }
        }
    }


    private int sum(ArrayList<Integer> res) {
        int ans = 0;
        for (int n: res){
            ans += n;
        }
        return ans;
    }
}
