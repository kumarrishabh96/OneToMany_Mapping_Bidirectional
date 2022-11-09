package hibernate_onetomany_uni_bi_controller;

import java.util.ArrayList;
import java.util.List;

import hibernate_onetomany_uni_bi_dao.SimCardDao;
import hibernate_onetomany_uni_bi_dto.Phone;
import hibernate_onetomany_uni_bi_dto.SimCard;

public class SimCardDriver {
public static void main(String[] args) {
		
		Phone phone = new Phone();
		phone.setId(1);
		phone.setBrand("Realme");
		phone.setPrice(18000);
		phone.setYearOfManufacturing(2021);
		
		SimCard simCard1=new SimCard();
		simCard1.setId(1);
		simCard1.setServiceProvider("Airtel");
		simCard1.setSimCardNumber(810211);
		simCard1.setPhone(phone);
		
		SimCard simCard2=new SimCard();
		simCard2.setId(2);
		simCard2.setServiceProvider("Jio");
		simCard2.setSimCardNumber(799115);
		simCard2.setPhone(phone);
		
		List<SimCard> simCardl= new ArrayList<SimCard>();
		simCardl.add(simCard1);
		simCardl.add(simCard1);
		
		phone.setSimCard(simCardl);
		
		SimCardDao dao = new SimCardDao();
		dao.saveSimCard(phone);
	}
}