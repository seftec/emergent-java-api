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
public class EpochOutputDataRow extends EmergentDataTableRow {
    Integer batch;
    Integer epoch;
    Float avg_sse;
    Float cnt_err;
    Float avg_ext_rew;
    Float avg_cycles;
    Float Leabra_cur_lrate;
    Float epoch_time_tot;
    Float epoch_time_usr;
    Float A_da;
    Float B_da;
    Float C_da;
    Float one_da;
    Float two_da;
    Float X_da;
    Float Y_da;
    Float Z_da;

    public EpochOutputDataRow() {}
}

