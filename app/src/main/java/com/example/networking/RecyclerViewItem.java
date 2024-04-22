package com.example.networking;

import androidx.recyclerview.widget.RecyclerView;

@SuppressWarnings("WeakerAccess")
public class RecyclerViewItem {
    private String title;

    public RecyclerViewItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
