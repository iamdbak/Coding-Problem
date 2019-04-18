
package ispalin;

/**
 *
 * @author divyaraj
 */
import java.io.*;
public class IsPalin 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ISR);
        
        System.out.println("Enter a Number to check isPalin ");
        String V1= br.readLine();
        int x = Integer.parseInt(V1);
        
        int y=x,rem,rev=0;
        while(x!=0)
        {
            rem = x%10;
            rev= rev*10+rem;
            x=x/10;
        }
        
        if(rev==y)
        {
            System.out.println("The Number " + y +" is Palindrome ");
            
        }
        else 
        {
            System.out.println("The Number " + y +" is not Palindrome ");
        }
        
    }
    
}
