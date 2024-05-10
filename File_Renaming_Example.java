import java.io.File;

public class File_Renaming_Example 
{
	public static void main(String[] args) 
	{
		File oldFile= new File("Deepa.txt");
		File NewFile= new File("Deepanjali.txt");
		boolean status = oldFile.renameTo(NewFile);
		if(status)
			System.out.println("File renamed succesfully");
		else
			System.out.println("File name Deepa.txt already exist");
	}
}
