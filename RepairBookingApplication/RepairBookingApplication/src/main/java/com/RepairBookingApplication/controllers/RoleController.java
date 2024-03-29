package com.RepairBookingApplication.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RepairBookingApplication.models.Role;
import com.RepairBookingApplication.models.RoleType;
import com.RepairBookingApplication.services.RoleService;


@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RequestMapping("/api/roles/") //TODO impostare la rotta
public class RoleController {

    private final Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private RoleService roleService;
    
//---------------------------- Get ---------------------------------
    
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public ResponseEntity<List<Role>> getRoleList() {
        
    	List<Role> res = roleService.getAll();
    	
  	  if (res.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else{
            return new ResponseEntity<>(res, HttpStatus.OK);
        }
    }

    @GetMapping("{id}")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public Role getRoleById(@PathVariable("id") Long id) {
        return roleService.getById(id);
    }
    
//---------------------------- Post --------------------------------

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Role saveRole(
            @RequestParam(value="roleType",required=false) RoleType roleType    
    ) {
        Role role = Role.builder()
        		.roleType(roleType)
        		.build();

        logger.info("Save Role in RoleController");
        return roleService.save(role);
    }

//---------------------------- Put ---------------------------------
    
    @PutMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Role updateRole(
            @PathVariable("id") Long id,
            @RequestParam(value="roleType",required=false) RoleType roleType
            ) {

        Role role = roleService.getById(id);
        if(roleType != null) role.setRoleType(roleType);
        
        logger.info("Updated Role successfully");
        roleService.save(role);
        return role;
    }
    
 //---------------------------- Delete -------------------------------    

    @DeleteMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String deleteRoleById(@PathVariable("id") Long id) {
        roleService.deleteById(id);
        return "Role deleted successfully";
    }

}
