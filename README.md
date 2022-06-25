# JAVA_LEC_SAT


## 자바 기초 

1. JAVA 언어의 특징 
   
   - 문법은 C 기반 
   - C/C++ 과 다르게 메모리연산(Pointer)을 지원하지 않음 -> 편해짐 
   - 통역가(JVM)을 항상 데리고 다녀 Platform Independency를 
     구현 
   - 통역가를 데리고 다니는 만큼 리소스(컴퓨터자원)를 일반 
     컴파일 Only 기반 언어보다 더 사용한다. 
   - 컴파일 + 인터프리팅 기반 언어다

2. JDK 설치 
    
    1. https://openjdk.org/ 
    2. Download -> http://jdk.java.net/11 
    3. Windows Binary 로 다운로드 
    4. 특정 위치에 압축 풀기 
    5. 탐색기 -> 내PC -> 마우스 우클릭 -> 속성 -> 고급시스템 설정 
       -> 최하단 환경 변수 -> 시스템 변수 -> 변수명 : JAVA_HOME , 값 : 4에서 압축을 푼 위치 주소 
       ex) c:\javalecture\jdk\jdk-11 입력 
    6. 실행파일 위치잡기 
       환경변수 -> 시스템변수 -> Path 클릭 후 편집 -> %JAVA_HOME%\bin 
    --------------------------------------------------------------------------------------------- 
    7. 명령프롬프트 실행 > javac --version 으로 확인 
     

3. 도스명령어 

   cd ( change directory ) : cd 디렉토리Path 
   copy , xcopy : copy a b = a를 b로 카피해라 
   dir, dir/w, dir/p 
   cls 
   del 파일명 

   
     
  

## 자바 네이밍 룰

1. 클래스( or 인터페이스)  
     
  - 쌍봉낙타 네이밍 룰 

  Hello+world
  
  a) 클래스 명의 시작은 항상 대문자 여야한다.  
  b) 두 단어 이상이 접합된 클래스 명에 대해선, 그 단어의 시작문자는 
      모두 대문자로 시작해야 한다.  
  c) 클래스명과 파일명은 동일해야 한다. ( 대소문자를 구분합니다. )
  
  show me the money  -> ShowMeTheMoney
  change me first -> ChangeMeFirst

2. 메서드

  - 단봉낙타 네이밍 룰 

   a) 메서드명의 시작은 항상 소문자로 시작한다. 
   b) 두 단어 이상이 접한된 메서드 명에 대해선, 각 단어의 시작문자는 
      대문자로 시작해야 한다. 

   show me the money -> showMeTheMoney
   change me first -> changeMeFirst
   
   
   ## GIT 기초 사용법 
   
   소스를 수정/추가 
(등록/수정)
  1. stage 

  2. commit 
-------------------------------------------- 
  3. push (서버로 푸시) 

(서버에서 가져오기) 

  1. clone  (한번만)
   
  2. fetch 

  3. pull 


https://github.com/lodosswkor/JAVA_LEC_SAT
