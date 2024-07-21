// program to print all the binary strings of a aprticular length
import java.util.*;
class binCombx
{
    ArrayList<String> al = new ArrayList<>();
    public void binaryCombinations(String y,int x,int c)
    {
        if(y.length()==x)
        {
            al.add(y);
        }
        else
        {
            c++;
            binaryCombinations(y+"0",x,c);
            binaryCombinations(y+"1",x,c);
        }
    }
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the binary numbers to be : ");
        int x = sc.nextInt();
        
        binaryCombinations("1",x,1);
        System.out.println(al);
    }
}