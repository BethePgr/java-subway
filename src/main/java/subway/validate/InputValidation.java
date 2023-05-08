package subway.validate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputValidation {

    public static void validateStartInput(String input){
        List<Object> list = new ArrayList<>(Arrays.asList("1","2","3","4","Q"));
        if(!list.contains(input)){
            throw new IllegalArgumentException("[ERROR] 존재하지 않는 기능입니다.");
        }
    }

}
