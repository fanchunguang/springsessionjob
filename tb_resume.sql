create table if not exists my_test.tb_resume
(
	id bigint auto_increment
		primary key,
	address varchar(255) null,
	name varchar(255) null,
	phone varchar(255) null
);

insert into tb_resume(address,name,phone) values('�Ϻ�','����','1111111');
insert into tb_resume(address,name,phone) values('����','����','2222222');

