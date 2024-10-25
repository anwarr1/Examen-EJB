package org.example.examwebclient.service;

import org.example.examwebclient.CdServiceRemote;
import org.example.examwebclient.model.CD;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;


public class CdService {
    private CdServiceRemote cdService;

    public CdService() {
        try {
            Context context = new InitialContext();
            cdService = (CdServiceRemote) context.lookup("java:Exam-BackEnd-EJB/CdServiceRemoteImp!org.example.Exam-BackEnd-EJB" +
                    ".service.CdServiceRemote");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public List<CD> getCds() {
        return cdService.getCds();
    }
}