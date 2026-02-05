package javacollectionsstreams.regexandjunit.junit;

public class TimeoutTaskSingle {

    public void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }

    public static void main(String[] args) {
        TimeoutTaskSingle t = new TimeoutTaskSingle();

        long start = System.currentTimeMillis();
        try {
            t.longRunningTask();
        } catch (Exception e) {}

        long time = System.currentTimeMillis() - start;
        System.out.println("Finished in under 2 sec? " + (time < 2000));
    }
}
