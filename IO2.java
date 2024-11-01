import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
class Test2
{
    public static void main(String[] args) 
    {
        try
        {
        File file=new File("file1.txt");
        FileInputStream fis=new FileInputStream(file);
        String data1="";
        while (true) {
            int x=fis.read();
            if(x==-1)
            break;
            data1=data1+(char)x;
           }
           System.out.println(data1);
        }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    
}

