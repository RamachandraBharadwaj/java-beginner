/*
 * Reverse the sequence of words
 */

import java.util.*;
class Rev
{
    public static String finom()
    {
        Scanner sc = new Scanner(System.in);
        String fin = sc.nextLine();
        
        String[] arr=fin.split("\\.");
        
        String ala="";
        for(int i=arr.length-1;i>=0;i--)
        {
            ala+=arr[i];
            
            if(i!=0)
            {
                ala+=".";
            }
        }
        
        return ala;
    }
    
    public static void main(String [] args)
    {
        System.out.println(finom());
    }
}