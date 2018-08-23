package com.LamaBook.dao;

import com.LamaBook.model.Lama;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Stateless
public class LamaDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Integer save(Lama lama) {
        entityManager.merge(lama);
        return lama.getId();
    }

    public Lama update(Lama lama) {
        return entityManager.merge(lama);
    }

    public void delete(Long id) {
        final Lama lama = entityManager.find(Lama.class, id);
        if (lama != null) {
            entityManager.remove(lama);
        }
    }

    public Lama findById(Long id) {
        return entityManager.find(Lama.class, id);
    }

    public List<Lama> findAll() {
        final Query query = entityManager.createQuery("SELECT l FROM Lama l");

        return query.getResultList();
    }
    public Integer getLastId() {
        Query queryLastId = entityManager.createQuery("SELECT MAX(l.id) FROM Lama l");
        if (queryLastId != null) {
            return (Integer) queryLastId.getSingleResult();
        }
        else return 1;
    }
}
