//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    public static int countFlips(int a[], int n)
    {
        if(n==0)
       return 0;
       if(n==1&&a[0]==0)
       return 1;
       else if(n==1&&a[0]==1)
       return 0;
      

 int count=0;
       for(int i=n-1;i>0;i--)
       {

//if element is different from orevious element than making right part same as previous
           if(a[i-1]!=a[i])
           {
           count++;
           
           }
           
       }


       if(a[0]==0)
       return count+1;
       else
       return count;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine().trim());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine().trim());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution ob = new Solution();
		    System.out.println(ob.countFlips(arr,sizeOfArray));
		}
	}
}


// } Driver Code Ends