package com.crud.h2.dto;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
	@JoinColumn(name= "role")
	private UserRoles role;
     
    @Column(nullable = false, length = 50, unique = true)
    private String name;
 
    public Role() { }
     
    public Role(String name) {
        this.name = name;
    }
     public Object getName() {
		return null;
	} 
    public Role(Integer id) {
        this.id = id;
    }
    

	public UserRoles getUserRoles() {
		return role;
	}

	public void setUserRoles(UserRoles roles) {
		this.role = roles;
	}
 
    @Override
    public String toString() {
        return this.name;
    }

	
     
    // getters and setters are not shown for brevity   
}
