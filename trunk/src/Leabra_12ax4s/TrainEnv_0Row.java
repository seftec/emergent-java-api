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
public class TrainEnv_0Row extends EmergentDataTableRow {
    String Group;
    String Name;
    Float Input[][];
    Float Output[][];
    Float RewTarg[][];

    public TrainEnv_0Row() {
        Input = new Float[3][3];
        Output = new Float[2][1];
        RewTarg = new Float[1][1];
    }
}


