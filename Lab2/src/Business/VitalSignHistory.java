package Business;

import java.util.ArrayList;

/**
 *
 * @author Parth
 */
public class VitalSignHistory {

    private ArrayList<VitalSigns> vitalSignHistory;

    public VitalSignHistory() {
        vitalSignHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public VitalSigns addVitals() {

        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }

    public void deleteVitals(VitalSigns v) {

        vitalSignHistory.remove(v);

    }

}
