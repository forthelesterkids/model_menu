package com.brandedb.modelmenu;

import com.brandedb.modelmenu.model.DailyProfile;
import com.brandedb.modelmenu.model.Food;
import com.brandedb.modelmenu.model.Profile;
import com.brandedb.modelmenu.profiler.DailyProfileBuilder;

import org.junit.Assert;
import org.junit.Test;

public class ProfileTests {

    @Test
    public void testProfilesAreEqual(){
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

        Assert.assertTrue(p1.compareTo(p2) == 0);
    }

    @Test
    public void testProfilesAreNotEqual(){
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

        Assert.assertFalse(p1.compareTo(p2) == 0);
    }

    @Test
    public void profileBuilderTest(){
        Food f1 = new Food("cabbage");
        Food f2 = new Food("chicken");
        Food f3 = new Food("ham");
        Food f4 = new Food("pumpkin");

        Food[] foods = {f1, f2, f3, f4};
        DailyProfile dailyProfile = new DailyProfileBuilder().addFoods(foods).buildDailyProfile();
        System.out.println(dailyProfile.toString());
    }
}