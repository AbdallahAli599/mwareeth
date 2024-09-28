package com.abdallah.mwareeth.calc;

import java.util.ArrayList;

public class WarathahOutput {
    ArrayList<Mirath> mWarathah;
    ArrayList<Mirath> mMahjoobin;

    boolean mTassawi;           // تعصيب بالتساوي أو للذكر مثل حظ الأنثيين
    boolean mIstighraq;
    boolean mShirkaTa3seeb;     // اشتراك عدة ورثة مختلفين في الباقي (جد وإخوة أو أبناء وبنات)
    boolean mMu3addah;

    int mNbrFurudh;
    int mNbr3assabat;
    int mAsl;
    int mBaqi;
    int mRo2osAlbaqi;
    int mRo2osBaqiAlbaqi;
    int mAwl;
    int mMissah;

    Naw3 mNaw3;

    public WarathahOutput() {
        mWarathah = new ArrayList<>();
        mMahjoobin = new ArrayList<>();

        mTassawi = true;
        mIstighraq = false;
        mShirkaTa3seeb = false;
        mMu3addah = false;

        mNbrFurudh = 0;
        mNbr3assabat = 0;
        mAsl = 1;
        mBaqi = 0;
        mRo2osAlbaqi = 1;
        mRo2osBaqiAlbaqi = 1;
        mAwl = 0;
        mMissah = 0;

        mNaw3 = Naw3.NAW3_3ADIA;
    }

    void copyHal(WarathahOutput from) {
        // from is the complete Massala where aljad is the last Sahib Fard in the list with 1/6
        // mWarathah contains only aljad + ikhwa for the other two cases where aljad part != 1/6
        ArrayList<Mirath> tmp = mWarathah;
        mWarathah = new ArrayList<>();
        int i;
        // Shallow copy of warathah as they are the same in all 3 cases (except Aljad and Ikhwa)
        for (i = 0; i < (from.mNbrFurudh - 1); i++) { mWarathah.add(from.mWarathah.get(i)); }
        // Preserve aljad and alikhwa from current massalal
        for (i = 0; i < tmp.size(); i++) { mWarathah.add(tmp.get(i)); }

        mMahjoobin = from.mMahjoobin;    // reference copy as hajb is the same for all cases

        mNbrFurudh = from.mNbrFurudh - 1;
        mNbr3assabat = from.mNbr3assabat + 1;
        mTassawi = from.mTassawi;

        // rest is unique to each case DO NOT COPY
//            mShirkaTa3seeb = from.mShirkaTa3seeb;
//            mMu3addah = from.mMu3addah;
//            mIstighraq = from.mIstighraq;

//            mAsl = 1;
//            mBaqi = 0;
//            mRo2osAlbaqi = 1;
//            mRo2osBaqiAlbaqi = 1;
//            mAwl = 0;
//            mMissah = 0;
    }

    public boolean isInkissar() { return mAwl != 0 ? mAwl != mMissah : mAsl != mMissah; }
}
