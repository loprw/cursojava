--Ejercicio 8: Relación Muchos a Muchos (M:M) - Empleados y Certificaciones
--Un empleado puede obtener varias certificaciones, y una certificación puede ser obtenida por varios empleados y cada cada certificación de cada empleado es válida hasta una fecha determinada. Por defecto el valor de la fecha será de 1 año más a partir de la fecha en la que se inserta.
--Tabla certificaciones con id, nombre y descripción
--CONSULTAS MUCHOS A MUCHOS
--========================================================
--Realiza una consulta SQL que muestre el nombre del empleado, el nombre de la certificación y la fecha en la que la obtuvo.
--Escribe una consulta SQL que muestre el nombre del empleado y el número total de certificaciones que ha obtenido.
--Escribe una consulta SQL que muestre el nombre de la certificación y la cantidad de empleados que la han obtenido, pero solo si más de un empleado la ha conseguido.
--CONSULTAS GENERALES
--========================================================
--Realiza una consulta SQL que muestre el nombre del empleado, su usuario de acceso, y el nombre del equipo al que pertenece.
--Realiza una consulta SQL que muestre el nombre del equipo, el número total de empleados en cada equipo y cuántos empleados tienen credenciales asignadas.
--Muestra el nombre del empleado, su usuario, el nombre de la certificación obtenida y la fecha en que la obtuvo.
--Muestra el nombre del equipo y el número total de certificaciones obtenidas por sus empleados.

/*
CREATE TABLE certificaciones (
    id NUMBER(5),
    nombre VARCHAR2(50),
    descripcion VARCHAR2(100),
    CONSTRAINT pk_certificaciones PRIMARY KEY (id)
);

CREATE TABLE certificaciones_empleados (
    certificacion_id NUMBER(5),
    empleado_id NUMBER(5,0),
    fecha_obtencion DATE DEFAULT SYSDATE,
    CONSTRAINT pk_certificacionesempleados PRIMARY KEY (certificacion_id, empleado_id),
    CONSTRAINT fk_certificacionesempleados_empleados FOREIGN KEY (empleado_id) REFERENCES empleados(id),
    CONSTRAINT fk_certificacionesempleados_certifiaciones FOREIGN KEY (certificacion_id) REFERENCES certificaciones(id)
);

INSERT INTO certificaciones VALUES (1, 'Certificado de Empleabilidad', 'Indica que el empleado es empleable');
INSERT INTO certificaciones VALUES (2, 'Certificado Java', 'Indica que el empleado sabe programar en Java');
INSERT INTO certificaciones VALUES (3, 'Curso de Contabilidad', 'Indica que el empleado sabe Contabilidad');
INSERT INTO certificaciones VALUES (4, 'Curso de Ventas', 'Indica que el empleado sabe vender productos de forma eficaz');

INSERT INTO certificaciones_empleados (certificacion_id, empleado_id) VALUES (1, 1);
INSERT INTO certificaciones_empleados VALUES (1, 2, '12/12/2024');
INSERT INTO certificaciones_empleados VALUES (1, 3, '10/02/2025');
INSERT INTO certificaciones_empleados (certificacion_id, empleado_id) VALUES (1, 4);
INSERT INTO certificaciones_empleados VALUES (1, 5, '30/11/2024');
INSERT INTO certificaciones_empleados (certificacion_id, empleado_id) VALUES (1, 6);
INSERT INTO certificaciones_empleados VALUES (2, 6, '20/10/2024');
INSERT INTO certificaciones_empleados (certificacion_id, empleado_id) VALUES (3, 2);
INSERT INTO certificaciones_empleados VALUES (3, 4, '30/01/2025');
INSERT INTO certificaciones_empleados (certificacion_id, empleado_id) VALUES (4, 1);
INSERT INTO certificaciones_empleados VALUES (4, 3, '20/03/2024');
INSERT INTO certificaciones_empleados (certificacion_id, empleado_id) VALUES (4, 5);
*/

SELECT e.nombre, c.nombre, ce.fecha_validez
FROM certificaciones_empleados ce
JOIN certificaciones c ON ce.certificacion_id = c.id
JOIN empleados e ON ce.empleado_id = e.id;

SELECT e.nombre, COUNT(ce.certificacion_id) AS numeroCertificaciones
FROM certificaciones_empleados ce
JOIN empleados e ON ce.empleado_id = e.id
GROUP BY e.nombre;

SELECT c.nombre, COUNT(ce.empleado_id) AS numeroEmpleados
FROM certificaciones_empleados ce
JOIN certificaciones c ON ce.certificacion_id = c.id
GROUP BY c.nombre;