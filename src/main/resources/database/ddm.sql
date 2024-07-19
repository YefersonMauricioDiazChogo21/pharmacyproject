
INSERT INTO country (country_name) VALUES
    ('Colombia'),
    ('United States'),
    ('Brazil');

INSERT INTO city (city_name, id_country) VALUES
    ('Bogotá', 1),
    ('Medellín', 1),
    ('Bucaramanga', 1),
    ('New York', 2),
    ('São Paulo', 3);

INSERT INTO neighborhood (neighborhood_name, id_city) VALUES
    ('Chapinero', 1),
    ('El Poblado', 2),
    ('Cabecera', 3),
    ('Manhattan', 4),
    ('Vila Madalena', 5),
    ('Floridablanca', 3),
    ('Girardot', 3),
    ('La Floresta', 3),
    ('Cabecera del Llano', 3),
    ('Provenza', 3);            


INSERT INTO dnltype (type_document,descripcion_type) VALUES
    ('CC',"Cedula de ciudadania"),
    ('TI',"Tarjeta de identidad"),
    ('PP',"Pasaporte"),
    ('CE',"Cedula Extranjera");

INSERT INTO customer (id, id_dnl_type, customer_name, customer_last_name, age, birthdate, id_neighborhood)
VALUES
    ('123456789', 1, 'Juan', 'Pérez', 35, '1989-05-15', 3),
    ('987654321', 1, 'María', 'Gómez', 28, '1996-10-25', 3),
    ('456789123', 2, 'Carlos', 'López', 42, '1982-03-10', 2),
    ('789123456', 1, 'Ana', 'Martínez', 30, '1994-07-08', 1),
    ('111111111', 1, 'Camila', 'Gómez', 22, '2002-08-10', 4),
    ('222222222', 1, 'Andrés', 'Martínez', 25, '1999-04-15', 3),
    ('333333333', 1, 'Valentina', 'López', 21, '2003-01-20', 2),
    ('444444444', 1, 'Santiago', 'Hernández', 24, '2000-11-05', 1);

