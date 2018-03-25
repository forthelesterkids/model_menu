package com.brandedb.modelmenu;

import com.brandedb.modelmenu.model.DailyProfile;
import com.brandedb.modelmenu.model.Food;
import com.brandedb.modelmenu.model.Profile;
import com.brandedb.modelmenu.model.QualifyingEvent;
import com.brandedb.modelmenu.profiler.DailyProfileBuilder;

import org.joda.time.Instant;
import org.junit.Assert;
import org.junit.Test;

public class ProfileTests {

    @Test
    public void testProfilesAreEqual() {
        Food f1 = new Food("cabbage");
        Food f2 = new Food("chicken");
        Food f3 = new Food("ham");

        Profile p1 = new Profile();
        p1.addFood(f1);
        p1.addFood(f2);
        p1.addFood(f3);

        Profile p2 = new Profile();
        p2.addFood(f1);
        p2.addFood(f2);
        p2.addFood(f3);

        Assert.assertTrue(p1.getFoods().equals(p2.getFoods()));
    }

    @Test
    public void testProfilesAreNotEqual() {
        Food f1 = new Food("cabbage");
        Food f2 = new Food("chicken");
        Food f3 = new Food("ham");

        Profile p1 = new Profile();
        p1.addFood(f1);
        p1.addFood(f2);
        p1.addFood(f3);

        Profile p2 = new Profile();
        p2.addFood(f1);
        p2.addFood(f2);

        Assert.assertFalse(p1.getFoods().equals(p2.getFoods()));
    }

    @Test
    public void profileBuilderTest() {
        Food f1 = new Food("cabbage");
        Food f2 = new Food("chicken");
        Food f3 = new Food("ham");
        Food f4 = new Food("pumpkin");

        Food[] foods = {f1, f2, f3, f4};
        DailyProfile dailyProfile = new DailyProfileBuilder().addFoods(foods).buildDailyProfile();
        System.out.println(dailyProfile.toString());
    }

    @Test
    public void qualifyingEventIsEqual() {

        QualifyingEvent q1 = new QualifyingEvent("headache", new Instant(1L));
        QualifyingEvent q2 = new QualifyingEvent("Headache", new Instant(1L));

        Assert.assertEquals(q1, q2);
    }

    @Test
    public void qualifyingEventNotEqual() {

        QualifyingEvent q1 = new QualifyingEvent("headaches", new Instant(1L));
        QualifyingEvent q2 = new QualifyingEvent("Headache", new Instant(1L));

        Assert.assertNotEquals(q1, q2);
    }
}