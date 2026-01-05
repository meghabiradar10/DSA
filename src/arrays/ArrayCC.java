package arrays;
import java.util.*;
public class ArrayCC {
public static void main(String args[]) {
    int[] marks = new int[100];
    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println("Phy : "+marks[0]);
     System.out.println("Che : "+marks[1]);
      System.out.println("Bio : "+marks[2]);
      marks[1] = marks[1] + 1;
      System.out.println("Che : "+marks[1]);
      System.out.println("length of array : "+marks.length);

}
}
