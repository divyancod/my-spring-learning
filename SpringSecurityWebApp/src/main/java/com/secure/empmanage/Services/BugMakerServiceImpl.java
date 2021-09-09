package com.secure.empmanage.Services;

import com.secure.empmanage.Configurations.BugNotFound;
import com.secure.empmanage.Dao.BugMakerDao;
import com.secure.empmanage.Models.BugsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BugMakerServiceImpl implements BugMakerService {

    @Autowired
    BugMakerDao bugMakerDao;

    @Override
    public List<BugsModel> getAllBugs() {
        return bugMakerDao.fetchAllBugs();
    }

    @Override
    public BugsModel getBug(String id) throws BugNotFound {
        return bugMakerDao.fetchBug(id);
    }

    @Override
    public void addBug(BugsModel bugsModel) {
        if(bugsModel.getBugid()==0)
            bugMakerDao.addBugToDB(bugsModel);
        else
            bugMakerDao.updateBugToDB(bugsModel);
    }
}
