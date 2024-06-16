package org.Rosokhatyi;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public SUV createSUV() {
        return new LuxurySUV();
    }

    @Override
    public Sedan createSedan() {
        return new LuxurySedan();
    }
}

class EconomyCarFactory implements CarFactory {
    @Override
    public SUV createSUV() {
        return new EconomySUV();
    }

    @Override
    public Sedan createSedan() {
        return new EconomySedan();
    }
}

