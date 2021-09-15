SELECT * FROM lojagames.tb_categoria;


insert into `lojagames`.`tb_categoria`(`categoria`)
values("rpg"),
("luta"),
("aventura");


select * from lojagames.jogos;
insert into `lojagames`.`jogos`(`descriçao`,`jogos`,`preço`,`categoria_id`)
values("jogo bom","powerGirls","20.00",1)