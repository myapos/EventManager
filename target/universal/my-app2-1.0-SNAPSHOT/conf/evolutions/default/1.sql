# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table event (
  id                        integer auto_increment not null,
  description               varchar(255),
  day_start                 varchar(255),
  day_end                   varchar(255),
  hours                     varchar(255),
  location_id               integer,
  constraint pk_event primary key (id))
;

create table location (
  id                        integer auto_increment not null,
  name                      varchar(255),
  address                   varchar(255),
  latitude                  varchar(255),
  longitude                 varchar(255),
  constraint pk_location primary key (id))
;

create table user (
  id                        varchar(255) not null,
  name                      varchar(255),
  username                  varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  role                      varchar(255),
  constraint pk_user primary key (id))
;

alter table event add constraint fk_event_location_1 foreign key (location_id) references location (id) on delete restrict on update restrict;
create index ix_event_location_1 on event (location_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table event;

drop table location;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

