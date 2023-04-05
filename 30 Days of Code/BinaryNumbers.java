import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int count=0;
        int consecutives =0;
        while(n>0)
        {

            if(n%2==1)
            {

                count++;
                if(count>=consecutives)
                {
                    consecutives=count;
                }
            }
            else
            {
                count=0;
            }

            n=n/2;
        }
        scanner.close();
        System.out.println(consecutives);
    }
}
