package org.Rosokhatyi;

public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;
    private boolean isLiquidCooled;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isLiquidCooled = builder.isLiquidCooled;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM + "GB, Storage=" + storage + "GB, Liquid Cooled=" + isLiquidCooled + "]";
    }

    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;
        private boolean isLiquidCooled;

        public Builder withCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder withGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder withRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder withStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder withLiquidCooled(boolean isLiquidCooled) {
            this.isLiquidCooled = isLiquidCooled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

