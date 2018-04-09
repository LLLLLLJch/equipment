package com.situ.xuexiao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.xuexiao.pojo.MachineMaintenance;
import com.situ.xuexiao.pojo.Member;
import com.situ.xuexiao.service.IMaintenanceService;
import com.situ.xuexiao.service.IMemberService;
import com.situ.xuexiao.vo.PageBean;

@Controller
@RequestMapping("/maintenanceIndex")
public class MaintenanceController<IBanJiService> {
	@Autowired
	private IMaintenanceService maintenanceService;
	@Autowired
	private IMemberService memberService;

	@RequestMapping("findAllMaintenance")
	public String StudentList(Model model, String pageIndexStr, String pageSizeStr) {
		int pageIndex = 1;
		int pageSize = 20;
		if (pageIndexStr != null && !pageIndexStr.equals("")) {
			pageIndex = Integer.parseInt(pageIndexStr);
		}
		if (pageSizeStr != null && !pageSizeStr.equals("")) {
			pageSize = Integer.parseInt(pageSizeStr);
		}
		PageBean<MachineMaintenance> pageBean = maintenanceService.findAllMaintenances(pageIndex, pageSize);
		model.addAttribute("pageBean", pageBean);
		return "machineMaintenance_list";
	}
	
	@RequestMapping("showMaintenance")
	public String showMaintenance(Model model,Integer ID) {
		MachineMaintenance machineMaintenance = maintenanceService.findMachineMaintenanceByID(ID);
		model.addAttribute("machineMaintenance", machineMaintenance);
		return "machineMaintenance_show";
	}
	@RequestMapping("goAddPage")
	public String goAddPage(Model model) {
		List<Member> members = memberService.findMember();
		model.addAttribute("members",members);
		System.out.println(members);
		return "maintenance_add";
	}
}
