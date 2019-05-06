package multibracketvalidation;

import stacksandqueues.Stack;

public abstract class MultiBracketValidation {
    public static boolean multiBracketValidation(String input) {
        if (input == null) {
            return false;
        }
        Stack<Character> stacko = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' ||
                    input.charAt(i) == '[' ||
                    input.charAt(i) == '{') {
                stacko.push(input.charAt(i));
            } else if (input.charAt(i) == ')') {
                if (stacko.peek() == null ||
                        stacko.pop() != '(') {
                    return false;
                }
            } else if (input.charAt(i) == ']') {
                if (stacko.peek() == null ||
                        stacko.pop() != '[') {
                    return false;
                }
            } else if (input.charAt(i) == '}') {
                if (stacko.peek() == null ||
                        stacko.pop() != '{') {
                    return false;
                }
            }
        }
        return (stacko.peek() == null);
    }
}
