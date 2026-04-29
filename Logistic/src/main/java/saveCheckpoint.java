import logistic.Checkpoint;
import logistic.DBconnections;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class saveCheckpoint(Checkpoint c) {

     try {
        Connection con = null;
        try {
            con = DBconnections.getConnection();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        String sql = "INSERT INTO checkpoints VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }


        ps.setString(1, c.id);
        ps.setString(2, c.getType());
        ps.setString(3, c.location);
        ps.setDouble(4, c.distance);
        ps.setInt(5, c.expectedTime);
        ps.setInt(6, c.actualTime);

        ps.executeUpdate();
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}

