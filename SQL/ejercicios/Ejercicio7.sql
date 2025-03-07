--Ejercicio 7: Relación Uno a Muchos (1:M) - Empleados y Equipos de Trabajo
--Cada empleado pertenece a un solo equipo de trabajo, pero cada equipo puede tener muchos empleados.
--Tabla equipos con id, nombre (not null), fecha creación default el dia que se inserta
--+Insertar Datos con fechas
--CONSULTAS UNO A MUCHOS
--========================================================
--+Obtener la lista de empleados con sus equipos
--+Contar cuántos empleados hay en cada equipo
--+Obtener los empleados con el salario más alto en cada equipo
--+Obtener los empleados de los equipos creados hace más de 3 años

--CREATE TABLE equipos (
--    id NUMBER(5),
--    nombre VARCHAR2(50),
--    fecha_creacion DATE DEFAULT SYSDATE,
--    empleado_id NUMBER(5),
--    CONSTRAINT pk_equipos PRIMARY KEY (id),
--    CONSTRAINT notnull_equipos_nombre CHECK (nombre IS NOT NULL)
--);

--INSERT INTO empleados VALUES (4, 'Julián Mínguez', 29, 3000.00, 2, '05/05/2020');
--INSERT INTO empleados VALUES (5, 'Anable Pinto', 34, 4500.00, 1, '01/09/2021');
--INSERT INTO empleados VALUES (6, 'Esther Duarte', 50, 2345.50, 3, '24/12/2023');
--ALTER TABLE empleados ADD equipo_id NUMBER(5);
--ALTER TABLE empleados ADD CONSTRAINT fk_equipos_empleados FOREIGN KEY (equipo_id) REFERENCES equipos(id);
--UPDATE empleados SET equipo_id = 3 WHERE id = 6;
--UPDATE empleados SET equipo_id = 1 WHERE id = 4 OR id = 2;
--UPDATE empleados SET equipo_id = 2 WHERE id = 1 OR id = 3 OR id = 5;
--ALTER TABLE empleados ADD CONSTRAINT notnull_empleaados_equipoid CHECK (equipo_id IS NOT NULL);
--UPDATE empleados SET nombre = 'Anabel Duarte' WHERE nombre = 'Anable Pinto';


--INSERT INTO equipos VALUES (1, 'Equipo Directivo', '05/05/2020');
--INSERT INTO equipos VALUES (2, 'Equipo Comercial', '10/10/2024');
--INSERT INTO equipos (id, nombre) VALUES (3, 'Equipo Desarrollo');

SELECT em.nombre, eq.nombre
FROM empleados em
JOIN equipos eq ON em.equipo_id = eq.id;

SELECT COUNT(em.nombre) AS totalEmpleados, eq.nombre
FROM empleados em
JOIN equipos eq ON em.equipo_id = eq.id
GROUP BY eq.nombre;

SELECT em.nombre, em.salario, eq.nombre
FROM empleados em
JOIN equipos eq ON em.equipo_id = eq.id
WHERE em.salario IN (
        SELECT MAX(salario)
        FROM empleados
        GROUP BY equipo_id
        );
        
SELECT em.nombre, em.edad, em.salario, em.fecha_contratacion, eq.nombre
FROM empleados em
JOIN equipos eq ON em.equipo_id = eq.id
WHERE MONTHS_BETWEEN(SYSDATE, eq.fecha_creacion) > (12 * 3);