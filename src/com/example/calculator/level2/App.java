package com.example.calculator.level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer; //지역변수 설정
        do { //level 1의 네 번째

            // level 1의 첫 번째
            System.out.println("양의 정수(0을 포함)를 2번 입력해주세요.");
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int positiveInteger1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int positiveInteger2 = scanner.nextInt();

            // level 1의 두 번째
            System.out.print("사칙연산 기호(+,-,*,/)를 입력하세요 : ");
            scanner.nextLine();
            String operator = scanner.nextLine();

            // level 1의 세 번째
            int result = 0;

            if ("+".equals(operator)) {
                result = positiveInteger1 + positiveInteger2;
            } else if ("-".equals(operator)) {
                result = positiveInteger1 - positiveInteger2;
            } else if ("*".equals(operator)) {
                result = positiveInteger1 * positiveInteger2;
            } else if ("/".equals(operator)) {
                if (positiveInteger2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번재 정수)에 0이 입력될 수 없습니다.");
                }
                result = positiveInteger1 / positiveInteger2;
            }
            System.out.println("결과 : " + result);

            // level 1의 네 번째 - while(true) 추가
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            answer = scanner.nextLine();
        } while (!answer.equals("exit"));

        // 현재 코드에서는 탈출 조건이 명확한 것은 while(true) 보다는 do while

        System.out.println("종료합니다.");
        scanner.close();

    }
}
