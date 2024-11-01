 import java.io.File;
 import java.io.FileOutputStream;
 import java.io.ObjectOutputStream;
import java.io.Serializable;
 class employee implements Serializable {
   
        String ename;
         transient int EId;
        String add;
        employee(String ename,int EId,String add)
        {
            this.ename=ename;
            this.EId=EId;
            this.add=add;
        }

         
        String getname()
        {
            return ename;
        }
        int EId()
        {
            return EId;
        }
        String add()
        {
            return add;
        
        }
    }
    class test3{
        public static void main(String[] args) {
            try
            {
            File file =new File("employee.txt");
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream OOs=new ObjectOutputStream(fos);
            employee E1=new employee("Mahima",101,"Indore");
            OOs.writeObject(E1);
            System.out.println("sucess");
            

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

    
    

 
