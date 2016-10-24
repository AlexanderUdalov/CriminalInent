package com.criminalintent.alexu.criminalintent;

import java.util.UUID;

/**
 * Created by alexu on 24.10.2016.
 */

public class Crime {
    private UUID mId;
    private String mTitle;


    public Crime(UUID mId){
        this.mId = UUID.randomUUID();

    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getmId() {

        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }
}
