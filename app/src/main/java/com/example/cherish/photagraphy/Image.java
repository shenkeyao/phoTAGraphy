package com.example.cherish.photagraphy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Cherish on 4/17/18.
 */

public class Image {
    private String image_name;
    private String image_file;
    private List<Tag> image_tags;
    private boolean isLiked;
    private Date date;

    Image(String file) {
        this.image_file = file;
        this.image_name = file;
        this.image_tags = new ArrayList<>();
        this.isLiked = false;
        this.date = Calendar.getInstance().getTime();
    }

    Image(String name, String file) {
        this.image_name = name;
        this.image_file = file;
        this.image_tags = new ArrayList<>();
        this.isLiked = false;
        this.date = Calendar.getInstance().getTime();
    }

    public List<Tag> getTag() {
        return image_tags;
    }

    public void addTag(Tag tag) {
        image_tags.add(tag);
    }

    public boolean deleteTag(Tag tag) {
        if(image_tags.size() <= 0)
            return false;
        else
            return image_tags.remove(tag);
    }

    public int getNumOfTags() {
        return image_tags.size();
    }

    public String getImageName() {
        return image_name;
    }

    public void setImageName(String name) {
        this.image_name = name;
    }

    public String getFile() {
        return image_file;
    }

    public void setFile(String file) {
        this.image_file = file;
    }

    public boolean getLike() {
        return isLiked;
    }

    public void setLike(boolean lk) {
        this.isLiked = lk;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date dd) {
        this.date = dd;
    }
}
