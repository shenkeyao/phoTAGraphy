package com.example.cherish.photagraphy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class IndividualImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_image);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IndividualImage.this, IndividualImagePop.class));
            }
        });
    }

    // add the function of LIKE vs LIKED
    public void changeLikeState(View view) {
        boolean checked = ((ToggleButton) view).isChecked();
        if (checked) {

        } else {

        }
    }
}
