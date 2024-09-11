import java.util.*;
public class Greatest{
    public static void main(String arg[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter any three integers ");
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    int max=a;
    if   (b > max) {
        max=b;

    }
    if   (c>max) {
        max=c;

    }
    System.out.println("The Greatest no. is "+ max);
}
}
