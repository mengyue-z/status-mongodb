package com.anchorhomes.statusmongodb.collection.purchasing;

import com.anchorhomes.statusmongodb.collection.Status;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ToiletPurchase {
    private Status status;
    private String poc;
}
