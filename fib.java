import java.util.*;
public class Fib{
    public static void main(String arg[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the nth term ");
        int a=inp.nextInt();
        int p=0;
        for(int i=0;i<=a;i++){
            int j=p+i;
            p=j;
        }
        System.out.println(p);



    }

}