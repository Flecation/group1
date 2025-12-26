package IPPSystem.Models;

import java.util.Date;

public class project {
    private String projectType,projectInstanceName,BuildingName,level,manager,projectStatus,unitDuration;
    private int assignProjectId,totalStories,totalUnits;
    private double projectArea,projectHeight,totalCost, duration;
    private Date startDate;


    public project(){};

    public project(int assignProjectId, String projectInstanceName, String projectType, String buildingName, String level, int totalStories, int totalUnits, double projectArea, double projectHeight, Date startDate, Double duration, String unitDuration, double totalCost, String manager, String projectStatus) {
        this.assignProjectId = assignProjectId;
        this.projectInstanceName = projectInstanceName;
        this.projectType = projectType;
        this.BuildingName = buildingName;
        this.level = level;
        this.totalStories = totalStories;
        this.totalUnits = totalUnits;
        this.projectArea = projectArea;
        this.projectHeight = projectHeight;
        this.startDate = startDate;
        this.duration = duration;
        this.unitDuration = unitDuration;
        this.totalCost = totalCost;
        this.manager = manager;
        this.projectStatus = projectStatus;
    }


    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectInstanceName() {
        return projectInstanceName;
    }

    public void setProjectInstanceName(String projectInstanceName) {
        this.projectInstanceName = projectInstanceName;
    }

    public String getBuildingName() {
        return BuildingName;
    }

    public void setBuildingName(String buildingName) {
        BuildingName = buildingName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getUnitDuration() {
        return unitDuration;
    }

    public void setUnitDuration(String unitDuration) {
        this.unitDuration = unitDuration;
    }

    public int getAssignProjectId() {
        return assignProjectId;
    }

    public void setAssignProjectId(int assignProjectId) {
        this.assignProjectId = assignProjectId;
    }

    public int getTotalStories() {
        return totalStories;
    }

    public void setTotalStories(int totalStories) {
        this.totalStories = totalStories;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(int totalUnits) {
        this.totalUnits = totalUnits;
    }

    public double getProjectArea() {
        return projectArea;
    }

    public void setProjectArea(double projectArea) {
        this.projectArea = projectArea;
    }

    public double getProjectHeight() {
        return projectHeight;
    }

    public void setProjectHeight(double projectHeight) {
        this.projectHeight = projectHeight;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
