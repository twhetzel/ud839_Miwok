package com.example.android.miwok;

/**
 * Created by whetzel on 8/12/16.
 */
public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /**
     * Get Miwok translation of the default word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the Default translation of the miwok word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
