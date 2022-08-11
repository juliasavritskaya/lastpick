create table if not exists attributes
(
    id                  bigserial     not null,
    role                varchar(60)   not null unique,
    primary key (id)
);

insert into attributes select * from (
                                         select 1, 'STRENGTH' union
                                         select 2, 'AGILITY' union
                                         select 3, 'INTELLIGENCE'
                                     ) x where not exists(select * from attributes);
