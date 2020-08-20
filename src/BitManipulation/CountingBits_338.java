package BitManipulation;

public class CountingBits_338 {

    // Accepted, But this performance is very bad. -> 26 ms
    public int[] countBits(int num) {

        int[] arr = new int[num+1];
        for (int i = 0; i <= num; i++) {

            int div = i;
            int cnt = 0;

            do {
                if(div % 2 == 1) {
                    cnt += 1;
                }
                div /= 2;
            }
            while (div / 2 != 0);
            cnt = div % 2 == 1 ? cnt + 1 : cnt;
            arr[i] = cnt;
        }
        return arr;
    }

    // Change to use bit manipulation -> 6ms
    public int[] countBits2(int num) {

        int[] arr = new int[num+1];
        for (int i = 0; i <= num; i++) {

            int div = i;
            int cnt = 0;

            do {
                if((div & 1) == 1) {
                    cnt += 1;
                }
                div >>= 1;
            }
            while (div >> 1 != 0);
            cnt = (div & 1) == 1 ? cnt + 1 : cnt;
            arr[i] = cnt;
        }
        return arr;
    }

}
