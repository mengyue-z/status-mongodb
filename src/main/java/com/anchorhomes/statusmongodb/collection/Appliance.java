package com.anchorhomes.statusmongodb.collection;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Appliance {
    private String status;

    //constructor
    public Appliance(String status) {
        this.status = status;
    }

    public Appliance() {
    }
}
