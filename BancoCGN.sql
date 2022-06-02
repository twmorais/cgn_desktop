drop database if exists bd_cgn;
create database if not exists bd_cgn;
use bd_cgn;

create table cliente
(
id int not null primary key auto_increment,
nome varchar(200),
nascimento varchar(200),
endereco varchar(200),
telefone varchar(200),
email varchar(200),
observacoes varchar(200) 
);

create table usuario
(
id int not null primary key auto_increment,
nome varchar(200),
senha varchar(200)
);

create table patrimonio
(
id int not null primary key auto_increment,
tipo varchar(200),
data_aquisicao varchar(200),
valor decimal(8,2)
);

create table despesa
(
id int not null primary key auto_increment,
tipo varchar(200),
descricao varchar(200),
data_despesa date,
total decimal(8,2)
);

create table pedido
(
id int not null primary key auto_increment,
id_cliente int,
tipo varchar(200),
data_entrega date,
total decimal(8,2),
foreign key (id_cliente) references cliente(id)
);

create table produto
(
id int not null primary key auto_increment,
tipo varchar(200),
descricao varchar(200),
data_produto varchar(200),
preco decimal(8,2)
);

create table item_pedido
(
id int not null primary key auto_increment,
id_pedido int,
id_produto int, 
quantidade int,
preco decimal(8,2),
foreign key (id_pedido) references pedido(id),
foreign key (id_produto)references produto(id)
);

INSERT INTO usuario (nome,senha) VALUES ("Administrador", "nathcriacoes2022"); 

INSERT INTO usuario (nome,senha) VALUES ("teste", "123"); 

INSERT INTO cliente (nome,nascimento,endereco,telefone,email,observacoes) VALUES ("Tiago ", "23/06/1981","Rua Tiago n. 199","99240-5982","tw.morais@yahoo.com.br","Cliente Top"); 

INSERT INTO cliente (nome,nascimento,endereco,telefone,email,observacoes) VALUES ("Daniel", "14/10/1958","Rua Dos boiolas n. 24","99724-2424","boiolao@gmail.com","Cliente Boiola"); 

INSERT INTO produto (tipo,descricao,data_produto,preco) VALUES ("Bolsa sublimada", "sublimada","08/04/2022",50); 

INSERT INTO produto (tipo,descricao,data_produto,preco) VALUES ("Bolsa bordada", "bordada","10/04/2022",25);

INSERT INTO pedido (id_cliente,tipo,data_entrega,total) VALUES
(1,"varejo","2022/05/03",25.00);

INSERT INTO item_pedido (id_pedido,id_produto,quantidade, preco) VALUES (1,2,1,25.00);

INSERT INTO despesa (tipo,descricao,data_despesa,total) VALUES ("Luz", "mensal","2022-05-09",150); 

INSERT INTO patrimonio (tipo,data_aquisicao,valor) VALUES ("Maquina de costura", "01/04/2022",3000.00); 


# sudo /opt/lampp/manager-linux-x64.run
# sudo /opt/apache-tomcat-10.0.17/bin/startup.sh
# sudo /opt/apache-tomcat-10.0.17/bin/shutdown.sh














