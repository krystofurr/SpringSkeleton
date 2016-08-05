/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.dao;

import java.util.List;
 
public interface IBaseDao {
    
    public <T> List<T> findAll(Class<T> clazz);

    public <T> T findById(Integer id, Class<T> clazz);

//    public <T> T findByCriteria(Collection<IQueryExpression> criterion, Class<T> clazz);
//
//    public <T> List<T> listByCriteria(Collection<IQueryExpression> criterion, Class<T> clazz);
//
//    public <T> T findByQuery(String sql, Map<String, Object> bean);
//
//    public <T> List<T> listByQuery(String sql, Map<String, Object> bean, Integer maxResults);
//
//    public <T> T findByNativeQuery(String sql, Class<T> clazz);
//
//    public <T> List<T> listByNativeQuery(String sql, Class<T> clazz);
//
//    @SuppressWarnings("rawtypes")
//    public List listByNativeQuery(String sql);
//
//    public Integer updateByNativeQuery(String sql);

    public <T> Integer save(T entity);

    public <T> Integer saveNoFlush(T entity);

    public <T> boolean update(T entity);

    public <T> boolean updateNoFlush(T entity);

    public <T> boolean delete(T entity);

    public void flush();

    public void clear();

//    public BaseModel<?> findByIdCopyProperties(Integer id, Class<?> clazz);

}
