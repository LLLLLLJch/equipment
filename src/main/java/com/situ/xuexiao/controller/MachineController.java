package com.situ.xuexiao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.xuexiao.pojo.Machine;
import com.situ.xuexiao.service.IMachineService;
import com.situ.xuexiao.vo.PageBean;

@Controller
@RequestMapping("/machineIndex")
public class MachineController<IBanJiService> {
	@Autowired
	private IMachineService machineService;

	@RequestMapping("findAllMachine")
	public String StudentList(Model model, String pageIndexStr, String pageSizeStr) {
		int pageIndex = 1;
		int pageSize = 20;
		if (pageIndexStr != null && !pageIndexStr.equals("")) {
			pageIndex = Integer.parseInt(pageIndexStr);
		}
		if (pageSizeStr != null && !pageSizeStr.equals("")) {
			pageSize = Integer.parseInt(pageSizeStr);
		}
		PageBean<Machine> pageBean = machineService.findAllMachines(pageIndex, pageSize);
		model.addAttribute("pageBean", pageBean);
		return "machine_list";
	}
	
	@RequestMapping("findAllMachines")
	@ResponseBody
	public List<Machine> findAllMachines(String workShopID) {
		List<Machine> machines = machineService.findMachine(workShopID);
		return machines;
	}
	
	@RequestMapping("findModelNumber")
	@ResponseBody
	public List<Machine> findModelNumber(String ID) {
		List<Machine> machines = machineService.findModeNumber(Integer.parseInt(ID));
		return machines;
	}
}
