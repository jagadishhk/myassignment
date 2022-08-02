package gfg;

import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

 

@Data
@RequiredArgsConstructor
@Entity(name = "user")
public class UserEntity {
	
	@Id String user;
    String username;
    String password;

}
