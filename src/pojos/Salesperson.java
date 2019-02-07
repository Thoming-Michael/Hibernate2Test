package pojos;
// Generated Feb 2, 2019 9:01:49 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Salesperson generated by hbm2java
 */
public class Salesperson  implements java.io.Serializable {


     private String salesPersonKey;
     private String lastName;
     private String firstName;
     private Date hireDate;
     private BigDecimal salary;
     private Set purchases = new HashSet(0);

    public Salesperson() {
    }

	
    public Salesperson(String salesPersonKey, String lastName, String firstName, Date hireDate, BigDecimal salary) {
        this.salesPersonKey = salesPersonKey;
        this.lastName = lastName;
        this.firstName = firstName;
        this.hireDate = hireDate;
        this.salary = salary;
    }
    public Salesperson(String salesPersonKey, String lastName, String firstName, Date hireDate, BigDecimal salary, Set purchases) {
       this.salesPersonKey = salesPersonKey;
       this.lastName = lastName;
       this.firstName = firstName;
       this.hireDate = hireDate;
       this.salary = salary;
       this.purchases = purchases;
    }
   
    public String getSalesPersonKey() {
        return this.salesPersonKey;
    }
    
    public void setSalesPersonKey(String salesPersonKey) {
        this.salesPersonKey = salesPersonKey;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public BigDecimal getSalary() {
        return this.salary;
    }
    
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public Set getPurchases() {
        return this.purchases;
    }
    
    public void setPurchases(Set purchases) {
        this.purchases = purchases;
    }

    @Override
    public String toString() {
        return "Salesperson{" + "salesPersonKey=" + salesPersonKey + ", lastName=" + lastName + ", firstName=" + firstName + ", hireDate=" + hireDate + ", salary=" + salary + ", purchases=" + purchases + '}';
    }

}


