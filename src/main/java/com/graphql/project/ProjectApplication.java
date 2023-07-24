package com.graphql.project;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authourRepository, BookRepository bookRepository){
		return args -> {
			Author subhranil = authourRepository.save(new Author(null, "Subhranil Ghosh", null));
			Author tamal = authourRepository.save(new Author(null, "Tamal Satra", null));

			bookRepository.saveAll(List.of(
					new Book(0,"Spring In details", "Jobnet", subhranil),
					new Book(0,"Angular In details", "Jobnet", tamal),
					new Book(0,"All the more Spring", "Fiscal", subhranil),
					new Book(0,"Angular in a nutshell", "Fiscal", tamal),
					new Book(0,"React for beginners", "Tomadel", tamal),
					new Book(0,"React for Intermediate", "Tomadel", tamal),
					new Book(0,"React Advanced", "Tomadel", tamal),
					new Book(0,"Spring for Intermidiate and Advanced", "Tomadel", subhranil)
			));
		};

	}

}
