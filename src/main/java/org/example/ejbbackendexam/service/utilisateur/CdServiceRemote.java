package org.example.ejbbackendexam.service.utilisateur;


import org.example.ejbbackendexam.models.CD;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface CdServiceRemote {
    List<CD> getCds();
    void EmprunterCD(String id);
    List<CD> getCdsEmpruntes();
}
