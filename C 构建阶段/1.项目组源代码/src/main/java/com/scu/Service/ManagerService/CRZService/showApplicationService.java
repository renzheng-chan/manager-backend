package com.scu.Service.ManagerService.CRZService;

import com.scu.Entity.ManagerEntity.CRZEntity.Application;

import java.util.List;

import static com.scu.Dao.ManagerDao.CRZDao.showApplicationDao.loadApplicationDao;

public class showApplicationService {
    public static List<Application> loadApplicationService(){
        return loadApplicationDao();
    }
    public static List<Application> loadApplicationService(Integer applicationID){
        return loadApplicationDao(applicationID);
    }

}
