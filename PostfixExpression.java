import java.util.Stack;
public class PostfixExpression {
    public static int evaluate(String s){
        s=s.trim();
        String[] arr=s.split(" ");
        Stack<Integer> stack=new Stack<>();
        for (String str:arr){
            if (str.matches("-?\\d+")){
                stack.push(Integer.parseInt(str));
            }
            else{
                int b=stack.pop();
                int a=stack.isEmpty()?0:stack.pop();
                if (str.equals("+")){
                    stack.push(a+b);
                }
                else if (str.equals("-")){
                    stack.push(a-b);
                }
                else if (str.equals("*")){
                    stack.push(a*b);
                }
                else if (str.equals("/")){
                    stack.push(a/b);
                }
                else if (str.equals("^")){
                    stack.push((int)Math.pow(a,b));
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args){
        String s= "2 1 + 3 *";
        System.out.println(evaluate(s));
    }
}
