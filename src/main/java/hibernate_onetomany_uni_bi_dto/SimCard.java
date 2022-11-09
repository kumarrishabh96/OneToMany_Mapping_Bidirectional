package hibernate_onetomany_uni_bi_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SimCard {
@Id
private int id;
private String serviceProvider;
private int simCardNumber;
@ManyToOne
private Phone phone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getServiceProvider() {
	return serviceProvider;
}
public void setServiceProvider(String serviceProvider) {
	this.serviceProvider = serviceProvider;
}
public int getSimCardNumber() {
	return simCardNumber;
}
public void setSimCardNumber(int simCardNumber) {
	this.simCardNumber = simCardNumber;
}
public Phone getPhone() {
	return phone;
}
public void setPhone(Phone phone) {
	this.phone = phone;
}

}
