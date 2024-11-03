import java.io.File;
 import java.io.FileInputStream;
 import java.io.ObjectInputStream;
import java.io.Serializable;
class test5
{
    public static void main(String[] args) 
{ 
        try
    {
        File file =new File("employee.txt");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream OOs=new ObjectInputStream(fis);
        employee E1=( employee)OOs.readObject();
        System.out.println(E1.getname());
        System.out.println(E1.EId());
        System.out.println(E1.add());


    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
}

 
    

 
    

