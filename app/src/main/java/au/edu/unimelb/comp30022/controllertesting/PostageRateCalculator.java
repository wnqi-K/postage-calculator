package au.edu.unimelb.comp30022.controllertesting;

import android.location.Location;

/**
 * Computes postage cost between two locations
 */
public interface PostageRateCalculator {
    int computeCost(Location sourceLocation, Location destinationLocation);
}
