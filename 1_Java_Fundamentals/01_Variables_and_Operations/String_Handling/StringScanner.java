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

        String s3 = s1 + s2;   // s1.concat(s2);
        System.out.println("Results on Concatination is : " + s3);
    }  
}
