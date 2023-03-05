package com.anchorhomes.statusmongodb.service;

import com.anchorhomes.statusmongodb.collection.BidStatus;
import com.anchorhomes.statusmongodb.collection.Project;
import com.anchorhomes.statusmongodb.collection.PurchasingStatus;
import com.anchorhomes.statusmongodb.collection.SelectionStatus;
import com.anchorhomes.statusmongodb.collection.bid.UtilityDisconnection;
import com.anchorhomes.statusmongodb.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
//    @Override
//    public void updateBidStatus(Long id, BidStatus updatedBidStatus) {
////        Optional<Project> optionalProject = projectRepository.findById(id);
////        if(!optionalProject.isPresent()) {
////            return ResponseEntity.notFound().build();
////        }
////        Project existingProject = optionalProject.get();
////        Optional<BidStatus> optionalBidStatus = Optional.ofNullable(existingProject.getBidStatus());
////        if(!optionalBidStatus.isPresent()) {
////            return ResponseEntity.notFound().build();
////        }
////        BidStatus bidStatus = optionalBidStatus.get();
////        existingProject.setBidStatus(updatedBidStatus);
//        Project existingProject = projectRepository.findById(id).get();
//        existingProject.setBidStatus(updatedBidStatus);
//        updateProject(existingProject);
//    }
//    @Override
//    public void updateUtilityDisconnection(Long id, UtilityDisconnection utilityDisconnection) {
//        Project existingProject = projectRepository.findById(id).get();
//        BidStatus existingBidStatus = existingProject.getBidStatus();
//        existingBidStatus.setUtilityDisconnection(utilityDisconnection);
//        updateBidStatus(id, existingBidStatus);
//    }

    @Override
    public void updateUtilityDisconnection(Long id, UtilityDisconnection updatedUtilityDisconnection) {
        Project existingProject = projectRepository.findById(id).get();
        BidStatus existingBidStatus = existingProject.getBidStatus();
        UtilityDisconnection utilityDisconnection = existingBidStatus.getUtilityDisconnection();
        System.out.println(updatedUtilityDisconnection);
        utilityDisconnection.setPoc(updatedUtilityDisconnection.getPoc());
        utilityDisconnection.setStatus(updatedUtilityDisconnection.getStatus());
        existingBidStatus.setUtilityDisconnection(updatedUtilityDisconnection);
        System.out.println(existingBidStatus);
        updateBidStatus(id, existingBidStatus);
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

