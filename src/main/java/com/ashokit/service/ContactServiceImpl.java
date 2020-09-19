package com.ashokit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.ContactDtlsEntity;
import com.ashokit.pojos.ContactDTO;
import com.ashokit.repository.ContactDtlsRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactDtlsRepository contactDtlsRepository;

	@Override
	public boolean saveContact(ContactDTO c) {
		ContactDtlsEntity entity = new ContactDtlsEntity();
		BeanUtils.copyProperties(c, entity);
		return contactDtlsRepository.save(entity) != null;
	}

	@Override
	public List<ContactDTO> getAllContact() {
		List<ContactDTO> ContactsList = new ArrayList<ContactDTO>();
		
		List<ContactDtlsEntity> findAll = contactDtlsRepository.findAll();
		findAll.forEach(entity->{
			ContactDTO c=new ContactDTO();
			BeanUtils.copyProperties(entity,c);
			ContactsList.add(c);
		});
		return ContactsList;
	}

	@Override
	public ContactDTO getContactById(Integer cid) {
		Optional<ContactDtlsEntity> findById = contactDtlsRepository.findById(cid);
		if(findById.isPresent()) {
			ContactDTO contact=new ContactDTO();
		BeanUtils.copyProperties(findById.get(),contact);
		return contact;
		}
		return null;
	}

	@Override
	public boolean updateContact(ContactDTO c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		contactDtlsRepository.deleteById(cid);
		return false;
	}

}
