// Threads using Anonymous class

import java.util.*;
class fuga extends Thread
{
    public void main()
    {
        Thread x = new Thread()
        {
            @Override
            public void run()
            {
                int x=90;
                int y=60;
                System.out.println(x+y);
            }
            };
            
        Thread y = new Thread()
        {
            @Override
            public void run()
            {
                int x=90042;
                int y=60244626;
                System.out.println(x+y);
            }
            };
            
        x.start();
        try{
            Thread.sleep(4000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        y.start();
    }
}