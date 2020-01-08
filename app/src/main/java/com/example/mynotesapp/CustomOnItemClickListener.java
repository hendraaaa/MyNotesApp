package com.example.mynotesapp;

import android.view.View;

public class CustomOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnitemClickCallback onitemClickCallback;

    public CustomOnItemClickListener(int position, OnitemClickCallback onitemClickCallback) {
        this.position = position;
        this.onitemClickCallback = onitemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onitemClickCallback.onItemClicked(view, position);

    }
    public interface OnitemClickCallback{
        void onItemClicked(View view, int position);
    }
}
