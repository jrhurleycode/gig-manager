package com.gigmanager.gigmanager.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalTime;
import java.util.Date;

@Entity
public class Gigs {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gig_id;
    private String gig_name;
    private String venue_name;
    private Date gig_date;
    private LocalTime doors_open_time;
    private LocalTime soundcheck_time;
    private String band_name;

    public Gigs() {};

    public Gigs(Long gig_id, String gig_name, String venue_name, Date gig_date, LocalTime doors_open_time, LocalTime soundcheck_time, String band_name) {
        this.gig_id = gig_id;
        this.gig_name = gig_name;
        this.venue_name = venue_name;
        this.gig_date = gig_date;
        this.doors_open_time = doors_open_time;
        this.soundcheck_time = soundcheck_time;
        this.band_name = band_name;
    }

    public Long getGig_id() {
        return gig_id;
    }

    public void setGig_id(Long gig_id) {
        this.gig_id = gig_id;
    }

    public String getGig_name() {
        return gig_name;
    }

    public void setGig_name(String gig_name) {
        this.gig_name = gig_name;
    }

    public String getVenue_name() {
        return venue_name;
    }

    public void setVenue_name(String venue_name) {
        this.venue_name = venue_name;
    }

    public Date getGig_date() {
        return gig_date;
    }

    public void setGig_date(Date gig_date) {
        this.gig_date = gig_date;
    }

    public LocalTime getDoors_open_time() {
        return doors_open_time;
    }

    public void setDoors_open_time(LocalTime doors_open_time) {
        this.doors_open_time = doors_open_time;
    }

    public LocalTime getSoundcheck_time() {
        return soundcheck_time;
    }

    public void setSoundcheck_time(LocalTime soundcheck_time) {
        this.soundcheck_time = soundcheck_time;
    }

    public String getBand_name() {
        return band_name;
    }

    public void setBand_name(String band_name) {
        this.band_name = band_name;
    }
}