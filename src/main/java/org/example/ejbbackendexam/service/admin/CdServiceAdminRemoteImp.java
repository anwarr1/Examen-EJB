package org.example.ejbbackendexam.service.admin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.ejbbackendexam.models.CD;

import javax.ejb.Stateful;
import java.util.List;

@Stateful
public class CdServiceAdminRemoteImp implements CdServiceAdminRemote {

    @PersistenceContext(unitName = "examplePU")
    private EntityManager entityManager;



    @Override
    public void AjouterCd(CD cd) {
        entityManager.persist(cd);


    }

    @Override
    public void EditCd(String id, CD updatedCd) {
        CD cd = entityManager.find(CD.class, id);
        if (cd != null) {
            cd.setNom(updatedCd.getNom());
            cd.setPrix(updatedCd.getPrix());
            cd.setIfEmprunte(updatedCd.getifEmprunte());
            entityManager.merge(cd);
        }

    }

    @Override
    public void DeleteCd(String id) {
        CD cd = entityManager.find(CD.class, id);
        if (cd != null) {
            entityManager.remove(cd);
        }
    }

    @Override
    public List<CD> getCdsEmpruntes() {
        return  entityManager.createQuery("SELECT c FROM CD c where  c.ifEmprunte = true", CD.class).getResultList();
    }

}