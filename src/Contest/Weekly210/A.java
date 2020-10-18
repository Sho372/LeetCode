package Contest.Weekly210;

public class A {
    public int maxDepth(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String ss = s.substring(i);
            max = Math.max(max, depth(ss,0));
        }
        return max;
    }

    public int depth(String s, int index) {

//        System.out.println("s " + s);
//        System.out.println("index " + index);
        if(s.length()-1 == index) return 0;

//        if(s.charAt(index) == ')') {
//            return 0;
//        }

        if(s.charAt(index) == '(') {
            return  1 + depth(s, index + 1);
        } else {
            return depth(s, index + 1);
        }
//        if(s.charAt(index) == '(') {
//            return  Math.max(1 + depth(s, index + 1), depth(s, index + 1));
//        }
//        return 0;
    }

    public static void main(String[] args) {
        A a = new A();
        String e = "(1+(2*3)+((8)/4))";
        System.out.println(a.maxDepth(e));
        System.out.println(a.depth(e,0));

    }
}
