package com.example.maximus.beatboxapp.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.maximus.beatboxapp.model.BeatBox;
import com.example.maximus.beatboxapp.model.Sound;

public class SoundViewModel extends BaseObservable{
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public void setSound(Sound mSound) {
        this.mSound = mSound;
        notifyChange();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
