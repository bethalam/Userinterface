package com.example.dineshvarma.userinterface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.triggertrap.seekarc.SeekArc;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekArc arc = (SeekArc) findViewById(R.id.seekArc);
        arc.setOnSeekArcChangeListener(new SeekArc.OnSeekArcChangeListener() {
            @Override
            public void onProgressChanged(SeekArc seekArc, int i, boolean b) {
                TextView tView = (TextView) findViewById(R.id.textView5);
                String text = String.valueOf(i);
                if (i!=10){
                    text = "0" + i;
                }
                tView.setText(text);
            }

            @Override
            public void onStartTrackingTouch(SeekArc seekArc) {

            }

            @Override
            public void onStopTrackingTouch(SeekArc seekArc) {

            }
        });

    }
}
