package com.kanke.dreamcar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by kanke on 15/12/2015.
 */
public class AutoTraderLink extends Activity {


    ImageButton autotrader;

    ImageButton gumtree;

    ImageButton audi;


    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step1);


        autotrader =(ImageButton) findViewById(R.id.autotrader);

        gumtree =(ImageButton) findViewById(R.id.gumtree);

        audi =(ImageButton) findViewById(R.id.audi);

        autotrader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, AutoTraderActivity.class);
                startActivity(intent);
            }
        });


        audi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, AudiActivity.class);
                startActivity(intent);
            }
        });

        gumtree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, GuntreeActivity.class);
                startActivity(intent);
            }
        });

    }
}
