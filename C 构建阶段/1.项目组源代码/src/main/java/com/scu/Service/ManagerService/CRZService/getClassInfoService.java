package com.scu.Service.ManagerService.CRZService;
import com.scu.Entity.ManagerEntity.CRZEntity.Student;
import java.util.List;

import static com.scu.Dao.ManagerDao.CRZDao.getClassInfoDao.getClassDao;

public class getClassInfoService {
    public static List<Student> getClassService(Integer classID){
        return getClassDao(classID);
    }

}
