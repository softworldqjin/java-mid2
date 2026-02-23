package collection.deque.test.queue;

public class BackupTask implements Task {
    @Override
    public void execute() {
        System.out.println("백업 진행 중... ");
    }
}
