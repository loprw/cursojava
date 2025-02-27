--Paso 1
CREATE TABLE empleados (
id NUMBER(5,0) PRIMARY KEY,
nombre VARCHAR2(50) NOT NULL,
edad NUMBER(3,0),
salario NUMBER(10,2) CHECK (salario > 0),
departamento_id NUMBER(3,0),
fecha_contratacion DATE DEFAULT SYSDATE
);

--Apartado 1
INSERT INTO empleados (id, nombre, edad, salario, departamento_id) VALUES (1, 'Juan Pérez', 30, 3000.00, 1);

--Apartado 2
INSERT ALL
 INTO empleados (id, nombre, edad, salario, departamento_id) VALUES (2, 'Ana García', 28, 3200.00, 1)
 INTO empleados (id, nombre, edad, salario, departamento_id) VALUES (3, 'Carlos Gómez', 40, 5000.00, 2)
 INTO empleados (id, nombre, edad, salario, departamento_id) VALUES (4, 'Laura Torres', 25, 2800.00, 3)
SELECT * FROM dual;

--Apartado 3
UPDATE empleados SET salario = salario * 1.1 WHERE nombre = 'Juan Pérez';

--Apartado 4
UPDATE empleados SET edad = edad + 1;
UPDATE empleados SET salario = salario * 1.05 WHERE departamento_id = 1;

--Apartado 5
DELETE FROM empleados WHERE id = 4;

--Apartado 6
DELETE FROM empleados WHERE salario < 3000.00;

--Apartado 7
SELECT * FROM empleados;

--Apartado 8
SELECT nombre, salario, departamento_id FROM empleados WHERE salario > 4000.00;

--Apartado 9
SELECT nombre, salario, departamento_id FROM empleados ORDER BY departamento_id;
SELECT MAX(salario) FROM empleados GROUP BY departamento_id;

--Apartado 10
