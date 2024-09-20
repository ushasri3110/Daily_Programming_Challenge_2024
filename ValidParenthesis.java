import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s){
        if (s.length()%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for (char c:s.toCharArray()){
            if (stack.isEmpty()){
                stack.push(c);
            }
            else if ((stack.peek()=='{' && c=='}')||(stack.peek()=='(' && c==')')||(stack.peek()=='[' && c==']')){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String s="[{()}]";
        System.out.println(isValid(s));
    }
}
