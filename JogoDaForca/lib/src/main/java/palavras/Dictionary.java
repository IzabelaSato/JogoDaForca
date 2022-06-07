package palavras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jogoforca.GameException;
import jogoforca.utils.RandomUtils;

public abstract class Dictionary {
	public static Dictionary instance;

	public static Dictionary getInstance() {
		// if (instance == null) {
		// instance = new Dictionary();
		// }
		return instance;
	}

	public abstract word nextWord();

	public abstract String getName();

}