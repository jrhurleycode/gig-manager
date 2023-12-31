begin transaction;
drop table if exists gig;
DROP TABLE IF EXISTS gigs;
DROP TABLE IF EXISTS setlists;


CREATE TABLE gigs (
	gig_id SERIAL,
	gig_name varchar(50) NOT NULL,
	venue_name varchar (50) NOT NULL,
	gig_date date,
	doorsOpen_time time,
	soundCheck_time time,
	band_name varchar(50) NOT NULL,
	CONSTRAINT pk_gig PRIMARY KEY (gig_id)
	);
	
	
CREATE TABLE setlists (
    setlist_id SERIAL,
    setlist_name VARCHAR(255), -- Add any other columns you need
    setlist_songs VARCHAR[], -- This column will hold an array of song titles
	CONSTRAINT pk_setlists PRIMARY KEY (setlist_id)
);
	
INSERT INTO gigs (gig_name, venue_name, gig_date, doorsOpen_time, soundCheck_time, band_name)
VALUES ('Tally Ho Show', 'Tally Ho', '09/08/2024', '17:00:00', '12:00:00', 'Poopy Boobie');


INSERT INTO Setlists (setlist_name, setlist_songs)
VALUES ('My Awesome Setlist', '{"AFI - Girls Not Grey", "Blink 182 - Dammit", "Mastodon - Blood and Thunder"}');

END transaction;

