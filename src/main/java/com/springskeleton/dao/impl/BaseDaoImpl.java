/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.springskeleton.dao.BaseDao;

/**
 *
 * @author krystofurr
 */
@Repository("baseDao")
public class BaseDaoImpl implements BaseDao {

    @Autowired
    @Qualifier("springSkeletonSessionFactory") 
    private SessionFactory sessionFactory;
 
    public Session getSession() {
	return sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional(value = "springSkeletonTransactionManager", propagation = Propagation.REQUIRED)
    public <T> List<T> findAll(Class<T> clazz) {

            List<T> entities = null;
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("from " + clazz.getName());
            entities = query.list();
            return entities;
    }

    @Override
    @Transactional(value = "springSkeletonTransactionManager", propagation = Propagation.REQUIRED)
    @SuppressWarnings("unchecked")
    public <T> T findById(Integer id, Class<T> clazz) {

            if (id == null)
                    return null;

            T entity = null;
            Session session = sessionFactory.getCurrentSession();
            entity = (T) session.get(clazz, id);
            return entity;
    }

    @Override
    @Transactional(value = "springSkeletonTransactionManager", propagation = Propagation.REQUIRED)
    public <T> Integer save(T entity) {

            Session session = sessionFactory.getCurrentSession();
            Integer entityId = (Integer) session.save(entity);
            session.flush();
            return entityId;
    }

    @Override
    @Transactional(value = "springSkeletonTransactionManager", propagation = Propagation.REQUIRED)
    public <T> Integer saveNoFlush(T entity) {

            Session session = sessionFactory.getCurrentSession();
            Integer entityId = (Integer) session.save(entity);
            return entityId;
    }

    @Override
    @Transactional(value = "springSkeletonTransactionManager", propagation = Propagation.REQUIRED)
    public <T> boolean update(T entity) {

            Session session = sessionFactory.getCurrentSession();
            session.update(entity);
            session.flush();
            return true;
    }

    @Override
    @Transactional(value = "springSkeletonTransactionManager", propagation = Propagation.REQUIRED)
    public <T> boolean updateNoFlush(T entity) {

            Session session = sessionFactory.getCurrentSession();
            session.update(entity);
            return true;
    }

    @Override
    @Transactional(value = "springSkeletonTransactionManager", propagation = Propagation.REQUIRED)
    public <T> boolean delete(T entity) {

            Session session = sessionFactory.getCurrentSession();
            session.delete(entity);
            session.flush();
            return true;
    }

    @Override
    @Transactional(value = "springSkeletonTransactionManager", propagation = Propagation.REQUIRED)
    public void flush() {

            Session session = sessionFactory.getCurrentSession();
            session.flush();

    }

    @Override
    @Transactional(value = "springSkeletonTransactionManager", propagation = Propagation.REQUIRED)
    public void clear() {

            Session session = sessionFactory.getCurrentSession();
            session.clear();

    }
}
