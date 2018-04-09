package com.situ.xuexiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.xuexiao.dao.MaintenanceDao;
import com.situ.xuexiao.pojo.MachineMaintenance;
import com.situ.xuexiao.service.IMaintenanceService;
import com.situ.xuexiao.vo.PageBean;
@Service
public class MaintenanceServiceImpl implements IMaintenanceService{

	@Autowired
	private MaintenanceDao maintenanceDao;
	
	@Override
	public PageBean<MachineMaintenance> findAllMaintenances(int pageIndex, int pageSize) {
		PageBean<MachineMaintenance> pageBean = new PageBean<MachineMaintenance>();
		pageBean.setPageIndex(pageIndex);
		pageBean.setPageSize(pageSize);
		int totalCount = maintenanceDao.findMaintenanceCount();
		pageBean.setTotalCount(totalCount);
		int totalPage = (int) Math.ceil(1.0 * totalCount / pageSize);
		pageBean.setTotalPage(totalPage);
		int index = (pageIndex - 1) * pageSize;
		List<MachineMaintenance> list = maintenanceDao.findAllMaintenance(index,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	@Override
	public MachineMaintenance findMachineMaintenanceByID(Integer ID) {
		return maintenanceDao.findMachineMaintenanceByID(ID);
	}

}
