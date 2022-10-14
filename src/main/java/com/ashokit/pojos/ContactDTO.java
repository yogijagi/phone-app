package com.ashokit.pojos;

import java.util.Objects;
public class ContactDTO {
	private Integer contactId;
	private String contactName;
	private String contactEmail;
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
		ContactDTO other = (ContactDTO) obj;
		return Objects.equals(contactEmail, other.contactEmail) && Objects.equals(contactId, other.contactId)
				&& Objects.equals(contactName, other.contactName) && Objects.equals(contactNumber, other.contactNumber);
	}
	@Override
	public String toString() {
		return "ContactDTO [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail=" + contactEmail
				+ ", contactNumber=" + contactNumber + "]";
	}
	
	
}
