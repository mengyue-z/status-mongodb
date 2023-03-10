package com.anchorhomes.statusmongodb.service;

import com.anchorhomes.statusmongodb.collection.BidStatus;
import com.anchorhomes.statusmongodb.collection.Project;
import com.anchorhomes.statusmongodb.collection.PurchasingStatus;
import com.anchorhomes.statusmongodb.collection.SelectionStatus;
import com.anchorhomes.statusmongodb.collection.bid.ConcreteBid;
import com.anchorhomes.statusmongodb.collection.bid.UtilityDisconnection;
import com.anchorhomes.statusmongodb.collection.purchasing.AppliancePurchase;
import com.anchorhomes.statusmongodb.collection.purchasing.CabinetPurchase;
import com.anchorhomes.statusmongodb.collection.selection.ApplianceSelection;
import com.anchorhomes.statusmongodb.collection.selection.CabinetSelection;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    void updateBidStatus(Long id, BidStatus updatedBidStatus);
    void updateUtilityDisconnection(Long id, UtilityDisconnection utilityDisconnection);
    void updateSelectionStatus(Long id, SelectionStatus selectionStatus);
    void updatePurchasingStatus(Long id, PurchasingStatus purchasingStatus);
    Project save(Project project);
    Project findByAddress(String address);
    Project updateProject(Project project);
    Optional<Project> findByProjectId(Long id);
    void deleteProjectById(Long id);
    List<Project> getAllProjects();
    List<Project> findAllByPriority();

    void updateConcreteBid(Long id, ConcreteBid concreteBid);
    void updateApplianceSelection(Long id, ApplianceSelection applianceSelection);
    void updateCabinetSelection(Long id, CabinetSelection cabinetSelection);

    void updateAppliancePurchase(Long id, AppliancePurchase appliancePurchase);

    void updateCabinetPurchase(Long id, CabinetPurchase cabinetPurchase);
}
