package hello;

import hello.Application;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class to Test the App class.
 *
 * @author L.Hankewitz
 * @since 26/02/16.
 */
public class ApplicationTest {

  private Application app = new Application();

  @Test
  public void when_callingGreeting_returnHelloWorld() {
    String result = app.greeting();
    assertThat(result, is("Hello World!"));
  }
}
