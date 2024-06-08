package week02_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        String[] unfinished = solution1(todo_list, finished);
        System.out.println(Arrays.toString(unfinished));
    }

    public static String[] solution1(String[] todo_list, boolean[] finished) {
        List<String> unfinished = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                unfinished.add(todo_list[i]);
            }
        }
        return unfinished.toArray(String[]::new); //i->new String[i]
    }
}
