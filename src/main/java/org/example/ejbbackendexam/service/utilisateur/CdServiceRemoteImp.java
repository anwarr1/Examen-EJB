package org.example.ejbbackendexam.service.utilisateur;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.ejbbackendexam.models.CD;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class CdServiceRemoteImp implements CdServiceRemote {

    @PersistenceContext(unitName = "examplePU")
    private EntityManager entityManager;

    @Override
    public List<CD> getCds() {
        return entityManager.createQuery("SELECT c FROM CD c", CD.class).getResultList();
    }

    @Override
    public void EmprunterCD(String id) {
        CD cd = entityManager.find(CD.class, id);
        if (cd != null) {
            cd.setIfEmprunte(true);
            entityManager.merge(cd);
        }
    }

    @Override
    public List<CD> getCdsEmpruntes() {
        return  entityManager.createQuery("SELECT c FROM CD c where  c.ifEmprunte = true", CD.class).getResultList();
    }

}