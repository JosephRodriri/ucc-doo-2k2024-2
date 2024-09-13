/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     12/09/2024 10:23:24 p. m.                    */
/*==============================================================*/


drop table APUESTAS;

drop table LOTERIAS;

drop table NUMEROS_APOSTADOS;

drop table USUARIOS;

/*==============================================================*/
/* Table: APUESTAS                                              */
/*==============================================================*/
create table APUESTAS (
   CHANCE_ID            NUMERIC              not null,
   USUARIO_ID           NUMERIC              not null,
   LOTERIA_ID           NUMERIC              not null,
   FECHA_APUESTA        TIME                 null,
   MONTO                MONEY                null,
   constraint PK_APUESTAS primary key (CHANCE_ID)
);

/*==============================================================*/
/* Table: LOTERIAS                                              */
/*==============================================================*/
create table LOTERIAS (
   LOTERIA_ID           NUMERIC              not null,
   NOMBRE               VARCHAR(10)          null,
   DEPARTAMENTO         VARCHAR(20)          null,
   constraint PK_LOTERIAS primary key (LOTERIA_ID)
);

/*==============================================================*/
/* Table: NUMEROS_APOSTADOS                                     */
/*==============================================================*/
create table NUMEROS_APOSTADOS (
   ID                   NUMERIC              not null,
   CHANCE_ID            NUMERIC              not null,
   NUMERO               NUMERIC              null,
   constraint PK_NUMEROS_APOSTADOS primary key (ID)
);

/*==============================================================*/
/* Table: USUARIOS                                              */
/*==============================================================*/
create table USUARIOS (
   USUARIO_ID           NUMERIC              not null,
   NOMBRE               VARCHAR(10)          null,
   EMAIL                VARCHAR(15)          null,
   FECHA_REGISTRO       DATE                 null,
   constraint PK_USUARIOS primary key (USUARIO_ID)
);

alter table APUESTAS
   add constraint FK_APUESTAS_REFERENCE_USUARIOS foreign key (USUARIO_ID)
      references USUARIOS (USUARIO_ID)
      on delete restrict on update restrict;

alter table APUESTAS
   add constraint FK_APUESTAS_REFERENCE_LOTERIAS foreign key (LOTERIA_ID)
      references LOTERIAS (LOTERIA_ID)
      on delete restrict on update restrict;

alter table NUMEROS_APOSTADOS
   add constraint FK_NUMEROS__REFERENCE_APUESTAS foreign key (CHANCE_ID)
      references APUESTAS (CHANCE_ID)
      on delete restrict on update restrict;

