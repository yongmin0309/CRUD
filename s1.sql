create table member(
	id varchar2(50) primary key,
	passwd varchar2(50),
	name varchar2(50),
	mail varchar2(50)
);

select * from member;

commit;