package Character;

public class CharacterInstanceMethods {

	public static void main(String[] args) {
		System.out.println(Character.isLetter('c')); //true
		System.out.println(Character.isLetter('5')); //false
		
		System.out.println(Character.isDigit('c')); //false
		System.out.println(Character.isDigit('5')); //true
		
		System.out.println(Character.isWhitespace('c')); //false
		System.out.println(Character.isWhitespace(' ')); //true
		
		System.out.println(Character.isWhitespace('\n')); //true
		System.out.println(Character.isWhitespace('\b')); //false
		System.out.println(Character.isWhitespace('\t')); //true
	}

}
