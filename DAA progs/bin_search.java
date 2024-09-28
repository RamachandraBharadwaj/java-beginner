/*
 * You are given a sorted array of integers and a target integer. 
Your task is to write a program that uses binary search to find the index of the target integer in the array. 
If the target is found, return its index. If the target is not found, return -1.

Your solution must have a time complexity of O(log n), where n is the number of elements in the array.

Input Format:
--------------
Line-1: An integer n (the number of elements in the array).
Line-2: n space-separated integers, representing the sorted array.
Line-3: An integer target, the value you need to search for in the array.

Output Format:
---------------
Line-1: Print a single integer, which is the index of the target element in the array. If the target is not found, print -1.

Constraints:
-------------
1 ≤ n ≤ 10^6 (size of the array)
-10^9 ≤ arr[i], target ≤ 10^9 (array elements and target value)
The array is sorted in non-decreasing order.


Sample Input-1:
---------------
6
1 3 5 7 9 11
5

Sample Output-1:
----------------
2

Explanation:
The target 5 is found at index 2.


Sample Input-2:
---------------
5
2 4 6 8 10
7

Sample Output-2:
----------------
-1

Explanation:
The target 7 is not found in the array, so the output is -1.
 */

import java.util.*;
class bin_search
{
    public static int bsearch(int [] array, int targ)
    {
        int idx=-1;
        //int mid=0;
        int st=0;
        int end=array.length-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(array[mid]<targ)
            {
                st=mid+1;
                continue;
            }
            else if(array[mid]==targ)
            {
                idx=mid;
                break;
            }
            else
            {
                end=mid-1;
            }
        }
        
        return idx;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int targ=sc.nextInt();
        
        int idx=bsearch(arr,targ);
        System.out.println(idx);
        
    }
}