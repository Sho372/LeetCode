package Stack;

import java.util.ArrayList;
import java.util.HashMap;

public class DailyTemperatures_739 {

    // O(n^2)
    public int[] dailyTemperatures(int[] T) {

        int[] ans = new int[T.length];
        for(int i = 0; i < T.length; i++) {
            int cnt = 1;
            for(int j = i+1; j < T.length; j++) {


                if(T[i] < T[j]) {
                    ans[i] = cnt;
                    break;
                } else {
                    if(j == T.length-1) {
                        ans[i] = 0;
                        break;
                    }

                    cnt++;
                }
            }
        }
        return ans;
    }

//    public int[] dailyTemperatures2(int[] T) {
//        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
//        for (int i = 0; i < T.length; i++) {
//            if(map.containsKey(T[i])) {
//                map.get(T[i]).add(i);
//            } else {
//                map.put(T[i], new ArrayList<>(i));
//            }
//        }
//
//        for (int i = 0; i < T.length; i++) {
//
//        }
//    }

}
