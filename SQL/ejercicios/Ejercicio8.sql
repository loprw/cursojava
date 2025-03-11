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

CREATE TABLE certificaciones_empleados (
    certificacion_id NUMBER(5),
    empleado_id NUMBER(5,0),
    fecha_validez DATE DEFAULT ADD_MONTHS(SYSDATE, 12),
    CONSTRAINT pk_certificacionesempleados PRIMARY KEY (certificacion_id, empleado_id)
);

INSERT INTO certificaciones_empleados (certificacion_id, empleado_id)
VALUES (1,1);
INSERT INTO certificaciones_empleados
VALUES (2,1, TO_DATE('15/10/2025'));

CREATE TABLE certificaciones (
    id NUMBER(5),
    nombre VARCHAR2(50),
    descripcion VARCHAR2(100),
    CONSTRAINT pk_certificaciones PRIMARY KEY (id),
    CONSTRAINT fk_certificacionesempleados_certificaciones FOREIGN KEY (id) REFERENCES certificaciones_empleados(certificacion_id)
);

ALTER TABLE empleados ADD CONSTRAINT fk_certificacionesmepleados_empleados FOREIGN KEY (id) REFERENCES certificaciones_empleados(empleado_id);