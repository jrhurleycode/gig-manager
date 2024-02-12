package com.gigmanager.gigmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Setlist {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long setlist_id;
    private String setlist_name;
    private String[] setlist_songs;

    public Setlist(){}

    public Setlist(Long setlist_id, String setlist_name, String[] setlist_songs) {
        this.setlist_id = setlist_id;
        this.setlist_name = setlist_name;
        this.setlist_songs = setlist_songs;
    }

    public Long getSetlist_id() {
        return setlist_id;
    }

    public void setSetlist_id(Long setlist_id) {
        this.setlist_id = setlist_id;
    }

    public String getSetlist_name() {
        return setlist_name;
    }

    public void setSetlist_name(String setlist_name) {
        this.setlist_name = setlist_name;
    }

    public String[] getSetlist_songs() {
        return setlist_songs;
    }

    public void setSetlist_songs(String[] setlist_songs) {
        this.setlist_songs = setlist_songs;
    }
}