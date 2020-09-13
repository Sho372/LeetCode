package Contest.Weekly205;

import java.util.ArrayList;

public class A {

    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a.modifyString("?az"));
        System.out.println(a.modifyString("v????gm??a?czgn?ba?dya?????b?t????j??ag??qm?????t?imx?f??gc??a????orb??e?uvae?ak?????a?e??f??qg"));

    }

    public String modifyString(String s) {

        char[] chars = s.toCharArray();
        boolean flag = false;
        int cnt = 0;
        for (char c :chars) {
            if ( c == '?') {
                flag = true;
                cnt++;
            }
        }

        if(!flag) return s;

            char[] cc = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".toCharArray();

        ArrayList<Character> conv = new ArrayList<>();
        for (char c: cc) {
            if (!s.contains(String.valueOf(c))) {
                conv.add(c);
            }
        }

        for (int i = 0; i < cnt; i++) {
            Character c = conv.remove(0);
            s = s.replaceFirst("\\?", String.valueOf(c));
        }
        return s;
    }
}
