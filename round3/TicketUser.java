package kr.or.kosa;

/**
 * 같은 폰번호로 여러 차량에 대한 정기권 구매
 */

/**
 * 종료 날짜만 덮어쓰기
 * 회원권 구매시 신규 혹은 연장 판단
 * 입차 시, 회원/비회원 구분 (IO를 통해 찾아보기)
 * 회원 목록 조회
 */

public class TicketUser {
    private String carNumber; // 유일무이
    private String phoneNumber;
    private String lastEndTime;
}
