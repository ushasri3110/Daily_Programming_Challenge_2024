import java.util.ArrayList;

public class ReverseString {
    public static void main(String[] args){
        String str="the sky is blue";
        str=str.trim();
        ArrayList<String> words=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int start=0;
        int end;
        for (end=0;end<str.length();end++){
            if (str.charAt(end)==' '){
                if (start!=end){
                    words.add(str.substring(start,end));
                }
                start=end+1;
            }
        }
        words.add(str.substring(start,end));
        for (int i=words.size()-1;i>=0;i--){
            sb.append(words.get(i));
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());

    }
}
