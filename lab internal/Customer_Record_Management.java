import java.sql.*;
import java.util.*;

class Customer_Record_Management
{
    public static void printdet(ResultSet rs)
    {
        try
        {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            System.out.println("-----------------------------------------------------------------");
    
            for (int i = 1; i <= columnCount; i++) 
            {
                System.out.printf("%-20s", rsmd.getColumnName(i));
            }
            System.out.println();
    
            for (int i = 1; i <= columnCount; i++) 
            {
                    System.out.printf("%-20s", rs.getString(i));
            }
            System.out.println();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    public static void main(String [] args)
    {
        String url="jdbc:mysql://localhost:3300/ramaa";
        String username="root";
        String password="Tanuku@1";
        
        Scanner sc = new Scanner(System.in);
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                      ResultSet.CONCUR_UPDATABLE);
            System.out.println("Welcome ! here are the options");
            
            String init_query="SELECT * FROM customers";
            
            ResultSet rs =statement.executeQuery(init_query);
            
            //rs.first();
            printdet(rs);
            
            //System.out.println("[N]ext: Move to the next record.\n[P]revious: Move to the previous record.\n[F]irst: Move to the first record.\n"
            //+"[L]ast: Move to the last record. \n[E]xit: Exit the application.\n[I]nsert: Insert a new record \n[D]elete: Delete the record");
            
            boolean flag=true;
            while(flag)
            {
                System.out.println("[N]ext: Move to the next record.\n[P]revious: Move to the previous record.\n[F]irst: Move to the first record.\n"
                +"[L]ast: Move to the last record. \n[E]xit: Exit the application.\n[I]nsert: Insert a new record \n[D]elete: Delete the record");
                
                char x= sc.nextLine().charAt(0);
                switch(x)
                {
                    case 'N':
                        {
                            if(rs.next())
                            {
                                printdet(rs);
                                break;
                            }
                            else
                            {
                                System.out.println("Reached the end ! Navigate through other options");
                            }
                        }
                    case 'P':
                        {
                            if(rs.previous())
                            {
                                printdet(rs);
                                break;
                            }
                            else
                            {
                                System.out.println("Reached the start ! Navigate through other options");
                            }
                        }
                    case 'F':
                        {
                            rs.first();
                            printdet(rs);
                            break;
                        }
                    case 'L':
                        {
                            rs.last();
                            printdet(rs);
                            break;
                        }
                    case 'I':
                    {
                        System.out.println("Enter your name : ");                        
                        String nam=sc.nextLine();
                        System.out.println("Enter your mail : ");  
                        String mail=sc.nextLine();
                        System.out.println("Enter your phone : ");  
                        String phon=sc.nextLine();
                        
                        rs.moveToInsertRow();
            
                        rs.updateString("name", nam);
                        rs.updateString("email", mail);
                        rs.updateString("phone", phon);
                        rs.insertRow();
            
                        // Move back to the current row
                        rs.moveToCurrentRow();

                        printdet(rs);
            
                        System.out.println("Row inserted successfully.");
                                }
                    case 'D':
                    {
                        rs.deleteRow();
                        printdet(rs);
                        break;
                    }
                    case 'E':flag=false;break;
                    default:System.out.println("Error in input !!!");
                }
                
                if(flag==false)
                {
                    rs.close();
                    break;
                }
            }        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}