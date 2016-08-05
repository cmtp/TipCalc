package com.cmtp.android.tipcalc;

import android.app.Application;
/**
 * Created by chris on 4/8/2016.
 */
public class TipCalcApp extends Application{
    private final static String ABOUT_URL = "https://about.me/adriancatalan";

    public static String getAboutUrl() {
        return ABOUT_URL;
    }
}
