package com.situ.xuexiao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.situ.xuexiao.pojo.Machine;

public interface MachineDao {
	
	public List<Machine> findAllMachine(@Param(value="index")int index, @Param(value="pageSize")int pageSize);

	public int findMachineCount();

	public List<Machine> findMachines(int workShopID);

	public List<Machine> findModelNumber(int ID);

}
