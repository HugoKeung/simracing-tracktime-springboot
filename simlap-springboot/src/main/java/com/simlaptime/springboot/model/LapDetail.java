package com.simlaptime.springboot.model;

import javax.persistence.*;


@Entity
@Table(name = "lapdetail")
public class LapDetail {
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public long getLaptime() {
        return laptime;
    }

    public void setLaptime(long laptime) {
        this.laptime = laptime;
    }

    public long getSectorOne() {
        return sectorOne;
    }

    public void setSectorOne(long sectorOne) {
        this.sectorOne = sectorOne;
    }

    public long getSectorTwo() {
        return sectorTwo;
    }

    public void setSectorTwo(long sectorTwo) {
        this.sectorTwo = sectorTwo;
    }

    public long getSectorThree() {
        return sectorThree;
    }

    public void setSectorThree(long sectorThree) {
        this.sectorThree = sectorThree;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getSimname() {
        return simname;
    }

    public void setSimname(String simname) {
        this.simname = simname;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getSetupId() {
        return setupId;
    }

    public void setSetupId(String setupId) {
        this.setupId = setupId;
    }

    public String getTelemetryId() {
        return telemetryId;
    }

    public void setTelemetryId(String telemetryId) {
        this.telemetryId = telemetryId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name = "track")
    private String track;

    @Column(name = "laptime")
    private long laptime;

    @Column(name = "sector_one")
    private long sectorOne;

    @Column(name = "sector_two")
    private long sectorTwo;

    @Column(name = "sector_three")
    private long sectorThree;

    @Column(name = "car")
    private String carmodel;

    @Column(name = "sim")
    private String simname;

    @Column(name = "video_id")
    private String videoId;

    @Column(name = "setup_id")
    private String setupId;

    @Column(name = "telemetry_id")
    private String telemetryId;

    @Column(name = "note")
    private String note;

    @Column(name = "uid")
    private Long uid;

    public LapDetail(){

    }

    public LapDetail(long id, String track, long laptime, long sectorOne, long sectorTwo, long sectorThree,
            String carmodel, String simname, String videoId, String setupId, String telemetryId, String note,
            Long uid) {
        this.id = id;
        this.track = track;
        this.laptime = laptime;
        this.sectorOne = sectorOne;
        this.sectorTwo = sectorTwo;
        this.sectorThree = sectorThree;
        this.carmodel = carmodel;
        this.simname = simname;
        this.videoId = videoId;
        this.setupId = setupId;
        this.telemetryId = telemetryId;
        this.note = note;
        this.uid = uid;
    }

    
}


