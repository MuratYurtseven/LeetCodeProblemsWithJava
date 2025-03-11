package EasyLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class reverseStack {

    public static Stack<Integer> reversedStack(Stack<Integer> stack){

        Stack<Integer> reversedStack = new Stack<>();
        List<Integer> arr= new ArrayList<>();
        while (!stack.isEmpty()){
            arr.add(stack.pop());
        }

        for (int i = 0; i <arr.size() ; i++) {
            reversedStack.push(arr.get(i));
        }


        return reversedStack;
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Stack<Integer> revStack = reversedStack(stack);
        while (!revStack.isEmpty()){
            System.out.println(revStack.pop());
        }

    }
}
