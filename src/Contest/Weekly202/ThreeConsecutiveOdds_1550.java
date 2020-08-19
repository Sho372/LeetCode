package Contest.Weekly202;

public class ThreeConsecutiveOdds_1550 {
    public boolean threeConsecutiveOdds(int[] arr) {

        int cnt = 0;
        for(int i : arr) {
            cnt = i % 2 == 0 ? 0 : cnt + 1;
            if(cnt == 3) return true;
        }
        return false;
    }
}
