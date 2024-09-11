class calculator{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;

    } 
 // here two add method is used to do addition  operations only we pass different parameter. 

    public int add(int n1,int n2){ 
        return n1+n2;
     } // method overloading means a method is used mutiple times 
}
 public class methodoverloading{
    public static void main(String arg[]){
        calculator obj=new calculator();
       int r1= obj.add(6,7);
       int r2= obj.add(2,3,4);
        System.out.println(r1);
         System.out.println(r2);



    }
 }