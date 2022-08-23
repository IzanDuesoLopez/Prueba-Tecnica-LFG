drop table if exists users_in_parties, parties, groups, users;

create table users (
	id int auto_increment primary key,
    username varchar(20),
    password varchar(16),
    steam_username varchar(20),
    user_rol varchar(20)
);

create table groups (
	id int auto_increment primary key,
    videogame varchar(50),
	members int,
    user_id int,
    constraint group_fk foreign key (user_id) references users (id)
    on delete cascade on update cascade
);

create table parties (
	id int auto_increment primary key,
    members int,
    messages int
);

create table users_in_parties (
	id int auto_increment primary key,
    message varchar(255),
    user_id int,
    party_id int,
    constraint user_fk_parties foreign key (user_id) references users (id)
    on delete cascade on update cascade,
    constraint party_fk_parties foreign key (party_id) references parties (id)
    on delete cascade on update cascade
);

insert into users(username, password, steam_username, user_rol)values('IzanCartio', 'pswd123', 'Izancube44', 'ADMIN');
insert into users(username, password, steam_username, user_rol)values('David', '321var', 'Daviduber', 'USER');
insert into users(username, password, steam_username, user_rol)values('Oscar', 'spider88', 'McOscar', 'USER');

insert into groups(videogame, members, user_id)values('Spider-man', 21, 1);
insert into groups(videogame, members, user_id)values('Minecraft', 24, 11);
insert into groups(videogame, members, user_id)values('League', 17, 21);

insert into parties(members, messages)values(21, 421);
insert into parties(members, messages)values(24, 730);
insert into parties(members, messages)values(17, 355);

insert into users_in_parties(message, user_id, party_id)values('¿Hola que tal?', 1, 1);
insert into users_in_parties(message, user_id, party_id)values('¿Muy bien y tu?', 11, 11);
insert into users_in_parties(message, user_id, party_id)values('¿Jugamos a algo?', 21, 21);