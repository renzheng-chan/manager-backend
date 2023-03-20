package com.scu.Service.ManagerService.CRZService;

import com.scu.Entity.ManagerEntity.CRZEntity.ClassInfo;

import java.util.List;

import static com.scu.Dao.ManagerDao.CRZDao.ShowClassDao.showClassDao;

public class ShowClassService {
    public static List<ClassInfo> showClassService(){
        return showClassDao();
    }
}
