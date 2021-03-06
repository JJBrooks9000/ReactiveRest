package com.joshb.ReactiveRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import com.joshb.ReactiveRest.entity.Users;
import com.joshb.ReactiveRest.repository.UserRepository;

import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class ReactiveRestApplication {


			
	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ReactiveRestApplication.class, args);
	}
	
	 @Bean
		CommandLineRunner runner() {
			return args -> {

				System.out.println("::::::::::::::::::::::");

				Mono<Void> sss = userRepository.deleteAll();

				sss.subscribe((e) -> {

				}, Throwable::printStackTrace);

				for (int i = 0; i <= 5; i++) {
					Users user= new Users("Test"+i, "1" + i);
					user.setId(i);

					Mono<Users> data = userRepository.save(user);
					System.out.println(data);

					data.subscribe((e) -> {
						System.out.println(e.toString());
					}, Throwable::printStackTrace);
				}
			};
	 }
}
