package com.xfactor.openlibrary.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Admin;
import com.xfactor.openlibrary.repositories.AdminRepository;
@RestController

@RequestMapping("admin")
public class AdminController {
  private AdminRepository adminRepository;
  
    public AdminController(AdminRepository adminRepository) {
    this.adminRepository = adminRepository;
}

    @PostMapping("/saveAdmin")
    public Admin saveBook(@RequestBody Admin admin) {
        adminRepository.save(admin);
        return admin;
    }  
    
    @GetMapping("/getAll")
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }
    @GetMapping("/getAdminById/{id}")
    public Admin findById (@PathVariable Long id) {
        Optional<Admin> optionalOfAdmin = adminRepository.findById(id);
        if (optionalOfAdmin.isPresent()){
            return optionalOfAdmin.get();
        }
        return null;
    }

    @GetMapping("/getAdminByName/{name}")
    public List<Admin> findByName (@PathVariable String name) {
        List<Admin> listOfAdminByName = adminRepository.findByName(name);
        return listOfAdminByName;
    }

    @GetMapping("/getAdminByUsername/{username}")
    public List<Admin> findByUsername (@PathVariable String username) {
        List<Admin> listOfAdminByUsername = adminRepository.findByUsername(username);
        return listOfAdminByUsername;
    }

    @GetMapping("/getAdminByPassword/{password}")
    public List<Admin> findByPassword (@PathVariable String password) {
        List<Admin> listOfAdminByPassword = adminRepository.findByPassword(password);
        return listOfAdminByPassword;
    }

    @PutMapping("/updateAdmin")
    public Admin updatedAdmin (@RequestBody Admin admin) {
        if (admin.getId() != null) {
            Admin updatedAdmin = adminRepository.save(admin);
            return updatedAdmin;
        }
        return null;
    }

    @DeleteMapping("deleteAdmin/{id}")
    public void deleteAdmin (@PathVariable Long id) {
        adminRepository.deleteById(id);
    }
}
