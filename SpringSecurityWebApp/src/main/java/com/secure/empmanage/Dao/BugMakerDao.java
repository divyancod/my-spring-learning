package com.secure.empmanage.Dao;

import com.secure.empmanage.Configurations.BugNotFound;
import com.secure.empmanage.Models.BugsModel;
import java.util.*;

public interface BugMakerDao {
    List<BugsModel> fetchAllBugs();
    BugsModel fetchBug(String bugId) throws BugNotFound;
    void addBugToDB(BugsModel bugsModel);
    void updateBugToDB(BugsModel bugsModel);
}
