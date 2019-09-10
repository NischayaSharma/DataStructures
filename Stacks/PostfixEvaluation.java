import java.util.*;

class PostfixEvaluation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the postfix expression: ");
        String postfixExpression = in.nextLine();
        char postfixArr[] = new char[postfixExpression.length() + 1];
        for (int i = 0; i < postfixExpression.length(); i++) {
            postfixArr[i] = postfixExpression.charAt(i);
        }
        postfixArr[postfixExpression.length()] = ')';
        Stack stk = new Stack(postfixArr.length);
        int i = 0;
        char ch = postfixArr[i];
        while (ch != ')') {
            if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8'
                    || ch == '9' || ch == '0') {
                stk.push(Character.getNumericValue(ch));
            } else {
                int num1 = stk.pop();
                int num2 = stk.pop();
                int result = 0;
                switch (ch) {
                    case '+':
                        result = num2 + num1;
                        break;
                    case '-':
                        result = num2 - num1;
                        break;
                    case '*':
                        result = num2 * num1;
                        break;
                    case '/':
                        result = num2 / num1;
                        break;
                }
                stk.push(result);
            }
            stk.display();
            ch = postfixArr[++i];
        }
    }
}