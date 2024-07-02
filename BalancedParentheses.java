package com.assignment3;
import java.util.*;

public class BalancedParentheses {

        public static boolean isBalanced(String exp) {
            Stack<Character> stack = new Stack<>();

            // Traverse the expression string
            for (int i = 0; i < exp.length(); i++) {
                char current = exp.charAt(i);

                // If current character is an opening bracket, push it to stack
                if (current == '(' || current == '{' || current == '[') {
                    stack.push(current);
                }
                // If current character is a closing bracket
                else if (current == ')' || current == '}' || current == ']') {
                    // If stack is empty, there is no matching opening bracket
                    if (stack.isEmpty()) {
                        return false;
                    }

                    // Pop the top element from stack and compare if it matches
                    char top = stack.pop();
                    if ((current == ')' && top != '(') ||
                            (current == '}' && top != '{') ||
                            (current == ']' && top != '[')) {
                        return false;
                    }
                }
            }

            // If stack is not empty, then there are unmatched opening brackets
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter expression: ");
            String exp = sc.nextLine();

            if (isBalanced(exp)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
        }
    }
