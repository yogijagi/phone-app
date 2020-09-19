package com.ashokit.service;
import java.util.List;
import com.ashokit.entity.ContactDtlsEntity;
import com.ashokit.pojos.ContactDTO;
public interface ContactService {
public boolean saveContact(ContactDTO c);
public List<ContactDTO> getAllContact();
public ContactDTO getContactById(Integer cid);
public boolean updateContact(ContactDTO c);
public boolean deleteContact(Integer cid);
}
