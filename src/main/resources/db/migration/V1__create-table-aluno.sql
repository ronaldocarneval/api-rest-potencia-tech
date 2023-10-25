    create table aluno(

        id bigint not null auto_increment unique,
        nome varchar(100) not null,
        idade varchar(2) not null,
        nota_primeiro_semestre varchar(4) not null,
        nota_segundo_semestre varchar(4) not null,
        nome_professor varchar(100) not null,
        numero_sala varchar(6) not null,



        primary key(id)

    );