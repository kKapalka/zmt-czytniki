package pl.zmt.reader;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTest {

    public static final String PERSISTENCE_UNIT_NAME = "reader";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();



        manager.close();
        factory.close();


    }
}
