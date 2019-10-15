package org.freedom.dbtest;

import org.freedom.dbtest.dao.HUserRepository;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RestController;  
  
 
  
@RestController  
public class HUserController {  
  
  @Autowired  
  private HUserRepository userRepository;  
  
  @GetMapping("/user") 
  public Msg userList() {  
    return Msg.success().add("user", userRepository.findAll());
  }  
  
  @GetMapping("/user/{id}") 
  public Msg findById(@PathVariable Long id) {  
    return Msg.success().add("user", userRepository.findById(id));
  }  
  
}  
