package com.example.android.helloandroid;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            }


    public void facebookButton(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Udacity/"));
        startActivity(browserIntent);

    }

    public void githubButton(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/udacity"));
        startActivity(browserIntent);

    }

    public void twitterButton(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/udacity"));
        startActivity(browserIntent);

    }

    public void youtubeButton(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCBVCi5JbYmfG3q5MEuoWdOw"));
        startActivity(browserIntent);

    }

    public void addressButton(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=udacity"));
        startActivity(browserIntent);

    }

    public void phoneButton(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:6505555555"));
        startActivity(browserIntent);

    }

    public void webButton(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udacity.com"));
        startActivity(browserIntent);

    }

}
