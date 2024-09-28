import java.util.*;
/* strobogrammatic numbers :
 * 
 * n=1 : 0, 1,8
 * n=2 : 11,69,96,88
 * n=3 : 101,808,609,906,111,619,818,916,181,689,986,868
 * n=4 : 1001,8008,6009,9006,1111,6119,8118,9116
 * 
 * Strobo from 1 to n size
 */


class strogrammatic
{
    public static ArrayList<String> recu(int x)
    {
        if(x==0)
        {
            return new ArrayList<>(Arrays.asList(""));
        }
        if(x==1)
        {
            return new ArrayList<>(Arrays.asList("0","1","8"));
        }
        String buf="";
        ArrayList<String> fin = recu(1);
        for(int i=0;i<(x-1);i++)
        {
            if(i==0)
            {
                fin.add("1"+buf+"1");
                fin.add("6"+buf+"9");
                fin.add("9"+buf+"6");
                fin.add("8"+buf+"8");
            }
            for(String z: recu(1))
            {
                if(i!=0)
                {
                    buf=z.repeat(i);
                    fin.add("1"+buf+"1");
                    fin.add("6"+buf+"9");
                    fin.add("9"+buf+"6");
                    fin.add("8"+buf+"8");
                }
            }
        }
        return fin;
    }
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(recu(a));
    }
}