package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void inheritanceTest() {
        Cat cat = new Cat("cat");
        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public void getNameTest() {
        Cat cat = new Cat("cat");
        Assert.assertEquals("cat", cat.getName());
    }
    @Test
    public void setNameTest() {
        Cat cat = new Cat("cat");
        cat.setName("newCat");
        Assert.assertEquals("newCat", cat.getName());
    }

    @Test
    public void speakTest() {
        Cat cat = new Cat("cat");
        Assert.assertEquals("Meow!", cat.speak());
    }
}
