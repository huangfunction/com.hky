package wuyefeiguanli;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hky.wuyefeiguanli.model.House;
import com.hky.wuyefeiguanli.service.HouseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/config/wuyefeiguanliBeans.xml"})
public class HouseServiceTest {
	@Autowired
	HouseService houseService;
	
	@Test
	public void insertHouseTest(){
		House house=new House();
		house.setBuildingNo(new BigDecimal(1));
		house.setFloorNo(new BigDecimal(1));
		house.setVillage("广厦新苑");
		house.setRoomNo(new BigDecimal(101));
		house.setFloorSpace(new BigDecimal(77.5));
		BigDecimal houseId=houseService.insertHouse(house);
		System.out.println(houseId);
	}
}
