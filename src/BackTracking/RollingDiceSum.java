package BackTracking;

import java.util.ArrayList;

public class RollingDiceSum {

    int cnt;

    public static void main(String[] args) {
        RollingDiceSum r = new RollingDiceSum();
//        r.rollingDiceSum2(3, 7,  new ArrayList<>());
        r.rollingDiceSum3(3, 7,  new ArrayList<>(), 0);

        System.out.println("count: " + r.cnt);
    }

    // Inefficiency
    public void rollingDiceSum(int dice, int sum, ArrayList<Integer> res) {
        cnt++;
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
        cnt++;
        if(dice == 0) {
            if(sum(res) == sum)
                System.out.println(res);

        } else {
            for (int i = 1; i <= 6; i++) {
                res.add(i); // Choice
                if(sum - 6 * (dice - 1) <= sum(res) && sum(res) <= sum){ //  min <= soFarSum <= max -> Prune
                    rollingDiceSum2(dice-1, sum, res); // Explore -> roll dice again ... (Move to next decision tree)
                }
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

    // Prune to optimize
    // Avoid to the sum every time -> Not use the sum function
    public void rollingDiceSum3(int dice, int sum, ArrayList<Integer> res, int sumSoFar) {
        cnt++;
//        System.out.println("dice: " + dice +" sumSoFar: " + sumSoFar + " sum: " + sum(res) );
        if(dice == 0) {
            if(sumSoFar == sum)
                System.out.println(res);

        } else {
            for (int i = 1; i <= 6; i++) {
                res.add(i); // Choice
                if(sum - 6 * (dice - 1) <= sumSoFar + i && sumSoFar + i <= sum){ //  min <= soFarSum <= max -> Prune
                    rollingDiceSum3(dice-1, sum, res, sumSoFar + i); // Explore -> roll dice again ... (Move to next decision tree)
                }
                res.remove(res.size() - 1); // Backtracking
            }
        }
    }
}
