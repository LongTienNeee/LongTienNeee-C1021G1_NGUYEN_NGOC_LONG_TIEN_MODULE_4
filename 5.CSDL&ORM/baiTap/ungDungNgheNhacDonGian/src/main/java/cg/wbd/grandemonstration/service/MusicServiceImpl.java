package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.Music;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.TransactionManager;
import java.util.List;

@Service
public class MusicServiceImpl implements IMusicService{

    private static List<Music> music;
    private static long autoIncreaseId = 0;
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    private static TransactionManager transactionManager;

    static {
        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            sessionFactory.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Music> findAll() {
        String queryStr = "select c from  as c ";
        TypedQuery<Music> query = entityManager.createQuery(queryStr, Music.class);
        return query.getResultList();
    }

    @Override
    public void addNew(Music music) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

        } finally {

        }
    }

    @Override
    public void edit(int id) {

    }

    @Override
    public void delete(Music music) {

    }
}

