package au.edu.unimelb.comp30022.controllertesting;

import android.location.Location;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by william on 31/8/17.
 */

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class ControllerTest  {

    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    Controller controller;

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    AddressTools addressTools;
    @Mock
    PostageRateCalculator postageRateCalculator;
    @Mock
    PostcodeValidator postcodeValidator;
    @Mock
    Location location;

    @Test
    public void testAdd(){
        Mockito.when(addressTools.locationFromAddress(Mockito.any(Address.class))).thenReturn(location);
        Mockito.when(postageRateCalculator.computeCost(Mockito.any(Location.class), Mockito.any(Location.class))).thenReturn(5);
        Mockito.when(postcodeValidator.isValid(Mockito.any(String.class))).thenReturn(true);

        controller = new Controller(addressTools, postcodeValidator, postageRateCalculator);
        controller.calculateButtonPressed();

        Assert.assertEquals(controller.costLabel.getText(), "$5" );
    }


    @Before
    public void setUp() throws Exception {
        UI.addWidget("CALCULATE_BUTTON", new Button());

        EditText sourcePostCode = new EditText();
        sourcePostCode.setText("3055");
        UI.addWidget("SOURCE_POST_CODE", sourcePostCode);

        EditText destPostCode = new EditText();
        destPostCode.setText("3010");
        UI.addWidget("DESTINATION_POST_CODE", destPostCode);

        TextView costLabel = new TextView();
        UI.addWidget("COST_LABEL", costLabel);
    }

    @After
    public void tearDown() throws Exception {

    }
}