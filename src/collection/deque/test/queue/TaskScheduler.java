package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    Queue<Task> queue = new ArrayDeque<>();
    public void addTask(Task task) {
        queue.offer(task);
    }

    public int getRemainTasks() {
        return queue.size();
    }

    public void processNextTasks() {
        while (queue.peek() != null) {
            queue.poll().execute();
        }
    }
}
