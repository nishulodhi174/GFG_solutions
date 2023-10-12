//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    
    String reverseWords(String S)
    {
        ArrayList<String> list = new ArrayList<>();
        String ch;
        StringBuilder sb = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        for(int i = 0;i<S.length();i++){
            if(S.charAt(i) != '.'){
                sb.append(S.charAt(i));
            }
            if(S.charAt(i) == '.'){
                ch = sb.toString();
                sb = new StringBuilder();
                list.add(ch);
                list.add(".");
                continue;
            }
            if(i == S.length()-1){
                ch = sb.toString();
                sb = new StringBuilder();
                list.add(ch);
            }
        }
        StringBuilder s = new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            s.append(list.get(i));
        }
        ch = s.toString();
        return ch;
    }
}