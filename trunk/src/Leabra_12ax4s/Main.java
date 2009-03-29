/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Leabra_12ax4s;

import com.ecortex.emergent.api.*;

/**
 *
 * @author djilk
 */
public class Main {

    static public void main(String[] args) {
        EmergentConnection E = new EmergentConnection("127.0.0.1");
        try {
            E.Initialize();
            //E.SetDebug(true);
            EmergentDataTable TrainEnv_0 = new EmergentDataTable("TrainEnv_0", new TrainEnv_0Row(), E);
            EmergentDataTable UnitNames = new EmergentDataTable("UnitNames", new UnitNamesRow(), E);
            EmergentDataTable TrialOutputData = new EmergentDataTable("TrialOutputData", new TrialOutputDataRow(), E);
            EmergentDataTable EpochOutputData = new EmergentDataTable("EpochOutputData", new EpochOutputDataRow(), E);
            /*
            TrainEnv_0.Read();
            for (EmergentDataTableRow R : TrainEnv_0) {
                TrainEnv_0Row Row = (TrainEnv_0Row) R;
                System.out.println(Row.Group + " " + Row.Name + " " + Row.Input[0][0] + " " + Row.RewTarg[0][0]); }
             
            UnitNames.Read();  // Errors reading both of these guys 
            for (EmergentDataTableRow R : UnitNames) {
                UnitNamesRow Row = (UnitNamesRow) R;
                System.out.println(Row.Input[0][0] + " " + Row.Output[0][0] + " " + Row.RewTarg[0][0]); }
             */
            E.RunProgram("LeabraEpochGpData");
            TrialOutputData.Read();  // Doesn't handle empty table - throws exception
            for (EmergentDataTableRow R : TrialOutputData) {
                TrialOutputDataRow Row = (TrialOutputDataRow) R;
                System.out.println(Row.trial_name + " " + Row.sse);
            }
            /*
            EpochOutputData.Read();
            for (EmergentDataTableRow R : TrialOutputData) {
                TrialOutputDataRow TR = (TrialOutputDataRow) R;
                System.out.println(TR.batch + " " + TR.epoch + " " + TR.trial + " " + TR.sse);
            }
             */
            E.Shutdown();
        }
        catch (EmergentException e) {
            e.printStackTrace();
        }
    }

}
