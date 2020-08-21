package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstructionbyHeight_406 {

    // Not Accepted -> 11/37
    public int[][] reconstructQueue(int[][] people) {
        int[][] ans = new int[people.length][2];
        int[] indexes = new int[people.length];

        sortByColumn(people);
        for(int i = 0; i < people.length; i++) {
            int k = people[i][1];
            int cnt = -1;
            int occupied = 0;
            for(int j = 0; j < people.length; j++) {
                if(indexes[j] != -1) {
                    cnt++;
                    if(cnt == k) {
                        ans[cnt + occupied] = people[i];
                        indexes[j] = -1;
                    }
                } else {
                    occupied++;
                }
            }
        }
        return ans;
    }

    public static void sortByColumn(int[][] array) {
        // Sort by height column
        Arrays.sort(array, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });
    }
}
