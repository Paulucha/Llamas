package com.LamaBook.bean;


import com.LamaBook.model.Lama;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Iterator;


public class CommonOperations {

    @PersistenceContext
    private EntityManager entityManager;

    Session session = null;
    SessionFactory sessionFactory = sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    public Lama getLoginDetails(Lama user) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        String login = user.getLogin();
        String password = user.getPassword();

        Query query = entityManager.createQuery("Select lama FROM Lama lama WHERE lama.login = '" + login + "' AND lama.password= '" + password + "'");
        for (Iterator it = (Iterator) query.getParameters(); it.hasNext(); ) {
            Lama lama = (Lama) it.next();
            user.setLogin(lama.getLogin());
            user.setPassword(lama.getPassword());
            user.setValid(true);
        }
        session.getTransaction().commit();
        session.close();
        return user;
    }

    public Lama registerUser(Lama user) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        user.setValid(true);
        session.getTransaction().commit();
        session.close();
        return user;
    }
}

