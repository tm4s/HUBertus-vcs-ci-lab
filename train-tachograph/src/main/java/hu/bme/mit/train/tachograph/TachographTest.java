package hu.bme.mit.train.tachograph;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Thomas on 2017. 03. 06..
 */
public class TachographTest {
    TrainController controller;
    TrainUser user;
    Tachograph graph;

    @Before
    public void before() {
        TrainSystem system = new TrainSystem();
        controller = system.getController();
        user = system.getUser();
        graph = new Tachograph();
    }

    @org.junit.Test
    public void testIsTableEmpty() throws Exception {
        Assert.assertTrue(graph.isTableEmpty());

        user.overrideJoystickPosition(5);
        controller.followSpeed();
        graph.record(user.getJoystickPosition(), controller.getReferenceSpeed());

        Assert.assertFalse(graph.isTableEmpty());
    }
}