package com.anchorhomes.statusmongodb.service;

import com.anchorhomes.statusmongodb.collection.BidStatus;
import com.anchorhomes.statusmongodb.collection.Project;
import com.anchorhomes.statusmongodb.collection.PurchasingStatus;
import com.anchorhomes.statusmongodb.collection.SelectionStatus;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.expression.spel.ast.Selection;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ProjectService {

    void updateBidStatus(Long id, BidStatus updatedBidStatus);
    void updateSelectionStatus(Long id, SelectionStatus selectionStatus);
    void updatePurchasingStatus(Long id, PurchasingStatus purchasingStatus);
    Project save(Project project);
    Project findByAddress(String address);
    Project updateProject(Project project);
    Optional<Project> findByProjectId(Long id);
    void deleteProjectById(Long id);
    List<Project> getAllProjects();
    List<Project> findAllByPriority();

}
