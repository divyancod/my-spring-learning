package com.secure.empmanage.Dao;

import com.secure.empmanage.Configurations.BugNotFound;
import com.secure.empmanage.Configurations.BugsRowMapper;
import com.secure.empmanage.Models.BugsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BugMakerDaoImpl implements BugMakerDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<BugsModel> fetchAllBugs() {
        String sql = "select b.*,bs.state,bp.name from bugs b,bugpriority bp,bugstatus bs where b.priority=bp.priority and bs.status=b.status";
        List<BugsModel> bugsModels = jdbcTemplate.query(sql, new BugsRowMapper());
        return bugsModels;
    }

    @Override
    public BugsModel fetchBug(String bugId) throws BugNotFound {
        String sql = "select b.*,bs.state,bp.name from bugs b,bugpriority bp,bugstatus bs where b.priority=bp.priority and bs.status=b.status and bugid=?";
        List<BugsModel> list = jdbcTemplate.query(sql, new BugsRowMapper(),bugId);
        if(list==null)
            throw new BugNotFound("Bug Not Found");
        else if(list.size()==1)
            return list.get(0);
        else
            throw new BugNotFound("Invalid BUG");
    }

    @Override
    public void addBugToDB(BugsModel bugsModel) {
        String sql = "INSERT INTO bugs(bugname,bugdesc,priority,platform,status) values (?,?,?,?,?)";
        jdbcTemplate.update(sql,bugsModel.getBugname(),bugsModel.getBugdesc(),bugsModel.getPriorityNumber(),bugsModel.getPlatform(),bugsModel.getStatusNumber());
    }

    @Override
    public void updateBugToDB(BugsModel bugsModel) {
        String sql = "UPDATE bugs SET bugname=?,bugdesc=?,priority=?,platform=?,status=? where bugid=?";
        jdbcTemplate.update(sql,bugsModel.getBugname(),bugsModel.getBugdesc(),bugsModel.getPriorityNumber(),bugsModel.getPlatform(),bugsModel.getStatusNumber(),bugsModel.getBugid());
    }
}
