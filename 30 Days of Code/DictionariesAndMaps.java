import java.util.*;
import java.io.*;

public class DictionariesAndMaps {
    public static void main(String []argh){
        Map<String, Integer> contacts = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contacts.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (contacts.containsKey(s)) {
                contacts.get(s);
                System.out.println(s+"="+contacts.get(s));
            }
            else {
                System.out.println("Not found");
            }        }
        in.close();
    }
}
