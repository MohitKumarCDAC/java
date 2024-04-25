package com.app.task;

import java.time.LocalDate;

public class Task {

	// taskId, taskName, description, taskDate, status, active
	private int taskId;
	private static int count=1;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private TaskStatus status;
	private boolean active;
	public Task( String taskName, String description, LocalDate taskDate) 
	{
		super();
		this.taskId = count++;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = TaskStatus.PENDING;
		this.active = true;
	}
	public Task(int taskID)
	{
		this.taskId=taskID;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Task.count = count;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String tackName) {
		this.taskName = tackName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}
	public TaskStatus getStatus() {
		return status;
	}
	public void setStatus(TaskStatus status) {
		this.status = status;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", tackName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Task)
		{
			Task other=(Task)o;
			return this.taskId==other.taskId;//(== because we check int value)
		}
		return false;
	}
	
	
	
}
