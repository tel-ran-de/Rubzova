CREATE SCHEMA STUDENT_INFO;
USE STUDENT_INFO;
CREATE TABLE TEACHER  (TeacherId INTEGER PRIMARY KEY,  TeacherName VARCHAR(50) NOT NULL,     Position VARCHAR(30) NOT NULL);

INSERT INTO TEACHER(TeacherId, TeacherName, Position) VALUES(1,'Петров Иван Семенович', 'профессор');
INSERT INTO TEACHER(TeacherId,TeacherName, Position) VALUES(2,'Семенова Анна Ивановна', 'доцент');

CREATE TABLE COURSE       (CourseId INTEGER PRIMARY KEY,         CourseTitle VARCHAR(50) NOT NULL UNIQUE);

INSERT INTO COURSE(CourseId,CourseTitle) VALUES(1,'Физика');
INSERT INTO COURSE(CourseId, CourseTitle) VALUES(2,'Базы данных');

CREATE TABLE ST_GROUP      (GroupNumber INTEGER PRIMARY KEY,      Specialization VARCHAR(50) NOT NULL);

INSERT INTO ST_GROUP(GroupNumber, Specialization) VALUES(341, 'Информационно-аналитические системы');
INSERT INTO ST_GROUP(GroupNumber, Specialization) VALUES(371, 'Системное программирование');



CREATE TABLE STUDENT
  (StudentId INTEGER AUTO_INCREMENT PRIMARY KEY, 
   StudentName VARCHAR(50) NOT NULL, 
   GroupNumber INTEGER, 
   BirthDate DATE, 
   Address VARCHAR(50));

ALTER TABLE STUDENT ADD CONSTRAINT GROUP_ST_FK FOREIGN KEY(GroupNumber) REFERENCES ST_GROUP(GroupNumber);

INSERT INTO STUDENT(StudentId, StudentName, GroupNumber,BirthDate, Address) VALUES(345567,'Иванов Александр', 341, "1999-01-20", 'Петергоф, Библиотечная пл., дом 2');
INSERT INTO STUDENT(StudentId, StudentName, GroupNumber,BirthDate, Address) VALUES(345568,'Широков Федор', 341, "1998-03-21", 'Санкт-Петербург, ул. Гаванская 34');
INSERT INTO STUDENT(StudentId, StudentName, GroupNumber,BirthDate, Address) VALUES(345569,'Антонова Даша', 341, "1999-05-17", 'Санкт-Петербург, ул. Широкая 45');
INSERT INTO STUDENT(StudentId, StudentName, GroupNumber,BirthDate, Address) VALUES(345570,'Антипенко Денис', 371, "1998-08-11", 'Санкт-Петербург, Малый пр. 15');
INSERT INTO STUDENT(StudentId, StudentName, GroupNumber,BirthDate, Address) VALUES(345571,'Сидоров Александр', 371, "1999-07-12", 'Санкт-Петербург, Средний пр. 4');
INSERT INTO STUDENT(StudentId, StudentName, GroupNumber,BirthDate, Address) VALUES(345572,'Фадеев Дмитрий', 371, "1999-11-24", 'Санкт-Петербург, Невский пр.23');

CREATE TABLE PHONE_LIST  (StudentId INTEGER NOT NULL, PhoneType CHAR(3),  Phone CHAR(11) NOT NULL);

ALTER TABLE PHONE_LIST ADD CONSTRAINT ST_PH_FK FOREIGN KEY(StudentId) REFERENCES STUDENT(StudentId); 

INSERT INTO PHONE_LIST(StudentId, PhoneType, Phone) VALUES(345567, 'моб', '89211264567');
INSERT INTO PHONE_LIST(StudentId, PhoneType, Phone) VALUES(345567, 'дом', '88121564567');
INSERT INTO PHONE_LIST (StudentId, PhoneType, Phone) VALUES(345568,'моб', '89217234567');
INSERT INTO PHONE_LIST (StudentId, PhoneType, Phone) VALUES(345571, 'моб', '89071254567');
INSERT INTO PHONE_LIST (StudentId, PhoneType, Phone) VALUES(345572, 'моб', '88121239567');


CREATE TABLE EXAM_SHEET (ExamSheetId INTEGER PRIMARY KEY, GroupNumber INTEGER NOT NULL, CourseId INTEGER NOT NULL, TeacherId INTEGER, ClassRoom INTEGER, ExamDate DATE);
ALTER TABLE EXAM_SHEET ADD CONSTRAINT COURSE_EX_SHEET_FK FOREIGN KEY(CourseId) REFERENCES COURSE(CourseId);
ALTER TABLE EXAM_SHEET ADD CONSTRAINT TEACHER_EX_SHEET_FK FOREIGN KEY(TeacherId) REFERENCES TEACHER(TeacherId);
ALTER TABLE EXAM_SHEET ADD CONSTRAINT GROUP_EX_SHEET_FK FOREIGN KEY(GroupNumber) REFERENCES  ST_GROUP(GroupNumber);

INSERT INTO EXAM_SHEET    (ExamSheetId,GroupNumber,CourseId,TeacherId,ClassRoom,ExamDate) VALUES(1,341,1,1,2408,"2017-01-25");
INSERT INTO EXAM_SHEET    (ExamSheetId,GroupNumber,CourseId,TeacherId,ClassRoom,ExamDate) VALUES(2,371,1,1,2408,"2017-01-27");
INSERT INTO EXAM_SHEET    (ExamSheetId,GroupNumber,CourseId,TeacherId,ClassRoom,ExamDate) VALUES(3,341,2,2,2446,"2017-01-28");
INSERT INTO EXAM_SHEET    (ExamSheetId,GroupNumber,CourseId,TeacherId,ExamDate)           VALUES(4,371,2,2,"2017-01-26");

CREATE TABLE EXAM_RESULT (StudentId INTEGER NOT NULL, ExamSheetId INTEGER NOT NULL, Mark SMALLINT CHECK (MARK > 0 AND MARK <= 5));
ALTER TABLE EXAM_RESULT ADD CONSTRAINT ST_EX_FK FOREIGN KEY(StudentId) REFERENCES STUDENT(StudentId);
ALTER TABLE EXAM_RESULT ADD CONSTRAINT EXR_EXT_FK FOREIGN KEY(ExamSheetId)REFERENCES EXAM_SHEET(ExamSheetId);
ALTER TABLE EXAM_RESULT ADD CONSTRAINT PK_EXAM_RESULT PRIMARY KEY(StudentId, ExamSheetId);

INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345567,1,5);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345567,3,5);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345568,1,3);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345568,3,4);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345569,1,5);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345569,3,2);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345570,2,4);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345570,4,5);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345571,2,3);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345571,4,2);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345572,2,5);
INSERT INTO EXAM_RESULT(StudentId,ExamSheetId,Mark) VALUES(345572,4,5);

