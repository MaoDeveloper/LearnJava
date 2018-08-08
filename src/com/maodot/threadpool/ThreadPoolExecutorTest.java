package com.maodot.threadpool;

import java.util.concurrent.*;

/**
 * 四种线程池的创建，和使用
 * @author maodot
 */
public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
        ThreadPoolExecutorTest test = new ThreadPoolExecutorTest();
        //test.testCachedThreadPool();
        //test.testFixedThreadPool();
        //test.testScheduleExecutorService();
        test.testSingleThreadExecutor();
    }

    /**
     * CachedThreadPool
     * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。示例代码如下：
     *   线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程
     */
    void testCachedThreadPool(){
        int executeNum = 40;
        //ExecutorService executorService = new ThreadPoolExecutor(3,5,500000L,TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>());
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < executeNum; i++) {
            final int index = i;
            try {
                Thread.sleep(1000 * index);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("index:"+index+"\t threadName:"+Thread.currentThread().getName());
                }
            });
        }
    }

    /**
     * FixedThreadPool
     * 创建一个定线程池，可控制线程最大并发数，超出的线程会在队长列中等待
     */
    void testFixedThreadPool(){
        //线程数
        int threadNum = 5;
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(threadNum);
        int executeNum = 40;
        for (int i = 0; i < executeNum; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("index:"+index+"\t\t thread name:"+Thread.currentThread().getName());
                }
            });
        }
    }

    /**
     * newScheduledThreadPool
     * 创建一个定长线程池，支持定时及周期性任务执行。延迟执行示例代码如下
     */
    void testScheduleExecutorService(){
        final int corePoolSize = 3;
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(corePoolSize);
        scheduledThreadPool.schedule(new Runnable() {
            int index = 0;
            @Override
            public void run() {
                index ++;
                System.out.println("延迟3秒钟执行，第"+index+"次执行，线程名称："+Thread.currentThread().getName());
            }
        },3,TimeUnit.MILLISECONDS);

        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            int index = 0;
            @Override
            public void run() {
                index ++ ;
                System.out.println("延迟3秒钟执行，间隔1秒，第"+index+"次执行,线程名称："+Thread.currentThread().getName());
            }
        },3,1,TimeUnit.SECONDS);

        scheduledThreadPool.scheduleWithFixedDelay(new Runnable() {
            int index = 0;
            @Override
            public void run() {
                index ++;
                System.out.println("延迟3秒钟执行，执行完后间隔1秒，第"+index+"次执行,线程名称："+Thread.currentThread().getName());
            }
        },3,1,TimeUnit.SECONDS);
    }

    /**
     * newSingleThreadExecutor
     * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
     */
    void testSingleThreadExecutor(){
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        int executeNum = 20;
        for (int i = 0; i < executeNum; i++) {
            final int index = i;
            singleThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("index:"+index+"\t\t sleep 2 second...thread name:"+Thread.currentThread().getName());
                }
            });
        }
    }
}
