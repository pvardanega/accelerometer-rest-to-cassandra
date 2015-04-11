CREATE KEYSPACE accelerations WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};

USE accelerations;

CREATE TABLE acceleration (
  timestamp bigint,
  x double,
  y double,
  z double,
  PRIMARY KEY (timestamp)
);
