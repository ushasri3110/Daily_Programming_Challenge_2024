import java.util.Stack;

public class ReverseStackUsingRecursion {
    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int top=stack.pop();
        reverse(stack);
        insert(stack,top);
    }
    public static void insert(Stack<Integer> stack,int ele){
        if (stack.isEmpty()){
            stack.push(ele);
            return;
        }
        int top=stack.pop();
        insert(stack,ele);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        reverse(stack);
        System.out.println(stack);
    }
}
