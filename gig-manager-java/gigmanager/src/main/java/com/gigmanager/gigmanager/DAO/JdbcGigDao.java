package com.gigmanager.gigmanager.DAO;

import com.gigmanager.gigmanager.model.Gig;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class JdbcGigDao implements GigDao {
    private final JdbcTemplate jdbc;

    public JdbcGigDao(JdbcTemplate jdbcTemplate) {this.jdbc = jdbcTemplate;}


    @Override
    public List<Gig> getGigs() {
        List<Gig> gigs = new ArrayList<>();
        String sql = "SELECT * FROM gigs ORDER BY gig_id;";
        try {
            SqlRowSet results = jdbc.queryForRowSet(sql);
            while (results.next()){
            Gig gig = mapRowToGig(results);
            gigs.add(gig);
            }
        }
        catch (CannotGetJdbcConnectionException e) {
            throw new RuntimeException("something fucked up");
        }
        return gigs;
    }

    @Override
    public Gig getGigById(int gig_id) {
        Gig gig = null;
        String sql = "SELECT * FROM gigs WHERE gig_id = ?";
        try {
            SqlRowSet results = jdbc.queryForRowSet(sql, gig_id);
            if (results.next()){
                gig = mapRowToGig(results);
            }
        }
        catch (CannotGetJdbcConnectionException e){
            throw new RuntimeException("something fucked up");
        }
        return gig;
    }

    private Gig mapRowToGig (SqlRowSet row){
        Gig gig = new Gig();
        gig.setGig_id(row.getLong("gig_id"));
        gig.setGig_name(row.getString("gig_name"));
        gig.setVenue_name(row.getString("venue_name"));
        gig.setGig_date(row.getDate("gig_date"));
        gig.setDoorsOpen_time(row.getTime("doorsopen_time").toLocalTime());
        gig.setSoundcheck_time(row.getTime("soundcheck_time").toLocalTime());
        gig.setBand_name(row.getString("band_name"));
        return gig;
    }

}