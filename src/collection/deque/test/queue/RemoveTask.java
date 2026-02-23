package collection.deque.test.queue;

public class RemoveTask implements Task {
    @Override
    public void execute() {
        System.out.println("쓰레기 파일 삭제 중...");
    }
}
