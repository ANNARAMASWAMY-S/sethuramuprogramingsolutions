import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository

public interface CountryRepository extends JpaRepository<Country,String>
{
	List<Country> findByNameContaining(String keyword);

    
    List<Country> findAllByOrderByNameAsc();
    List<Country> findAllByOrderByNameDesc();

    
    List<Country> findByNameStartingWith(String prefix);

   
    List<Country> findByCodeGreaterThan(String code);
    List<Country> findByCodeLessThan(String code);

   
    
	

}
