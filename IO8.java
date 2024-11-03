
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
class Test8
{
    public static void main(String[] args) {
        try
        {
           File file=new File("file1.txt");
           FileInputStream fis=new FileInputStream(file);
           String line ="";
           int count=0;
          FileReader f1=new FileReader("file1.txt");
          BufferedReader br=new BufferedReader(f1);
          while((line=br.readLine())!=null)
        {
            String words[]=line.split("");
            count=count+words.length;
        }
        System.out.println(count);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
 
    
}
}

