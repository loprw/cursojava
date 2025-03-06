CREATE TABLE credenciales_empleados (
    id NUMBER(5),
    nombre_usuario VARCHAR2(15),
    password VARCHAR2(15),
    empleado_id NUMBER(5),
    CONSTRAINT pk_credencialesempleados PRIMARY KEY (id),
    CONSTRAINT fk_credencialesempleados_empleados FOREIGN KEY (empleado_id) REFERENCES empleados(id),
    CONSTRAINT unique_credencialesempleaados_nombreusuario UNIQUE (empleado_id),
    CONSTRAINT unique_credencialesempleaados_empleadoid UNIQUE (nombre_usuario)
);

INSERT INTO credenciales_empleados VALUES (1, 'jperez', 'pepelospalotes', 1);
INSERT INTO credenciales_empleados VALUES (2, 'agarcia', 'anita246', 2);
INSERT INTO credenciales_empleados VALUES (3, 'cgomez', 'gocalo04', 3);

SELECT e.id, e.nombre, e.edad, e.salario, e.departamento_id, e.fecha_contratacion, c.id, c.nombre_usuario, c.password, c.empleado_id
FROM empleados e
JOIN credenciales_empleados c ON e.id = c.empleado_id;

SELECT e.nombre, e.departamento_id, c.nombre_usuario
FROM empleados e
JOIN credenciales_empleados c ON e.id = c.empleado_id
GROUP BY departamento_id
WHERE departamento_id = 1;
