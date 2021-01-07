package Test21RunnableAndThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3); //开启线程池
        executorService.submit(new RunnableImpl());//添加线程任务
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.shutdown();//关闭线程池

//        executorService.submit(new RunnableImpl());//会发生运行期异常,因为线程池已经被关闭
    }
}
