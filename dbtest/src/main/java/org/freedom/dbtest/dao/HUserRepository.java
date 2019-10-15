package org.freedom.dbtest.dao;

import org.freedom.dbtest.entity.HUser;
import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;  
  
 
  
@Repository  
public interface HUserRepository extends JpaRepository<HUser, Long> {  
	 
}  
