package com.joshb.ReactiveRest.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.joshb.ReactiveRest.entity.Users;

import reactor.core.publisher.Flux;

public interface UserRepository extends ReactiveMongoRepository<Users, Integer> {

    Flux<Users> findByName(String name);

}
