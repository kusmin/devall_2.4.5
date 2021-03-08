alter table blog_post add column thumbnail varchar(512) default null;
ALTER TABLE blog_post MODIFY COLUMN resumo varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL;
ALTER TABLE blog_post MODIFY COLUMN titulo varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL;
create table categoria (
  id bigint(20) not null auto_increment,
  nome varchar(128) not null,
  nome_canonico varchar(128) not null,
  primary key (id)
) Engine=InnoDB;

create table categoria_post (
  id_post bigint(20) not null,
  id_categoria bigint(20) not null,
  primary key (id_post, id_categoria)
) Engine=InnoDB;

alter table categoria_post add constraint `fk_categoria_post_categoria` foreign key (id_categoria) references categoria(id) on delete cascade;
alter table categoria_post add constraint `fk_categoria_post_post` foreign key (id_post) references blog_post(id) on delete cascade;
create index idx_unicidade_categoria on categoria(nome_canonico);

create table categoria_ignorar (
    id bigint(20) auto_increment,
    termo_normalizado varchar(128),
    primary key (id)
) Engine=InnoDB;

insert into categoria_ignorar (termo_normalizado) values ('blog');
insert into categoria_ignorar (termo_normalizado) values ('uncategorized');
insert into categoria_ignorar (termo_normalizado) values ('pt-br');
insert into categoria_ignorar (termo_normalizado) values ('portuguese');
insert into categoria_ignorar (termo_normalizado) values ('english');
insert into categoria_ignorar (termo_normalizado) values ('artigos');
insert into categoria_ignorar (termo_normalizado) values ('artigo');
insert into categoria_ignorar (termo_normalizado) values ('post');
insert into categoria_ignorar (termo_normalizado) values ('posts');

