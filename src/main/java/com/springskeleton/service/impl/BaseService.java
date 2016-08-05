/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.service.impl;

import com.springskeleton.dao.IBaseDao;
import com.springskeleton.service.IBaseService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author krystofurr
 */
@Service("baseService")
public abstract class BaseService implements IBaseService {

    @Resource(name = "baseDao")
    private IBaseDao baseDao;

    @Override
    public <T> List<T> findAll(Class<T> clazz) {
        return baseDao.findAll(clazz);
    }

    @Override
    public <T> T findById(Integer id, Class<T> clazz) {
        return baseDao.findById(id, clazz);
    }

    @Override
    public <T> Integer save(T entity) {
        return baseDao.save(entity);
    }

    @Override
    public <T> Integer saveNoFlush(T entity) {
        return baseDao.saveNoFlush(entity);
    }

    @Override
    public <T> boolean update(T entity) {
        return baseDao.update(entity);
    }

    @Override
    public <T> boolean updateNoFlush(T entity) {
        return baseDao.updateNoFlush(entity);
    }

    @Override
    public <T> boolean delete(T entity) {
        return baseDao.delete(entity);
    }

    @Override
    public void flush() {
        baseDao.flush();
    }

    @Override
    public void clear() {
        baseDao.clear();
    }

}
