create table if not exists heroes
(
    id                  bigint            not null unique,
    name                varchar(60)     not null,
    localized_name      varchar(60)     not null,
    primary_attribute   varchar(60)     not null,
    attack_type         varchar(60)       not null,
    position            varchar(60)       not null,
    primary key (id)
);