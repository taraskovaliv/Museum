import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import services.HibernateService;

public class TestHibernateService {

    @Test
    public void testSesionBuilder(){
        SessionFactory sessionFactory = HibernateService.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.close();
    }

}
