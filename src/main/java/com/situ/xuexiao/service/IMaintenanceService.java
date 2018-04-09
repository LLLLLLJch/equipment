package com.situ.xuexiao.service;

import com.situ.xuexiao.pojo.MachineMaintenance;
import com.situ.xuexiao.vo.PageBean;

public interface IMaintenanceService {
	
	PageBean<MachineMaintenance> findAllMaintenances(int pageIndex, int pageSize);

	MachineMaintenance findMachineMaintenanceByID(Integer iD);

}
