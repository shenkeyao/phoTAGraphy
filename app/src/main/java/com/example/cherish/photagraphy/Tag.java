package com.example.cherish.photagraphy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Cherish on 4/17/18.
 */

public class Tag {
    private String tag_name;
    private List<Image> image_contained;

    Tag(String name) {
        this.tag_name = name;
        this.image_contained = new ArrayList<>();
    }

    public List<Image> getImage() {
        return image_contained;
    }

    public void addImage(Image image) {
        image_contained.add(image);
    }

    public boolean deleteImage(Image image) {
        if (image_contained.size() <= 0)
            return false;
        else
            return image_contained.remove(image);
    }

    public int getNumOfImages() {
        return image_contained.size();
    }

    public String getTagName() {
        return tag_name;
    }

    public void setTagName(String name) {
        this.tag_name = name;
    }
}
