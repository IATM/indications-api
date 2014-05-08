package com.iatm.indications.api.beans;

public class IndicationsInput {
    private Request request;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "IndicationsInput [request=" + request + "]";
    }
}
