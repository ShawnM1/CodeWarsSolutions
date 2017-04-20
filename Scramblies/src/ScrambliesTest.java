import static org.junit.Assert.*;

import org.junit.Test;


public class ScrambliesTest {

	@Test
    public void test() {
		assertEquals(true, Scramblies.scramble("rkqodlw","world"));
		assertEquals(true, Scramblies.scramble("rkqodlw","world"));
		assertEquals(true, Scramblies.scramble("cedewaraaossoqqyt","codewars"));
		assertEquals(false, Scramblies.scramble("katas","steak"));
		assertEquals(false, Scramblies.scramble("scriptjavx","javascript"));
		assertEquals(true, Scramblies.scramble("scriptingjava","javascript"));
		assertEquals(true, Scramblies.scramble("scriptsjava","javascripts"));
		assertEquals(false, Scramblies.scramble("javscripts","javascript"));
		assertEquals(true,Scramblies.scramble("aabbcamaomsccdd","commas"));
		assertEquals(true, Scramblies.scramble("commas","commas"));
		assertEquals(true, Scramblies.scramble("sammoc","commas"));
    }

}
