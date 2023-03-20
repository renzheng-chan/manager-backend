package com.scu.Service.ManagerService.CRZService;

import com.scu.Entity.ManagerEntity.CRZEntity.Application;

import static com.scu.Dao.ManagerDao.CRZDao.updateApplicationDao.approvalDao;

public class updateApplicationService {
    public static boolean approvalService(Application application){
        return approvalDao(application);
    }
}
