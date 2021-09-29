package com.nttdata.willams.jasypdemo;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableEncryptableProperties
@Log4j2
public class ExecuteApplication {
	@Value("${minha.url.secreta}")
	private String minhaUrlSecreta;

	@PostConstruct
	void show() {
		log.info("### URL descriptografada: {}", minhaUrlSecreta);
	}

	public static void main(String[] args) {
		SpringApplication.run(ExecuteApplication.class, args);
	}
}
