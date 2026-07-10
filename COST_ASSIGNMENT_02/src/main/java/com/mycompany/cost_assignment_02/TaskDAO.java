package com.mycompany.cost_assignment_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskDAO {

    // 1. ADD: Insert a new task
    public boolean addTask(Task task) {
        String sql = "INSERT INTO task_data (task_id, task_title, status) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, task.getTaskId());
            pstmt.setString(2, task.getTaskTitle());
            pstmt.setString(3, task.getStatus());
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0; // Returns true if successful
            
        } catch (SQLException e) {
            System.err.println("Database error during Add: " + e.getMessage());
            return false;
        }
    }

    // 2. SEARCH: Find a task by ID
    public Task searchTask(int taskId) {
        String sql = "SELECT * FROM task_data WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, taskId);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                // If a record is found, create and return a Task object
                return new Task(
                    rs.getInt("task_id"), 
                    rs.getString("task_title"), 
                    rs.getString("status")
                );
            }
        } catch (SQLException e) {
            System.err.println("Database error during Search: " + e.getMessage());
        }
        return null; // Returns null if not found or if there's an error
    }

    // 3. UPDATE: Update an existing task
    public boolean updateTask(Task task) {
        String sql = "UPDATE task_data SET task_title = ?, status = ? WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, task.getTaskTitle());
            pstmt.setString(2, task.getStatus());
            pstmt.setInt(3, task.getTaskId()); // The WHERE clause
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Database error during Update: " + e.getMessage());
            return false;
        }
    }

    // 4. DELETE: Remove a task by ID
    public boolean deleteTask(int taskId) {
        String sql = "DELETE FROM task_data WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, taskId);
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            System.err.println("Database error during Delete: " + e.getMessage());
            return false;
        }
    }
}