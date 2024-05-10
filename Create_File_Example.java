import java.io.File;

public class Create_File_Example
{
	public static void main(String[ ] args)
	{
		File f=null;
		boolean bool= false;
		try
		{
		 //create new file
		 f= new File("Deepa.txt");
		 // tries to create new file in the System
		 bool=f.createNewFile();
		 //prints
		 System.out.println("File create : "+bool);
		 f.delete();
		 // delete() is invoked
		 System.out.println("delete() method is invoked");
		 //tries to create new file in the System
		 bool=f.createNewFile();
		 //print
		 System.out.println("File Created : ");
		}
	 catch(Exception e)
	 	{
		 e.printStackTrace();
	 	}
 	}
}
