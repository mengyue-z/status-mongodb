package com.anchorhomes.statusmongodb.service;

import com.anchorhomes.statusmongodb.collection.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    String save(Project project);

    List<Project> getProjectByAddress(String address);
}
