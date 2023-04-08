package com.example.recyclebin;

public class FarmTools {
    int jembe;
    int panga; 
    int wheelborrow;

    public FarmTools(int jembe, int panga, int wheelborrow){
        this.jembe = jembe;
        this.panga = panga;
        this.wheelborrow = wheelborrow;
    }

    public void setJembe(int jembe) {
        this.jembe = jembe;
    }

    public void setPanga(int panga){
        this.panga = panga;
    }

    public void setWheelborrow(int wheelborrow){
        this.panga = wheelborrow;
    }

    public int getJembe() {
        return jembe;
    }

    public int getPanga() {
        return panga;
    }

    public int getWheelborrow() {
        return wheelborrow;
    }
}
