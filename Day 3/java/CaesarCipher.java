public class CaesarCipher{
	public static String encrypt(String word, int shift){

		String result = "";
		shift = shift % 26;
		
		for(int index = 0; index < word.length(); index++){

			char character = word.charAt(index);

			if(character >= 'A' && character <= 'Z'){
				char encrypted = (char) ('A' + (character - 'A'+ shift)% 26);
				result+= encrypted;
				
}

			else if(character >= 'a' && character <= 'z'){
				char encrypted = (char) ('a' + (character - 'a'+ shift)% 26);
				result+= encrypted;
				
}

			else{
				result+= character;
}
}
		return result;		
}

	public static String decrypt(String word, int shift){

		return encrypt(word, 26 - (shift % 26));
}
























}