package com.sunshine.testevents;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Collection;
import java.util.LinkedList;

public class MainFragment extends Fragment implements View {
    Button button;
    Collection<Runnable> whenButtonClicked=new LinkedList<>();
    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        android.view.View  view=  super.onCreateView(inflater, container, savedInstanceState);
        if(view==null){
            view=inflater.inflate(R.layout.fragment_layout,container,false);
        }
        button=(Button) view.findViewById(R.id.button);
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                try {
                    Events.fire(whenButtonClicked);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return view;
    }

    @Override
    public void whenButtonClicked(Runnable listener){
            whenButtonClicked.add(listener);
    }

    @Override
    public String getButtonData() {
        return "200";
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
}
