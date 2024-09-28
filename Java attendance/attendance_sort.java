import java.io.*;
import java.util.*;

class attendance_sort
{
    public static void main(String [] args)
    {
        try
        {
            Set<String> sett = new HashSet<>();
            BufferedReader br = new  BufferedReader(new FileReader("today attendees.txt"));
            String lin="";
            while((lin=br.readLine())!=null)
            {
                //System.out.println(lin);
                //System.out.println("*".repeat(100));
                sett.add(lin);
            }
            
            ArrayList <String> al = new ArrayList<>(sett);
            Collections.sort(al);
            for(String h : al)
            {
                System.out.println(h);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    }
