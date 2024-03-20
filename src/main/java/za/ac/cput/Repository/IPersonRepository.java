package za.ac.cput.Repository;
/*
    Admin.java
    Admin Model class
    Author: Logan Kalib Coghill 221534067
    Date: 19 March 2024
*/
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.Person;

public interface IPersonRepository extends JpaRepository<Person, Long> {
}
