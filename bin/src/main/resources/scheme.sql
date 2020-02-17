show databases;

create database comercio;

use comercio;

create table usuario (
     id int not null primary key auto_increment,
     login varchar(80),
     senha varchar(80)
);

insert into usuario(login,senha)
    values ('admin', 'admin');
    
create table produto (
  id int not null primary key auto_increment,
  foto varchar(80),
  nome varchar(80),
  descricao varchar(255),
  preco double(10,2)
);

insert into produto (foto, nome, descricao, preco)
    values(
		'iphone.png',
        'Iphone',
        'Design inovador, totalmente em vidro. A c�mera que o mundo inteiro adora, ainda melhor. O chip mais poderoso e inteligente em qualquer smartphone. Recarga sem fio simples de verdade.',
        3099.00
        );
        
insert into produto (foto, nome, descricao, preco)
    values(
		'cart.png',
        'Carrinho de Beb� Agil',
        'O Carrinho Multikids tem estrutura de alum�nio, por isso � mais leve, resistente e vers�til. Possui cinto de seguran�a de 5 pontos, capota retr�til com visor e tela, 3 rodas com travas e freios.',
        355.70
        );      

select * from usuario;

select * from produto;

update produto set foto = 'iphone.png' where id = 2;

select * from hibernate_sequence;

alter table produto modify foto blob(100000);
