import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class Main {

    Worker glazurnik = new Worker();

    double dupa = glazurnik.work(15, 20, 2, 3);

    System.out.println(dupa);
}
