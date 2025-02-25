CREATE TABLE usuarios (
id NUMBER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
nombre VARCHAR2(50) NOT NULL,
email VARCHAR2(100) NOT NULL UNIQUE,
fecha_registro DATE DEFAULT SYSDATE
);

SELECT SYSDATE FROM dual;

ALTER TABLE usuarios ADD telefono VARCHAR2(15);

ALTER TABLE usuarios MODIFY nombre VARCHAR(100) NOT NULL;