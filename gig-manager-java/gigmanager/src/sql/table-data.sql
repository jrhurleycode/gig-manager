BEGIN TRANSACTION:

DROP TABLE IF EXISTS gig;

CREATE TABLE gig (
	gig_id serial,
	gig_name varchar(50) NOT NULL,
	venue_name varchar (50) NOT NULL,
	gig_date date,
	doorsOpen_time time,
	soundCheck_time time,
	band_name varchar(50) NOT NULL,
	CONSTRAINT pk_gig PRIMARY KEY (gig_id)
	);
	
COMMIT TRANSACTION;