package arrays;
import java.util.*;
public class LinearSearch1 {
    public static int lsearch(String Menu[], String key) {
        for(int i = 0; i < Menu.length; i++) {
           if(Menu[i].equals(key)) {
            return i;
           } 
        }
           return -1;
    }
    public static void main(String args[]) {
        String Menu[] = {"Vadapav", "Pavbhaji", "Idli", "Dosa", "Kachori"};
        String key = "Dosa";
        int result = lsearch(Menu, key);
        if(result == -1) {
            System.out.println("The key is not present");
        }
        else {
            System.out.println("key is present at index : "+result);
        }
    }
}