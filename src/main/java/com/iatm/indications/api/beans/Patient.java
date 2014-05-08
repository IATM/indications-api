package com.iatm.indications.api.beans;

public class Patient {
    private String name;
    private int age;
    private String sex;
    private int weight;
    private int height;
    private boolean hospitalized;
    private boolean diabetes;
    private boolean allergies;
    private boolean claustrophobia;
    private boolean recent_surgery;
    private boolean infiltration;
    private boolean previous_contrast;
    private boolean renal;
    private boolean chemo;
    private boolean radio;
    private boolean transplant;
    private boolean contagious;
    private boolean mental_disc;
    private boolean metformin;
    private boolean anticoagulants;
    private boolean viagra;
    private boolean metal;
    private boolean brackets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(boolean hospitalized) {
        this.hospitalized = hospitalized;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isAllergies() {
        return allergies;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }

    public boolean isClaustrophobia() {
        return claustrophobia;
    }

    public void setClaustrophobia(boolean claustrophobia) {
        this.claustrophobia = claustrophobia;
    }

    public boolean isRecent_surgery() {
        return recent_surgery;
    }

    public void setRecent_surgery(boolean recent_surgery) {
        this.recent_surgery = recent_surgery;
    }

    public boolean isInfiltration() {
        return infiltration;
    }

    public void setInfiltration(boolean infiltration) {
        this.infiltration = infiltration;
    }

    public boolean isPrevious_contrast() {
        return previous_contrast;
    }

    public void setPrevious_contrast(boolean previous_contrast) {
        this.previous_contrast = previous_contrast;
    }

    public boolean isRenal() {
        return renal;
    }

    public void setRenal(boolean renal) {
        this.renal = renal;
    }

    public boolean isChemo() {
        return chemo;
    }

    public void setChemo(boolean chemo) {
        this.chemo = chemo;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isTransplant() {
        return transplant;
    }

    public void setTransplant(boolean transplant) {
        this.transplant = transplant;
    }

    public boolean isContagious() {
        return contagious;
    }

    public void setContagious(boolean contagious) {
        this.contagious = contagious;
    }

    public boolean isMental_disc() {
        return mental_disc;
    }

    public void setMental_disc(boolean mental_disc) {
        this.mental_disc = mental_disc;
    }

    public boolean isMetformin() {
        return metformin;
    }

    public void setMetformin(boolean metformin) {
        this.metformin = metformin;
    }

    public boolean isAnticoagulants() {
        return anticoagulants;
    }

    public void setAnticoagulants(boolean anticoagulants) {
        this.anticoagulants = anticoagulants;
    }

    public boolean isViagra() {
        return viagra;
    }

    public void setViagra(boolean viagra) {
        this.viagra = viagra;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public boolean isBrackets() {
        return brackets;
    }

    public void setBrackets(boolean brackets) {
        this.brackets = brackets;
    }

    @Override
    public String toString() {
        return "Patient [name=" + name + ", age=" + age + ", sex=" + sex + ", weight=" + weight + ", height=" + height + ", hospitalized="
                + hospitalized + ", diabetes=" + diabetes + ", allergies=" + allergies + ", claustrophobia=" + claustrophobia
                + ", recent_surgery=" + recent_surgery + ", infiltration=" + infiltration + ", previous_contrast=" + previous_contrast
                + ", renal=" + renal + ", chemo=" + chemo + ", radio=" + radio + ", transplant=" + transplant + ", contagious="
                + contagious + ", mental_disc=" + mental_disc + ", metformin=" + metformin + ", anticoagulants=" + anticoagulants
                + ", viagra=" + viagra + ", metal=" + metal + ", brackets=" + brackets + "]";
    }
}
