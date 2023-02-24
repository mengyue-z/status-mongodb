package com.anchorhomes.statusmongodb.service;

import com.anchorhomes.statusmongodb.collection.BidStatus;
import com.anchorhomes.statusmongodb.collection.Project;
import com.anchorhomes.statusmongodb.collection.PurchasingStatus;
import com.anchorhomes.statusmongodb.collection.SelectionStatus;
import com.anchorhomes.statusmongodb.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public void updateBidStatus(Long id, BidStatus updatedBidStatus) {
        Project existingProject = projectRepository.findById(id).get();
        existingProject.setBidStatus(updatedBidStatus);
        updateProject(existingProject);
    }
    @Override
    public void updateSelectionStatus(Long id, SelectionStatus updatedSelectionStatus) {
        Project existingProject = projectRepository.findById(id).get();
        existingProject.setSelectionStatus(updatedSelectionStatus);
        updateProject(existingProject);
    }
    @Override
    public void updatePurchasingStatus(Long id, PurchasingStatus updatedPurchasingStatus) {
        Project existingProject = projectRepository.findById(id).get();
        existingProject.setPurchasingStatus(updatedPurchasingStatus);
        updateProject(existingProject);
    }

    @Override
    public List<Project> findAllByPriority() {
        return projectRepository.findAllByPriority();
    }
}

