import java.util.*;
class pal_paranthesis {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        Stack<Character> sta = new Stack<>();
        
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '[') {
                sta.push(x.charAt(i));
            } else {
                if (!sta.isEmpty()) {
                    char z = sta.peek();
                    char t = x.charAt(i);
                    
                    if ((t == ')' && z == '(') || (t == ']' && z == '[') || (t == '}' && z == '{')) {
                        sta.pop();
                    }
                }
            }
        }
        
        for( char ex : sta)
        {
            System.out.print(ex+" ");
        }
        return sta.isEmpty();
    }
    
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        String zx = sc.nextLine();
        if(ispar(zx))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not palindrom");
        }
    }
}
