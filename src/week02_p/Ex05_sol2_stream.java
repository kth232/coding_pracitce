package week02_p;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex05_sol2_stream {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        String[] unfinished = solution2(todo_list, finished);
        System.out.println(Arrays.toString(unfinished));
    }
// 스트림 사용할 때
    public static String[] solution2(String[] todo_list, boolean[] finished) {
        return IntStream.range(0, todo_list.length)
                .filter(i->!finished[i])
                .mapToObj(i->todo_list[i])
                .toArray(String[]::new);
    }
}
