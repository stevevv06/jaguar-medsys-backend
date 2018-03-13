insert into genders(id, gender, created)
values(1,'Masculino','2018-03-11 10:10:10');
insert into genders(id, gender, created)
values(2,'Femenino','2018-03-11 10:10:10');

insert into patients(id, full_name, gender_id, birth_date, address, phone1, phone2, email, created)
values (1, 'Pedro Perez', 1, '1970-01-01','YUI','2323-4545',null,null,'2018-03-11 10:10:10');
insert into patients(id, full_name, gender_id, birth_date, address, phone1, phone2, email, created)
values (2, 'Luis Lopez', 1, '1979-04-21','POI','2323-3438',null,'a@a.com','2018-03-11 10:10:10');
insert into patients(id, full_name, gender_id, birth_date, address, phone1, phone2, email, created)
values (3, 'Maria Martinez', 2, '1986-05-01','TYU','2323-0909',null,'z@z.com','2018-03-11 10:10:10');
insert into patients(id, full_name, gender_id, birth_date, address, phone1, phone2, email, created)
values (4, 'Consuelo Candelaria', 2, '1989-08-01','LKJ','2323-6769',null,null,'2018-03-11 10:10:10');

insert into doctors (id,full_name, specialities, color, created, modified) 
values (1,'Dr 1', 'ABC', 'blue','2018-03-11 10:10:10',null);
insert into doctors (id,full_name, specialities, color, created, modified) 
values (2,'Dr 2', 'ZXC', 'green','2018-03-11 10:10:10',null);
insert into doctors (id,full_name, specialities, color, created, modified) 
values (3,'Dr 3', 'WER', 'yellow','2018-03-11 10:10:10',null);

insert into services(id, service, created)
values (1, 'Ortodoncia', '2018-03-11 10:10:10');
insert into services(id, service, created)
values (2, 'Extraccion', '2018-03-11 10:10:10');
insert into services(id, service, created)
values (3, 'Limpieza', '2018-03-11 10:10:10');

insert into companies(id, full_name, commercial_name, address, phone1, phone2, logo, created)
values (1, 'Company 1', 'Company 1', 'AABBCC', '2222-2222', '7777-7777', null, '2018-03-11 10:10:10');

insert into clinics(id, clinic, address, phone1, phone2, company_id,created)
values (1,'Clinic 1', 'ABC','2222-2222','7777-7777',1,'2018-03-11 10:10:10');
insert into clinics(id, clinic, address, phone1, phone2, company_id,created)
values (2,'Clinic 2', 'ZZZ','2222-3333','7777-8888',1,'2018-03-11 10:10:10');

insert into appointments(id, patient_id, doctor_id, service_id, clinic_id, start, end, created)
values(1,1,1,1,1,'2018-03-15 10:00:00', '2018-03-15 10:30:00','2018-03-11 10:10:10');
insert into appointments(id, patient_id, doctor_id, service_id, clinic_id, start, end, created)
values(2,2,1,2,1,'2018-03-15 10:30:00', '2018-03-15 11:00:00','2018-03-11 10:10:10');
insert into appointments(id, patient_id, doctor_id, service_id, clinic_id, start, end, created)
values(3,3,2,3,2,'2018-03-15 08:00:00', '2018-03-15 08:30:00','2018-03-11 10:10:10');
insert into appointments(id, patient_id, doctor_id, service_id, clinic_id, start, end, created)
values(4,2,3,1,2,'2018-03-15 15:00:00', '2018-03-15 15:30:00','2018-03-11 10:10:10');
insert into appointments(id, patient_id, doctor_id, service_id, clinic_id, start, end, created)
values(5,1,1,1,1,'2018-03-17 10:00:00', '2018-03-17 10:30:00','2018-03-11 10:10:10');

