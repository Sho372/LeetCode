package BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses_22 {

    // Not accepted.
    public List<String> generateParenthesis(int n) {
        // base case
        if(n == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add("()");
            return new ArrayList<>();
        }

        // recursive case
        List<String> l = generateParenthesis(n-1);
        Set<String> set = new HashSet<>();
        for(int i = 0; i < l.size(); i++) {
            set.add("(" + l.get(i) + ")");
            set.add("()" + l.get(i));
            set.add(l.get(i) + "()");
        }
        return new ArrayList<>(set);
    }

}
