import java.util.Stack;

class ReverseWordsString {
    public String reverseWords(String s) {
        s.trim();
        String[] str = s.split("\\s+");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            stack.push(str[i]);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}