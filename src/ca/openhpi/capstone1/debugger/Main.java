package ca.openhpi.capstone1.debugger;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		/* There are no changes necessary in the main method */

		// An object of type File is created. 
		// It holds a reference onto the file secretCode.txt, 
		// which resides directly in our exercise folder.
		File file = new File("src/secretCode.txt");

		// In case the passed file does not exist, the program terminates here with
		// a suited output message.


		// The file is now decoded and printed out afterwards. 
		Decoder fileDecoder = new Decoder();
		System.out.print(fileDecoder.decodeFile(file));
	}
}
