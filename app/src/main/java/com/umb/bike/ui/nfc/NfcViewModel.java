package com.umb.bike.ui.nfc;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NfcViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NfcViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mfc fragment");
    }

    public MutableLiveData<String> getmText() {
        return mText;
    }
}
