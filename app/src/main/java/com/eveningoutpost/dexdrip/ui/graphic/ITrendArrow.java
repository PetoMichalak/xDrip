package com.eveningoutpost.dexdrip.ui.graphic;

import android.view.View;

// jamorham

// visual trend arrow interface
// mgdl change per minute goes in, view represents it
// null update means error/invalid data

public interface ITrendArrow {

    // get the view
    View get();

    // update it
    boolean update(Double mgdl);

}
