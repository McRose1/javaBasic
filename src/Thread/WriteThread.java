package Thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

public class WriteThread implements Runnable {

    BlockingQueue<String> blockingQueue = null;

    public WriteThread(BlockingQueue<String> blockingDeque) {
        this.blockingQueue = blockingDeque;
    }

    @Override
    public void run() {
        try (PrintWriter writer = new PrintWriter(new File("/Users/zhujiaye/Documents/GitHub/JavaBasic/src/Thread/ouput.txt"))) {

            while (true) {
                String buffer = blockingQueue.poll();
                if (buffer.equals("EOF")) {
                    break;
                } else if (buffer.length() > 1) {
                    String[] str = buffer.split(" ");
                    int sum = 0;
                    int pre = 1;
                    for (String s : str) {
                        if (s.charAt(0) == '-') {
                            pre = -1;
                        } else if (s.charAt(0) == '+') {
                            pre = 1;
                        } else {
                            int n = s.charAt(0) - '0';
                            sum += pre * n;
                        }
                    }
                    writer.println(buffer + " = " + sum + "");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
