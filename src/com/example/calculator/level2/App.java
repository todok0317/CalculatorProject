package com.example.calculator.level2;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calcul = new Calculator();
        InputMannger input = new InputMannger();
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            int x = input.positiveInteger1();
            int y = input.positiveInteger2();
            String operator = input.operatorAnswer();
            int resultAnswerPrice = calcul.calculate(x,y,operator);
            List<Integer> resultPrice = calcul.getResult();
            System.out.println("결과 값 : " + resultAnswerPrice);
            System.out.println("현재 저장 된 결과 값 : " + resultPrice);
            input.removeFirstIdxFromResultPrice(resultPrice);
            answer = input.exitAnswer();

        } while (!"exit".equals(answer));

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}
