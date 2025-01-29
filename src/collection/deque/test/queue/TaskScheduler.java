package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public int getRemainingTasks() {
        return tasks.size();
    }

    public void processNextTask() {
        // 나의 답
//        Task nextTask = tasks.poll();
//        nextTask.execute();
        // 영한님 답
        Task task = tasks.poll();
        if(task != null) {
            task.execute();
        }
    }

}
