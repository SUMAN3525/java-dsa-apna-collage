import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If the character is a closing bracket
            else {
                // If the stack is empty or the top of the stack doesn't match, it's invalid
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }

        // If the stack is empty, all brackets were matched; otherwise, it's invalid
        return stack.isEmpty();
    }

    // Helper method to check if two characters form a matching pair
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s)); // Output: true
    }
}
