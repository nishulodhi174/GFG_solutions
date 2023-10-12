//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Solution
// {
//     //Function to find the first non-repeating character in a string.
//     static char nonrepeatingCharacter(String S)
//     {
//         char ch ;
//         for(int i = 0;i<S.length()-1;i++){
//             int var=0;
//             ch = S.charAt(i);
//             for(int j=i+1;j<S.length();j++){
//                 if(ch == S.charAt(j)){
//                     var++;
//                 }
//             }
//             if(var == 0){
//                 return ch;
//             }
//         }
//         return '$';
//     }
// }
class Solution
{
    static char nonrepeatingCharacter(String s)
    {
        for(char c:s.toCharArray()){
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return c;
            }
        }
        return '$';
    }
}
