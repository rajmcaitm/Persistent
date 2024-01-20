package com.intuit.enums;

public enum Gerder {
    male("male"),
    female("female"),
    other("other"),
    notApplicable("notApplicable");

    private String value;
    Gerder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Gerder get(String string) {
        for(Gerder type : Gerder.values()){
            if(type.value.equalsIgnoreCase(string)){
                return type;
            }
        }
        throw new IllegalArgumentException("No Gerder found for string: " + string);
    }
}
