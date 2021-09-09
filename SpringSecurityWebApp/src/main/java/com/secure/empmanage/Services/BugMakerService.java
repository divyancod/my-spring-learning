package com.secure.empmanage.Services;

import com.secure.empmanage.Configurations.BugNotFound;
import com.secure.empmanage.Models.BugsModel;

import java.util.List;

public interface BugMakerService {
    List<BugsModel> getAllBugs();
    BugsModel getBug(String id) throws BugNotFound;
    void addBug(BugsModel bugsModel);
}
