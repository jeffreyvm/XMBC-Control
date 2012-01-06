package be.jeffreyvanmulem.dao;

import be.jeffreyvanmulem.model.AbstractEntity;
import org.apache.log4j.Logger;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Jeffrey
 * Date: 06/01/12
 * Time: 10:04
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractDAO<T extends AbstractEntity> {
    protected final Logger LOG = Logger.getLogger(getClass());
private Class<T> entityClass;

    public AbstractDAO() {

    }

    public long count(){
        return 0;
    }

    public T find(Long key){
        LOG.info("Trying to find " + getEntityClass() + " with id " + key + " among " + count() + " elements.");
        return null;
    }

    public List<T> findAll(){
        return null;
    }


    public void clear(){
    }

    public void flush(){
    }

    public T merge(T entity){
        return null;
    }

    public void persist(T entity){
    }
    
    public void remove(T entity){
    }

    public Class<T> getEntityClass() {
        if(entityClass == null){
            Type type = this.getClass().getGenericSuperclass();
            ParameterizedType parameterizedType = (ParameterizedType) type;
            entityClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];
        }
        
        return entityClass;
    }
}
