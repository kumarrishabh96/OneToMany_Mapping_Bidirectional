package hibernate_onetomany_uni_bi_dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone {
@Id
private int id;
private String brand;
private int price;
private int yearOfManufacturing;
@OneToMany
private List<SimCard> simCard=new ArrayList<SimCard>();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getYearOfManufacturing() {
	return yearOfManufacturing;
}
public void setYearOfManufacturing(int yearOfManufacturing) {
	this.yearOfManufacturing = yearOfManufacturing;
}
public List<SimCard> getSimCard() {
	return simCard;
}
public void setSimCard(List<SimCard> simCard) {
	this.simCard = simCard;
}

}
