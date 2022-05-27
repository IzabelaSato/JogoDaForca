package jogoforca;

import java.util.Scanner;

public class UI {
	
	public static void print (Object object) {
		System.out.println(object);
	}
	public static void printNewLine() {
		System.out.println();
	}
	
	@SuppressWarnings("resource")
	public static char readChar (String text)throws InvalidCharacterExeception {
		System.out.println(text + " ");
		
		Scanner scanner = new Scanner (System.in);
		String line = scanner.nextLine();
		
		if (line.trim().isEmpty()) {
			throw new InvalidCharacterExeception ("NENHUMA LETRA FOI DIGITADA");
		}
		if (line.length()>1) {
			throw new InvalidCharacterExeception ("APENAS UMA LETRA DEVE SER DIGITADA");
		}
		char c = line.charAt(0);
		
		if (!Character.isLetter(c)) {
			throw new InvalidCharacterExeception("APENAS LETRAS DEVEM SER DIGITADAS");
		}
		return c;
	}	
}
