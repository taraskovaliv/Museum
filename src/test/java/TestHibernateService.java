import entity.Material;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;
import services.HibernateService;

public class TestHibernateService {

    @Test
    public void testSesionBuilder(){
        SessionFactory sessionFactory = HibernateService.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.close();
    }

    @Test
    public void testMaterials(){
        Session session = HibernateService.getSessionFactory().openSession();
        session.beginTransaction();
        Material material =new Material((long) 1, "Carbon");
        System.out.println(material.toString());
        session.save(material);
        session.delete(material);
        session.getTransaction().commit();
        session.close();
    }

}
