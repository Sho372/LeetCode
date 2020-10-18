package Contest.Weekly209;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

public class A {
    public int specialArray(int[] nums) {

        int max = 0;
        for (int n : nums) {
            max = Math.max(max, n);
        }

        for (int x = max; -1 < x; x--) {
            int cnt = 0;
            for (int n : nums) {
                if(x <= n) cnt++;
            }
            if(cnt == x) return x;
        }
        return -1;
    }
}
