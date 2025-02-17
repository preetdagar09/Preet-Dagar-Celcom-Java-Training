package com.celcom.day10;

import java.util.ArrayList;

class Task{
	private String name;
	private Boolean isCompleted;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	} 
	
	@Override
	public String toString(){
		return "Task name : " + name + ", Status: " + (isCompleted? "Completed" : "Not Completed");
	}
	
}



public class TaskManagementSystem {
	ArrayList<Task> tasklist = new ArrayList<>();
	
	public void addTask(String name, Boolean isCompleted) {
		Task task1 = new Task(); 
		task1.setName(name);
		task1.setIsCompleted(isCompleted);
		tasklist.add(task1);
		System.out.println("Task added: ");
		for(Task task: tasklist) {
			System.out.println(task);
		}
		
	}
	
	public void viewTasks() {
		if(tasklist.isEmpty()) {
			System.out.println("No tasks available");
		}
		else {
			System.out.println("All tasks :");
			for(Task task : tasklist) {
				System.out.println(task);
			}
		}
	}
	
	public void markTaskAsCompleted(String taskName) {
		boolean taskFound = false;
		for(Task task : tasklist) {
			if(task.getName().equalsIgnoreCase(taskName)) {
				task.setIsCompleted(true);
				taskFound = true;
				System.out.println("Task is marked as completed.");
				break;
			}
		}
		if(!taskFound) {
			System.out.println("Task : " + taskName + " Not found.");
		}
	}
	
	public void deleteTask(String taskName) {
		boolean taskFound = false;
		for(Task task : tasklist) {
			if(task.getName().equalsIgnoreCase(taskName)) {
				tasklist.remove(task);
				taskFound = true;
				System.out.println("Task : " + taskName + " is deleted.");
				break;
			}
		}
		if(!taskFound) {
			System.out.println("Task : " + taskName + " Not found.");
		}
	}
	
	public void searchTask(String taskName) {
		boolean taskFound = false;
		for(Task task : tasklist) {
			if(task.getName().equalsIgnoreCase(taskName)) {
				System.out.println("Found Task: " + task + "index : " + tasklist.indexOf(task));
				taskFound = true;
				break;
			}
		}
		if(!taskFound) {
			System.out.println("Task : " + taskName + " Not found.");
		}
	}

	public static void main(String[] args) {
		TaskManagementSystem taskSystem = new TaskManagementSystem();
		taskSystem.addTask("Complete assignment 1", false);
		taskSystem.viewTasks();
		taskSystem.markTaskAsCompleted("Complete assignment 1");
		taskSystem.viewTasks();
		
		
		

	}

}
