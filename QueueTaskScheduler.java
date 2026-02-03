import java.util.LinkedList;
import java.util.Queue;

public class QueueTaskScheduler {
    public static void main(String[] args) {
        // 1. Initialize Queue using LinkedList
        Queue<String> taskQueue = new LinkedList<>();

        // 2. Add tasks to the queue
        taskQueue.add("I am reading question");
        taskQueue.add("I am thinking of solution");
        taskQueue.add("Implementing , coding solution ");
        taskQueue.add("Exceuting solution");

        System.out.println("Initial Tasks: " + taskQueue);

        // 3. Execute tasks using poll() until queue is empty
        System.out.println("\nExecuting Tasks:");
        while (!taskQueue.isEmpty()) {
            String currentTask = taskQueue.poll();
            System.out.println("Processing: " + currentTask);
        }

        System.out.println("\nFinal task after queue is empty: " + taskQueue.poll());
    }
}
