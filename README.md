# Backend_Basic_TIL
백엔드 개발 학습 과정에서 진행한 실습, 과제, 그리고 주요 개념들을 기록한 TIL 문서입니다.

## 목차

- [JAVA 연습문제](#JAVA)
- [SQL](#SQL)
- [JDBC](#JDBC)
- [JPA](#JPA)
- [Servlet](#Servlet)
- [Spring Core](#Spring-Core)
- [Javascript Core](#Javascript-Core)

## JAVA

- **[[250312] 연습문제1](01_Java-Mission/a_array/src/main/java/mission/a_array/Exercise01.java)**  
  _변수, 데이터 타입, 연산자, 배열과 문자열 다루기_
- **[[250312] 연습문제1 테스트](01_Java-Mission/a_array/src/test/java/mission/a_array/Exercise01Tests.java)**  
  _연습문제1의 기능을 검증하는 JUnit 테스트 코드_
- **[[250313] 연습문제2](01_Java-Mission/b_loop/src/main/java/mission/b_loop/Exercise02.java)**  
  _반복문, 제어문 활용_
- **[[250313] 연습문제2 테스트](01_Java-Mission/b_loop/src/test/java/mission/b_loop/Exercise02Test.java)**  
  _연습문제2의 기능을 검증하는 JUnit 테스트 코드_
- **[[250313] 연습문제3](01_Java-Mission/c_oop/src/main/java/mission/c_oop/cafe/Cafe.java)**  
  _카페를 예시로 클래스 분리 연습_
- **[[250317] 연습문제4](01_Java-Mission/d_library/src/main/java/mission/d_library/Application.java)**  
  _클래스, 상속, 메서드 오버라이딩 활용 간단한 회원 관리 기능을 구현_
- **[[250317] 연습문제4 테스트](01_Java-Mission/d_library/src/test/java/mission/d_library/ApplicationTest.java)**  
  _연습문제4의 기능을 검증하는 JUnit 테스트 코드_
- **[[250318] 연습문제5](01_Java-Mission/e_bookstore/src/main/java/mission/e_bookstore/LibrarySearch.java)**  
    _인터페이스 활용 도서 검색 기능 구현_
- **[[250318] 연습문제5 테스트](01_Java-Mission/e_bookstore/src/test/java/mission/e_bookstore/LibrarySearchTest.java)**  
  _연습문제5의 기능을 검증하는 JUnit 테스트 코드_
- **[[250318] 연습문제6](01_Java-Mission/f_generics/src/main/java/mission/f_generics/FruitMain.java)**  
    _제네릭스 인터페이스 활용 과일 처리 시스템 구현_
- **[[250318] 연습문제6 테스트](01_Java-Mission/f_generics/src/test/java/mission/f_generics/services/FruitProcessorTest.java)**  
  _연습문제6의 기능을 검증하는 JUnit 테스트 코드_
- **[[250319] 연습문제7](01_Java-Mission/g_collection/src/main/java/mission/g_collection/service/BookManager.java)**  
  _제네릭스와 Collection(List) 활용 도서 목록 관리 시스템 구현_
- **[[250319] 연습문제7 테스트](01_Java-Mission/g_collection/src/test/java/mission/g_collection/service/BookServiceTests.java)**  
  _연습문제7의 기능을 검증하는 JUnit 테스트 코드_
- **[[250319] 연습문제8](01_Java-Mission/h_collection/src/main/java/mission/h_collection/service/RentalManager.java)**  
  _Collection(Map, List)활용 사용자 대여 목록 관리 기능 구현_
- **[[250319] 연습문제8 테스트](01_Java-Mission/h_collection/src/test/java/mission/h_collection/service/LibraryServiceTests.java)**  
  _연습문제8의 기능을 검증하는 JUnit 테스트 코드_
- **[[250320] 연습문제9](01_Java-Mission/i_exception/src/main/java/mission/i_exception/Application.java)**  
  _IO& exception활용 대출반납 기록 로그 파일 저장 기능 구현_
- **[[250320] 연습문제9 테스트](01_Java-Mission/i_exception/src/test/java/mission/i_exception/ApplicationTests.java)**  
  _연습문제9의 기능을 검증하는 JUnit 테스트 코드_


## SQL

- [SQL 기초](02_SQL/Script-Basic.sql) - SQL의 기본 문법과 명령어
- [JOIN 연산](02_SQL/Script-Join.sql) - 여러 테이블을 결합하는 다양한 JOIN 유형
- [GROUP BY](02_SQL/Script-Group%20by.sql) - 데이터를 그룹화하고 집계 함수
- [서브쿼리](02_SQL/Script-Sub%20Query.sql) - 쿼리 내에 중첩된 쿼리
- [VIEW](02_SQL/Script-View.sql) - 가상 테이블을 생성하고 관리하는 방법
- [VIEW와 윈도우 함수 실습](02_SQL/Script-View%20and%20Window%20Function%20Mission.sql) - VIEW와 윈도우 함수를 활용한 실습
- [트랜잭션](02_SQL/Script-Transaction.sql) - 데이터베이스 트랜잭션의 개념과 사용법
- [트랜잭션 실습](02_SQL/Script-Transaction%20Misson.sql) - 트랜잭션을 활용한 실습


## JDBC
- [JDBC 적용 앱](03_JDBC/Module-JDBC/src/main/java/com/devyujin/jdbc/Application.java) - JDBC 적용하여 MySQL DB Connection 어플리케이션 연습

## JPA
- [JPA 적용 앱](04_JPA/Module-JPA/src/main/java/com/metaverse/academy/Application.java) - JPA 적용 User 로그인/프로필 수정 미션

## Servlet
- [Servlet 실습](05_Servlet/Module-Servlet/src/main/java/com/metaverse/servlet/chap01/ServletLifeCycle.java) - Servlet 개념 학습을 위한 예제

## Spring-Core
- [Spring Container](06_Spring-Core/Module01-SpringContainer/src/main/java/metaverse/chap01) - Spring 컨테이너의 구조와 Bean 관리 이해
- [Spring DI](06_Spring-Core/Module02-DependencyInjection/src/main/java/com/metaverse/injection/chap01) - 의존성 주입(DI)의 개념과 방식 실습
- [Spring AOP](06_Spring-Core/Module03-AOP/src/main/java/com/metaverse/aop) - 관심사의 분리를 위한 AOP 개념 및 적용 예제

## Javascript-Core
- [Javascript Core](07_Javascript-Core/01_variable_datatype) - JavaScript의 기본 문법과 데이터 타입 이해