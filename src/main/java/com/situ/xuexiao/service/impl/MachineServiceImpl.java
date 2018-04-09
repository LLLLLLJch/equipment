package com.situ.xuexiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.xuexiao.dao.MachineDao;
import com.situ.xuexiao.pojo.Machine;
import com.situ.xuexiao.service.IMachineService;
import com.situ.xuexiao.vo.PageBean;
@Service
public class MachineServiceImpl implements IMachineService{

	@Autowired
	private MachineDao machineDao;
	
	@Override
	public PageBean<Machine> findAllMachines(int pageIndex, int pageSize) {
		PageBean<Machine> pageBean = new PageBean<Machine>();
		pageBean.setPageIndex(pageIndex);
		pageBean.setPageSize(pageSize);
		int totalCount = machineDao.findMachineCount();
		pageBean.setTotalCount(totalCount);
		int totalPage = (int) Math.ceil(1.0 * totalCount / pageSize);
		pageBean.setTotalPage(totalPage);
		int index = (pageIndex - 1) * pageSize;
		List<Machine> list = machineDao.findAllMachine(index,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	@Override
	public List<Machine> findMachine(String workShopID) {
		return machineDao.findMachines(Integer.parseInt(workShopID));
	}

	@Override
	public List<Machine> findModeNumber(int ID) {
		return machineDao.findModelNumber(ID);
	}

}
