package com.java_algorithms_api.java_algorithms_api.model.response;

public class ValidaSesionResponse {

    private boolean pase;

    public ValidaSesionResponse() {
        super();
    }

    public ValidaSesionResponse(boolean pase) {
        super();
        this.pase = pase;
    }

    public boolean isPase() {
        return pase;
    }

    public void setPase(boolean pase) {
        this.pase = pase;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
