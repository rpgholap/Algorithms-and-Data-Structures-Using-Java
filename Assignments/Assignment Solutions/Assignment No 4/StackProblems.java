import java.util.Arrays;

class StackProblems {

    // ---------------- Q4: Balanced Parentheses ----------------
    static boolean isBalanced(String expr) {
        char[] stack = new char[expr.length()];
        int top = -1;

        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (top == -1) return false;
                char topChar = stack[top--];
                if ((ch == ')' && topChar != '(') ||
                    (ch == '}' && topChar != '{') ||
                    (ch == ']' && topChar != '[')) return false;
            }
        }
        return top == -1;
    }

    // ---------------- Q5: Reverse String ----------------
    static String reverseString(String str) {
        char[] stack = new char[str.length()];
        int top = -1;
        for (char ch : str.toCharArray()) stack[++top] = ch;

        StringBuilder sb = new StringBuilder();
        while (top != -1) sb.append(stack[top--]);
        return sb.toString();
    }

    // ---------------- Q6: Evaluate Postfix ----------------
    static int evaluatePostfix(String expr) {
        int[] stack = new int[expr.length()];
        int top = -1;

        for (char ch : expr.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack[++top] = ch - '0';
            } else {
                int b = stack[top--];
                int a = stack[top--];
                switch (ch) {
                    case '+': stack[++top] = a + b; break;
                    case '-': stack[++top] = a - b; break;
                    case '*': stack[++top] = a * b; break;
                    case '/': stack[++top] = a / b; break;
                }
            }
        }
        return stack[top];
    }

    // ---------------- Q7: Infix to Postfix ----------------
    static String infixToPostfix(String expr) {
        char[] stack = new char[expr.length()];
        int top = -1;
        StringBuilder result = new StringBuilder();

        for (char ch : expr.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack[++top] = ch;
            } else if (ch == ')') {
                while (top != -1 && stack[top] != '(') result.append(stack[top--]);
                top--; // pop '('
            } else { // operator
                while (top != -1 && precedence(stack[top]) >= precedence(ch)) {
                    result.append(stack[top--]);
                }
                stack[++top] = ch;
            }
        }
        while (top != -1) result.append(stack[top--]);
        return result.toString();
    }

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return -1;
    }

    // ---------------- Q8: Next Greater Element ----------------
    static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] stack = new int[n];
        int top = -1;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (top != -1 && stack[top] <= arr[i]) top--;
            result[i] = (top == -1) ? -1 : stack[top];
            stack[++top] = arr[i];
        }
        return result;
    }

    // ---------------- Q9: Two Stacks in One Array ----------------
    static class TwoStacks {
        int[] arr;
        int top1, top2;

        TwoStacks(int size) {
            arr = new int[size];
            top1 = -1;
            top2 = size;
        }

        void push1(int val) {
            if (top1 < top2 - 1) arr[++top1] = val;
            else System.out.println("Stack1 Overflow");
        }

        void push2(int val) {
            if (top1 < top2 - 1) arr[--top2] = val;
            else System.out.println("Stack2 Overflow");
        }

        int pop1() {
            if (top1 >= 0) return arr[top1--];
            System.out.println("Stack1 Underflow");
            return -1;
        }

        int pop2() {
            if (top2 < arr.length) return arr[top2++];
            System.out.println("Stack2 Underflow");
            return -1;
        }
    }

    // ---------------- Q10: Stack with getMin() in O(1) ----------------
    static class MinStack {
        int[] stack;
        int[] minStack;
        int top;

        MinStack(int size) {
            stack = new int[size];
            minStack = new int[size];
            top = -1;
        }

        void push(int val) {
            stack[++top] = val;
            if (top == 0) minStack[top] = val;
            else minStack[top] = Math.min(val, minStack[top - 1]);
        }

        int pop() {
            if (top == -1) return -1;
            return stack[top--];
        }

        int getMin() {
            if (top == -1) return -1;
            return minStack[top];
        }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        // Q4
        String expr = "({[]})";
        System.out.println("Balanced? " + isBalanced(expr));

        // Q5
        System.out.println("Reverse of 'hello': " + reverseString("hello"));

        // Q6
        System.out.println("Postfix '231*+9-' = " + evaluatePostfix("231*+9-"));

        // Q7
        System.out.println("Infix A+B*C -> Postfix: " + infixToPostfix("A+B*C"));

        // Q8
        int[] arr = {4, 5, 2, 25};
        System.out.println("Next Greater Elements: " + Arrays.toString(nextGreaterElement(arr)));

        // Q9
        TwoStacks ts = new TwoStacks(5);
        ts.push1(10); ts.push2(20); ts.push1(30);
        System.out.println("Pop1: " + ts.pop1() + ", Pop2: " + ts.pop2());

        // Q10
        MinStack ms = new MinStack(10);
        ms.push(5); ms.push(3); ms.push(7);
        System.out.println("Current Min: " + ms.getMin());
        ms.pop();
        System.out.println("Current Min after pop: " + ms.getMin());
    }
}
