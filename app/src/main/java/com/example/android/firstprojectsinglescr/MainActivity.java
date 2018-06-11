package com.example.android.firstprojectsinglescr;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView call;
    private TextView location;
    private ImageView facebook;
    private ImageView instagram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/**
 * For calling
 */
        call = findViewById(R.id.phonenumber);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9818339232" ));
                startActivity(intent);
            }
        });

        /**
         * For Follow us at facebook and instagram
         */
        facebook = findViewById(R.id.facebook_follow);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.facebook.com/CafeVivekVihar/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        instagram = findViewById(R.id.instagram_follow);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.instagram.com/cafetorium.reloaded/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        /**
         * For finding a store location in maps
         */

        location = findViewById(R.id.location);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String map = "https://www.google.com/maps/place/Cafetorium/@28.6805033,77.3167598,15z/data=!4m5!3m4!1s0x0:0xf265d688160fe11e!8m2!3d28.6805033!4d77.3167598";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(map));
                startActivity(intent);
            }
        });


    }
}
