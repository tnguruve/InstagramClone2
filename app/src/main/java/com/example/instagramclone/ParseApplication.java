package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("DLXTfK2p5KItZqTI0As6rzAr7SEVer1b9DAz2zwG")
                .clientKey("1CFsrUMHg2zuxjeQCvjIV1AX1KoWF45BdKCs9FXh")
                .server("https://parseapi.back4app.com").build()
        );
    }
}

