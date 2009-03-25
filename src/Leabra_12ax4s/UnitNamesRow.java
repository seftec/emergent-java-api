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
public class UnitNamesRow extends EmergentDataTableRow {
    String Input[][];
    String Output[][];
    String RewTarg[][];

    public UnitNamesRow() {
        Input = new String[3][3];
        Output = new String[2][1];
        RewTarg = new String[1][1];
    }
}


