package BackTracking;

import java.util.ArrayList;

public class RollingDice {

    public static void main(String[] args) {
        RollingDice r = new RollingDice();
        r.rollingDice(2, new ArrayList<>());
    }

    public void rollingDice(int dice, ArrayList<Integer> res) {
        if(dice == 0) {
            System.out.println(res);
        } else {
            for (int i = 1; i <= 6; i++) {
                res.add(i); // Choice
                rollingDice(dice-1, res); // Explore -> roll dice again ...
                res.remove(res.size() - 1); // Backtracking
            }
        }
    }
}
