import java.util.*;
class DutchNFalgo
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String x=sc.nextLine();
        
        int [] arr={0,1,2,0,0,0,1,1,1,2,0,2,1};
        int start=0,mid=0;
        int end= arr.length-1;
        
        while(mid<=end)
        {
            if(arr[mid]==0)
            {
                int t=arr[start];
                arr[start]=arr[mid];
                arr[mid]=t;
                
                start++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int t= arr[end];
                arr[end]=arr[mid];
                arr[mid]=t;
                end--;
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}