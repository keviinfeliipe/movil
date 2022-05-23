package com.umb.bike.ui.owner;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OwnerViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public OwnerViewModel() {
        this.mText = new MutableLiveData<>();
        mText .setValue("This a owner fragment");
    }

    public MutableLiveData<String> getText() {
        return mText;
    }
}
