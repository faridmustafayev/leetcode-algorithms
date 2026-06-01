package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        ValidParentheses1 validParentheses1 = new ValidParentheses1();
        System.out.println(validParentheses1.isValid("([)]"));
//        System.out.println(validParentheses1.isValid("([])"));
//        System.out.println(validParentheses1.isValid("()[]{}"));

    }
}

class ValidParentheses1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                Character lastOpened = stack.pop();

                if (c == ')' && lastOpened != '(') return false;
                if (c == ']' && lastOpened != '[') return false;
                if (c == '}' && lastOpened != '{') return false;

            }
        }

        return stack.isEmpty();
    }
}
