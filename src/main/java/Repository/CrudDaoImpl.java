package Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class CrudDaoImpl<T, ID> {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu1");

    public T save(T entity) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        em.persist(entity);
        tr.commit();
        em.close();
        return entity;
    }

    @Override
    public void delete(T entity) { }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T findById(ID id) {
        return null;
    }
}
