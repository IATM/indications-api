package com.iatm.indications.api.beans;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;

public class IndicationsOutput {
    private Set<Indication> schedule_indications = new HashSet<Indication>();
    private Set<Indication> patient_indications = new HashSet<Indication>();
    @JsonIgnore
    private Set<String> rulesMatched = new HashSet<String>();

    public List<String> getSchedule_indications() {
        List<String> indications = new LinkedList<String>();
        for (Indication schedule_indication : schedule_indications) {
            if (schedule_indication == null || schedule_indication.getText() == null)
                continue;
            indications.add(schedule_indication.getText());
        }
        return indications;
    }

    public List<String> getPatient_indications() {
        List<String> indications = new LinkedList<String>();
        for (Indication patient_indication : patient_indications) {
            if (patient_indication == null || patient_indication.getText() == null)
                continue;
            indications.add(patient_indication.getText());
        }
        return indications;
    }

    public void addScheduleIndication(Indication indication) {
        schedule_indications.add(indication);
    }

    public void addPatientIndication(Indication indication) {
        patient_indications.add(indication);
    }

    public Set<String> getRulesMatched() {
        return rulesMatched;
    }

    public void setRulesMatched(Set<String> rulesMatched) {
        this.rulesMatched = rulesMatched;
    }
}
