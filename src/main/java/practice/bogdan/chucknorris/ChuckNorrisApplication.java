package practice.bogdan.chucknorris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import practice.bogdan.chucknorris.controllers.JokerController;

@SpringBootApplication
public class ChuckNorrisApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(ChuckNorrisApplication.class, args);

		JokerController jokerController = (JokerController) ctx.getBean("jokerController");

		System.out.println(jokerController.getJoker());

	}

}
