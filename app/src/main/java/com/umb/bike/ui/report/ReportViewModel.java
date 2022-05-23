package com.umb.bike.ui.report;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReportViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ReportViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is report fragment");
    }

    public MutableLiveData<String> getmText() {
        return mText;
    }
}
