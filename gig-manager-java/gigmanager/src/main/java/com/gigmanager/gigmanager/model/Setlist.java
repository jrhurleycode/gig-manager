package com.gigmanager.gigmanager.model;

import java.util.List;

public class Setlist {
    private int setlist_id;
    private String setlist_name;
    private List setlist_songs;

    public Setlist(){}

    public Setlist(int setlist_id, String setlist_name, List setlist_songs) {
        this.setlist_id = setlist_id;
        this.setlist_name = setlist_name;
        this.setlist_songs = setlist_songs;
    }

    public int getSetlist_id() {
        return setlist_id;
    }

    public void setSetlist_id(int setlist_id) {
        this.setlist_id = setlist_id;
    }

    public String getSetlist_name() {
        return setlist_name;
    }

    public void setSetlist_name(String setlist_name) {
        this.setlist_name = setlist_name;
    }

    public List getSetlist_songs() {
        return setlist_songs;
    }

    public void setSetlist_songs(List setlist_songs) {
        this.setlist_songs = setlist_songs;
    }
}