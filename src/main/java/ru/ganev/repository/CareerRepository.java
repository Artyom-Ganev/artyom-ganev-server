package ru.ganev.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ganev.model.Career;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Career Repository
 *
 * @author Artyom Ganev
 */
@Repository
public class CareerRepository implements CrudRepository<Career, UUID> {
    @Autowired
    private EntityManager em;

    @Override
    public <S extends Career> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Career> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Career> findById(UUID uuid) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Career> cr = cb.createQuery(Career.class);
        Root<Career> root = cr.from(Career.class);
        cr.where(cb.equal(root.get("id"), uuid));
        TypedQuery<Career> query = em.createQuery(cr);
        return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public List<Career> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Career> cr = cb.createQuery(Career.class);
        Root<Career> root = cr.from(Career.class);
        cr.select(root);
        TypedQuery<Career> query = em.createQuery(cr);
        return query.getResultList();
    }

    @Override
    public Iterable<Career> findAllById(Iterable<UUID> uuids) {
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
    public void delete(Career entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Career> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
