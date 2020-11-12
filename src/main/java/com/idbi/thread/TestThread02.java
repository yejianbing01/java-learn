package com.idbi.thread;

//import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;


/**
 * 练习Thread，实现多线程下载图片
 * @author idbi
 */
public class TestThread02 extends Thread {
    private final String url;
    private final String name;

    public TestThread02(String url, String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        try {
            webDownloader.download(url, name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestThread02 testThread1 = new TestThread02("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3330926522,4246964662&fm=26&gp=0.jpg", "jpg1.jpg");
        TestThread02 testThread2 = new TestThread02("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3330926522,4246964662&fm=26&gp=0.jpg", "jpg2.jpg");
        TestThread02 testThread3 = new TestThread02("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3330926522,4246964662&fm=26&gp=0.jpg", "jpg3.jpg");

        testThread1.start();
        testThread2.start();
        testThread3.start();
    }

}

/**
 * 下载器
 */
class WebDownloader{
    public void download(String url, String name) throws IOException {
//        FileUtils.copyURLToFile(new URL(url), new File(name));
    }
}
