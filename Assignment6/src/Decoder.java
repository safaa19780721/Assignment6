import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Decoder implements IDecoder {

	@Override
	public void decode(String filePath) {
		File file = new File(filePath);
		RandomAccessFile scan;
		String message = new String();
		try {
			
				scan = new RandomAccessFile(file, "r");
				int bytes = 0;
				while(bytes != -1)
				{
					message += scan.readChar();
					bytes = scan.readInt();
					for(int i = 0; i < bytes; i++)
					{
						scan.readByte();
					}
				}
			scan.close();

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		System.out.print(message);
	}

}
