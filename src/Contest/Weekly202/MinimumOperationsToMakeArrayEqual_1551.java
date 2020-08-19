package Contest.Weekly202;

public class MinimumOperationsToMakeArrayEqual_1551 {

    public int minOperations(int n) {
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(2 * i + 1 > n) cnt += 2 * i + 1 -n;
        }

        return cnt;
    }

}
