package org.example.examwebclient;

import org.example.examwebclient.model.CD;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface CdServiceRemote {
    List<CD> getCds();
    void EmprunterCD(String id);
}
