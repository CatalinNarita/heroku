INSERT INTO User (username, password, firstName, lastName, email, address, nfcTag) VALUES ('catalin','pass123','Catalin','Narita','catalin.ioan.narita@gmail.com','Bucium','zg�1');
INSERT INTO User (username, password, firstName, lastName, email, address, nfcTag) VALUES ('olimpiu','pass123','Olimpiu','Stefan','olimpiu.stefan@gmail.com','Brad','p��O1');
INSERT INTO User (username, password, firstName, lastName, email, address, nfcTag) VALUES ('calin','pass123','Calin','Cotet','calin.cotet@gmail.com','Abrud','v�1');
INSERT INTO User (username, password, firstName, lastName, email, address) VALUES ('sergiu','pass123','Sergiu','Coca','sergiu.coca@gmail.com','Zalau');
INSERT INTO User (username, password, firstName, lastName, email, address) VALUES ('petru','pass123','Petru','Vornicu','vo.petru@gmail.com','Oradea');

INSERT INTO Role (roleName, username) VALUES ('ROLE_USER','catalin');
INSERT INTO Role (roleName, username) VALUES ('ROLE_ADMIN','olimpiu');
INSERT INTO Role (roleName, username) VALUES ('ROLE_ADMIN','calin');
INSERT INTO Role (roleName, username) VALUES ('ROLE_ADMIN','sergiu');
INSERT INTO Role (roleName, username) VALUES ('ROLE_USER','petru');

INSERT INTO monitor_spec(aspect_ratio, colour, diagonal, guarantee, producer, resolution) VALUES ('16:9','BLACK',24,'_24','Benq','1920 x 1080');
INSERT INTO monitor_spec(aspect_ratio, colour, diagonal, guarantee, producer, resolution) VALUES ('16:9','GREY',23,'_24','LG','1920 x 1080');
INSERT INTO laptop_spec(diagonal, hdd_capacity, processor, producer, guarantee, ram, video_card) VALUES (15.6,256,'Intel® Core™ i5-7200U Processor (3M Cache, up to 3.10 GHz)','Asus','_24',8,'GeForce 940MX');
INSERT INTO laptop_spec(diagonal, hdd_capacity, processor, producer, guarantee, ram, video_card) VALUES (15.6,512,'Intel® Core™ i7-7700HQ Processor (6M Cache, up to 3.80 GHz)','Lenovo','_12',8,'GeForce GTX 1050 Ti');
INSERT INTO smartphone_spec(colour, memory, processor, producer, guarantee, resolution, screen) VALUES ('BLACK',64,'Qualcomm MSM8996 Snapdragon 821 Quad Core, 2150 + 1600 Mhz', 'Google', '_24','1440 x 2960','Super AMOLED');
INSERT INTO monitor_spec(aspect_ratio, colour, diagonal, guarantee, producer, resolution) VALUES ('16:9','BLACK',24,'_24','ASUS','1920 x 1080');
INSERT INTO monitor_spec(aspect_ratio, colour, diagonal, guarantee, producer, resolution) VALUES ('16:9','RED',23,'_24','DELL','1920 x 1080');
INSERT INTO laptop_spec(diagonal, hdd_capacity, processor, producer, guarantee, ram, video_card) VALUES (14.0,256,'Intel® Core™ i7-8550U (8M Cache, up to 4.00 GHz)','Asus','_24',16,'GeForce MX150 2GB');
INSERT INTO laptop_spec(diagonal, hdd_capacity, processor, producer, guarantee, ram, video_card) VALUES (13.9,512,'Intel® Core™ i7-8550U (8M Cache, up to 4.00 GHz)','Lenovo','_12',16,'Intel GMA UHD 620');
INSERT INTO smartphone_spec(colour, memory, processor, producer, guarantee, resolution, screen) VALUES ('BLACK',64,'Cortex A53 2300 + 1700 MHz', 'Samsung', '_24','1440 x 2960','Super AMOLED');
INSERT INTO monitor_spec(aspect_ratio, colour, diagonal, guarantee, producer, resolution) VALUES ('16:9','BLACK',18.5,'_24','AOC','1920 x 1080');
INSERT INTO laptop_spec(diagonal, hdd_capacity, processor, producer, guarantee, ram, video_card) VALUES (13.3,256,'Intel® Core™ i7-8550U (8M Cache, up to 4.00 GHz)','Asus','_24',8,'Intel GMA UHD 620');
INSERT INTO laptop_spec(diagonal, hdd_capacity, processor, producer, guarantee, ram, video_card) VALUES (17.3,512,'Intel® Core™ i7-7700HQ (6M Cache, up to 3.80 GHz)','Lenovo','_12',8,'GeForce GTX 1060 6GB');
INSERT INTO smartphone_spec(colour, memory, processor, producer, guarantee, resolution, screen) VALUES ('BLACK',64,'ARM v8 Typhoon 1,4 GHz', 'Samsung', '_24','1440 x 2960','Super AMOLED');


INSERT INTO product_spec(monitor_spec_id) VALUES (1);
INSERT INTO product_spec(monitor_spec_id) VALUES (2);
INSERT INTO product_spec(laptop_spec_id) VALUES (1);
INSERT INTO product_spec(laptop_spec_id) VALUES (2);
INSERT INTO product_spec(smartphone_spec_id) VALUES (1);
INSERT INTO product_spec(monitor_spec_id) VALUES (3);
INSERT INTO product_spec(monitor_spec_id) VALUES (4);
INSERT INTO product_spec(laptop_spec_id) VALUES (3);
INSERT INTO product_spec(laptop_spec_id) VALUES (4);
INSERT INTO product_spec(smartphone_spec_id) VALUES (2);
INSERT INTO product_spec(monitor_spec_id) VALUES (5);
INSERT INTO product_spec(laptop_spec_id) VALUES (5);
INSERT INTO product_spec(laptop_spec_id) VALUES (6);
INSERT INTO product_spec(smartphone_spec_id) VALUES (3);

INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Monitor LED BenQ Gaming Zowie XL2411','MONITOR','1249.99',1,15);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Monitor LED LG 23MP68VQ-P','MONITOR','679.99',2,20);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Ultrabook ASUS 15.6'''' ZenBook UX530UQ, FHD','LAPTOP','5098.99',3,15);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Notebook / Laptop Lenovo Gaming 15.6'''' Legion Y520, FHD IPS','LAPTOP','3898.99',4,23);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Smartphone Google Pixel XL','SMARTPHONE','2798.99',5,12);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Monitor LED ASUS Gaming VS248HR 24 inch 1ms Black','MONITOR','619.99',6,3);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Monitor LED DELL U2414H 23.8 inch 8ms GTG','MONITOR','869.99',7,45);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Ultrabook ASUS 14'''' ZenBook UX430UN, FHD','LAPTOP','5398.99',8,2);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Notebook / Laptop 2-in-1 Lenovo 13.9" Yoga 920 Glass, FHD IPS','LAPTOP','8698.99',9,1);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Samsung G950F Galaxy S8','SMARTPHONE','2898.99',10,46);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Monitor LED AOC e970Swn 18.5 inch 5ms black','MONITOR','269.99',11,33);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Notebook / Laptop 2-in-1 DELL 13.3'''' Inspiron 5379 (seria 5000)','LAPTOP','5698.99',12,142);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Notebook / Laptop Acer Gaming 17.3'''' Predator Helios 300 PH317-51','LAPTOP','6098.99',13,24);
INSERT INTO Product (name, category, price, product_spec_id, quantity) VALUES ('Apple iPhone 6','SMARTPHONE','1698.99',14,19);

INSERT INTO order_t (address, order_date, total_price, user_id) VALUES ('Bucium-Sat nr. 165','2017-12-02 13:00:00',123.23,1);
INSERT INTO order_t (address, order_date, total_price, user_id) VALUES ('Abrud nr. 12','2017-12-01 14:45:00',222.12,2);
INSERT INTO order_t (address, order_date, total_price, user_id) VALUES ('Cluj-Napoca, Str. Obs. nr. 34','2017-11-23 12:30:00',182.99,3);
INSERT INTO order_t (address, order_date, total_price, user_id) VALUES ('Zalau nr. 212','2017-10-12 09:25:00',254.23,4);
INSERT INTO order_t (address, order_date, total_price, user_id) VALUES ('Bucium-Sat nr. 155','2017-11-13 10:37:00',112.99,4);

INSERT INTO Cart (user_id) VALUES (1);
INSERT INTO Cart (user_id) VALUES (2);
INSERT INTO Cart (user_id) VALUES (3);
INSERT INTO Cart (user_id) VALUES (4);
INSERT INTO Cart (user_id) VALUES (5);

-- INSERT INTO item (quantity, product_id) VALUES (1,1);
-- INSERT INTO item (quantity, product_id) VALUES (2,2);
-- INSERT INTO item (quantity, product_id) VALUES (4,3);
-- INSERT INTO item (quantity, product_id) VALUES (2,4);
-- INSERT INTO item (quantity, product_id) VALUES (5,5);
-- INSERT INTO item (quantity, product_id) VALUES (6,6);
-- INSERT INTO item (quantity, product_id) VALUES (1,7);
-- INSERT INTO item (quantity, product_id) VALUES (2,8);
-- INSERT INTO item (quantity, product_id) VALUES (3,9);
-- INSERT INTO item (quantity, product_id) VALUES (4,10);
-- INSERT INTO item (quantity, product_id) VALUES (5,11);
-- INSERT INTO item (quantity, product_id) VALUES (2,12);
-- INSERT INTO item (quantity, product_id) VALUES (7,13);
-- INSERT INTO item (quantity, product_id) VALUES (2,14);
--
--
-- INSERT INTO order_item (id_order, id_item) VALUES (1,1);
-- INSERT INTO order_item (id_order, id_item) VALUES (1,2);
-- INSERT INTO order_item (id_order, id_item) VALUES (1,3);
-- INSERT INTO order_item (id_order, id_item) VALUES (2,1);
-- INSERT INTO order_item (id_order, id_item) VALUES (2,2);
-- INSERT INTO order_item (id_order, id_item) VALUES (2,3);
-- INSERT INTO order_item (id_order, id_item) VALUES (3,3);
-- INSERT INTO order_item (id_order, id_item) VALUES (3,2);
-- INSERT INTO order_item (id_order, id_item) VALUES (3,1);
-- INSERT INTO order_item (id_order, id_item) VALUES (4,1);
-- INSERT INTO order_item (id_order, id_item) VALUES (5,3);
--
-- INSERT INTO cart_item (id_cart, id_item) VALUES (1,1);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (2,1);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (2,2);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (3,1);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (3,2);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (3,3);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (4,1);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (4,2);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (4,3);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (4,4);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (5,1);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (5,2);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (5,3);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (5,4);
-- INSERT INTO cart_item (id_cart, id_item) VALUES (5,5);


