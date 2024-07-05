package org.Rosokhatyi;

public interface Car {
    String getType();
    String getEngine();
    String getInterior();
}

interface SUV extends Car {}
interface Sedan extends Car {}

