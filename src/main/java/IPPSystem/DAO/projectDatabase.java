package IPPSystem.DAO;

import IPPSystem.Models.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class projectDatabase {
    private static Connection con;

    static {
        try {
            con = databaseConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<project> getAllProjects(){
        ArrayList<project> ls = new ArrayList<>();
        try {
            PreparedStatement pstmt = con.prepareCall("");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                ls.add(new project(
                        rs.getInt("projectId"),
                        rs.getString("projectInstanceName"),
                        rs.getString("typeName"),
                        rs.getString("buildingName"),
                        rs.getString("levelName"),
                        rs.getInt("totalStories"),
                        rs.getInt("totalUnits"),
                        rs.getDouble("projectArea"),
                        rs.getDouble("projectHeight"),
                        rs.getDate("startDate"),
                        rs.getDouble("duration"),
                        rs.getString("unitDuration"),
                        rs.getDouble("totalCost"),
                        rs.getString("userName"),
                        rs.getString("projectStatus")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ls;
    }

    public static ArrayList<project> getProjectsByStatus(String projectStatus){
        ArrayList<project> ls = new ArrayList<>();
        try {
            PreparedStatement pstmt = con.prepareCall("SELECT * FROM projects WHERE projectStatus = ?");
            pstmt.setString(1,projectStatus);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                ls.add(new project(
                        rs.getInt("projectId"),
                        rs.getString("projectInstanceName"),
                        rs.getString("typeName"),
                        rs.getString("buildingName"),
                        rs.getString("levelName"),
                        rs.getInt("totalStories"),
                        rs.getInt("totalUnits"),
                        rs.getDouble("projectArea"),
                        rs.getDouble("projectHeight"),
                        rs.getDate("startDate"),
                        rs.getDouble("duration"),
                        rs.getString("unitDuration"),
                        rs.getDouble("totalCost"),
                        rs.getString("userName"),
                        rs.getString("projectStatus")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ls;
    }

}
