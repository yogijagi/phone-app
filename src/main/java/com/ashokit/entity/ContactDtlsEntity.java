package com.ashokit.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="contact_dtls")
public class ContactDtlsEntity {
	@Id
	@GeneratedValue
	@Column(name="contact_id")
private Integer contactId;
	@Column(name="contact_name")
private String contactName;
	@Column(name="contact_email")
private String contactEmail;
	@Column(name="contact_num")
	private Long contactNumber;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contactEmail, contactId, contactName, contactNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactDtlsEntity other = (ContactDtlsEntity) obj;
		return Objects.equals(contactEmail, other.contactEmail) && Objects.equals(contactId, other.contactId)
				&& Objects.equals(contactName, other.contactName) && Objects.equals(contactNumber, other.contactNumber);
	}
	@Override
	public String toString() {
		return "ContactDtlsEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail="
				+ contactEmail + ", contactNumber=" + contactNumber + "]";
	}
	
}
