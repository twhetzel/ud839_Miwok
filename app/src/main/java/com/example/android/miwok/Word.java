package com.example.android.miwok;

/**
 * Created by whetzel on 8/12/16.
 */
public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    /**
     * Constructor to display words and images
     * @param defaultTranslation
     * @param miwokTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /**
     * Constructor to display words and images
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
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

    /**
     * Get the image resource Id
     * @return
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                '}';
    }
}
