package com.ebix.ifbieapp.model;
// Generated Mar 23, 2018 11:11:12 AM by Hibernate Tools 4.3.2-SNAPSHOT


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Employee1Id generated by hbm2java
 */
@Embeddable
public class Employee1Id  implements java.io.Serializable {


     private Integer empId;
     private String empName;
     private Serializable empDate;

    public Employee1Id() {
    }

    public Employee1Id(Integer empId, String empName, Serializable empDate) {
       this.empId = empId;
       this.empName = empName;
       this.empDate = empDate;
    }
   


    @Column(name="empId")
    public Integer getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }


    @Column(name="empName", length=50)
    public String getEmpName() {
        return this.empName;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }


    @Column(name="empDate")
    public Serializable getEmpDate() {
        return this.empDate;
    }
    
    public void setEmpDate(Serializable empDate) {
        this.empDate = empDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Employee1Id) ) return false;
		 Employee1Id castOther = ( Employee1Id ) other; 
         
		 return ( (this.getEmpId()==castOther.getEmpId()) || ( this.getEmpId()!=null && castOther.getEmpId()!=null && this.getEmpId().equals(castOther.getEmpId()) ) )
 && ( (this.getEmpName()==castOther.getEmpName()) || ( this.getEmpName()!=null && castOther.getEmpName()!=null && this.getEmpName().equals(castOther.getEmpName()) ) )
 && ( (this.getEmpDate()==castOther.getEmpDate()) || ( this.getEmpDate()!=null && castOther.getEmpDate()!=null && this.getEmpDate().equals(castOther.getEmpDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEmpId() == null ? 0 : this.getEmpId().hashCode() );
         result = 37 * result + ( getEmpName() == null ? 0 : this.getEmpName().hashCode() );
         result = 37 * result + ( getEmpDate() == null ? 0 : this.getEmpDate().hashCode() );
         return result;
   }   


}


