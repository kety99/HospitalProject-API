package com.example.hospital.model;

import javax.persistence.*;

@Entity
public class Patient extends User {

    private String illnessInfo;
    private String treatmentInfo;
    @ManyToOne
    private Ward ward;

    public String getIllnessInfo() {
        return illnessInfo;
    }

    public void setIllnessInfo(String illnessInfo) {
        this.illnessInfo = illnessInfo;
    }

    public String getTreatmentInfo() {
        return treatmentInfo;
    }

    public void setTreatmentInfo(String treatmentInfo) {
        this.treatmentInfo = treatmentInfo;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }
}
