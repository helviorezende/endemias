drop table tb_categories if exists;
create table tb_categories (
	categoryid bigint generated by default as identity,
	categoryname varchar(15),
	description varchar(256),
	primary key(categoryid)
	);
	
drop table tb_orders if exists;
create table tb_orders (
	orderid bigint generated by default as identity,
	customerid varchar(10),
	employeeid int(11),
	orderdate varchar(8),
	requireddate varchar(8),
	shippeddate varchar(8),
	shipvia int(11),
	freight int(3),
	shipname varchar(40),
	shipaddress varchar(60),
	shipcity varchar(15),
	shipregion varchar(15),
	shippostalcode varchar(10),
	shipcountry varchar(15),
	primary key(orderid)
	);
	
	drop table tb_orderdetails if exists;
create table tb_orderdetails (
	id bigint generated by default as identity,
	orderid int(11),
	productid int(11),
	unitprice int,
	quantity int(2),
	discount int,
	primary key(id)
	);
	
	drop table tb_products if exists;
create table tb_products (
	productid bigint generated by default as identity,
	productname varchar(40),
	supplierid int(11),
	categoryid int(11),
	quantityperunit int(2),
	unitprice int(11),
	unitsinstock int(2),
	unitsonorder int(2),
	reorderlevel int(2),
	discontinued varchar(2),
	primary key(productid)
	);