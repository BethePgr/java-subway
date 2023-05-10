package subway.domain.line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineValidate {

    public static void validateLineMain(String input){
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "B"));
        if(!list.contains(input)){
            throw new IllegalArgumentException("[ERROR] 지원되지 않는 기능입니다.");
        }
    }

}
