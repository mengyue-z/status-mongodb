package com.anchorhomes.statusmongodb.controller;

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
import com.anchorhomes.statusmongodb.service.ProjectService;
import com.anchorhomes.statusmongodb.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @PostMapping
    public Project save(@RequestBody Project project){
        project.setId(sequenceGeneratorService.generateSequence(Project.SEQUENCE_NAME));
        return projectService.save(project);
    }

    @GetMapping(value = "/")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

//    public List<Project> findAllByPriority() {
//        return ObjectMapperUtils.mapAll(projectService.findAllByPriority(), Project.class);
//    }

    @GetMapping(value = "/address/{address}")
    public Project findByAddress(@PathVariable("address") String address){
        return projectService.findByAddress(address);
    }

    @GetMapping(value = "/{id}")
    public Optional<Project> findProjectById(@PathVariable("id") Long id){
        return projectService.findByProjectId(id);
    }

    @PutMapping(value="/bid-status/{id}")
    public void updateBidStatus(@PathVariable("id") Long id,@RequestBody BidStatus updatedBidStatus){
        projectService.updateBidStatus(id,updatedBidStatus);
    };
    @PatchMapping(value="/bid-status/{id}/utilityDisconnection")
    public void updateUtilityDisconnection(@PathVariable("id") Long id,@RequestBody UtilityDisconnection utilityDisconnection){
        projectService.updateUtilityDisconnection(id,utilityDisconnection);
    };
    @PatchMapping(value="/bid-status/{id}/concreteBid")
    public void updateUtilityDisconnection(@PathVariable("id") Long id,@RequestBody ConcreteBid concreteBid){
        projectService.updateConcreteBid(id,concreteBid);
    };

    @PatchMapping(value="/selection-status/{id}/applianceSelection")
    public void updateApplianceSelection(@PathVariable("id") Long id,@RequestBody ApplianceSelection applianceSelection){
        projectService.updateApplianceSelection(id,applianceSelection);
    };

    @PatchMapping(value="/selection-status/{id}/cabinetSelection")
    public void updateCabinetSelection(@PathVariable("id") Long id,@RequestBody CabinetSelection cabinetSelection){
        projectService.updateCabinetSelection(id,cabinetSelection);
    };

    @PutMapping(value="/selection-status/{id}")
    public void updateSelectionStatus(@PathVariable("id") Long id,@RequestBody SelectionStatus updatedSelectionStatus){
        projectService.updateSelectionStatus(id,updatedSelectionStatus);
    };

    @PutMapping(value="/purchasing-status/{id}")
    public void updatePurchasingStatus(@PathVariable("id") Long id,@RequestBody PurchasingStatus updatedPurchasingStatus){
        projectService.updatePurchasingStatus(id,updatedPurchasingStatus);
    };

    @PatchMapping(value="/purchasing-status/{id}/appliancePurchase")
    public void updateAppliancePurchase(@PathVariable("id") Long id, @RequestBody AppliancePurchase appliancePurchase){
        projectService.updateAppliancePurchase(id,appliancePurchase);
    };

    @PatchMapping(value="/purchasing-status/{id}/cabinetPurchase")
    public void updateCabinetSelection(@PathVariable("id") Long id,@RequestBody CabinetPurchase cabinetPurchase){
        projectService.updateCabinetPurchase(id,cabinetPurchase);
    };
    @PutMapping(value="/{id}")
    public void updateProjectById(@PathVariable("id") Long id,@RequestBody Project project){
        projectService.updateProject(project);
    };
    @DeleteMapping(value="{id}")
    public ResponseEntity<?> deleteProjectById(@PathVariable("id") Long id){
        projectService.deleteProjectById(projectService.findByProjectId(id).get().getId());
        return new ResponseEntity<>("Student deleted", HttpStatus.OK);
    }

}
