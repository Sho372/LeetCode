package Contest.Weekly201;

public class FindKthBit_1545 {
    public char findKthBit(int n, int k) {
//        int[] bit = new int[1048575];
//        bit[0] = 0;
        String bit = "0";
//        System.out.println(~s & 1);
        for(int i = 0; i < n; i++) {
            int temp = reverse(~Integer.valueOf(bit) & 1);
            bit = bit + "1" + String.valueOf(temp);
        }
        System.out.println(bit);

        return bit.charAt(k-1);
    }

    static int reverse(int x) {
        int b=0;
        while (x!=0){
            b<<=1;
            b|=( x &1);
            x>>=1;
        }
        return b;
    }

    public static void main(String[] args) {
        FindKthBit_1545 s = new FindKthBit_1545();
        char ans = s.findKthBit(4,1);
        System.out.println(ans);
    }
}
