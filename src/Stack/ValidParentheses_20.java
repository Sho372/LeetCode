package Stack;

import java.util.Stack;

public class ValidParentheses_20 {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            if(stack.size() == 0 && (c == ')' || c == '}'|| c == ']')) return false;
            if(c == ')' && stack.pop() != '(') return false;
            if(c == '}' && stack.pop() != '{') return false;
            if(c == ']' && stack.pop() != '[') return false;
        }

        return stack.empty();
    }

}
