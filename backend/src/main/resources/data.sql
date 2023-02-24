CREATE TABLE IF NOT EXISTS ircnpj.public.tb_user (
    id serial not null,
    cnpj varchar(18) not null,
    salary float8,
    occupation varchar(25)
);

insert into ircnpj.public.tb_user values (1, '12.122.111/0001-11', 3000, 'Dev'),
                                  (2, '13.133.111/0002-11', 3500, 'Dev jr'),
                                  (3, '14.111.111/0003-11', 9000, 'Dev'),
                                  (4, '15.123.143/0004-11', 1000, 'Aux. almoxarife');