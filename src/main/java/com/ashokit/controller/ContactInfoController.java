package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.pojos.ContactDTO;
import com.ashokit.service.ContactServiceImpl;

@Controller
public class ContactInfoController {
	@Autowired
	private ContactServiceImpl contactServiceImpl;

	@GetMapping(value = { "/", "loadForm" })
	public String loadContactForm(Model model) {
		ContactDTO contactdto = new ContactDTO();
		model.addAttribute("contact", contactdto);
		return "index";

	}

	@PostMapping("/saveContact")
	public String handleSubmit(@ModelAttribute("contact") ContactDTO dto, RedirectAttributes r) {
		boolean saveContact = contactServiceImpl.saveContact(dto);
		if (saveContact) {
			if (dto.getContactId() != null) {
				r.addFlashAttribute("succMsg", "cotact updated");
			} else {
				r.addFlashAttribute("errorMsg", "faild to update contact");
			}
		} else {
			r.addFlashAttribute("errorMsg", "failed to save contact");
		}
		return "redirect:/loadForm";

	}

	@GetMapping("/viewcontacts")
	public String handleViewCtcsHyperlink(Model model,RedirectAttributes r) {
		List<ContactDTO> allContact = contactServiceImpl.getAllContact();
		model.addAttribute("contacts", allContact);
		r.addFlashAttribute("viewcontact","view All contacts list");
		return "viewcontacts";

	}

}
