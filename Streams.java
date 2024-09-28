/*
 * Basic implmentation and understanding of the streams API in java. 
 * Streams are often referred to as lazy as they are closed as soon as an operation is performed on them.
 * Streams are important for making tasks easier and you know, to skip the boring basic algorithms in problem solving :P
 */

import java.util.*;
import java.util.stream.*;
import java.lang.*;

class xerexes
{
    public void main()
        {    
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the number of elements you want to enter : ");
            int n =sc.nextInt();
            String arr[]= new String[n];
            for(int i=0;i<n;i++)
            {
                String z= sc.nextLine();
                arr[i]=z;
            }
            
            boolean cond =true;
            
        while(cond)
        {
            System.out.println("***************************MAIN MENU*******************");
            System.out.println("Enter 1 to display Strings of even length");
            System.out.println("Enter 2 to display Strings starting with an alphabet");
            System.out.println("Enter 3 to display Strings ending with an alphabet");
            System.out.println("Enter 4 for displaying Strings as UpperCase or lowercase");
            System.out.println("Enter 5 for appending a string at the end");
            System.out.println("Enter 6 for showing distinct strings");
            System.out.println("Enter 7 for alphabetically ordering strings");
            System.out.println("Enter 99 for exit !");
            int x=sc.nextInt();
            
            Scanner sc2= new Scanner(System.in);
            
                switch(x)
                {
                    case 1:
                        {
                            System.out.print("No of even length strings : ");
                            Stream <String> st = Arrays.stream(arr);
                            ArrayList <String> al = st.filter(ex-> (ex.length())%2==0).collect(Collectors.toCollection(ArrayList::new));
                            System.out.println(al);
                            };break;
                    
                    case 2:
                        {
                            System.out.println("Enter the starting substring to be checked : ");
                            String xy = sc2.nextLine();
                            Stream <String> st = Arrays.stream(arr);
                            ArrayList <String> al = st.filter(ex-> ex.startsWith(xy)).collect(Collectors.toCollection(ArrayList::new));
                            System.out.println(al);
                            };break;
                    
                    case 3:
                        {
                            System.out.println("Enter the starting substring to be checked : ");
                            String xy = sc2.nextLine();
                            Stream <String> st = Arrays.stream(arr);
                            ArrayList <String> al = st.filter(ex-> ex.endsWith(xy)).collect(Collectors.toCollection(ArrayList::new));
                            System.out.println(al);
                            };break;
                    
                    case 4:
                        {
                            System.out.println("Enter U for Upper Case \n Enter L for Lower case ");
                            char choice =sc2.nextLine().charAt(0);
                            
                            if(choice=='U')
                            {
                                System.out.println("Here are the uppercase letters");
                                Stream <String> st = Arrays.stream(arr);
                                ArrayList <String> al = st.map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new));
                                System.out.println(al);
                            }
                            else if(choice=='L')
                            {
                                System.out.println("Here are the uppercase letters");
                                Stream <String> st = Arrays.stream(arr);
                                ArrayList <String> al = st.map(String::toLowerCase).collect(Collectors.toCollection(ArrayList::new));
                                System.out.println(al);
                            }
                            else
                            {
                                System.out.println("Wrong Choice !");
                            }
                            };break;
                    
                    case 5:
                        {
                            System.out.println("Enter the string to be appended :");
                            String suf=sc2.nextLine();
                            
                            Stream<String> st = Arrays.stream(arr);
                            ArrayList <String> al = st.map(ex->ex+suf).collect(Collectors.toCollection(ArrayList::new));
                            System.out.println(al);
                        };break;
                        
                    case 6:
                        {
                            System.out.println("Distinct / unique strings are :");
                            Stream<String> st = Arrays.stream(arr);
                            ArrayList <String> al = st.distinct().collect(Collectors.toCollection(ArrayList::new));
                            System.out.println(al);
                        };break;
                    
                    case 7:
                        {
                            Stream <String> s = Arrays.stream(arr);
                
                            ArrayList <String> arl=s.sorted().
                            collect(Collectors.toCollection(ArrayList::new));
                            System.out.println(arl);
                
                            s = Arrays.stream(arr);
                            String [] arrom = s.sorted().toArray(String[]::new);
                
                        };break;
                        
                    case 99:
                        {
                            System.out.println("Bye!");
                            cond=false;
                        };break;
                        
                    default:
                        {
                            System.out.println("Wrong choice ! Retry !!");
                        }
                        
                    if(!cond)
                    {
                        break;
                    }
            }
        }
    }
}