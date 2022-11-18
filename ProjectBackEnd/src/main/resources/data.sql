CREATE TABLE `usuarios` (
  `ID_usuario` int auto_increment not null,
  `nombre` varchar(25) NOT NULL,
  `apellidos` varchar(25) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `correo` varchar(255) not null,
  `ciudad` varchar(255) NOT NULL,
  `fotoPerfil` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_usuario`)
);
/*
CREATE TABLE `administradores` (
  `ID_usuario` int auto_increment not null,
  `empresa` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_usuario`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`ID_usuario`) REFERENCES `usuarios` (`ID_usuario`)
) ;
*/
CREATE TABLE `hoteles` (
  `ID_hotel` int auto_increment not null,
  `nombre` varchar(255) not null,
  `tipo_pension` varchar(25) NOT NULL, 
  `estrellas` int NOT NULL, 
  `tipo_habitaciones` varchar(255) NOT NULL, 
  `descripcion` varchar(255) not null,
  `mascotas` boolean NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `localidad` varchar(255) not null,
  PRIMARY KEY (`ID_hotel`)
);

CREATE TABLE `vuelos` (
  `ID_vuelos` int auto_increment not null,
  `aereolinea` varchar(255) NOT NULL, 
  `tipo_asiento` varchar(255) NOT NULL, 
  `maletas` varchar(255) NOT NULL, 
  `duracion` int not null,
  `asignacion_asiento` varchar(2), 
  `escalas` varchar(255) NOT NULL,
  `origen` varchar(255) NOT NULL,
  `destino` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_vuelos`)
) ;


CREATE TABLE `viajes` (
  `ID_viaje` int auto_increment not null,
  `ID_vuelo` int,
  `ID_hotel` int ,
  `origen` varchar(255) not null,
  `destino` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_viaje`,`ID_vuelo`,`ID_hotel`),
  CONSTRAINT `viajes_ibfk_1` FOREIGN KEY (`ID_vuelo`) REFERENCES `vuelos` (`ID_vuelos`),
  CONSTRAINT `viajes_ibfk_2` FOREIGN KEY (`ID_hotel`) REFERENCES `hoteles` (`ID_hotel`)
) ;

CREATE TABLE `chollo` (
  `ID_chollo` int auto_increment not null,
 /* `ID_admin` int not null,*/ 
  `ID_viaje` int not null,
  `fecha_caducidad` date not null,
  `titulo` varchar(255) NOT NULL,
  `precio` int NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `valoracion` int NOT NULL, /*numero estrellas*/
  `unidades` int NOT NULL,
  /*  PRIMARY KEY (`ID_chollo`,`ID_admin`,`ID_viaje`),*/
  PRIMARY KEY (`ID_chollo`),
 /* CONSTRAINT `chollo_ibfk_1` FOREIGN KEY (`ID_admin`) REFERENCES `administradores` (`ID_usuario`),*/
  CONSTRAINT `chollo_ibfk_2` FOREIGN KEY (`ID_viaje`) REFERENCES `viajes` (`ID_viaje`)
);

CREATE TABLE `reserva` (
  `ID_reserva` int auto_increment NOT NULL,
  `ID_usuario` int NOT NULL,
  `ID_chollo` int NOT NULL,
  `fecha_reserva` date NOT NULL,
  PRIMARY KEY (`ID_reserva`,`ID_usuario`,`ID_chollo`),
  CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`ID_usuario`) REFERENCES `usuarios` (`ID_usuario`),
  CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`ID_chollo`) REFERENCES `chollo` (`ID_chollo`)
);