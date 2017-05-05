INSERT INTO tb_categories (categoryid,categoryname,description)
VALUES (1,'PROCESSADOR','CORE I3, 2500 HRZ DE VELOCIDADE, 3ª GERACAO');
INSERT INTO tb_orders (orderid, customerid, employeeid, orderdate, requireddate, shippeddate, Shipvia, freight, shipname, shipaddress, shipcity, shipregion, shippostalcode, shipcountry)
VALUES (1, 'proc', 1, 21042017, 20042017, 19042017, 1, 10, 'processador', 'anselmo alves dos santos 600', 'uberlandia', 'santa monica','38408900', 'minas gerais');
INSERT INTO tb_orderdetails (id,orderid,productid,unitprice,quantity,discount)
VALUES (1,1,1,10,10,08);
INSERT INTO tb_products (productid, productname, supplierid, categoryid, quantityperunit, unitprice, unitsinstock, unitsonorder, reorderlevel, discontinued)
VALUES (1, 'processador corei5',123456789, 321, 5, 3, 10, 5, 2,'s');