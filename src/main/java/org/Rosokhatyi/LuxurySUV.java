package org.Rosokhatyi;

public class LuxurySUV implements SUV {
    @Override
    public String getType() {
        return "Luxury SUV";
    }

    @Override
    public String getEngine() {
        return "V8 Engine";
    }

    @Override
    public String getInterior() {
        return "Leather Interior";
    }
}

class LuxurySedan implements Sedan {
    @Override
    public String getType() {
        return "Luxury Sedan";
    }

    @Override
    public String getEngine() {
        return "V6 Engine";
    }

    @Override
    public String getInterior() {
        return "Leather Interior";
    }
}

class EconomySedan implements Sedan {
    @Override
    public String getType() {
        return "Economy Sedan";
    }

    @Override
    public String getEngine() {
        return "I4 Engine";
    }

    @Override
    public String getInterior() {
        return "Fabric Interior";
    }
}

