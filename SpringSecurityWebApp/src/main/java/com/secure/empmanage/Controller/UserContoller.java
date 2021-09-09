package com.secure.empmanage.Controller;

import com.secure.empmanage.Configurations.BugNotFound;
import com.secure.empmanage.Models.BugsModel;
import com.secure.empmanage.Services.BugMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserContoller {

    @Autowired
    BugMakerService bugMakerService;

    @RequestMapping("/dashboard")
    public String userDashboard(Model model) {
        List<BugsModel> bugsModelList = bugMakerService.getAllBugs();
        model.addAttribute("bugsList", bugsModelList);
        return "userdashboard";
    }

    @RequestMapping("/add-bug")
    public String bugAddition(Model model) {
        BugsModel bugsModel = new BugsModel();
        model.addAttribute("bugdetail", bugsModel);
        return "bug-addition";
    }

    @RequestMapping("/confirm-add-bug")
    public String addBug(@ModelAttribute("bugdetail") BugsModel bugsModel) {
        bugMakerService.addBug(bugsModel);
        return "redirect:/user/dashboard";
    }

    @RequestMapping("/show-bug")
    public String showBug(@RequestParam("bugid") String bugid, Model model) throws BugNotFound {
        BugsModel bugsModel = bugMakerService.getBug(bugid);
        model.addAttribute("bugdetail", bugsModel);
        return "bug-addition";
    }
}
