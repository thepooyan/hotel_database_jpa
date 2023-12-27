package dao;

import java.util.List;

public interface CrudDao<T,ID> {

    T save (T entity);
    void delete(T entity);
    List<T> findAll();
    T findById(ID id);
}
