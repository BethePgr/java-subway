package subway.view;


import java.io.Console;
import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static String inputStart(){
        System.out.println("## 원하는 기능을 선택하세요.");
        return scanner.next();
    }

}
