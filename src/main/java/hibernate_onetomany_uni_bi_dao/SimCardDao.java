package hibernate_onetomany_uni_bi_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_onetomany_uni_bi_dto.Phone;
import hibernate_onetomany_uni_bi_dto.SimCard;

public class SimCardDao {
public void saveSimCard(Phone phone) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kumar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(phone);
	List<SimCard> simCard=phone.getSimCard();
	for (SimCard simCard2 : simCard) {
		entityManager.persist(simCard2);
	}
	entityTransaction.commit();
}
}
