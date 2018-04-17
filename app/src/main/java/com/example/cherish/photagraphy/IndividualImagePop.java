package com.example.cherish.photagraphy;

import android.app.Activity;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;

/**
 * Created by Cherish on 4/16/18.
 */

public class IndividualImagePop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.individual_image_tag_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout(width, (int)(height * 0.25));
        getWindow().setGravity(Gravity.BOTTOM);

    }
}
