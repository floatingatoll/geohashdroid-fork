/**
 * FinalDestinationDisabledGlobalhashOverlay.java
 * Copyright (C)2009 Nicholas Killewald
 * 
 * This file is distributed under the terms of the BSD license.
 * The source package should have a LICENCE file at the toplevel.
 */
package net.exclaimindustries.geohashdroid;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;

import android.graphics.drawable.Drawable;

/**
 * The FinalDestinationDisabledGlobalhashOverlay draws a greyed-out and translucent flag
 * which can be tapped to change the active graticule.
 * 
 * @author Nicholas Killewald
 */
public class FinalDestinationDisabledGlobalhashOverlay extends FinalDestinationDisabledOverlay {

    /**
     * Creates a new disabled final destination overlay.
     * 
     * @param d Drawable to use as the flag
     * @param i Info bundle within this overlay (defines where it is)
     * @param parent parent MainMap which will pop up a dialog when this is tapped
     */
    public FinalDestinationDisabledGlobalhashOverlay(Drawable d, Info i, MainMap parent) {
        super(d, i, parent);
    }

}
