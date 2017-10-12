package com.cllfst.dao;


import com.cllfst.entities.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description of the file AnnonceRepository.java <br>
 *
 * @author ahmed ksentini
 */
@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, String> {

}
