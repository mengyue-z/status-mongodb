package com.anchorhomes.statusmongodb.collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SelectionStatus {
    private Appliance applianceStatus;


    //constructors


    public SelectionStatus(Appliance applianceStatus) {
        this.applianceStatus = applianceStatus;
    }

    public SelectionStatus() {
    }
}



