package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void inheritanceTest() {
        Dog dog = new Dog("dog");
        Assert.assertTrue(dog instanceof Pet);
    }

    @Test
    public void getNameTest() {
        Dog dog = new Dog("dog");
        Assert.assertEquals("dog", dog.getName());
    }
    @Test
    public void setNameTest() {
        Dog dog = new Dog("dog");
        dog.setName("newDog");
        Assert.assertEquals("newDog", dog.getName());
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog("dog");
        Assert.assertEquals("Bark!", dog.speak());
    }
}
