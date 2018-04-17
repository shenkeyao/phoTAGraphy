package com.example.cherish.photagraphy;

import android.app.Activity;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Cherish on 4/16/18.
 */

public class IndividualImagePop extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private ArrayList<Tag> mTags = new ArrayList<Tag>();

    TextView titleText;
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.individual_image_tag_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout(width, (int) (height * 0.25));
        getWindow().setGravity(Gravity.BOTTOM);

        // TODO: get the tags of the image from the intent
        // fill in tag list
        Tag t1 = new Tag("Tag111111");
        Tag t2 = new Tag("Tag2");
        Tag t3 = new Tag("Tag3");
        Tag t4 = new Tag("Tag4");
        Tag t5 = new Tag("Tag5");
        Tag t6 = new Tag("Tag6");
        Tag t7 = new Tag("Tag7");
        Tag t8 = new Tag("Tag8");
        Tag t9 = new Tag("Tag9");
        mTags.add(t1);
        mTags.add(t2);
        mTags.add(t3);
        mTags.add(t4);
        mTags.add(t5);
        mTags.add(t6);
        mTags.add(t7);
        mTags.add(t8);
        mTags.add(t9);

        layout = (RelativeLayout) findViewById(R.id.individual_image_tag_feed);

        mRecyclerView = (RecyclerView) findViewById(R.id.current_tags);
        LinearLayoutManager horizontalLayoutMananger = new LinearLayoutManager(IndividualImagePop.this,
                LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(horizontalLayoutMananger);

        setAdapterAndUpdateData();


    }

    private void setAdapterAndUpdateData() {
        // create a new adapter with the updated mComments array
        // this will "refresh" our recycler view
        mAdapter = new TagCellAdapter(this, mTags);
        mRecyclerView.setAdapter(mAdapter);

        // scroll to the last comment
        if(mTags.size()!=0){
            mRecyclerView.smoothScrollToPosition(0);
        }

    }
}
