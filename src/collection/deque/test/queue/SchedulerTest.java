package collection.deque.test.queue;

public class SchedulerTest {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackupTask());
        scheduler.addTask(new RemoveTask());

        System.out.println("작업시작");
        run(scheduler);
        System.out.println("작업종료");
    }

    static void run(TaskScheduler scheduler) {
        if (scheduler.getRemainTasks() > 0) {
            scheduler.processNextTasks();
        }
    }
}
