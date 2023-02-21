package com.anchorhomes.statusmongodb.collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Status {
    private String statusDetail = "in process";
    private String date = "-";
    private String notes =" ";

    public Status() {
    }
}
