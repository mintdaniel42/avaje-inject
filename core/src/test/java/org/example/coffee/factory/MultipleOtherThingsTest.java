package org.example.coffee.factory;

import io.dinject.BeanContext;
import io.dinject.BeanContextBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultipleOtherThingsTest {

  @Test
  public void test() {

    try (BeanContext context = new BeanContextBuilder().build()) {
      final MultipleOtherThings combined = context.getBean(MultipleOtherThings.class);
      assertEquals("blue", combined.blue());
      assertEquals("red", combined.red());
      assertEquals("green", combined.green());
      assertEquals("yellow", combined.yellow());
    }
  }
}
