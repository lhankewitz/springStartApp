package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class to Initialize the App.
 *
 * @author L.Hankewitz
 * @since 26/02/16.
 */
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run (Application.class, args);
  }

  public String greeting() {
    return "Hello World!";
  }
}
