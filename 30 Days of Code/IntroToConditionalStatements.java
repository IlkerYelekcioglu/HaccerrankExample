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



public class IntroToConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        if (n % 2 == 0) {
            if (n < 6) System.out.println("Not Weird");
            else if (n < 21) System.out.println("Weird");
            else System.out.println("Not Weird");
        } else System.out.println("Weird");
    }
}
