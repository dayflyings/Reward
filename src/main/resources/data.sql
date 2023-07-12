truncate table users;
truncate table transactions;

insert into users(name) values('Mike');

insert into users(name) values('Alice');

insert into users(name) values('Jack');

insert into transactions(amount, user_id, created_time)
values(200, 1, '20230701');

insert into transactions(amount, user_id, created_time)
values(200, 1, '20230601');

insert into transactions(amount, user_id, created_time)
values(200, 1, '20230401');