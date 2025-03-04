-- PASO 1
CREATE TABLE empleados (
id NUMBER(5,0),
nombre VARCHAR2(50),
edad NUMBER(3,0),
salario NUMBER(10,2),
departamento_id NUMBER(3,0),
fecha_contratacion DATE DEFAULT SYSDATE,
CONSTRAINT pk_empleados PRIMARY KEY (id),
CONSTRAINT chk_salario CHECK (salario > 9),
CONSTRAINT notnull_nombre CHECK (nombre IS NOT NULL)
);

--ALTER TABLE empleados RENAME CONSTRAINT SYS_C008561 TO PK_EMPLEADO;
--ALTER TABLE empleados ADD CONSTRAINT chk_edad CHECK (edad > 18);

-- PASO 2

--Apartado 1
INSERT INTO empleados (id, nombre, edad, salario, departamento_id) VALUES (1, 'Juan Pérez', 30, 3000.00, 1);

--Apartado 2
INSERT ALL
 INTO empleados (id, nombre, edad, salario, departamento_id) VALUES (2, 'Ana García', 28, 3200.50, 1)
 INTO empleados (id, nombre, edad, salario, departamento_id) VALUES (3, 'Carlos Gómez', 40, 5000.10, 2)
 INTO empleados (id, nombre, edad, salario, departamento_id) VALUES (4, 'Laura Torres', 25, 2800.80, 3)
SELECT * FROM empleados;

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
SELECT ID nombre, edad, salario, departamento_id, fecha_contratacion FROM empleados;

--Apartado 8
SELECT nombre, salario, departamento_id FROM empleados WHERE salario > 4000.00;

--Apartado 9
SELECT nombre, salario, departamento_id
FROM empleados e
WHERE salario = 
    (SELECT MAX(salario) 
    FROM empleados 
    WHERE departamento_id = e.departamento_id );

--Apartado 10
SELECT COUNT(nombre) AS numeroEmpleados, SUM(salario) AS sumaSalarios, AVG(salario) AS promedioSalarios, departamento_id
FROM empleados
GROUP BY departamento_id
HAVING COUNT(nombre) > 1;

-- PASO 3

--Apartado 1
SELECT UPPER(nombre) AS nombreMayusculas
FROM empleados;

--Apartado 2
SELECT id, nombre, LENGTH(nombre) AS tamañoNombre
FROM empleados;

--Apartado 3
SELECT id, nombre, SUBSTR(nombre, 1, 3)AS primerasLetras
FROM empleados;

--Apartado 4
SELECT id, nombre, salario, ROUND(salario) AS salarioRedondeado, TRUNC(salario) AS salarioTruncado
FROM empleados;

--Apartado 5
SELECT nombre, fecha_contratacion, ROUND(MONTHS_BETWEEN(SYSDATE, fecha_contratacion)) AS tiempoContratado
FROM empleados;

-- Apartado 6
SELECT nombre, fecha_contratacion, NEXT_DAY(fecha_contratacion, 'lunes')
FROM empleados;

-- Apartado 7
SELECT SUM(salario) AS salarioTotal, MIN(salario) AS salarioMinimo, MAX(salario) AS salarioMaximo, ROUND(AVG(salario),2) AS salarioPromedio
FROM empleados;

--Apartado 8
SELECT nombre, edad, salario, departamento_id, fecha_contratacion
FROM empleados
WHERE MONTHS_BETWEEN(SYSDATE, fecha_contratacion) >= (12 * 3);

--Apartado 9
SELECT nombre, salario, 
    CASE 
        WHEN salario > 4500.00 THEN 'Alto'
        WHEN salario < 3000.00 THEN 'Bajo'
        ELSE 'Medio'
    END AS nivel_salarial
FROM empleados;

--Apartado 10
SELECT COUNT(nombre) AS numeroEmpleados, AVG(salario) AS promedioSalarios, departamento_id
FROM empleados
GROUP BY departamento_id
HAVING COUNT(nombre) > 1;
