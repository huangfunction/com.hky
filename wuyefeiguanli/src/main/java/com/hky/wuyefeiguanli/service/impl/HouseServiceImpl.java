package com.hky.wuyefeiguanli.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hky.wuyefeiguanli.dao.HouseMapper;
import com.hky.wuyefeiguanli.dao.SeqMapper;
import com.hky.wuyefeiguanli.model.DealList;
import com.hky.wuyefeiguanli.model.DealListExample;
import com.hky.wuyefeiguanli.model.DealListWithBLOBs;
import com.hky.wuyefeiguanli.model.House;
import com.hky.wuyefeiguanli.model.HouseExample;
import com.hky.wuyefeiguanli.model.HouseLinkman;
import com.hky.wuyefeiguanli.model.HouseLinkmanExample;
import com.hky.wuyefeiguanli.model.HousePayment;
import com.hky.wuyefeiguanli.service.HouseService;

@Component
public class HouseServiceImpl implements HouseService {
	
	@Autowired
	HouseMapper houseMapper;
	
	@Autowired
	SeqMapper seqMapper;

	public BigDecimal insertHouse(House house) {
		try{
			BigDecimal houseId=seqMapper.nextSeqOfHouseId();
			house.setHouseId(houseId);
			houseMapper.insertSelective(house);
			return houseId;
		}catch(org.springframework.dao.DuplicateKeyException e){
			throw new RuntimeException("该房子已存在，请勿重复添加");
		}
	}

	public void updateHouse(House house) {
		// TODO Auto-generated method stub

	}

	public void deleteHouse(House house) {
		// TODO Auto-generated method stub

	}

	public List<House> selectByHouseExample(HouseExample houseExample) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertHouseLinkman(HouseLinkman houseLinkman) {
		// TODO Auto-generated method stub

	}

	public void updateHouseLinkman(HouseLinkman houseLinkman) {
		// TODO Auto-generated method stub

	}

	public void deleteHouseLinkman(HouseLinkman houseLinkman) {
		// TODO Auto-generated method stub

	}

	public List<HouseLinkman> selectByHouseLinkmanExample(HouseLinkmanExample houseLinkmanExample) {
		// TODO Auto-generated method stub
		return null;
	}

	public void generateHousePayment(BigDecimal[] houseId, String yearMonthStart, String yearMonthEnd) {
		// TODO Auto-generated method stub

	}

	public void deleteHousePayment(BigDecimal[] houseId, String yearMonthStart, String yearMonthEnd) {
		// TODO Auto-generated method stub

	}

	public List<HousePayment> selectHousePayment(BigDecimal[] houseId, String yearMonthStart, String yearMonthEnd) {
		// TODO Auto-generated method stub
		return null;
	}

	public String checkGenerateHousePayment() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertDealList(DealList dealList) {
		// TODO Auto-generated method stub

	}

	public List<DealList> selectByDealListExample(DealListExample dealListExample) {
		// TODO Auto-generated method stub
		return null;
	}

	public void finishDealList(BigDecimal dealId, DealListWithBLOBs dealListWithBLOBs) {
		// TODO Auto-generated method stub

	}

}
