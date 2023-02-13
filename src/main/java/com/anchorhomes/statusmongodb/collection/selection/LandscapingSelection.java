package com.anchorhomes.statusmongodb.collection.selection;

import com.anchorhomes.statusmongodb.collection.Status;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LandscapingSelection {
    private Status status;
    private String poc;
}
