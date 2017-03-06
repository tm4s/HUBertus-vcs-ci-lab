package hu.bme.mit.train.tachograph;

import static org.junit.Assert.*;

/**
 * Created by Thomas on 2017. 03. 06..
 */
public class TachographTest {
    TrainController controller;
    TrainSensor sensor;
    TrainUser user;
    Tachograph graph;

    @Before
    public void before() {
        TrainSystem system = new TrainSystem();
        controller = system.getController();
        user = system.getUser();
        graph = new Tachograph();
        sensor.overrideSpeedLimit(50);
    }

    @org.junit.Test
    public void testIsTableEmpty() throws Exception {
        user.overrideJoystickPosition(5);

        controller.followSpeed();
        graph.


    }
}