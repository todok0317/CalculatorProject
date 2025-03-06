package com.example.calculator.level3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputMannger {
    Scanner scanner = new Scanner(System.in);

    // 속성


    // 생성자
    public InputMannger() {

    }

    // 기능
    public double positiveInteger1() {
        double x;
        while(true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요. : ");
                x = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요.");
                scanner.nextLine();
            }
        }
        return x;
    }

    public double positiveInteger2() {
        double y;
        while(true) {
            try {
                System.out.print("두 번째 숫자를 입력하세요. : ");
                y = scanner.nextDouble(); // 3 + 엔터 ->입력
                scanner.nextLine(); // 위에 nextInt에서 입력받은 엔터를 없애주는 역할 이걸 안해주면 다음 operatorAnswer 메서드에서 엔터가 넘어감
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요.");
                scanner.nextLine();
            }
        }
        return y;
    }

    public String operatorAnswer() {
        String operator;
        while(true) {
                System.out.print("사칙연산 기호를 입력하세요 : ");
                operator = scanner.nextLine();
                 if (operator.equals("+") || (operator.equals("-")) || (operator.equals("*")) || operator.equals("/")) {
                 break;
                 }
                System.out.println("잘못입력하였습니다. 사칙연산 +, -, *, / 중에서 입력해주세요.");
        }
        return operator;
    }

    public void removeFirstIdxFromResultPrice(List<Double> resultPrice) {
        String removeAnswer;
        System.out.print("가장 앞에 있는 저장된 결과 값을 지우고싶으시면 remove를 입력해주시고, 저장하고 싶으시면 save라고 입력해주세요. : ");
        while (true) {
            removeAnswer = scanner.nextLine();
            if ("remove".equals(removeAnswer)) {
                System.out.println("가장 앞에 있는 결과 '" + resultPrice.get(0) + "' 값이 삭제되었습니다.");
                resultPrice.remove(0);
                break;
            } else if ("save".equals(removeAnswer)) {
                System.out.println("결과 값을 삭제하지 않겠습니다.");
                break;
            } else {
                System.out.print("잘못입력하였습니다. 다시 입력해주세요. : ");
            }
        }
    }

    public String exitAnswer() {
        String answer = "";
            System.out.print("더 계산하시겠습니까? 종료를 원하시면 exit입력, 계속 원하시면 yes를 입력해주세요. : ");
            while(true) {
                answer = scanner.next();

                if(answer.equals("yes")) {
                    System.out.println("계속 진행하겠습니다.");
                    break;
                } else if (answer.equals("exit")) {
                    break;
                } else {
                    System.out.print("잘못입력하였습니다. 다시 입력해주세요. : ");
                }
            }
        return answer;
    }






}


