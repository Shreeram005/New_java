public class Except{
    public static void main(String arg[]){
        int i=0;
        int j=0;
        try{
           j= 18/i;
            if(j==0)
            throw new ArithmeticException("I dont want to print zero");
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("Thats the defaut output"+e);
           }
           catch(Exception e){
            System.out.println("Something went wrong "+e);

           }
           System.out.println(j);
           System.out.println("Bye");

    }
}