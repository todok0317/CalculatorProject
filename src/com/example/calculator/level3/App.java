package com.example.calculator.level3;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator calcul = new ArithmeticCalculator();
        InputMannger input = new InputMannger();
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            double x = input.positiveInteger1();
            double y = input.positiveInteger2();
            OperatorType operator = OperatorType.findValidatedSymbol(input.operatorAnswer());
            double resultAnswerPrice = (double) calcul.calculate(x,y,operator);
            List<Double> resultPrice = calcul.getResult();

            System.out.println("결과 값 : " + resultAnswerPrice);
            System.out.println("현재 저장 된 결과 값 : " + resultPrice);

            input.removeFirstIdxFromResultPrice(resultPrice);
            answer = input.exitAnswer();

        } while (!"exit".equals(answer));

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}
