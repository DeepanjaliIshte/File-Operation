// 1] Reading/Writing using a random access file.

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
public class Random_IO
{
	public static void main(String[] args) 
	{
		RandomAccessFile file=null;
		try
		{
			file= new RandomAccessFile(" rand.dat","rw");
			// writing to a file
			file.writeChar('S');
			file.writeInt(1010);
			file.writeDouble(17.10710);
			file.seek(0);	// Go to the beginning
			// Reading from the file
			System.out.println(file.readChar());
			System.out.println(file.readInt());
			System.out.println(file.readDouble());
			file.seek(2);
			System.out.println(file.readInt());
			//goto end and append fabe to the file
			file.seek(file.length());
			file.writeBoolean(true);
			file.seek(4);
			System.out.println(file.readBoolean());
			file.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
