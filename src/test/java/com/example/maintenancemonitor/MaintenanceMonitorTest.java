package com.example.maintenancemonitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaintenanceMonitorTest {
    MaintenanceMonitor mon = new MaintenanceMonitor();
    @Test
    void deliverTest1(){
        String res = mon.deliver();
        String expRes = "Everything operates as expected";
        assertEquals(expRes,res);
    }

}