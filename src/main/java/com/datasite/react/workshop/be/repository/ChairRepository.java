package com.datasite.react.workshop.be.repository;

import com.datasite.react.workshop.be.model.Chair;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChairRepository extends MongoRepository<Chair, String> {
}
