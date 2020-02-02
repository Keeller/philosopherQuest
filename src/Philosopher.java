import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {

    private String pname;
    private Server server;

    public Philosopher(String name,Server server) {
        this.pname = name;
        this.server=server;
    }


    public String getPname() {
        return pname;
    }

    public void setPname(String pname, Server server) {
        this.pname = pname;
        this.server=server;
    }




    @Override
    public void run() {
        while (true){

            try {
                sthink();
                server.philosopherWaitEat();
                ethink();
                eat();
                server.philosopherEndEat();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void eat(){
        System.out.println("Philosopher "+pname+" start eating");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Philosopher "+pname+" end eating");
    }

    public void sthink(){
        System.out.println("Philosopher "+pname+" start thincking");

    }

    public void ethink(){
        System.out.println("Philosopher "+pname+" end thincking");
    }


}
