public class RunningNumbers extends Thread {
    int i = 0;
    @Override
    public void run() {
        while (true) {
            i++;
            if (i == 10) {
                i = 0;
            }
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
