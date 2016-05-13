# --- !Ups
 
CREATE TABLE user (
    username varchar(20),
    firstname varchar(20),
    lastname varchar(20),
    address varchar(255),
    PRIMARY KEY (username)
);
 
# --- !Downs
 
DROP TABLE user;