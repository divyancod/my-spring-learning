package com.secure.empmanage.Configurations;

import com.secure.empmanage.Models.BugsModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BugsRowMapper implements RowMapper<BugsModel> {
    @Override
    public BugsModel mapRow(ResultSet resultSet, int i) throws SQLException {
        BugsModel bugsModel = new BugsModel();
        bugsModel.setBugid(resultSet.getInt("bugid"));
        bugsModel.setBugname(resultSet.getString("bugname"));
        bugsModel.setBugdesc(resultSet.getString("bugdesc"));
        bugsModel.setPriority(resultSet.getString("name"));
        bugsModel.setPlatform(resultSet.getString("platform"));
        bugsModel.setStatus(resultSet.getString("state"));
        return bugsModel;
    }
}
