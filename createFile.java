import java.io.*;
class createFlie{
    public static void main(String arg[]) throws IOException
{
    File f=new File("C:\\Users\\shree\\Desktop\\File.txt");
    if(f.createNewFile()){
        System.out.println("File created ");
    }
    else{
        System.out.println("File already exists");

    }

}
}

