package SaloonBE.example.SaloonBE.Entity;

import jakarta.persistence.*;

@Entity //Represent a table stored in a database
public class Header {
 @Id  // This Indicates The Primary Key In The Table
 @Column
 @GeneratedValue(strategy = GenerationType.AUTO) //It Increment The ID One By One
 private Long id;
 private String logo;
 private String Slogan;
 private String contact_email;
 private String contact_phone;
 private String address;
 private String social_media_link;
 private String last_updated_date;

 public Header(Long id, String logo, String slogan, String contact_email, String contact_phone, String address, String social_media_link, String last_updated_date) {
  this.id = id;
  this.logo = logo;
  Slogan = slogan;
  this.contact_email = contact_email;
  this.contact_phone = contact_phone;
  this.address = address;
  this.social_media_link = social_media_link;
  this.last_updated_date = last_updated_date;
 }

 // setters updates the value of the variable whereas getter reads the value of the variable
 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getLogo() {
  return logo;
 }

 public void setLogo(String logo) {
  this.logo = logo;
 }

 public String getSlogan() {
  return Slogan;
 }

 public void setSlogan(String slogan) {
  Slogan = slogan;
 }

 public String getContact_email() {
  return contact_email;
 }

 public void setContact_email(String contact_email) {
  this.contact_email = contact_email;
 }

 public String getContact_phone() {
  return contact_phone;
 }

 public void setContact_phone(String contact_phone) {
  this.contact_phone = contact_phone;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getSocial_media_link() {
  return social_media_link;
 }

 public void setSocial_media_link(String social_media_link) {
  this.social_media_link = social_media_link;
 }

 public String getLast_updated_date() {
  return last_updated_date;
 }

 public void setLast_updated_date(String last_updated_date) {
  this.last_updated_date = last_updated_date;
 }
}
