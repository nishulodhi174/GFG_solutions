//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sequence(int n){
        long ans = 0l;
        long counter = 1l;
        for(int i = 1;i<=n;i++){
            long prod = 1l;
            for(int j=1;j<=i;j++){
                prod = (counter*prod) % 1000000007;
                counter++;
            }
            ans = (ans+prod) % 1000000007;
        }
        return ans;
    }
}