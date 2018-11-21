public interface IEncoder {
	/**
	 * Given the paths of an input file and an output file, the encoder 
	 * will read the message from the input file, encode the message 
	 * as described above, and store it into a binary file with the
	 * given path.
	 * Includes code to handle the IOException.
	 * @param inputFileName, the name of a file with the message to be encoded
	 * @param outputFilePath, the name of a file to store the encoded message
	 */
	public void encode(String inputFileName, String outputFilePath);
}
