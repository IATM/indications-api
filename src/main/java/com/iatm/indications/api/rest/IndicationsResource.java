package com.iatm.indications.api.rest;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.iatm.indications.api.beans.IndicationsInput;
import com.iatm.indications.api.beans.IndicationsOutput;
import com.iatm.indications.api.beans.Patient;
import com.iatm.indications.api.beans.Study;
import com.iatm.indications.api.rules.DroolsService;

@Path("/indications")
public class IndicationsResource {

    public IndicationsResource() {
        System.out.println("New resource");
    }

    @POST
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_FORM_URLENCODED })
    @Produces(MediaType.APPLICATION_JSON)
    public IndicationsOutput getIndications(IndicationsInput input) {
        Patient patient = input.getRequest().getPatient();
        Study study = input.getRequest().getStudy();
        System.out.println(patient);
        System.out.println(study);
        IndicationsOutput indicationOutput = new IndicationsOutput();
        DroolsService droolsService = new DroolsService();
        List<Object> facts = new LinkedList<Object>();
        facts.add(patient);
        facts.add(study);
        facts.add(indicationOutput);
        droolsService.evaluate(facts);

        return indicationOutput;
    }
}
