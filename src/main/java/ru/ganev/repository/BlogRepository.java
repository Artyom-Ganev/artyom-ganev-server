package ru.ganev.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ganev.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Blog Repository
 *
 * @author Artyom Ganev
 */
@Repository
public class BlogRepository implements CrudRepository<Blog, UUID> {
    @Autowired
    private EntityManager em;

    @Override
    public <S extends Blog> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Blog> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Blog> findById(UUID uuid) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Blog> cr = cb.createQuery(Blog.class);
        Root<Blog> root = cr.from(Blog.class);
        cr.where(cb.equal(root.get("id"), uuid));
        TypedQuery<Blog> query = em.createQuery(cr);
        return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public List<Blog> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Blog> cr = cb.createQuery(Blog.class);
        Root<Blog> root = cr.from(Blog.class);
        cr.select(root);
        TypedQuery<Blog> query = em.createQuery(cr);
        return query.getResultList();
    }

    @Override
    public Iterable<Blog> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(Blog entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Blog> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
