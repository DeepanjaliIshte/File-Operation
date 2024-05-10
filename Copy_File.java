// coping characters from one file(input.dat) to another file (output.dat).

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_File {

	public static void main(String[] args) {
		File infile=new File("input.dat");
		File outfile= new File("Output.dat");
		FileReader ins= null;
		FileWriter outs=null;
		try
		{
			ins=new FileReader(infile);
			outs=new FileWriter(outfile);
			int ch;
			while((ch=ins.read())!= -1)
				{
					outs.write(ch);
				}
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);
		}
		finally
		{
			try
			{
				ins.close();
				outs.close();
			}
			catch(IOException ioe)
			{
				
			}
		}
	}
}
