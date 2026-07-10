package com.mycompany.cost_assignment_02;

public class Task {
    private int taskId;
    private String taskTitle;
    private String status;

    public Task(int taskId, String taskTitle, String status) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.status = status;
    }

    public int getTaskId() { return taskId; }
    public void setTaskId(int taskId) { this.taskId = taskId; }
    
    public String getTaskTitle() { return taskTitle; }
    public void setTaskTitle(String taskTitle) { this.taskTitle = taskTitle; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}