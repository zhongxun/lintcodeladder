/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.Stack;

/**
 *
 * @author v-xuzhon
 */
public class EvaluateReversePolishNotation {

  public int evalRPN(String[] tokens) {
    // Write your code here
    Stack<Integer> stack = new Stack<>();

    for (String s : tokens) {
      if (s == "+" || s == "-" || s == "*" || s == "/") {
        int op2 = stack.pop();
        int op1 = stack.pop();

        switch (s) {
          case "+":
            op1 = op1 + op2;
            break;

          case "-":
            op1 = op1 - op2;
            break;

          case "*":
            op1 = op1 * op2;
            break;

          case "/":
            op1 = op1 / op2;
            break;
        }

        stack.push(op1);
      } else {
        stack.push(Integer.parseInt(s));
      }
    }

    return stack.pop();
  }
}
