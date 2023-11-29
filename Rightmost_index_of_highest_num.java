import java.util.*;
class Rightmost_index_of_highest_num
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        
        int t = read.nextInt();
        int ele;
        for(int i=0; i<t; i++)
        {
            ArrayList<Integer> a = new ArrayList<Integer>();
            int n = read.nextInt();
            for(int j=0; j<n; j++){
                ele = read.nextInt();
                a.add(ele);
            }
            // Initialise the rightmost index to 0
            int right = 0;
            // Initilise the largest value to -100. The smallest element in A is -100
            int large = -100;
            
            int j = 0;
            while(j < n){
                // Here - we need to check if A[i] '=' large so that we can update the variable 'right'
                if(a.get(j) >= large){
                    large = a.get(j);
                    right = j;
                }
                j++;
            }
            System.out.println(large + " " + right);

        }
        read.close();
    }
} 