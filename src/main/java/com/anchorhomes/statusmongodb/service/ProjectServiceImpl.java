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
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project findByAddress(String address) {
        return projectRepository.findByAddress(address);
    }

    @Override
    public Optional<Project> findByProjectId(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public void deleteProjectById(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public List<Project> findAllByPriority() {
        return projectRepository.findAllByPriority();
    }
}

