package collection.deque.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> stack = new ArrayDeque<>();

    public void visitPage(String google) {
        stack.push(google);
    }

    public String goBack() {
        if (stack.isEmpty()) {
            return "갈곳없음";
        }
        return stack.pop();
    }
}
