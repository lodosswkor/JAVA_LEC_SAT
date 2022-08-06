SHOW TABLES;

SELECT * FROM user;

SELECT HOST, user FROM user;

-- 한줄주석 
/*
    여러줄 주석
    입니다. 
    
    Select, Update, Delete, Insert 
*/

SELECT 컬럼목록(OR *) FROM 테이블명 ( WHERE OPTION.... )

SELECT * FROM user; -- user 테이블의 전체 컬럼을 목록을 가지고 온다. 
SELECT HOST, User FROM user; -- user 테이블에서 Host, User 컬럼의 
 									  -- 데이터만 들고오고 싶습니다. 
										
-- user테이블에서 Host가 127.0.0.1인 데이터만 들어고오 싶습니다. 
SELECT * FROM user WHERE HOST = '127.0.0.1';

-- user 테이블에서 Host가 127.0.0.1이거나 localhost인 데이터들만 보고싶어요
SELECT * FROM user
WHERE HOST = '127.0.0.1' OR HOST = 'localhost'  

-- user 테이블에서 Host가 localhost 이고 select_priv라는 컬럼이 Y인 것만
-- 보고싶어요.
SELECT * FROM user
WHERE HOST = 'localhost' AND select_priv = 'Y'


-- 테스트를 위해서 DB를 만들고
-- 테이블을 반들어 봅시다. 

-- 1. 데이터 베이스를 만들어 봅시다.
-- 만드는 명령어는 create 
-- create database 데이터베이스 이름 

CREATE DATABASE javadb; 

-- 2. javadb를 사용하겠습니다. 
USE javadb;

-- 3. Test용 테이블을 생성하겠습니다. 
-- create table 테이블명 ( 컬럼 정의 )

CREATE TABLE students (
  -- 컬럼명 / 데이터타입 / 옵션들. 
  student_id INT(9) NOT NULL, 
  student_name VARCHAR(100) NOT NULL
);

-- 4. students 테이블 구조 확인 
DESC students;

-- 5. students 테이블 데이터 조회 
SELECT * FROM students; 

-- 6. 데이터를 넣어봅시다. 
-- C : insert into 테이블명 (컬럼명..) values (데이터...)

INSERT INTO students ( student_id, student_name )
VALUES ( 1, '이종석'); 

INSERT INTO students ( student_id, student_name )
VALUES ( 2, '이종석B'); 

INSERT INTO students ( student_id, student_name )
VALUES ( 3, '이종석C'); 

SELECT * FROM students; 

-- 7. 데이터를 변경해보자. 
-- update 테이블명 set 컬럼명=값 where option....

UPDATE students SET student_name = '이종석A'  
-- 전체 데이터에 반영 where절 꼭 사용하세용

UPDATE students SET student_name = '이종석A' 
WHERE student_id = 1; 

UPDATE students SET student_name = '이종석B' 
WHERE student_id = 2; 

UPDATE students SET student_name = '이종석C' 
WHERE student_id = 3; 

SELECT * FROM students; 

-- 8. 데이터를 삭제합시다. 
-- delete from 테이블명 where options... 
-- 나는 학번이 1번보다 큰 학생을 다 지우고 싶어요. 

DELETE FROM students WHERE student_id > 1;















 

 

										
										 
 





