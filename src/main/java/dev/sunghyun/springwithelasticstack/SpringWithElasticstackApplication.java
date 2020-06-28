package dev.sunghyun.springwithelasticstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWithElasticstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithElasticstackApplication.class, args);
	}

	@SuppressWarnings({"NumericOverflow", "divzero"})
	@GetMapping("/divzero")
	public int divideByZero() {
		return 13 / 0;  // will raise ArithmeticException: / by zero
	}
}
