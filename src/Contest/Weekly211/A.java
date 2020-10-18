package Contest.Weekly211;

public class A {

    public int maxLengthBetweenEqualCharacters(String s) {

        int max = -1;
        for (int i = 0; i < s.toCharArray().length; i++) {
            int cnt = 0;
            char c = s.charAt(i);
            for (int j = i+1; j < s.toCharArray().length; j++) {
                if(c == s.charAt(j)) {
                    max = Math.max(max, cnt);
                    System.out.println(max);

                }
                cnt++;
            }
        }
        return max;
    }

}
