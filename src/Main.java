import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Server server=new Server();
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        executorService.submit(new Philosopher("Сократ",server));
        executorService.submit(new Philosopher("Декарт",server));
        executorService.submit(new Philosopher("Паскаль",server));
        executorService.submit(new Philosopher("Руссо",server));
        executorService.submit(new Philosopher("Фуко",server));
        executorService.shutdown();

    }
}
