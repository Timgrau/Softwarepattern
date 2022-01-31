package com.company;

class Wanderschuhe implements ISchuhe {
    String model = "Wanderschuhe";

    @Override
    public String getModel() {
        return this.model;
    }
}
