package vn.codegym.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Song;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

import static vn.codegym.repository.ConnectionUtil.entityManager;
import static vn.codegym.repository.ConnectionUtil.sessionFactory;

@Repository
public class SongRepository implements ISongRepository {


    @Override
    public void create(Song song) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Song origin = new Song();
            origin.setName(song.getName());
            origin.setSinger(song.getSinger());
            origin.setLink(song.getLink());
            origin.setCategory(song.getCategory());
            session.saveOrUpdate(origin);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }


    @Override
    public void delete(int id) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            String sql = "delete from Song as s where id =:id";
            Query query = session.createQuery(sql);
            query.setParameter("id", id);
            query.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Song> findAll() {
        String queryStr = "SELECT s FROM Song AS s";
        TypedQuery<Song> query = entityManager.createQuery(queryStr, Song.class);
        return query.getResultList();
    }

    @Override
    public Song listen(Song song) {
        return null;
    }

    @Override
    public void update(Song song) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Song origin = new Song();
            origin.setId(song.getId());
            origin.setName(song.getName());
            origin.setSinger(song.getSinger());
            origin.setLink(song.getLink());
            origin.setCategory(song.getCategory());
            session.saveOrUpdate(origin);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public Song findOne(int id) {
        String queryStr = "SELECT s FROM Song AS s WHERE s.id = :id";
        TypedQuery<Song> query = entityManager.createQuery(queryStr, Song.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}
