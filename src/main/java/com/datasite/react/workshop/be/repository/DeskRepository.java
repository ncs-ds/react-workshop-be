package com.datasite.react.workshop.be.repository;

import com.datasite.react.workshop.be.model.Desk;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeskRepository extends MongoRepository<Desk, String> {
}
