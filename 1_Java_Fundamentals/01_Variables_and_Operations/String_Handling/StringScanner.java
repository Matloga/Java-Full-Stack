import java.util.Scanner;

public class StringScanner 
{

    public static void main (String[] args)
    {
        String s1, s2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter second strings ");
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();

        int 11 = s1.length();
        int 12 = s2.length();

        System.out.println("Length of first string is : " + 11);
        System.out.println("Length of second string is : " + 12);

        String s3 = s1 + s2;   // s1.concat(s2);
        System.out.println("Results on Concatination is : " + s3);

        s1 = s1.toUpperCase();
        System.out.println("First string in Upper Case : " + s1);

        s2 = s2.toLowerCase();
    }  
}
