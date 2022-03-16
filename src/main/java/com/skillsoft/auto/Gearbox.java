package com.skillsoft.auto;

public class Gearbox
{
    String type;
    int numgeras;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumgeras() {
        return numgeras;
    }

    public void setNumgeras(int numgeras) {
        this.numgeras = numgeras;
    }

    @Override
    public String toString() {
        return "Gearbox{" +
                "type='" + type + '\'' +
                ", numgeras=" + numgeras +
                '}';
    }
}
