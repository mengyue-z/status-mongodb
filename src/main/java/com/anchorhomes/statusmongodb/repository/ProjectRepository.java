package com.anchorhomes.statusmongodb.repository;

import com.anchorhomes.statusmongodb.collection.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends MongoRepository<Project, Long> {
    Project findByAddress(String address);
    Optional<Project> findById(Long id);


    List<Project> findAll();
    List<Project> findAllByPriority();
}
