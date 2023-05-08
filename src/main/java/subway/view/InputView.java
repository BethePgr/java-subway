package subway.view;


import java.io.Console;
import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static String inputStart(){
        System.out.println("## 메인 화면\n1. 역 관리\n2. 노선 관리\n3. 구간 관리\n4. 지하철 노선도 출력\nQ. 종료\n");
        System.out.println("## 원하는 기능을 선택하세요.");
        return scanner.next();
    }

}
