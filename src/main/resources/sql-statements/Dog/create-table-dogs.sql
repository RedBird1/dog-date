CREATE TABLE DOGS
(
	dog# CHAR (36),
	owner# CHAR (36),
	breed VARCHAR2 (45),
	height NUMBER (5, 2),
	weight NUMBER (5, 2),
	age NUMBER (3, 0),
		CONSTRAINT DOGS_dog#_pk PRIMARY KEY (dog#),
		CONSTRAINT DOGS_owner#_fk FOREIGN KEY (owner#)
			REFERENCES OWNERS(owner#),
		CONSTRAINT DOGS_age_reasonable CHECK (age <= 21)
);