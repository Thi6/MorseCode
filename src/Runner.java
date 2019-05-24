import java.util.HashMap;

public class Runner {
	public static void main(String[] args) {
		HashMap<String, String> morseCode = new HashMap<String, String>();

		morseCode.put(".-", "a");
		morseCode.put("-...", "b");
		morseCode.put("-.-.", "c");
		morseCode.put("-..", "d");
		morseCode.put(".", "e");
		morseCode.put("..-.", "f");
		morseCode.put("--.", "g");
		morseCode.put("....", "h");
		morseCode.put("..", "i");
		morseCode.put(".---", "j");
		morseCode.put("-.-", "k");
		morseCode.put(".-..", "l");
		morseCode.put("--", "m");
		morseCode.put("-.", "n");
		morseCode.put("---", "o");
		morseCode.put(".--.", "p");
		morseCode.put("--.-", "q");
		morseCode.put(".-.", "r");
		morseCode.put("...", "s");
		morseCode.put("-", "t");
		morseCode.put("..-", "u");
		morseCode.put("...-", "v");
		morseCode.put("-..-", "x");
		morseCode.put("-.--", "y");
		morseCode.put("--..", "z");
		morseCode.put(".----", "1");
		morseCode.put("..---", "2");
		morseCode.put("...--", "3");
		morseCode.put("....-", "4");
		morseCode.put(".....", "5");
		morseCode.put("-....", "6");
		morseCode.put("--...", "7");
		morseCode.put("---..", "8");
		morseCode.put("----.", "9");
		morseCode.put("-----", "0");

		translateMorse(morseCode,
				".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--");

	}

	public static void translateMorse(HashMap<String, String> morseCode, String theMorse) {
		String splitToWord[] = theMorse.split(" / ");

		for (int i = 0; i < splitToWord.length; i++) {
			// System.out.println(splitToWord[i]);
			String splitToLetter[] = splitToWord[i].split(" ");

			for (int j = 0; j < splitToLetter.length; j++) {
				// System.out.println(splitToLetter[j]);
				// System.out.println(morseCode.get(splitToLetter[j]));
				System.out.print(morseCode.get(splitToLetter[j]));

			}
			System.out.print(" ");
		}

	}

}
