 create table POST (
        id bigint not null auto_increment,
        title varchar(255) not null,
        anons varchar(255),
        full_text varchar(16384) not null,
        views integer
        primary key (id)
  );