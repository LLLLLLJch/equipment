package com.situ.xuexiao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.situ.xuexiao.pojo.MachineMaintenance;

public interface MaintenanceDao {
	
	public List<MachineMaintenance> findAllMaintenance(@Param(value="index")int index, @Param(value="pageSize")int pageSize);

	public int findMaintenanceCount();

	public MachineMaintenance findMachineMaintenanceByID(Integer ID);

}
