package org.example.ejbbackendexam.service.admin;


import org.example.ejbbackendexam.models.CD;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface CdServiceAdminRemote {
    void  AjouterCd(CD cd);
    void EditCd(String id, CD updatedCd);
    void DeleteCd(String id);
    List<CD> getCdsEmpruntes();
}
