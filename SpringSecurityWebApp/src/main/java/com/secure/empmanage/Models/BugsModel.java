package com.secure.empmanage.Models;

public class BugsModel {
    private int bugid;
    private String bugname;
    private String bugdesc;
    private String priority;
    private String platform;
    private String status;
    private String priorityNumber;
    private String statusNumber;

    public String getPriorityNumber() {
        return priorityNumber;
    }

    public void setPriorityNumber(String priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public String getStatusNumber() {
        return statusNumber;
    }

    public void setStatusNumber(String statusNumber) {
        this.statusNumber = statusNumber;
    }

    public int getBugid() {
        return bugid;
    }

    public void setBugid(int bugid) {
        this.bugid = bugid;
    }

    public String getBugname() {
        return bugname;
    }

    public void setBugname(String bugname) {
        this.bugname = bugname;
    }

    public String getBugdesc() {
        return bugdesc;
    }

    public void setBugdesc(String bugdesc) {
        this.bugdesc = bugdesc;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BugsModel{" +
                "bugid=" + bugid +
                ", bugname='" + bugname + '\'' +
                ", bugdesc='" + bugdesc + '\'' +
                ", priority='" + priority + '\'' +
                ", platform='" + platform + '\'' +
                ", status='" + status + '\'' +
                ", priorityNumber='" + priorityNumber + '\'' +
                ", statusNumber='" + statusNumber + '\'' +
                '}';
    }
}
