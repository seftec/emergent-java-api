/**
 * EmergentConnection.java
 * Copyright (c) 2008 eCortex, Inc.
 * 
 * This file is part of the Emergent Server Java API.
 *
 * The Emergent Server Java API is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Emergent Server Java API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with the Emergent Server Java API.  If not, see http://www.gnu.org/licenses/.
 *
 * Emergent Server Java API
 * Version 0.8
 * Compatible with Emergent 4.0.17
 * 
 */


package com.ecortex.emergent.vision;

import com.ecortex.emergent.api.EmergentDataTableRow;

/**
 *
 * @author David Jilk
 */
public class PresentationRow extends EmergentDataTableRow {
// It appears that these will have to be in order; or alternatively I guess I could read
//    the header row from the table and handle the correct order (and missing fields, if needed)
//    internally
    
    // Rules:
    //   1. The names of the fields must be identical (case-sensitive) to those in the 
    //      Emergent Data Table
    //   2. They must match the Data Table order exactly, and there must be no extra
    //      or missing fields (temporary)
    //   3. There must be a nullary constructor that initializes ALL the fields.  The
    //      super() function will initialize all non-matrix fields, but matrix fields 
    //      need to be allocated to a structure of the correct size.  Note that the
    //      individual cells of a matrix do NOT need to be initialized.
    //      [Or, maybe now that I format to blanks, we don't have to have it]
    public Integer oid_id;
    public String supercat;
    public String category;
    public String subcat;
    public String feature1;
    public String feature2;
    public String feature3;
    public String feature4;
    public String individual;
    public String ctrlflags;
    public String filename;
    public Integer supercat_id;
    public Integer category_id;
    public Integer subcat_id;
    public Integer feature1_id;
    public Integer feature2_id;
    public Integer feature3_id;
    public Integer feature4_id;
    public Integer catsubcat_id;
    public Integer individual_id;
    public Float[][] foveate_box;
    public Float translate_x;
    public Float translate_y;
    public Float rotate;
    public Float scale;
    public Float ret_translate_x;
    public Float ret_translate_y;
    
    // It is the API user's responsibility to provide a nullary constructor that
    // initializes all the fields
    // super() must be first and handles all the non-array fields.  A 
    //  
    //    I need to add checks for null in case it's not done; also deal properly with fields
    //    specified here that don't match columns in the table (really, just ignore).
    // 
    public PresentationRow () {
        super();
        foveate_box = new Float[2][2];
    }
}
