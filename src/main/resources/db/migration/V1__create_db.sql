CREATE TABLE CLIENT(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(200),
	CHECK(LENGTH(NAME)>2)
);

CREATE TABLE PLANET(
id VARCHAR PRIMARY KEY,
name VARCHAR(500),
	CHECK(LENGTH(NAME)>1),
CONSTRAINT id_Only_Latin_and_Numbers
	CHECK (id NOT LIKE '%[^A-Z0-9]%'),
CONSTRAINT id_upper
check (upper(id) = id)
);

CREATE TABLE TICKET(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
client_id INT,
from_planet_id VARCHAR,
to_planet_id VARCHAR,
PRIMARY KEY(id)
);

ALTER TABLE TICKET
   ADD  FOREIGN KEY (client_id)
      REFERENCES CLIENT(id)
      ON DELETE CASCADE;
ALTER TABLE TICKET
   ADD  FOREIGN KEY (from_planet_id)
      REFERENCES PLANET(id)
      ON DELETE CASCADE;
ALTER TABLE TICKET
     ADD  FOREIGN KEY (to_planet_id)
        REFERENCES PLANET(id)
        ON DELETE CASCADE;