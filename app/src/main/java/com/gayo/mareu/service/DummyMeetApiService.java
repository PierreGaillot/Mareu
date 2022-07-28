package com.gayo.mareu.service;


import com.gayo.mareu.model.Meet;

import java.util.List;

public class DummyMeetApiService implements MeetApiService{

    private List<Meet> meets = DummyMeetGenerator.generateMeets();

    @Override
    public List<Meet> getMeet() {
        return meets;
    }




}
