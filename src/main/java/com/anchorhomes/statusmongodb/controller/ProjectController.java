package com.anchorhomes.statusmongodb.controller;

import com.anchorhomes.statusmongodb.collection.Project;
import com.anchorhomes.statusmongodb.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping
    public String save(@RequestBody Project project){
        return projectService.save(project);
    }

    @GetMapping
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

}
