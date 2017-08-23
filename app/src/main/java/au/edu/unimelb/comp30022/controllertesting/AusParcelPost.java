package au.edu.unimelb.comp30022.controllertesting;

import android.location.Location;

/**
 * Concrete implementation of postage calculator
 */
public class AusParcelPost implements  PostageRateCalculator, PostcodeValidator {

    @Override
    public int computeCost(Location sourceLocation, Location destinationLocation) {

        float distance = sourceLocation.distanceTo(destinationLocation);

        if (distance > 1000.0) {
            return 10;
        }

        if (distance > 100.0) {
            return 5;
        }

        return 2;

    }

    @Override
    public boolean isValid(String postcode) {
        // TODO validate all postcodes correctly
        return true;
    }
}
