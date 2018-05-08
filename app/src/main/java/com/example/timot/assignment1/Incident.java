package com.example.timot.assignment1;

public class Incident {


//holds stuff for card view.

    private String location;
    private String status;
    private String description;
    private String officer;
    private String officerPhone;

    public Incident(String location, String status, String description, String officer, String officerPhone) {
        this.location = location;
        this.status = status;
        this.description = description;
        this.officer = officer;
        this.officerPhone = officerPhone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public String getOfficerPhone() {
        return officerPhone;
    }

    public void setOfficerPhone(String officerPhone) {
        this.officerPhone = officerPhone;
    }
}
