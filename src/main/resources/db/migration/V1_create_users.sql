# create table users with id, name, email, password_hash, password_salt, created_at, updated_at
create table users (
  id int(11) not null auto_increment,
  name varchar(255) not null,
  email varchar(255) not null,
  password_hash varchar(255) not null,
  password_salt varchar(255) not null,
  created_at datetime not null,
  updated_at datetime not null,
  primary key (id)
);