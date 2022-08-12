create table if not exists attack_types
(
    id   serial   not null,
    attack_type varchar(60) not null unique,
    primary key (id)
);

insert into attack_types
select *
from (
         select 1, 'RANGE'
         union
         select 2, 'MELEE'
     ) x
where not exists(select * from attack_types);
