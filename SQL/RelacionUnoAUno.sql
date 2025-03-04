CREATE TABLE clientes (
id NUMBER(5),
nombre VARCHAR2(50),
CONSTRAINT pk_clientes PRIMARY KEY (id)
);

CREATE TABLE clientes_detalles (
id NUMBER(5),
direccion VARCHAR2(100),
telefono VARCHAR(20),
cliente_id NUMBER(5),
CONSTRAINT pk_clientesdetalles PRIMARY KEY (id),
CONSTRAINT unique_clientesdetalles_clienteid UNIQUE (cliente_id),
CONSTRAINT fk_clientesdetalles_cliente FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);

INSERT into clientes VALUES (1, 'Juan Pérez');
INSERT into clientes VALUES (2, 'Ana García');
INSERT into clientes_detalles VALUES (1, 'Calle Mayor 123', '627800701', 1);
INSERT into clientes_detalles VALUES (2, 'Avenida Central 45', '678905432', 2);

--forma correcta de pedir dos datos relacionadas por pk/fk
SELECT c.id, c.nombre, d.direccion, d.telefono
FROM clientes c
JOIN clientes_detalles d ON c.id = d.cliente_id;