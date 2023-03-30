package ace.submodule.javalib.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoClassTest {

	@Test
	void test() {
		assertEquals("DemoClassString", ace.submodule.javalib.level1.DemoClass.returnString());
	}

}
