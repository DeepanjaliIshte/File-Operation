import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writeby {

	public static void main(String[] args)
	{
		byte Cities()= {'P','u','n','e','M','u','m','b','a','i','S','o','l','a','p','u','r' };
		FileOutputStream Outfile=null;
		try
		{
			Outfile = new FileOutputStream("city.txt");
			byte[] cities;
			Outfile.write(cities);
			Outfile.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);
		}
	}

	private static void Cities() {
		// TODO Auto-generated method stub
		
	}
}
