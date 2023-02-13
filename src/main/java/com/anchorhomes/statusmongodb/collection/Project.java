package com.anchorhomes.statusmongodb.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "project")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Project {
    @Id
    private String id;
    private Long priority;
    private String address;
    private SelectionStatus selectionStatus;
}
