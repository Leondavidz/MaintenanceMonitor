package com.example.maintenancemonitor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MaintenanceMonitorController {
    MaintenanceMonitor mon = new MaintenanceMonitor();

    @RequestMapping("/api/deliver")
    public String deliver(){
        return mon.deliver();
    }
}
