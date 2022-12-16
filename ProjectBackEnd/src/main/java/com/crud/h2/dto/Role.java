package com.crud.h2.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "roles")
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String name;
    
    @OneToMany(mappedBy= "id_roles", cascade=CascadeType.ALL,  orphanRemoval = true)
	private List<UserRoles> userrole;
     
  
    
    
 
    public Role() { }
     
    
    public Role(Integer id,String name, List<UserRoles> userroles) {
        this.id = id;
        this.name=name;
        this.userrole=userroles;
    }
    

    public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<UserRoles> getUserRoles() {
		return userrole;
	}
 

	public void setUserRoles(List<UserRoles> userrole) {
		this.userrole = userrole;
	}


	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}
 
   

	
}
