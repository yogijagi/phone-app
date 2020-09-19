package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.entity.ContactDtlsEntity;
import com.ashokit.pojos.ContactDTO;
import com.ashokit.service.ContactServiceImpl;

@Controller	
public class ViewContactController {
	@Autowired
	private ContactServiceImpl  contactServiceImpl ;
	@GetMapping("/editcontact")
	public String editContact(@RequestParam("cid")Integer contactId,Model model) {
		ContactDTO contact = contactServiceImpl.getContactById(contactId);
		model.addAttribute("contact",contact);
		return "index";

	}
     @GetMapping("/deletecontact")
	public String deleteContact(@RequestParam("cid")Integer cid,RedirectAttributes r) {
    	 contactServiceImpl.deleteContact(cid);
    	 r.addFlashAttribute("deleteMsg","Contact Deleted Successfully");
    	 r.addFlashAttribute("viewcontact","Updated Contacts List Here");
		return "redirect:viewcontacts";

	}

	public String handleAddCtcsHyperlink(Model model) {
		return null;

	}

	
	
}
