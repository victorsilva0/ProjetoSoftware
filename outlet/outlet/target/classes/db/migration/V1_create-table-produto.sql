create table produto(

    id bigint not null auto_increment primary key,
    tipo varchar(100) not null,
    marca varchar(100) not null,
    tamanho varchar(2) not null,
    quantidade int not null,
    valor decimal(10,2) not null

)