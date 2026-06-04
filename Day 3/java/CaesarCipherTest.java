import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class CaesarCipherTest{

	@Test
	public void testThatTheCaesarCipherEncrpytsTheTextLowerCase(){

		String word = "samosa";
		int shift = 3;
		String expected = "vdprvd";
		String actual = CaesarCipher.encrypt(word, shift);
		assertEquals(expected, actual);

}

	@Test
	public void testThatTheCaesarCipherEncrpytsTheTextUpperCase(){

		String word = "SAMOSA";
		int shift = 3;
		String expected = "VDPRVD";
		String actual = CaesarCipher.encrypt(word, shift);
		assertEquals(expected, actual);

}



	@Test
	public void testThatCaesarCipherDecrpytsTheEncryptedTextLowerCase(){

		String word = "vdprvd";
		int shift = 3;
		String expected = "samosa";
		String actual = CaesarCipher.decrypt(word, shift);
		assertEquals(expected, actual);

}

	@Test
	public void testThatCaesarCipherDecrpytsTheEncryptedTextUpperCase(){

		String word = "VDPRVD";
		int shift = 3;
		String expected = "SAMOSA";
		String actual = CaesarCipher.decrypt(word, shift);
		assertEquals(expected, actual);

}




	@Test
	public void testThatCaesarCipherEncryptsAndDecryptsTheText(){

		String word = "hello";
		int shift = 2;
		String encrypt = CaesarCipher.encrypt(word, shift);
		String decrypt = CaesarCipher.decrypt(encrypt, shift);
		assertEquals(word, decrypt);

}
}