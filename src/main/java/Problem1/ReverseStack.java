package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty() == false){

            int x = stack.pop();
            reverseStack(stack);

            move_to_bottom(stack , x);
        }


        }
    public static void move_to_bottom(Stack<Integer> stack, int x){
        if(stack.isEmpty()){
            stack.push(x);
            return;


        }
        int y = stack.pop();
        move_to_bottom(stack,x);
        stack.push(y);


    }

    public static void main(String[]args){
        Stack<Integer> originalStack = new Stack<>();
        originalStack.add(4);
        originalStack.add(9);
        originalStack.add(14);
        originalStack.add(16);
        originalStack.add(20);
        originalStack.add(23);

        System.out.println("Original Stack: " +originalStack);

        ReverseStack s = new ReverseStack();
        s.reverseStack(originalStack);

        System.out.println("Reversed Stack: " + originalStack);
    }
}