import static org.junit.Assert.*;

import org.junit.Test;


public class ASCII_EncrpytionTest {

	@Test
	public void testDecrypt() throws Exception {
		assertEquals("", ASCII_Encryption.encrypt("", 1));
		assertEquals("b", ASCII_Encryption.encrypt("a", 1));
		assertEquals("rngcug\"gpet{rv\"og", ASCII_Encryption.encrypt("please encrypt me", 2));
		//s 
	}

}
