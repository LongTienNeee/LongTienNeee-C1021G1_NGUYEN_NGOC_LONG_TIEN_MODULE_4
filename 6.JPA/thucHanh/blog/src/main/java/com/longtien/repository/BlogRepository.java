package com.longtien.repository;

import com.longtien.model.Blog;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class BlogRepository implements IBlogRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = em.createQuery("select c from Blog as c", Blog.class);
        return query.getResultList();
    }

    @Override
    public void save(Blog blog) {
        if(blog.getId() != null){
            em.merge(blog);
        } else {
            em.persist(blog);
        }
    }

    @Override
    public void delete(long id) {
        Blog blog = findById(id);
        em.remove(blog);
    }

    @Override
    public Blog findById(long id) {
        TypedQuery<Blog> query = em.createQuery("select c from Blog as c where c.id=:id", Blog.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void edit(long id) {
        Blog blog = findById(id);
        em.merge(blog);
    }
}
