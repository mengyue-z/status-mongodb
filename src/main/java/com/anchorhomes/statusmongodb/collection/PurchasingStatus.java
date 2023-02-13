package com.anchorhomes.statusmongodb.collection;

import com.anchorhomes.statusmongodb.collection.purchasing.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PurchasingStatus {
    private LumberPurchase lumberPurchase;
    private RoofingPurchase roofingPurchase;
    private InsulationPurchase insulationPurchase;
    private FireplacePurchase fireplacePurchase;
    private DrywallPurchase drywallPurchase;
    private CabinetPurchase cabinetPurchase;
    private CabinetLightPurchase cabinetLightPurchase;
    private VesselSink vesselSink;
    private UndermountSink undermountSink;
    private ApronSink apronSink;
    private LinearDrain linearDrain;
    private CountertopPurchase countertopPurchase;
    private InteriorDoorPurchase interiorDoorPurchase;
    private InteriorTrimPurchase interiorTrimPurchase;
    private SidingCornicePurchase sidingCornicePurchase;
    private StonePurchase stonePurchase;
    private RailingPurchase railingPurchase;
    private MetalRailingPurchase metalRailingPurchase;
    private LeadWalkFlagStonePurchase leadWalkFlagStonePurchase;
    private BrickPurchase brickPurchase;
    private AppliancePurchase appliancePurchase;
    private HardwoodPurchase hardwoodPurchase;
    private CarpetPurchase carpetPurchase;
    private LVPPurchase lvpPurchase;
    private GarageDoorPurchase garageDoorPurchase;
    private TilePurchase tilePurchase;
    private WaterHeaterPurchase waterHeaterPurchase;
    private DiverterValveSumpPumpRadonFan diverterValeSumpPumpRadonFan;
    private RopeLightPurchase ropeLightPurchase;
    private RecessedLightPurchase recessedLightPurchase;
    private SensorDimmerSwitchPurchase sensorDimmerSwitchPurchase;
    private PlumbingFixturePurchase plumbingFixturePurchase;
    private ExteriorLightPurchase exteriorLightPurchase;
    private InteriorLightingPurchase interiorLightingPurchase;
    private BathroomHardwarePurchase bathroomHardwarePurchase;
    private MailBoxHouseNumber mailBoxHouseNumber;
    private WireShelving wireShelving;
    private ClosetWoodRod closetWoodRod;
    private ClosetMetalRod closetMetalRod;
    private CabinetHardware cabinetHardware;
    private MirrorPurchase mirrorPurchase;
    private DoorbellPurchase doorbellPurchase;
    private FreeStandingTub freeStandingTub;
    private PedestalSink pedestalSink;
    private ToiletPurchase toiletPurchase;
    private UtilitySinkPurchase utilitySinkPurchase;
    private DisposalPurchase disposalPurchase;
    private LandscapingPurchase landscapingPurchase;


    public PurchasingStatus() {
    }

    public PurchasingStatus(LumberPurchase lumberPurchase, RoofingPurchase roofingPurchase, InsulationPurchase insulationPurchase, FireplacePurchase fireplacePurchase, DrywallPurchase drywallPurchase, CabinetPurchase cabinetPurchase, CabinetLightPurchase cabinetLightPurchase, VesselSink vesselSink, UndermountSink undermountSink, ApronSink apronSink, LinearDrain linearDrain, CountertopPurchase countertopPurchase, InteriorDoorPurchase interiorDoorPurchase, InteriorTrimPurchase interiorTrimPurchase, SidingCornicePurchase sidingCornicePurchase, StonePurchase stonePurchase, RailingPurchase railingPurchase, MetalRailingPurchase metalRailingPurchase, LeadWalkFlagStonePurchase leadWalkFlagStonePurchase, BrickPurchase brickPurchase, AppliancePurchase appliancePurchase, HardwoodPurchase hardwoodPurchase, CarpetPurchase carpetPurchase, LVPPurchase lvpPurchase, GarageDoorPurchase garageDoorPurchase, TilePurchase tilePurchase, WaterHeaterPurchase waterHeaterPurchase, DiverterValveSumpPumpRadonFan diverterValeSumpPumpRadonFan, RopeLightPurchase ropeLightPurchase, RecessedLightPurchase recessedLightPurchase, SensorDimmerSwitchPurchase sensorDimmerSwitchPurchase, PlumbingFixturePurchase plumbingFixturePurchase, ExteriorLightPurchase exteriorLightPurchase, InteriorLightingPurchase interiorLightingPurchase, BathroomHardwarePurchase bathroomHardwarePurchase, MailBoxHouseNumber mailBoxHouseNumber, WireShelving wireShelving, ClosetWoodRod closetWoodRod, ClosetMetalRod closetMetalRod, CabinetHardware cabinetHardware, MirrorPurchase mirrorPurchase, DoorbellPurchase doorbellPurchase, FreeStandingTub freeStandingTub, PedestalSink pedestalSink, ToiletPurchase toiletPurchase, UtilitySinkPurchase utilitySinkPurchase, DisposalPurchase disposalPurchase, LandscapingPurchase landscapingPurchase) {
        this.lumberPurchase = lumberPurchase;
        this.roofingPurchase = roofingPurchase;
        this.insulationPurchase = insulationPurchase;
        this.fireplacePurchase = fireplacePurchase;
        this.drywallPurchase = drywallPurchase;
        this.cabinetPurchase = cabinetPurchase;
        this.cabinetLightPurchase = cabinetLightPurchase;
        this.vesselSink = vesselSink;
        this.undermountSink = undermountSink;
        this.apronSink = apronSink;
        this.linearDrain = linearDrain;
        this.countertopPurchase = countertopPurchase;
        this.interiorDoorPurchase = interiorDoorPurchase;
        this.interiorTrimPurchase = interiorTrimPurchase;
        this.sidingCornicePurchase = sidingCornicePurchase;
        this.stonePurchase = stonePurchase;
        this.railingPurchase = railingPurchase;
        this.metalRailingPurchase = metalRailingPurchase;
        this.leadWalkFlagStonePurchase = leadWalkFlagStonePurchase;
        this.brickPurchase = brickPurchase;
        this.appliancePurchase = appliancePurchase;
        this.hardwoodPurchase = hardwoodPurchase;
        this.carpetPurchase = carpetPurchase;
        this.lvpPurchase = lvpPurchase;
        this.garageDoorPurchase = garageDoorPurchase;
        this.tilePurchase = tilePurchase;
        this.waterHeaterPurchase = waterHeaterPurchase;
        this.diverterValeSumpPumpRadonFan = diverterValeSumpPumpRadonFan;
        this.ropeLightPurchase = ropeLightPurchase;
        this.recessedLightPurchase = recessedLightPurchase;
        this.sensorDimmerSwitchPurchase = sensorDimmerSwitchPurchase;
        this.plumbingFixturePurchase = plumbingFixturePurchase;
        this.exteriorLightPurchase = exteriorLightPurchase;
        this.interiorLightingPurchase = interiorLightingPurchase;
        this.bathroomHardwarePurchase = bathroomHardwarePurchase;
        this.mailBoxHouseNumber = mailBoxHouseNumber;
        this.wireShelving = wireShelving;
        this.closetWoodRod = closetWoodRod;
        this.closetMetalRod = closetMetalRod;
        this.cabinetHardware = cabinetHardware;
        this.mirrorPurchase = mirrorPurchase;
        this.doorbellPurchase = doorbellPurchase;
        this.freeStandingTub = freeStandingTub;
        this.pedestalSink = pedestalSink;
        this.toiletPurchase = toiletPurchase;
        this.utilitySinkPurchase = utilitySinkPurchase;
        this.disposalPurchase = disposalPurchase;
        this.landscapingPurchase = landscapingPurchase;
    }
}
