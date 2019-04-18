
package even;

/**
 *
 * @author divyaraj
 */
import java.io.*;
public class Even
{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException 
    {
        //BufferedReader chuthiya = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader grant=new InputStreamReader(System.in);    
        BufferedReader andrew=new BufferedReader(grant);            
       
       System.out.println("Enter a Limit");
       String a =andrew.readLine();
       int x = Integer.parseInt(a);
       
       System.out.println("The even numbers till the limit you mentioned are : ");
       
       for (int i =0;i <=x;i++)
       {
           if (i%2==0)
           {
               System.out.println(i);
           }
       }
    }
    
}
