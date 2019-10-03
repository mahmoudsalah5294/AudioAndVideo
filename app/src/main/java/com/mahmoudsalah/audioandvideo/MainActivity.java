package com.mahmoudsalah.audioandvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button audioButton,videoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void audio(View view) {
        Intent intent=new Intent(MainActivity.this,Audio.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(MainActivity.this,Video.class);
        startActivity(intent);
    }
}
