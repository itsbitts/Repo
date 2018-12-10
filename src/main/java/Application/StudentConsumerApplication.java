package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



public class StudentConsumerApplication {
	
	@SpringBootApplication
	@ComponentScan("com.")
	public static class StudentServicesApplication {

		public static void main(String[] args) {
			SpringApplication.run(StudentConsumerApplication.class, args);
		}

}
}
