import java.io.File;

public class Deleting_Files_Demo
{
	public static void main(String[ ] args)
	{
		//create file which you want to declare
		File file= new File("Myfile.txt");
		boolean status =file.delete();
		if(status)
			System.out.println("File delete Successfully ..!");
		else
			System.out.println("File name Myfile.txt does not exists");
	}
}
