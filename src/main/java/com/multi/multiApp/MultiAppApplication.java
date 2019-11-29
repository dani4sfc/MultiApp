package com.multi.multiApp;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.multi.multiApp.model.Note;
import com.multi.multiApp.repository.NoteRepository;

@SpringBootApplication
public class MultiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiAppApplication.class, args);
	}
		
	@Bean
	CommandLineRunner init(NoteRepository noteRepository) {
		
		return args -> {
			Stream.of("Note1", "Note2", "Note3", "Note3", "Note4").forEach(title -> {
				Note note = new Note(title, title.toLowerCase() + " Note body/Content");
				noteRepository.save(note);
			});
			noteRepository.findAll().forEach(System.out::println);
		};
	}

}
