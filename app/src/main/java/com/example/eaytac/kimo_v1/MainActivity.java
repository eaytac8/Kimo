package com.example.eaytac.kimo_v1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity
{
    VideoView vv;
    Button btnDur, btnDevam;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vv = (VideoView) findViewById(R.id.videoOynat);
        btnDur = (Button)findViewById(R.id.kapat_button);
        btnDevam = (Button)findViewById(R.id.devam_button);

        Uri yol = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);

        vv.setVideoURI(yol);
        vv.start();

        btnDur.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                vv.pause();
            }
        });

        btnDevam.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Uri yol = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
                vv.start();
            }
        });


    }
}
