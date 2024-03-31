package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void inheritanceTest() {
        Bird bird = new Bird("bird");
        Assert.assertTrue(bird instanceof Pet);
    }

    @Test
    public void getNameTest() {
        Bird bird = new Bird("bird");
        Assert.assertEquals("bird", bird.getName());
    }
    @Test
    public void setNameTest() {
        Bird bird = new Bird("bird");
        bird.setName("newBird");
        Assert.assertEquals("newBird", bird.getName());
    }

    @Test
    public void speakTest() {
        Bird bird = new Bird("bird");
        Assert.assertEquals("Tweet!", bird.speak());
    }
}
