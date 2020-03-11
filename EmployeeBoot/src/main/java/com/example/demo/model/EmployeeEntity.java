package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	 
	    @Id
	    @GeneratedValue
	    private Long id;
	     
	    @Column(name="name")
	    private String name;
	    
	    
	    @Column(name="designation")
	    private String designation;
	    
	    @Column(name="location")
	    private String location;
	    
	    @Column(name="time")
	    private String time;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	    
	    
		@Override
	    public String toString() {
	        return "EmployeeEntity [id=" + id + ", name=" + name + 
	                ", designation=" + designation + ", location=" + location   +
	                ",time=" + time   + "]";
	    
}

}