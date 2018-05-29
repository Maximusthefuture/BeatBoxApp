package com.example.maximus.beatboxapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.maximus.beatboxapp.model.SingleFragmentActivity;

public class BeatBoxActivity  extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
