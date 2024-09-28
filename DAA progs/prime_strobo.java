/*
 * prime strobo numbers
 */

import java.util.*;
import java.util.*;

public class prime_strobo
{
    public static boolean isPrime(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        if(n==2 || n==3)
        {
            return true;
        }
        else
        {
            int c=0;
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            
            if(c==0)
            {
                return true;
            }
            
            return false;
        }
    }
    
    public static ArrayList<String> prime_strobogram(List<String> numbs)
    {
        ArrayList<String> prime_strobo = new ArrayList<>();
        for(String x : numbs)
        {
            if(isPrime(Integer.parseInt(x)))
            {
                System.out.println();
                prime_strobo.add(x);
            }
        }
        return prime_strobo;
    }
    
    
    public static List<String> findStrobogrammatic(int n) {
        return helper(n, n);
    }
    private static List<String> helper(int n, int finalLength) {
        if (n == 0) return Arrays.asList("");
        if (n == 1) return Arrays.asList("0", "1", "8");
        List<String> previousList = helper(n - 2, finalLength);
        List<String> resultList = new ArrayList<>();
        for (String str : previousList) {
            if (n != finalLength) {
                resultList.add("0" + str + "0");
            }
            resultList.add("1" + str + "1");
            resultList.add("6" + str + "9");
            resultList.add("8" + str + "8");
            resultList.add("9" + str + "6");
        }
        
        return resultList;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> strobogrammaticNumbers = findStrobogrammatic(n);
        Collections.sort(strobogrammaticNumbers);
        
        System.out.println(prime_strobogram(strobogrammaticNumbers));
        System.out.println(strobogrammaticNumbers.get(0)+" "+strobogrammaticNumbers.get(strobogrammaticNumbers.size()-1));
        
    }
}