import java.util.concurrent.Semaphore;

public class Server {

    protected  Semaphore semaphore=new Semaphore(5);



    public  void philosopherWaitEat() throws InterruptedException {
         semaphore.acquire(2);
    }

    public  void philosopherEndEat(){
        semaphore.release(2);
    }


}
