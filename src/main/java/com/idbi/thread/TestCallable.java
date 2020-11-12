package com.idbi.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * 实现线程方式三，实现Callable接口
 */
public class TestCallable implements Callable<Boolean> {
    public String url = null;
    public String name = null;

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.download(url, name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3330926522,4246964662&fm=26&gp=0.jpg", "1.jpg");
        TestCallable t2 = new TestCallable("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3330926522,4246964662&fm=26&gp=0.jpg", "2.jpg");
        TestCallable t3 = new TestCallable("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3330926522,4246964662&fm=26&gp=0.jpg", "3.jpg");

        // 创建执行服务
        ExecutorService service = Executors.newFixedThreadPool(3);

        // 提交执行
        Future<Boolean> ts1 =  service.submit(t1);
        Future<Boolean> ts2 =  service.submit(t2);
        Future<Boolean> ts3 =  service.submit(t3);

        // 获取结果
        Boolean tss1 = ts1.get();
        Boolean tss2 = ts2.get();
        Boolean tss3 = ts3.get();

        System.out.println(tss1);
        System.out.println(tss2);
        System.out.println(tss3);

        // 关闭服务
        service.shutdownNow();
    }

}


