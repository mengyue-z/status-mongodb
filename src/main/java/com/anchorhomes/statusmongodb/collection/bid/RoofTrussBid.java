package com.anchorhomes.statusmongodb.collection.bid;

import com.anchorhomes.statusmongodb.collection.Status;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoofTrussBid {
    private Status status;
    private String poc;
}
