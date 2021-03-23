package stackNqueue.validParentheses;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();

        String exp = "[(])";
        System.out.println(vp.solve(exp));
    }

    private boolean solve(String exp) {
        if(exp.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for(int i =0; i < exp.length(); i++) {

            switch (exp.charAt(i)) {
                case ')' :
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    }
                    break;
             case ']' :
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    }
                    break;
            case '}' :
                    if(!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    }
                    break;

                default :
                    stack.push(exp.charAt(i));
                    break;
            }
        }
        return stack.isEmpty();
    }
}
