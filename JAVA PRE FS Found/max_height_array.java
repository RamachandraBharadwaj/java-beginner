/*
 * You are developing an inventory management system for a retail company.
The company wants to introduce a new feature where it can predict when
the inventory for a product might need restocking. The inventory levels
for various products are recorded daily, and the company wants to monitor
the next higher stock level for each product to anticipate demand.

Given an array stock levels where each element represents the daily inventory
level of a particular product over a certain period, write a function to find
the "next higher stock level" for every day. The "next higher stock level" for
a given day is defined as the first higher stock level recorded in
the subsequent days. If no higher stock level is found in the following days,
return -1.

## Sample Input:

Line-1: An integer N, Number of days.
Line-2: N space separated integers,

## Sample Output:

An integer array according to problem.

## Sample Input-1:

3
10 15 10

## Sample Output-1:

[15, -1, -1]

## Explanation-1:

- For day 1 (stock level = 10), the next higher stock level is 15.
- For day 2 (stock level = 15), there is no higher stock level in the subsequent days.
- For day 3 (stock level = 10), there is no higher stock level in the subsequent days.
 */

import java.util.*;

class max_height_array
{
    public static int maximum(int array[], int st, int end)
    {
        int ma=-1;
        int start= array[st];
        
        for(int i=st;i<end;i++)
        {
            if(array[i]>start)
            {
                ma=array[i];
                break;
            }
        }
        return ma;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> al = new ArrayList<>();
        String z=sc.nextLine();
        
        String [] arro=z.split(" ");
        int arr[]=new int[arro.length];
        int c=0;
        for(String x : arro)
        {
            arr[c]=Integer.parseInt(x);
            c++;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(i<arr.length-1)
            {
                if(arr[i]<arr[i+1])
                {
                    al.add(arr[i+1]);
                }
                else
                {
                    al.add(maximum(arr,i,arr.length));
                }
                continue;
            }
            al.add(-1);
        }
        
        System.out.println(al);
    }
}