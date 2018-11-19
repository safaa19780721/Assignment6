import java.io.*;
import java.util.*;

public class Encoder implements IEncoder {

	public void encode(String inputFileName, String outputFilePath) {
		
		File file = new File(inputFileName);
		Random random = new Random();
		Scanner scanner;
		
		try {
			
			scanner = new Scanner(file);
			String input = scanner.next();
			
			while (scanner.hasNextLine()) {
				
				input = input.concat(scanner.nextLine());
				
			}

			RandomAccessFile filerandom = new RandomAccessFile(outputFilePath, "rw");
			
			int last = input.length() - 1;
			
			for (int i = 0; i < last; i++) {
				
				char c = input.charAt(i);
				int n = random.nextInt(20) + 1;

				filerandom.writeChar(c);
				filerandom.writeInt(n);
				
				for (int j = 0; j < n; j++) {
					
					filerandom.writeByte(random.nextInt());
					
				}
				
			filerandom.writeChar(input.charAt(last));
			filerandom.writeInt(-1);
			
			}
			
			filerandom.close();
			scanner.close();

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
}
