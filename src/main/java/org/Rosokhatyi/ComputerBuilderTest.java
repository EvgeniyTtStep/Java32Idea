package org.Rosokhatyi;

public class ComputerBuilderTest {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder()
                .withCPU("Intel Core i9")
                .withGPU("NVIDIA RTX 3080")
                .withRAM(32)
                .withStorage(2000)
                .withLiquidCooled(true)
                .build();

        System.out.println(gamingComputer);

        Computer officeComputer = new Computer.Builder()
                .withCPU("Intel Core i5")
                .withGPU("Integrated")
                .withRAM(16)
                .withStorage(512)
                .withLiquidCooled(false)
                .build();

        System.out.println(officeComputer);
    }
}

