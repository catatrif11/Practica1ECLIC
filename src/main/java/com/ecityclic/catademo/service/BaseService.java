package com.ecityclic.catademo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dpardell on 31/07/2020.
 *
 * @author dpardell
 * @version $Id: $Id
 */
@SuppressWarnings("ClassWithoutLogger")
public class BaseService<T>{

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    protected JpaRepository<T, Long> repository;

    /** {@inheritDoc} */
    public List<T> findAll() {
        return repository.findAll();
    }

    /** {@inheritDoc} */
    public List<T> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    /** {@inheritDoc} */
    public Page<T> findAll(Pageable page) {
        return repository.findAll(page);
    }

    /** {@inheritDoc} */
    public <S extends T> S save(S object) {
    	S result = repository.saveAndFlush(object);
        return result;
    }

    /** {@inheritDoc} */
    public void save(List<T> objects) {
        repository.saveAll(objects);
    }

    /** {@inheritDoc} */
    public T findOne(long id) {
        return repository.getOne(id);
    }
//
//    /** {@inheritDoc} */
//    public void delete(long id) {
//        repository.deleteById(id);
//    }
//
//    /** {@inheritDoc} */
//    public void delete(T object) {
//        repository.delete(object);
//    }
//
//    /** {@inheritDoc} */
//    public void deleteAll() {
//        repository.deleteAll();
//    }

}
