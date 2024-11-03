 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
class Test6
{
    public static void main(String[] args) {
        try
        {
        File file=new File("file1.txt");
        FileOutputStream fos=new FileOutputStream(file,true);
        String input_data=" It is Ite Ate";
        byte b[]=input_data.getBytes();
        fos.write(b);
        System.out.println("Done");
        }
        catch(Exception e)
       {
        e.printStackTrace();
       }
}
    
}