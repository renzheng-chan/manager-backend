package com.scu.Service.ManagerService.CRZService;

import com.scu.Entity.ManagerEntity.CRZEntity.Notification;

import static com.scu.Dao.ManagerDao.CRZDao.sendNoteDao.sendNoteToDB;

public class sendNoteService {
    public static boolean processNote(Notification notification){
        return sendNoteToDB(notification);
    }

}
