CREATE TABLE DOGS
(
	uid CHAR(36),
	breed VARCHAR2(45),
	height NUMBER(5, 2),
	weight NUMBER(5, 2),
	age NUMBER(3, 0),
		CONSTRAINT DOGS_uid_pk PRIMARY KEY (uid),
		CONSTRAINT DOGS_age_reasonable CHECK (age <= 21)
);