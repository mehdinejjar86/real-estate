package com.nightstalker.interaction;

import com.nightstalker.people.Profile;

public class ProfileRating {
    private Profile profile;
    private int rate;
    private String comment;

    public ProfileRating(Profile profile, int rate, String comment) {
        this.profile = profile;
        this.rate = rate;
        this.comment = comment;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ProfileRating{" +
                "profile=" + profile +
                ", rate=" + rate +
                ", comment='" + comment + '\'' +
                '}';
    }
}
