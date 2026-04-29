import logistic.Checkpoint;
import logistic.Delivery;
import logistic.FuelCheckpoint;
import logistic.RestCheckpoint;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoadFromDB {
      try {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM checkpoints");

        while (rs.next()) {
            String type = rs.getString("type");

            Checkpoint c;

            if (type.equals("Delivery")) {
                c = new Delivery(
                        rs.getString("id"),
                        rs.getString("location"),
                        rs.getDouble("distance"),
                        rs.getInt("expected_time"),
                        rs.getInt("actual_time")
                );
            } else if (type.equals("FuelCheckpoint")) {
                c = new FuelCheckpoint(
                        rs.getString("id"),
                        rs.getString("location"),
                        rs.getDouble("distance"),
                        rs.getInt("expected_time"),
                        rs.getInt("actual_time")
                );
            } else {
                c = new RestCheckpoint(
                        rs.getString("id"),
                        rs.getString("location"),
                        rs.getDouble("distance"),
                        rs.getInt("expected_time"),
                        rs.getInt("actual_time")
                );
            }

            route.addCheckpoint(c);
        }

        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}

