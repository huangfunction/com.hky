package com.hky.wuyefeiguanli.service;

import java.math.BigDecimal;
import java.util.List;

import com.hky.wuyefeiguanli.model.DealList;
import com.hky.wuyefeiguanli.model.DealListExample;
import com.hky.wuyefeiguanli.model.DealListWithBLOBs;
import com.hky.wuyefeiguanli.model.House;
import com.hky.wuyefeiguanli.model.HouseExample;
import com.hky.wuyefeiguanli.model.HouseLinkman;
import com.hky.wuyefeiguanli.model.HouseLinkmanExample;
import com.hky.wuyefeiguanli.model.HousePayment;

public interface HouseService {
	/**
	 * 新增房屋信息
	 * @param house
	 * @return
	 */
	public BigDecimal insertHouse(House house);
	/**
	 * 更新房屋信息
	 * @param house
	 * @return
	 */
	public void updateHouse(House house);
	/**
	 * 删除房屋信息
	 * @param house
	 * @return
	 */
	public void deleteHouse(House house);
	/**
	 * 查询房屋信息
	 * @param house
	 * @return
	 */
	public List<House> selectByHouseExample(HouseExample houseExample);
	/**
	 * 新增房屋联系人
	 * @param house
	 * @return
	 */
	public void insertHouseLinkman(HouseLinkman houseLinkman);
	/**
	 * 更新房屋联系人
	 * @param house
	 * @return
	 */
	public void updateHouseLinkman(HouseLinkman houseLinkman);
	/**
	 * 删除房屋联系人
	 * @param house
	 * @return
	 */
	public void deleteHouseLinkman(HouseLinkman houseLinkman);
	/**
	 * 查询房屋联系人
	 * @param house
	 * @return
	 */
	public List<HouseLinkman> selectByHouseLinkmanExample(HouseLinkmanExample houseLinkmanExample);
	/**
	 * 生成物业费信息
	 * @param houseId
	 * @param yearMonthStart
	 * @param yearMonthEnd
	 */
	public void generateHousePayment(BigDecimal[] houseId,String yearMonthStart,String yearMonthEnd);
	/**
	 * 删除物业费信息
	 * @param houseId
	 * @param yearMonthStart
	 * @param yearMonthEnd
	 */
	public void deleteHousePayment(BigDecimal[] houseId,String yearMonthStart,String yearMonthEnd);
	/**
	 * 查询物业费信息
	 * @param houseId
	 * @param yearMonthStart
	 * @param yearMonthEnd
	 */
	public List<HousePayment> selectHousePayment(BigDecimal[] houseId,String yearMonthStart,String yearMonthEnd);
	/**
	 * 查看物业费计算规则
	 * @param houseId
	 * @param yearMonthStart
	 * @param yearMonthEnd
	 */
	public String checkGenerateHousePayment();
	/**
	 * 新增订单
	 * @param houseId
	 * @param yearMonthStart
	 * @param yearMonthEnd
	 */
	public void insertDealList(DealList dealList);
	/**
	 * 查询订单
	 * @param houseId
	 * @param yearMonthStart
	 * @param yearMonthEnd
	 */
	public List<DealList> selectByDealListExample(DealListExample dealListExample);
	/**
	 * 完成订单
	 * @param houseId
	 * @param yearMonthStart
	 * @param yearMonthEnd
	 */
	public void finishDealList(BigDecimal dealId,DealListWithBLOBs dealListWithBLOBs);
}
