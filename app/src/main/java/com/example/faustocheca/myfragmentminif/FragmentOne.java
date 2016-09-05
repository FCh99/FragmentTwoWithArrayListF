package com.example.faustocheca.myfragmentminif;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

/**
 * Created by faustocheca on 13/8/16.
 */
public class FragmentOne extends Fragment {



    EditText editText;
    Button button;
    TextView textView;
    Context context;
    private EventBus bus = EventBus.getDefault();  // Publisher
    CommunicateEvent event;
    ArrayList<Coche> coches;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,container,false);

        editText = (EditText)view. findViewById(R.id.edit_text);
        button = (Button)view. findViewById(R.id.button_go);

        coches = new ArrayList<>();

        coches.add(new Coche("Toyota", "rojo"));
        coches.add(new Coche("Opel", "gris"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                event = new CommunicateEvent(coches);
                bus.post(event);

            }
        });

        return view;

    }


}
