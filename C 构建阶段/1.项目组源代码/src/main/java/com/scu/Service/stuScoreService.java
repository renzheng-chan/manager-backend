package com.scu.Service;

import com.scu.Entity.Score;

import java.util.List;

public interface stuScoreService {
    List<Score> scoreFind(int stuID);
}
