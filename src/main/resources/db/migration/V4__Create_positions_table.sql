create table if not exists positions
(
    id        serial      not null,
    positions varchar(60) not null unique,
    primary key (id)
);

insert into positions
select *
from (
         select 1, 'CARRY'
         union
         select 2, 'MID'
         union
         select 3, 'OFFLANE'
         union
         select 4, 'SEMI_SUPPORT'
         union
         select 5, 'HARD_SUPPORT'
     ) x
where not exists(select * from positions);
