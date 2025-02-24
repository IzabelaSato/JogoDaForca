package palavras;

import java.util.HashSet;
import java.util.Set;

public class word {
	private static final char SECRET_CHAR = '_';

	public String originalWord;
	public Set<Character> foundChars = new HashSet<>();
	public Set<Character> wordChars = new HashSet<>();

	public word(String originalWord) {
		this.originalWord = originalWord.toUpperCase();

		char[] chars = originalWord.toCharArray();
		for (char c : chars) {
			wordChars.add(c);
		}
	}

	// tamanho da palavra
	public int size() {
		return originalWord.length();
	}

	// verificando se a letra � da palavra original
	public boolean hasChar(char c) {
		if (originalWord.indexOf(c) > -1) {
			foundChars.add(c);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		char[] charArray = originalWord.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];

			if (foundChars.contains(c)) {
				sb.append(c);

			} else {
				sb.append(SECRET_CHAR);
			}
			sb.append(" ");
		}
		return sb.toString();
	}

	public boolean discovered() {
		return foundChars.equals(wordChars);
	}

	public String getOriginalWord() {
		return originalWord;
	}
}
