package com.sunshine.testevents;

public interface View {
    void whenButtonClicked(Runnable listener);
    String getButtonData();
}
