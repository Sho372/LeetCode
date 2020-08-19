package Contest.Weekly201;

public class MakeGood_1544 {

    public String makeGood(String s) {

        String ss = s;
        for(int j = 0; j < ss.length(); j++) {
            for(int i = 0; i < ss.length()-1; i++) {
                if(ss.toUpperCase().charAt(i) == ss.toUpperCase().charAt(i+1) && ss.charAt(i) != ss.charAt(i+1)) {
                    ss = ss.substring(0,i) + ss.substring(i+2);
                    j=0;
                    break;
                }
            }
        }
        return ss;
    }

    public static void main(String[] args) {
        MakeGood_1544 s = new MakeGood_1544();
        System.out.println(s.makeGood("abBAcC"));
    }

}
