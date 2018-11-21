public interface IDecoder {
	/**
	 * Given the file path of the binary file, the decoder will read the file, decode the message and 
	 * print it to the console.
	 * Includes code to handle the IOException.
	 * @param filePath, the name of the file to be decoded
	 */
	public void decode(String filePath);
}
