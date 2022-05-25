package palavras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jogoforca.GameException;
import jogoforca.utils.RandomUtils;

public class Dictionary {
	
	private static final String FILE_NAME = "dicionario.txt";
	
	private List<String> words = new ArrayList<>();
	
	private void load () throws GameException {
		try (Scanner scanner = 
				new Scanner(getClass().getResourceAsStream("/"+FILE_NAME))){
			while (scanner.hasNextLine()) {
				String word = scanner.nextLine().trim();
				words.add(word);
				
			}
			if (words.size()==0) {
				throw new GameException ("A lista de palavras não pode ser vazia");
			}
		}
	}
	public word nextWord () {
	int pos = RandomUtils.newRandomNumber(0, words.size());
		return new word (words.get(pos));
		
	}
}
