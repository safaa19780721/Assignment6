/*
 * Tyler Henniges and Richard Graziano
 * 11/21/18
 * CS1120-550 LA6
 * This program takes a file with a message and encodes it. It then decodes the same message and prints
 * it to the screen
 */

public class main {

	public static void main(String[] args) {
		IEncoder encoder = new Encoder();
		IDecoder decoder = new Decoder();
		String inputFileName = "input.txt";
		String encodedFileName = inputFileName+".encode";
		encoder.encode(inputFileName,encodedFileName);
		decoder.decode(encodedFileName);
	}

}
