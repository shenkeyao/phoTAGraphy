package com.example.cherish.photagraphy;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Cherish on 4/17/18.
 */

public class TagCellAdapter extends RecyclerView.Adapter implements View.OnClickListener {

    private Context mContext;
    private List<Tag> mTags;
    private AdapterView.OnItemClickListener mOnItemClickListener = null;

    public TagCellAdapter(Context context, List<Tag> tags) {
        this.mContext = context;
        this.mTags = tags;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.tag_cell, parent, false);
        return new TagCellViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Tag tag = mTags.get(position);
        ((TagCellViewHolder) holder).bind(tag);
        holder.itemView.setTag(position);
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public int getItemCount() { return mTags.size(); }
}

class TagCellViewHolder extends RecyclerView.ViewHolder {
    public RelativeLayout mTagCellRelativeLayout;
    public TextView mTagTextView;

    public TagCellViewHolder(View itemView) {
        super(itemView);
        mTagCellRelativeLayout = itemView.findViewById(R.id.every_tag);
        mTagTextView = mTagCellRelativeLayout.findViewById(R.id.tag_name_cell);
    }

    void bind(Tag tag) {
        mTagTextView.setText(tag.getTagName());
    }

}
