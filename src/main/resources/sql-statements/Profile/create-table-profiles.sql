/* Creates PROFILES table */
CREATE TABLE PROFILES
(
	profile# CHAR (36),
	owner# CHAR (36),
	bio VARCHAR2 (120),
	name VARCHAR2 (45),
	city VARCHAR2 (45),
	state CHAR (2),
	zip CHAR (5),
		CONSTRAINT PROFILES_profile#_pk PRIMARY KEY (profile#),
		CONSTRAINT PROFILES_owner#_fk FOREIGN  KEY (owner#)
);
