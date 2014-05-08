package com.iatm.indications.api.beans;

public class Study {
    private String name;
    private String code;
    private String modality;
    private String bodypart;
    private boolean contrast;
    private boolean renal_protection;
    private boolean sedation;
    private boolean anesthesia;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getBodypart() {
        return bodypart;
    }

    public void setBodypart(String bodypart) {
        this.bodypart = bodypart;
    }

    public boolean isContrast() {
        return contrast;
    }

    public void setContrast(boolean contrast) {
        this.contrast = contrast;
    }

    public boolean isRenal_protection() {
        return renal_protection;
    }

    public void setRenal_protection(boolean renal_protection) {
        this.renal_protection = renal_protection;
    }

    public boolean isSedation() {
        return sedation;
    }

    public void setSedation(boolean sedation) {
        this.sedation = sedation;
    }

    public boolean isAnesthesia() {
        return anesthesia;
    }

    public void setAnesthesia(boolean anesthesia) {
        this.anesthesia = anesthesia;
    }

    @Override
    public String toString() {
        return "Study [name=" + name + ", code=" + code + ", modality=" + modality + ", bodypart=" + bodypart + ", contrast=" + contrast
                + ", renal_protection=" + renal_protection + ", sedation=" + sedation + ", anesthesia=" + anesthesia + "]";
    }
}
