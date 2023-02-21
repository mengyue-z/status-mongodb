package com.anchorhomes.statusmongodb.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@Document(collection = "project")
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Project {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private Long id;
    private Long priority;
    private String address;
    private SelectionStatus selectionStatus;
    private BidStatus bidStatus;
    private PurchasingStatus purchasingStatus;
}
