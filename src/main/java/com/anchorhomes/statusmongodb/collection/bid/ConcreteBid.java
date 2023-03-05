package com.anchorhomes.statusmongodb.collection.bid;

import com.anchorhomes.statusmongodb.collection.Status;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
public class ConcreteBid {
    private Status status;
    private String poc;

}
