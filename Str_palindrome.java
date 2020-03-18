import java.util.Scanner;

/**
 *
 * @author Gayatri
 */
public class Str_palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int i;
        char temp;
        System.out.println("Enter a string : ");
        String s=sc.nextLine();
        int l=s.length();
        String reverse="";
        for(i=0; i<l; i++)
       {
           reverse = reverse + s.charAt(i);
       }
        if(reverse.equalsIgnoreCase(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
    
}
