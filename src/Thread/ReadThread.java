package Thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class ReadThread implements Runnable {

    BlockingQueue<String> blockingQueue = null;

    public ReadThread(BlockingQueue<String> blockingDeque) {
        this.blockingQueue = blockingDeque;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("/Users/zhujiaye/Documents/GitHub/JavaBasic/src/Thread/input.txt"));
            String buffer = null;
            while ((buffer = br.readLine()) != null) {
                blockingQueue.offer(buffer);
            }
            blockingQueue.offer("EOF");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
