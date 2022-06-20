package palavras;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jogoforca.Config;
import jogoforca.GameException;
import jogoforca.utils.RandomUtils;

public abstract class Dictionary {
	public static Dictionary instance;

	public static Dictionary getInstance() {
		if (instance == null) {
			try {
				String dictionaryClassName = Config.get("dictionaryClassName");
				Class <?> clazz = Class.forName(dictionaryClassName);
				Constructor<?> constructor = clazz.getConstructor();
				instance = (Dictionary) constructor.newInstance();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		 }
		return instance;
	}

	public abstract word nextWord();

	public abstract String getName();
}
