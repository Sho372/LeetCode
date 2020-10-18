package Contest.Weekly211;

import java.util.HashSet;

public class B {

    HashSet<String> set;
    String minstr;

    public static void main(String[] args) {
        B b = new B();
        String ans = b.findLexSmallestString("43987654", 7, 3);
        System.out.println(ans);
    }

    //DFS
    public String findLexSmallestString(String s, int a, int b) {
        set = new HashSet<>();
        minstr = s;

        helper(s,a,b);
        return minstr;

//        set.add(s);
//
//        int min = Integer.MAX_VALUE;
//
//        while (true) {
//
//            String rs = rotate(s, b);
//            String as = add(s, a);
//
//            if(set.contains(rs) && set.contains(as)) {
//                System.out.println(set);
//                return s;
//            }
//
//            set.add(rs);
//            set.add(as);
//
//            int ss = Integer.parseInt(s);
//            int o1 = Integer.parseInt(rs);
//            int o2 = Integer.parseInt(as);
////            if(o1 >= ss && o2 >= ss) {
////                return s;
////            }
//            min = Math.min(Math.min(min, o1),o2);
//            s = o1 >= o2 ? as : rs;
//            s = String.valueOf(min);
//            System.out.println(s);
//        }
    }

    public void helper(String s, int a, int b) {

        if(set.contains(s)) return;

        if(s.compareTo(minstr) < 0) {
            minstr = s;
        }

        set.add(s);

        helper(rotate(s,b), a, b);
        helper(add(s,a), a,b);
    }



    public String rotate(String s, int b) {

        char[] ca = s.toCharArray();
        char[] rotated = new char[s.length()];

        for (int i = 0; i < ca.length; i++) {
            rotated[(i+b)% ca.length] = ca[i];
        }
        return new String(rotated);
    }

    public String add(String s, int a) {
        char[] ca = s.toCharArray();

        for (int i = 1; i < ca.length; i += 2) {
            // convert numeric char to int
            int c = ca[i] - '0';
            int cc = (((c + a) % 10));
            // convert int to numeric char
            ca[i] = (char) (cc + '0');
        }
        return new String(ca);
    }
}
