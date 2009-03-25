/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Leabra_12ax4s;

import com.ecortex.emergent.api.EmergentDataTableRow;

/**
 *
 * @author djilk
 */
public class TrialOutputDataRow extends EmergentDataTableRow {
    Integer batch;
    Integer epoch;
    Integer trial;
    String trial_name;
    String group_name;
    Integer phase_no;
    Float minus_cycles;
    Float sse;
    Float ext_rew;
    Float DA;
    Float PVe;
    Float PVi;
    Float LVe;
    Float LVi;
    Float absDA;

    public TrialOutputDataRow() {}
}


