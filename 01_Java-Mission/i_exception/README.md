
**미션 9: 대출/반납 기록을 로그 파일로 저장하는 기능 구현**
- **입력:**
    - 대출 또는 반납 거래 기록을 나타내는 문자열
- **기능:**
    1. 입력받은 거래 기록을 로그 파일(예: "transaction.log")에 추가(append) 모드로 저장한다.
    2. 파일 입출력 과정에서 발생할 수 있는 예외를 처리하며, 잘못된 파일 경로 등의 예외 상황에 대해 assertThrows를 이용한 테스트를 진행한다.
- **출력 예:**
    - "transaction.log" 파일에 대출/반납 기록이 추가되어 저장됨


**미션 9 (대출/반납 로그 파일 저장):**
1. `LogManager` 클래스를 정의하여:
    - `logTransaction(String record, String filePath)` 메서드 구현
    - 파일 입출력 시 발생하는 IOException을 try-catch로 처리한다.
2. main() 메서드에서 샘플 거래 기록을 이용하여 로그 파일 저장 기능을 시연한다.

## 내가 접근하는 방법
### 입력 콘솔창
- 1번. 대여하기
- 2번. 반납하기
- 3번. 종료
####  1번. 대여하기 프로세스
1. '회원 아이디를 입력해주세요.'
- members.txt에서 입력받은 회원 아이디와 일치하는 아이디가 있는지 확인한다.
  - 일치하는 경우 : 입력받은 회원 ID 변수에 담기 / '대출할 책 title을 입력해주세요.' 입력으로 이동
  - 일치 아이디 없는 경우 : FileStorageManager.saveMembersToFile로 회원등록 / '대출할 책 title을 입력해주세요.' 입력으로 이동
2. '대출할 책 title을 입력해주세요.'
- books.txt 에서 해당 책이 있는지 확인한다.
  - 일치하는 경우 : 입력받은 대출 책 title 담기 / 입력받은 '회원 아이디' & '대출 책 title' & '대출 시간' 을 String record로 transaction.log에 기록한다.
  - 일치 book 없는 경우 : 해당하는 book 이 없다고 출력 후 다시 '대출할 책 title을 입력해주세요.'를 띄운다.

####  2번. 반납하기 프로세스
1. '회원 아이디를 입력해주세요.'
- transaction.log에서 입력받은 회원 아이디와 일치하는 아이디가 있는지 확인한다.
  - 일치하는 경우 : '반납할 책 title을 입력해주세요.'로 이동
  - 일치 아이디 없는 경우 : '해당 ID로 대출한 내역이 없습니다.' 출력 / 다시 '회원 아이디를 입력해주세요.'를 띄운다.

2. 1.'반납할 책 title을 입력해주세요.'
- transaction.log 에서 입력받은 회원 아이디에 해당 책의 대출 record가 있는지 확인한다.
  - 있는 경우 : 해당 String record를 transcation.log에서 삭제한다. / 입력 콘솔 초반으로 이동
  - 없는 경우 : '해당 책 title의 대출 이력이 없습니다.' 출력 / 다시 '반납할 책 title을 입력해주세요.'를 띄운다.
  
#### 예외처리
- 입력받는 과정에서 
  - 문자열이 아닌 경우
  - 입력 길이 초과되는 경우
  - 아무 것도 입력하지 않은 경우
  - 잘못된 파일경로 등의 예외를 처리
