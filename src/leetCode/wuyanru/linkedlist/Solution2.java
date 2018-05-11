package leetCode.wuyanru.linkedlist;

import java.util.Stack;

import com.wuyanru.tree.Solution47;
import com.wuyanru.tree.TreeNode;


/**
 * 
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are+,-,*,/. Each operand may be an integer or another expression.

Some examples:

  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
    
 */

public class Solution2 {
	 public int evalRPN(String[] tokens) {
		    Stack<Integer> stack = new Stack<Integer>();
		    for(int i = 0;i<tokens.length;i++){
		      try{
		        int num = Integer.parseInt(tokens[i]);
		        stack.add(num);
		      }catch (Exception e) {
		        int b = stack.pop();
		        int a = stack.pop();
		        stack.add(get(a, b, tokens[i]));
		      }
		    }
		    return stack.pop();
	  }
      private int get(int a,int b,String operator){
		    switch (operator) {
		    case "+":
		      return a+b;
		    case "-":
		      return a-b;
		    case "*":
		      return a*b;
		    case "/":
		      return a/b;
		    default:
		      return 0;
		    }
	 }
	
	public static void main(String[] args) {
		String str[]={"4","3","-"};
		Solution2 s=new Solution2();
		System.out.println(s.evalRPN(str));

	}
	
}
