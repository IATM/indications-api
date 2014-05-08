package com.iatm.indications.api.beans;

public class Request {
    private Patient patient;
    private Study study;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    @Override
    public String toString() {
        return "Request [patient=" + patient + ", study=" + study + "]";
    }
}
