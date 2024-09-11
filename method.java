class computer{
    public void playMusic(){
        System.out.println("Music Playing...");

    }

    public String getMeAPen(int cost){
        if(cost>=10)
        return "Pen";
        
        else 
            return "Nothing";

        

    }
}
public class method{
public static void main(String arg[]){
    computer obj=new computer();
    obj.playMusic();

   String str=obj.getMeAPen(1);
   System.out.println(str);


}
}
