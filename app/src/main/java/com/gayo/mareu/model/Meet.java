package com.gayo.mareu.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Meet implements Serializable {

    /** Meeting topic */
    private String topic;

    /** Meeting Date */
    private Date date;

    /** Meeting Room Name */
    private String roomName;

    /** Meeting List of Participant Email */
    private List<String> participantsList;

    /** CONSTRUCTOR */
    public Meet(String topic, Date date, String roomName, List<String> participantsList) {
        this.topic = topic;
        this.date = date;
        this.roomName = roomName;
        this.participantsList = participantsList;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<String> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(List<String> participantsList) {
        this.participantsList = participantsList;
    }

}
