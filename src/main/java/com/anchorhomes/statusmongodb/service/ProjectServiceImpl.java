package com.anchorhomes.statusmongodb.service;

import com.anchorhomes.statusmongodb.collection.Project;
import com.anchorhomes.statusmongodb.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public String save(Project project) {
        return projectRepository.save(project).getId();
    }

    @Override
    public List<Project> getProjectByAddress(String address) {
        return projectRepository.findByAddress(address);
    }
}
