public class LongestPalindromicSubstring {
    public static String palindrome(String s,int start,int end){
        while (start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(start+1,end);
    }
    public static String longestPalindrome(String s){
        String result="";
        for (int i=0;i<s.length();i++){
            String longest="";
            String evenPalindrome=palindrome(s,i-1,i);
            String oddPalindrome=palindrome(s,i,i);
            longest=evenPalindrome.length()>oddPalindrome.length()?evenPalindrome:oddPalindrome;
            result=longest.length()>result.length()?longest:result;
        }
        return result;
    }
    public static void main(String[] args){
        String s="babad";
        System.out.println("Longest Palindromic Substring is :"+longestPalindrome(s));
    }
}
