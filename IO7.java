import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
class Test7
{
    public static void main(String[] args) {
        try
        {
            int count=0;
        
        File file=new File("file1.txt");
        FileInputStream fis=new FileInputStream(file);
        String data1="";
        while (true) {
            
            int x=fis.read();
            if(x=='t')
            {
                count++;
            }
            if(x==-1)
            break;
            data1=data1+(char)x;
            }
            System.out.println(count);
        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    
}


    

