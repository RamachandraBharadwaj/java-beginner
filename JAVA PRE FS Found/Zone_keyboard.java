/*
 * In a futuristic virtual reality (VR) game world, players are provided with custom VR keypads that are similar to modern American keyboards but have some restrictions. The keypad is divided into three distinct zones, and each zone contains specific letters that the player can use for a task.
    - Zone 1: Letters on the top row: "qwertyuiop"
    - Zone 2: Letters on the middle row: "asdfghjkl"
    - Zone 3: Letters on the bottom row: "zxcvbnm"

Players are given a set of secret codes (words), and they must type these codes using only letters from one zone at a time. If a word uses letters from more than one zone, it will be considered invalid and cannot be typed.

Your task is to help the players by filtering out the valid secret codes (words) that can be typed using letters from only one zone.

Given a list of secret codes (words), return the codes that can be typed using letters from only one zone of the VR keypad.

Constraints:
------------
1 ≤ secretCodes.length ≤ 20
1 ≤ secretCodes[i].length ≤ 100
secretCodes[i] consists of English letters (both lowercase and uppercase).

Input Format:
-------------
Space separated words, secretCodes[]

Output Format:
--------------
A list of codes that can be typed using letters from only one zone.


Sample Input-1:
---------------
Galaxy Mars Venus Sky

Sample Output-1:
----------------
["Mars", "Sky"]

Explanation:
------------
"Mars" can be typed using only Zone 2.
"Sky" can be typed using only Zone 3.
"Galaxy" and "Venus" use letters from multiple zones and are thus invalid.


Sample Input-2:
---------------
keyboard monkey

Sample Output-2:
----------------
[]

Explanation:
------------
None of the words can be typed using letters from only one zone.


Sample Input-3:
---------------
qw er ty

Sample Output-3:
----------------
["qw", "er", "ty"]

Explanation:
------------
All the codes can be typed using only letters from Zone 1.

 */

import java.util.*;
class Zone_keyboard
{
    public static void main(String [] args)
    {
        HashMap <Integer,String> hmp= new HashMap<>();
        hmp.put(1,"qwertyuiop");
        hmp.put(2,"asdfghjkl");
        hmp.put(3,"zxcvbnm");
        
        Scanner sc= new Scanner(System.in);
        String x= sc.nextLine();
        String [] arro= x.split(" ");
        
        ArrayList<String> al = new ArrayList<>();
        
        for(String y :arro)
        {
            int z=-1;
            boolean cond=true;
            for(int i=0;i<y.length();i++)
            {
                char a=y.charAt(i);
                if(z==-1)
                {
    
                    for(Map.Entry<Integer,String> rr : hmp.entrySet())
                    {
                        int k =rr.getKey();
                        String v=rr.getValue();
                        
                        if(v.contains(Character.toString(a)))
                        {
                            z=k;
                            break;
                        }
                    }
                }
                else
                {
                    String chk=hmp.get(z);
                    if(!chk.contains(Character.toString(a)))
                    {
                        cond=false;
                        break;
                    }
                }
            }
            if(cond)
            {
                al.add(y);
            }
        }
        System.out.println(al);
        
    }
    
}