package com.example.cherish.photagraphy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cherish on 4/17/18.
 */

public class ImageTagManager {
    private List<Tag> all_tags;
    private List<Image> all_images;

    ImageTagManager() {
        all_tags = new ArrayList<>();
        all_images = new ArrayList<>();
    }

    ImageTagManager(List<Tag> tags, List<Image> images) {
        all_tags = tags;
        all_images = images;
    }

    public List<Tag> getAllTags() {
        return all_tags;
    }

    public void addToAllTags(Tag tag) {
        all_tags.add(tag);
    }

    public boolean deleteFromAllTags(Tag tag) {
        if(all_tags.size() <= 0)
            return false;
        else
            return all_tags.remove(tag);
    }

    public int getNumOfAllTags() {
        return all_tags.size();
    }

    public List<Image> getAllImages() {
        return all_images;
    }

    public void addToAllImages(Image image) {
        all_images.add(image);
    }

    public boolean deleteFromAllImages(Image image) {
        if(all_images.size() <= 0)
            return false;
        else
            return all_images.remove(image);
    }

    public int getNumOfAllImages() {
        return all_images.size();
    }
}
