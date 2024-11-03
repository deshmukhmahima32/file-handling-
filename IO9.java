import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
class Test9
{
    public static void main(String[] args) 
    {
        try
        {     
        int count=0;
        File file=new File("file1.txt");
        FileInputStream fis=new FileInputStream(file);
        String data1="";

        
        int x=0;
        while (true) 
        {
              x=fis.read();
            if((char)x==' '||(char)x=='.')
            {
                count++;
            }
            else if(x==-1)
            break;
            data1=data1+(char)x;
        }
           System.out.println(count);
           long l=file.length();
           System.out.println(l);
           long avg=(file.length()/count);
           System.out.println(avg);
        }
    catch(Exception e)
    {
        e.printStackTrace();
    }

}
    
}

