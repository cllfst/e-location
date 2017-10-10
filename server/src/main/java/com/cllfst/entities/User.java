package com.cllfst.entities;

import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;


/**
 * Description of the file User.java <br>
 *
 * @author ahmed ksentini
 * <p>
 * It represents the user of the application <br>
 * <p>
 * This notice should not be removed <br>
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="id_user")
    private Long idUser;
    
    @Column(name="username")
    private String username;

    @Column(name="name")
    private String name;

    
    @Column(name="email")
    private String email;
    
    @Column(name="password")
    private String password;

    public User() {
        super();
    }

    public User(String username, String name, String email, String password) {
        super();
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    

    public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void encodePassword(PasswordEncoder passwordEncoder) {
        this.password = passwordEncoder.encode(this.password);
    }
}
