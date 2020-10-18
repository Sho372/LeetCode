package Contest.Weekly210;

public class A_review {

    public int maxDepth(String s) {

        int max = 0;
        int d = 0;
        for (char c:s.toCharArray()) {
            if(c == '(') {
                d++;
            }
            if(c == ')') {
                d--;
            }
            max = Math.max(max, d);
        }
        return max;
    }

    public static void main(String[] args) {
        A_review a = new A_review();
        String e = "1";
        System.out.println(a.maxDepth(e));
    }

}
