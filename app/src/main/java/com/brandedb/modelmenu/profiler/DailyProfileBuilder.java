package com.brandedb.modelmenu.profiler;

import com.brandedb.modelmenu.model.DailyProfile;
import com.brandedb.modelmenu.model.Food;
import com.brandedb.modelmenu.model.Profile;

public class DailyProfileBuilder {

    DailyProfile dailyProfile = new DailyProfile();
    private void combinationUtil(Food arr[], Food data[], int start,
                                int end, int index, int r) {
        Profile profile = new Profile();
        if (index == r) {
            for (int j = 0; j < r; j++) {
                profile.addFood(data[j]);
            }
            dailyProfile.addProfile(profile);
            return;
        }
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    private void buildCombination(Food arr[], int n, int r) {
        Food data[] = new Food[r];
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }

    public void buildProfileForDay(Food arr[]){
        for(int i = 1; i < arr.length; i++) {
            buildCombination(arr, arr.length, i);
        }
    }

    public DailyProfile getDailyProfile(){
        return dailyProfile;
    }
}

