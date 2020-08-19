package Contest.Weekly201;

public class FindKthBit_1545_review {
    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");

        for(int i = 1; i < n; i++) {

            StringBuilder reverse = new StringBuilder();

            for (int j = s.length()-1; j > -1 ; j--) {
                int ss = (s.charAt(j) - '0') ^ 1;  // inverse with XOR ASCIIの0,1に変換
                // NOT Use concat as String itself. Use append of StringBuilder instead of concat.
                reverse.append(String.valueOf(ss));
                if(s.length() - j > k) break; // It's not necessary to loop more than k times
            }

            s.append("1").append(reverse);
        }
        return s.charAt(k-1);
    }


    public static void main(String[] args) {
        FindKthBit_1545_review f = new FindKthBit_1545_review();
        System.out.println(f.findKthBit(20,1048575));
    }

}
