package stackNqueue.baseballGame;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] strs = {"5", "-2", "4", "C", "D", "9","+", "+"};

        BaseballGame baseballGame = new BaseballGame();

        System.out.println(baseballGame.points(strs));
    }

    private int points(String[] strs) {

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(String str :strs) {
            switch (str) {
                case  "C" :
                    stack.pop();
                    break;
                case "D" :
                    stack.push(stack.peek() * 2);
                    break;
                case "+" :
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y);
                    stack.push(x);
                    stack.push(x+y);
                    break;
                default :
                    stack.push(Integer.valueOf(str));
                    break;
            }
        }

        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }

        return  result;
    }
}
