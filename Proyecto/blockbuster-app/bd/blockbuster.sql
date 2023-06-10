#Nombre: Angel Gabriel Vargas Varela 
#Carnet: 2021080292
create database blockbuster;
show databases;
use blockbuster;
create table clients(
  id int not null auto_increment,
  nombre varchar(50) not null,
  apellido varchar(50) not null,
  cedula int not null,
  telefono int not null,
  direccion varchar(50) not null,
  primary key(id)
);


insert into clients (nombre, apellido, cedula, telefono, direccion)
values
  ('Frank', 'Suarez', 209870899, 87995678, 'Alajuela'),
  ('Pablo', 'Ramirez', 890456788, 89567810, 'San jose'),
  ('Xavier', 'Villanueva', 210908928, 67891090, 'Guanacaste'),
  ('Jimmy', 'Cervantes', 890184567, 78892314 , 'Limon'),
  ('Olga', 'Vargas', 834589010, 65709009, 'Heredia'),
  ('Maria', 'Peña', 210345670, 89592740, 'Cartago'),
  ('Juan', 'Espinoza', 256789030, 86775302, 'Puntarenas'),
  ('Belia', 'Santamaria', 278980017, 89305679, 'Alajuela'),
  ('Leonardo', 'Benavides', 756789000, 76891023, 'Limon'),
  ('Yasmin', 'Sanchez', 410234257, 81478002, 'San jose');

start transaction;
delimiter //
create procedure update_client(
    in p_id int,
    in p_nombre varchar(50),
    in p_apellido varchar(50),
    in p_cedula int,
    in p_telefono int,
    in p_direccion varchar(50),
    out p_procedure_status int
)
begin
    if exists (select id from client where id = p_id) then update client
        set nombre = p_nombre, apellido = p_apellido, cedula = p_cedula, telefono = p_telefono, direccion = p_direccion where id = p_id;
        select 1 into p_procedure_status;
    else
        set p_procedure_status =-1;
    end if;
    rollback;
end
//
delimiter ;

#call operacion_prueba();
  


create table review(
  id int not null auto_increment,
  rating int not null,
  review_text varchar(100) not null,
  created_on datetime not null,
  client_id int not null,
  movie_id int not null,
  primary key(id),
  foreign key(client_id) references clients(id),
  foreign key(movie_id) references movie(id)
);



insert into review (rating, review_text, created_on, client_id, movie_id)
values
  (1, 'Fue una pelicula muy buena', '2010-8-27', 4, 3),
  (3, 'No me gustó mucho la película, la trama era confusa', '2018-3-15', 2, 4),
  (5, 'Definitivamente recomendaría esta película, me mantuvo enganchado de principio a fin', '2019-11-28', 5, 3),
  (4, 'La película estuvo bien, pero esperaba más acción', '2005-9-3', 3, 1),
  (3, 'No entendí muy bien la película, la encontré un poco aburrida', '2014-7-20', 2, 4),
  (5, '¡Increíble película! No pude apartar la vista de la pantalla', '2017-2-14', 5, 2),
  (5, 'Me encantó el mensaje que transmitía la película, realmente me hizo reflexionar', '2023-1-7', 4, 1);

start transaction;
delimiter //
create procedure update_review(
    in p_id int,
    in p_rating varchar(50),
    in p_review_text varchar(50),
    in p_created_on datetime,
    in p_movie_id int,
    out p_procedure_status int
)
begin
    if exists (select id from review where id = p_id) then update review
        set rating = p_rating, review_text = p_review_text , created_on = p_created_on, movie_id = p_movie_id where id = p_id;
        select 1 into p_procedure_status;
    else
        set p_procedure_status =-1;
    end if;
    rollback;
end
//
delimiter ;
  
delimiter //
create trigger review_insert after insert on review
for each row begin
   insert into review(review_text) value (concat("Se subio una review con un rating de: ",NEW.rating, "y el: ", NEW.created_on));
end //
delimiter ;

delimiter //
create trigger review_delete after delete on review
for each row begin
   insert into review(review_text) value (concat("Se borro la review: ",NEW.id, "y creado el: ", NEW.created_on));
end //
delimiter ;

delimiter //
create trigger review_update after update on review
for each row begin
   insert into review(review_text) value (concat("Se actualizo la review con el id: ",NEW.id, "y creada el: ", NEW.created_on));
end //
delimiter ;

create table rentals(
  id int not null auto_increment,
  rental_date datetime not null,
  client_id int not null,
  movie_id int not null,
  primary key(id),
  foreign key(client_id) references clients(id),
  foreign key(movie_id) references movie(id)
);

insert into rentals (rental_date, client_id, movie_id)
values
  ('2003-6-19', 1, 2),
  ('2010-8-27', 1, 2),
  ('2010-8-27', 1, 2),
  ('2012-5-31', 1, 2),
  ('2019-12-1', 1, 2),
  ('2015-4-3', 1, 2),
  ('2008-9-10', 1, 2);

delimiter //
create procedure operacion_prueba(in table_names text, in created_on datetime, in entry_text text)
begin
  declare cantidad int unsigned;
  select id, table_names, created_on, entry_text from blockbuster_log where id != 0;
end //
delimiter ;

#call operacion_prueba();

delimiter //
create trigger rentals_insert after insert on review
for each row begin
   insert into rentals(client_id) value (concat("Se rento una pelicula por el usuario: ",NEW.client_id, "y en la fecha: ", NEW.rental_date));
end //
delimiter ;

delimiter //
create trigger rentals_delete after delete on review
for each row begin
   insert into review(client_id) value (concat("Se devolvio una pelicula por el usuario: ",NEW.id, "y en la fecha: ", NEW.created_on));
end //
delimiter ;

delimiter //
create trigger rentals_update after update on review
for each row begin
   insert into review(client_id) value (concat("Se actualizo la renta de una pelicula por el usuario: ",NEW.id, "y en la fecha: ", NEW.created_on));
end //
delimiter ;

create table category(
  id int not null auto_increment,
  nombre varchar(50) not null,
  descripcion varchar(50) not null,
  primary key(id)
);

insert into category (nombre, descripcion)
values
  ('Fantasia', 'Elementos de fantasia y magicos'),
  ('Romance', 'Romantico'),
  ('Animada', 'Creada con animacion'),
  ('Accion', 'Mucha adrenalina'),
  ('Drama', 'Sentimental'),
  ('Ciencia ficcion', 'No existe'),
  ('Terror', 'Dan miedo');
  
create table movie(
  id int not null auto_increment,
  titulo varchar(50) not null,
  fecha_lanzamiento datetime not null,
  category_id int not null,
  units_available int not null,
  primary key(id),
  foreign key(category_id) references category(id)
);


insert into movie (titulo, fecha_lanzamiento, category_id, units_available)
values
  ('El señor de los anillos', '2003-6-19', 1, 4),
  ('Titanic',  '2004-12-24', 2, 8),
  ('Buscando a Nemo',  '2020-11-5', 3, 9),
  ('El padrino', '2021-2-7', 4, 8),
  ('El mago de oz', '2000-10-19', 1, 3),
  ('1914', '2019-10-19', 5, 1),
  ('Parasyte', '2018-4-25', 5, 4),
  ('E.T', '1998-9-17', 6, 9),
  ('Harry Potter', '1999-11-14', 1, 10),
  ('El conjuro', '2012-8-13', 7, 7);
  
create table blockbuster_log(
  id int not null auto_increment,
  table_names varchar(50) not null,
  created_on datetime not null,
  entry_text varchar(50) not null,
  primary key(id)
);


insert into blockbuster_log (table_names, created_on, entry_text)
values
  ('Juan', '2003-6-19', 'Me gustan las peliculas de terror'),
  ('María', '1998-2-12', 'Me encanta el cine de ciencia ficción'),
  ('Pedro', '2005-9-30', 'Prefiero las películas de comedia romántica'),
  ('Ana', '1995-7-8', 'Soy fanática de los filmes de acción'),
  ('Luis', '2001-4-23', 'Disfruto viendo películas de drama'),
  ('Carolina', '2008-11-16', 'Me apasionan las películas de aventuras'),
  ('Laura', '2004-3-27', 'Suelo emocionarme con las películas románticas'),
  ('Isabel', '1997-1-18', 'Me encantan los clásicos del cine');
  




