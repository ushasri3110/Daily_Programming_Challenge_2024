import java.util.Stack;
public class SortAStackUsingRecursion {
    public static void sort(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int top=stack.pop();
        sort(stack);
        insert(stack,top);
    }
    public static void insert(Stack<Integer> stack,int ele){
        if (stack.isEmpty()||stack.peek()<=ele){
            stack.push(ele);
            return;
        }
        int top=stack.pop();
        insert(stack,ele);
        stack.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        sort(stack);
        System.out.println(stack);
    }
}
