package com.ostapdev.weathertelerambot.services;

import com.ostapdev.weathertelerambot.models.Log;
import com.ostapdev.weathertelerambot.models.LogStatus;
import com.ostapdev.weathertelerambot.repos.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    @Autowired
    private LogRepo logRepo;

    public void addLog(LogStatus status,String message){
        logRepo.save(new Log(status,message));
    }
}
