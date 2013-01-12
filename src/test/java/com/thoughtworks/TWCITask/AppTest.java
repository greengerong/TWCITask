package com.thoughtworks.TWCITask;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class AppTest

{
    private  App app;
    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void testApp() {
        assertEquals(app.getBool(), true);
    }

}
