import java.io.*;
import java.util.*;
class Oddcharacters {
    public static void main(String[] ar) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i));
            } else {
                System.out.print(" ");
            }
        }        
    }
}