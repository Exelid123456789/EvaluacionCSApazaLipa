
package agenda_modelo;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@Entity
public class Person implements Serializable {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "contacto_id", nullable = false)
	private  Integer postalCode;
        @Column(length = 20)
        private  String firstName;
        @Column(length = 20)
	private  String lastName;
        @Column(length = 20)
	private  String street;
        @Column(length = 20)
	private  String city;
        @Temporal(TemporalType.TIMESTAMP)
	private  Date birthday;

	/**
	 * Default constructor.
	 */
        
	public Person() {
            this(null,null,null,null,null,null);
	}

    public Person(Integer postalCode, String firstName, String lastName, String street, String city, Date birthday) {
        this.postalCode = postalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.birthday = birthday;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.postalCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return Objects.equals(this.postalCode, other.postalCode);
    }

    @Override
    public String toString() {
        return "Person{" + "postalCode=" + postalCode + '}';
    }

    
    /**
     * Constructor with some initial data.
     *
     * @param firstName
     * @param lastName
     */
        
        
}
