package com.gigmanager.gigmanager.DAO;

import com.gigmanager.gigmanager.model.Gig;

import java.util.List;

public interface GigDao {

    List<Gig> getGigs();
    Gig getGigById(int gig_id);

}