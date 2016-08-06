/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.service;

import java.util.List;

/**
 *
 * @author krystofurr
 */
public interface BaseService {
    
    public <T> List<T> findAll(Class<T> clazz);

    public <T> T findById(Integer id, Class<T> clazz);

    public <T> Integer save(T entity);

    public <T> Integer saveNoFlush(T entity);

    public <T> boolean update(T entity);

    public <T> boolean updateNoFlush(T entity);

    public <T> boolean delete(T entity);

    public void flush();

    public void clear(); 
}
