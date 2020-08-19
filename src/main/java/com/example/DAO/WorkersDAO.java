package com.example.DAO;

import com.example.hibernate.HibernateUtil;
import com.example.model.Worker;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class WorkersDAO implements IDAO{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Worker getById(int id) {
        if(entityManager != null){
            Worker worker = entityManager.find(Worker.class, id);
            entityManager.detach(worker);
            return worker;
        }
        return null;
    }

    public String getName(int id){
        String name = "see me?";
        /*if(entityManager != null){
            worker = entityManager.find(Worker.class, id);
            entityManager.detach(worker);
            name = worker.getName();
        }
        else{
            name = "entity manager was null";
        }*/
        return name;
    }

    @Override
    public List<Worker> getAll() {
        return null;
    }
}
