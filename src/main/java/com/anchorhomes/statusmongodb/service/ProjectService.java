package com.anchorhomes.statusmongodb.service;

import com.anchorhomes.statusmongodb.collection.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    Project save(Project project);
    Project findByAddress(String address);
    Project updateProject(Project project);
    Optional<Project> findByProjectId(Long id);
    void deleteProjectById(Long id);
    List<Project> getAllProjects();
    List<Project> findAllByPriority();

}
