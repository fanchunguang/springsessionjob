create table if not exists my_test.tb_resume
(
	id bigint auto_increment
		primary key,
	address varchar(255) null,
	name varchar(255) null,
	phone varchar(255) null
);

insert into tb_resume(address,name,phone) values('上海','张三','1111111');
insert into tb_resume(address,name,phone) values('北京','李四','2222222');

