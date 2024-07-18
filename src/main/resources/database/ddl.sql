    CREATE DATABASE pharmacy;
    USE pharmacy;

    CREATE TABLE country(
        id int AUTO_INCREMENT,
        country_name VARCHAR(20) NOT NULL,
        CONSTRAINT pk_id_country PRIMARY KEY(id)
    );

    CREATE TABLE city (
        id int AUTO_INCREMENT,
        city_name VARCHAR(20) NOT NULL,
        id_country int NOT NULL,
        CONSTRAINT pk_id_city PRIMARY KEY(id),
        CONSTRAINT fk_id_country FOREIGN KEY (id_country) REFERENCES country(id)
    );

    CREATE TABLE neighborhood(
        id int AUTO_INCREMENT,
        neighborhood_name VARCHAR(20) NOT NULL,
        id_city int NOT NULL,
        CONSTRAINT pk_id_neighborhood PRIMARY KEY (id),
        CONSTRAINT fk_id_city FOREIGN KEY (id_city) REFERENCES city(id)
    );

    CREATE TABLE dnltype(
        id int AUTO_INCREMENT,
        type_document VARCHAR(10) NOT NULL,
        CONSTRAINT pk_id_dnltype PRIMARY KEY(id)
    );

    CREATE TABLE customer(
        id VARCHAR(20),
        id_dnl_type int NOT NULL,
        customer_name VARCHAR(60) NOT NULL,
        customer_last_name VARCHAR(60) NOT NULL,
        age int,
        birthdate DATE,
        registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        id_city int NOT NULL,
        id_neighborhood int NOT NULL,
        CONSTRAINT pk_id_customer PRIMARY KEY (id),
        CONSTRAINT fk_id_dnl_type FOREIGN KEY (id_dnl_type) REFERENCES dnltype(id),
        CONSTRAINT fk_id_city_customer FOREIGN KEY (id_city) REFERENCES city(id),
        CONSTRAINT fk_id_neihgborhood_customer FOREIGN KEY (id_neighborhood) REFERENCES neighborhood(id)
    );

        