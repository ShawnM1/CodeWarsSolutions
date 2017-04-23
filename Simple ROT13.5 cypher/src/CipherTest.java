import static org.junit.Assert.*;

import org.junit.Test;


public class CipherTest {

	 @Test
	    public void testSomething() {
	       assertEquals("Gur dhvpx oebja sbk whzcf bire gur 7 ynml qbtf", Cipher.ROT135("The quick brown fox jumps over the 2 lazy dogs"));
	       assertEquals("The quick brown fox jumps over the 2 lazy dogs", Cipher.ROT135("Gur dhvpx oebja sbk whzcf bire gur 7 ynml qbtf"));
	    }

}
