package com.kabaso.mock.week11.task2;
import java.util.Stack;

public class Calculator {
//Write a program to implement a basic calculator using stacks. 
    public static void main(String[] args) {
        String expression = "2 + 3 * 4 - 5";
        System.out.println(evaluate(expression));
    }

    public static int evaluate(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                StringBuilder num = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num.append(expression.charAt(i));
                    i++;
                }
                i--;
                operands.push(Integer.parseInt(num.toString()));
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    evaluateTop(operands, operators);
                }
                operators.pop(); 
            } else if (isOperator(ch)) {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    evaluateTop(operands, operators);
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            evaluateTop(operands, operators);
        }

        return operands.pop();
    }

    private static void evaluateTop(Stack<Integer> operands, Stack<Character> operators) {
        char op = operators.pop();
        int right = operands.pop();
        int left = operands.pop();

        switch (op) {
            case '+':
                operands.push(left + right);
                break;
            case '-':
                operands.push(left - right);
                break;
            case '*':
                operands.push(left * right);
                break;
            case '/':
                operands.push(left / right);
                break;
        }
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}