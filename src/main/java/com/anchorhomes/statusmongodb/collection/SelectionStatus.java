package com.anchorhomes.statusmongodb.collection;

import com.anchorhomes.statusmongodb.collection.selection.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SelectionStatus {
    private ApplianceSelection applianceSelection;
    private FireplaceSelection fireplaceSelection;
    private CabinetSelection cabinetSelection;
    private CountertopSelection countertopSelection;
    private PlumbingSelection plumbingSelection;
    private ExteriorSelection exteriorSelection;
    private WindowSelection windowSelection;
    private DoorSelection doorSelection;
    private TrimSelection trimSelection;
    private ElectricalSelection electricalSelection;
    private StairSelection stairSelection;
    private FlooringSelection flooringSelection;
    private LightingSelection lightingSelection;
    private TileSelection tileSelection;
    private PaintSelection paintSelection;
    private PatioDeckSelection patioDeckSelection;
    private LandscapingSelection landscapingSelection;
    private AccessorySelection accessorySelection;
    private HAVCSelection havcSelection;
    private InsulationSelection insulationSelection;


    //constructors

    public SelectionStatus() {
    }

    public SelectionStatus(ApplianceSelection applianceSelection, FireplaceSelection fireplaceSelection, CabinetSelection cabinetSelection, CountertopSelection countertopSelection, PlumbingSelection plumbingSelection, ExteriorSelection exteriorSelection, WindowSelection windowSelection, DoorSelection doorSelection, TrimSelection trimSelection, ElectricalSelection electricalSelection, StairSelection stairSelection, FlooringSelection flooringSelection, LightingSelection lightingSelection, TileSelection tileSelection, PaintSelection paintSelection, PatioDeckSelection patioDeckSelection, LandscapingSelection landscapingSelection, AccessorySelection accessorySelection, HAVCSelection havcSelection, InsulationSelection insulationSelection) {
        this.applianceSelection = applianceSelection;
        this.fireplaceSelection = fireplaceSelection;
        this.cabinetSelection = cabinetSelection;
        this.countertopSelection = countertopSelection;
        this.plumbingSelection = plumbingSelection;
        this.exteriorSelection = exteriorSelection;
        this.windowSelection = windowSelection;
        this.doorSelection = doorSelection;
        this.trimSelection = trimSelection;
        this.electricalSelection = electricalSelection;
        this.stairSelection = stairSelection;
        this.flooringSelection = flooringSelection;
        this.lightingSelection = lightingSelection;
        this.tileSelection = tileSelection;
        this.paintSelection = paintSelection;
        this.patioDeckSelection = patioDeckSelection;
        this.landscapingSelection = landscapingSelection;
        this.accessorySelection = accessorySelection;
        this.havcSelection = havcSelection;
        this.insulationSelection = insulationSelection;
    }
}



