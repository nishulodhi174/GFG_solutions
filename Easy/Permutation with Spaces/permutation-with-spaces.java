//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    
    public static void findString(String s , ArrayList<String> al , String res)
    {
        if(s.length() == 0){
            al.add(res);
            return ;
        }
        
        
        if(res.length()!=0 && res.charAt(res.length()-1) != ' ')
        findString(s.substring(1),al,res+" "+s.charAt(0));
        
        findString(s.substring(1),al,res+s.charAt(0));
        
       
        
        
    }
    
    ArrayList<String> permutation(String S){
        ArrayList<String> al = new ArrayList<>();
        
        String res = "";
        
        findString(S,al,res);
        
        return al;
        
    }
    

    
}