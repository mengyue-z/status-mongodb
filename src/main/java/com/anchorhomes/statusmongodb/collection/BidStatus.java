package com.anchorhomes.statusmongodb.collection;

import com.anchorhomes.statusmongodb.collection.bid.*;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class BidStatus {
    private UtilityDisconnection utilityDisconnection;
    private SiteWorkContract siteWorkContract;
    private ConcreteBid concreteBid;
    private WindowBid windowBid;
    private ExtDoorBid extDoorBid;
    private RoofTrussBid roofTrussBid;
    private FloorJoistBid floorJoistBid;
    private StairBid stairBid;
    private HVACContract hvacContract;
    private ElectricalContract electricalContract;
    private LowVoltageContract lowVoltageContract;
    private PlumbingContract plumbingContract;
    private PestControlContract pestControlContract;
    private SprinklerContract sprinklerContract;
    private UtilityReconnect utilityReconnect;

    public BidStatus() {
    }

    public BidStatus(UtilityDisconnection utilityDisconnection, SiteWorkContract siteWorkContract, ConcreteBid concreteBid, WindowBid windowBid, ExtDoorBid extDoorBid, RoofTrussBid roofTrussBid, FloorJoistBid floorJoistBid, StairBid stairBid, HVACContract hvacContract, ElectricalContract electricalContract, LowVoltageContract lowVoltageContract, PlumbingContract plumbingContract, PestControlContract pestControlContract, SprinklerContract sprinklerContract, UtilityReconnect utilityReconnect) {
        this.utilityDisconnection = utilityDisconnection;
        this.siteWorkContract = siteWorkContract;
        this.concreteBid = concreteBid;
        this.windowBid = windowBid;
        this.extDoorBid = extDoorBid;
        this.roofTrussBid = roofTrussBid;
        this.floorJoistBid = floorJoistBid;
        this.stairBid = stairBid;
        this.hvacContract = hvacContract;
        this.electricalContract = electricalContract;
        this.lowVoltageContract = lowVoltageContract;
        this.plumbingContract = plumbingContract;
        this.pestControlContract = pestControlContract;
        this.sprinklerContract = sprinklerContract;
        this.utilityReconnect = utilityReconnect;
    }
}

