package com.example.maintenancemonitor;

public class MaintenanceMonitor {
    private String message = "Everything operates as expected";

    public String deliver() {
        return this.message;
    }
    public String set(String set) {
        if (set != null && !set.trim().equals("")) {
            message = set;
        }
        return message;
    }
    public String reset() {
        message = "Everything operates as expected";
        return "ok";
    }

}
