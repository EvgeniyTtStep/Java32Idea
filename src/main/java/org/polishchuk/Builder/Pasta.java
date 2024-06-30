package org.polishchuk.Builder;

public class Pasta {
    private String type;
    private String sauce;
    private String filling;
    private String additives;

    private Pasta(Builder builder) {
        this.type = builder.type;
        this.sauce = builder.sauce;
        this.filling = builder.filling;
        this.additives = builder.additives;
    }

    public String getType() {
        return type;
    }

    public String getSauce() {
        return sauce;
    }

    public String getFilling() {
        return filling;
    }

    public String getAdditives() {
        return additives;
    }

    public static class Builder {
        private String type;
        private String sauce;
        private String filling;
        private String additives;

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setFilling(String filling) {
            this.filling = filling;
            return this;
        }

        public Builder setAdditives(String additives) {
            this.additives = additives;
            return this;
        }

        public Pasta build() {
            return new Pasta(this);
        }
    }
}