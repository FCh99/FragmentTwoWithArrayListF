package com.example.faustocheca.myfragmentminif;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;

/**
 * Created by faustocheca on 13/8/16.
 */
public class FragmentTwo extends Fragment {
    // SUBSCRIBER

    TextView textView;
    EventBus bus = EventBus.getDefault();
    ArrayList <Coche>coches2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two,container,false);

        textView = (TextView)view. findViewById(R.id.text_view_mostrar);

        bus.register(this);

        return view;
    }

    @Subscribe
    public void onEvent (CommunicateEvent event2){

        String string = String.valueOf(event2);
        textView.setText(string);

    }


}
