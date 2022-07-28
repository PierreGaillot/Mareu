package com.gayo.mareu.DI;

import com.gayo.mareu.service.DummyMeetApiService;
import com.gayo.mareu.service.MeetApiService;

public class DI {

    private  static MeetApiService service = new DummyMeetApiService();

    public static MeetApiService getMeetApiService() {return service;}

    public static MeetApiService getNewInstanceApiService(){
        return  new DummyMeetApiService();
    };
}
