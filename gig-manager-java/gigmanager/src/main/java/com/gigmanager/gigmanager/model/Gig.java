package com.gigmanager.gigmanager.model;


import java.time.LocalTime;
import java.util.Date;

public class Gig {

    private int gig_id;
    private String gig_name;
    private String venue_name;
    private Date gig_date;
    private LocalTime doorsOpen_time;
    private LocalTime soundcheck_time;
    private String band_name;

    public Gig() {};

    public Gig(int gig_id, String gig_name, String venue_name, Date gig_date, LocalTime doorsopen_time, LocalTime soundcheck_time, String band_name) {
        this.gig_id = gig_id;
        this.gig_name = gig_name;
        this.venue_name = venue_name;
        this.gig_date = gig_date;
        this.doorsOpen_time = doorsopen_time;
        this.soundcheck_time = soundcheck_time;
        this.band_name = band_name;
    }

    public int getGig_id() {
        return gig_id;
    }

    public void setGig_id(int gig_id) {
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

    public LocalTime getDoorsOpen_time() {
        return doorsOpen_time;
    }

    public void setDoorsOpen_time(LocalTime doorsOpen_time) {
        this.doorsOpen_time = doorsOpen_time;
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