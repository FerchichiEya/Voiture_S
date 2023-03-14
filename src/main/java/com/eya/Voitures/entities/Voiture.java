package com.eya.Voitures.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Voiture {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idVoiture;
private String nomVoiture;
private Double prixVoiture;
private Date dateCreation;
private String imageUrl;
private String Detail;




@ManyToOne
private Categorie categorie;

public Voiture() {
super();
}


public Voiture(Long idVoiture, String nomVoiture, Double prixVoiture, Date dateCreation, String imageUrl, String detail,
		Categorie categorie) {
	super();
	this.idVoiture = idVoiture;
	this.nomVoiture = nomVoiture;
	this.prixVoiture = prixVoiture;
	this.dateCreation = dateCreation;
	this.imageUrl = imageUrl;
	Detail = detail;
	this.categorie = categorie;
}




public Long getIdVoiture() {
	return idVoiture;
}


public void setIdVoiture(Long idVoiture) {
	this.idVoiture = idVoiture;
}


public String getNomVoiture() {
	return nomVoiture;
}


public void setNomVoiture(String nomVoiture) {
	this.nomVoiture = nomVoiture;
}


public Double getPrixVoiture() {
	return prixVoiture;
}


public void setPrixVoiture(Double prixVoiture) {
	this.prixVoiture = prixVoiture;
}


public Date getDateCreation() {
	return dateCreation;
}


public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}


public String getImageUrl() {
	return imageUrl;
}


public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}


public String getDetail() {
	return Detail;
}


public void setDetail(String detail) {
	Detail = detail;
}



@Override
public String toString() {
	return "Voiture [idVoiture=" + idVoiture + ", nomVoiture=" + nomVoiture + ", prixVoiture=" + prixVoiture
			+ ", dateCreation=" + dateCreation + ", imageUrl=" + imageUrl + ", Detail=" + Detail + ", categorie="
			+ categorie + "]";
}


public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}
}
