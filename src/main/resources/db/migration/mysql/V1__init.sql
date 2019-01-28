CREATE TABLE empresa (id bigint(20) not null,
		      cnpj varchar(255) not null,
		      data_atualizacao datetime not null,
		      data_criacao datetime not null,
		      razao_social varchar(255) not null)
engine = InnoDB default charset = utf8;

CREATE TABLE funcionario(id bigint(20) not null,
			   cpf varchar(255) not null,
			   data_atualizacao datetime not null,
			   data_criacao datetime not null,
			   email varchar(255) not null,
			   nome varchar(255) not null,
			   perfil varchar(255) not null,
			   qtd_horas_almoco float default null,
			   qtd_horas_trabalho_dia float default null,
			   senha varchar(255) default null,
			   valor_hora decimal(19,2) default null,
			   empresa_id bigint(20) default null)
engine = InnoDB default charset = utf8;

CREATE TABLE lancamento(id bigint(20) not null,
			  data datetime not null,
			  data_atualizacao datetime not null,
			  data_criacao datetime not null,
			  descricao varchar(255) not null,
			  localizacao varchar(255) not null,
			  tipo varchar(255) not null,
		      funcionario_id bigint(20) default null)
engine = InnoDB default charset = utf8;

alter table empresa add primary key (id);

alter table funcionario add primary key (id), 
add key keyfuncionario (empresa_id);

alter table lancamento add primary key (id), 
add key keylancamento (funcionario_id);

alter table empresa
modify id bigint(20) not null auto_increment;

alter table funcionario
modify id bigint(20) not null auto_increment;

alter table lancamento
modify id bigint(20) not null auto_increment;

alter table funcionario
add constraint constfunc foreign key (empresa_id) references empresa (id);


alter table lancamento
add constraint conslanc foreign key (funcionario_id) references funcionario (id);