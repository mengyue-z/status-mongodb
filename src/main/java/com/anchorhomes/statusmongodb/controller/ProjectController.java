package com.anchorhomes.statusmongodb.controller;

import com.anchorhomes.statusmongodb.collection.Project;
import com.anchorhomes.statusmongodb.service.ProjectService;
import com.anchorhomes.statusmongodb.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    @DeleteMapping(value="{id}")
    public ResponseEntity<?> deleteProjectById(@PathVariable("id") Long id){
        projectService.deleteProjectById(projectService.findByProjectId(id).get().getId());
        return new ResponseEntity<>("Student deleted", HttpStatus.OK);
    }

}
