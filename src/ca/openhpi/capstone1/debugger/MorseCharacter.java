package ca.openhpi.capstone1.debugger;

import java.util.List;

public class MorseCharacter {
	/* A MorseCharacter consists of multiple concatenated CypherSymbols. 
	 * It further contains a human readable character that is reflected by the CypherSymbols
	 * (the translation of the code).
	 */
	private List<CypherSymbol> morseSymbol;
	private char character;
	
	// Constructors and getters are still missing here.

	public MorseCharacter(char character, List<CypherSymbol> morseSymbol) {
		this.character = character;
		this.morseSymbol = morseSymbol;
	}
	
	public MorseCharacter(List<CypherSymbol> morseSymbol) {
		this.morseSymbol = morseSymbol;
	}
	
	public char getCharacter() {
		return character;
	}

	public boolean equals(MorseCharacter other) {
		
		/* If two MorseCharacters have the same morseSymbol size and 
		 * each of their morseSymbols is equal, the MorseCharacters are equal.
		 */
		
		// Unfortunately, the equals method is still completely missing.
		return morseSymbol.equals(other.morseSymbol);
	}

}

