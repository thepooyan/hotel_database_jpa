package Repository;

import Model.Model;
import jakarta.persistence.*;

public class DB_Manager {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu1");
    public void save(Model entity) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        em.persist(entity);
        tr.commit();
        em.close();
    }
}
