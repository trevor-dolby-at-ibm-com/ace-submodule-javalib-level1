package ace.submodule.javalib.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DemoClassTests {

  @Test
  public void test() {
    assertEquals("DemoClassString", ace.submodule.javalib.level1.DemoClass.returnString());
  }

}
