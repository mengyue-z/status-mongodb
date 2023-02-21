package com.anchorhomes.statusmongodb.collection.selection;

import com.anchorhomes.statusmongodb.collection.Status;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
public class FlooringSelection {
    private Status status;
    private String poc="not assigned";

}
