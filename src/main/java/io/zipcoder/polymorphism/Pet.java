package io.zipcoder.polymorphism;

public abstract class Pet {
    private String name;

    public Pet(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak(){
        return null;
    }
}
