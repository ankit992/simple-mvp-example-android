package com.sunshine.testevents;

public class MainPresenter {
    View view;
    Model model;
    public MainPresenter(View view, final Model model){
        this.view=view;
        this.model=model;

        view.whenButtonClicked(() -> {
            model.doSomethingWithData(view.getButtonData());
        });
        view.whenButtonClicked(() -> {
            model.doSomethingWithData(view.getButtonData());
        });
    }
}
