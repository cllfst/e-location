package com.cllfst.dao;


import com.cllfst.entities.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Description of the file AnnonceRepository.java <br>
 *
 * @author ahmed ksentini
 */
@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, String> {

   Annonce findAnnonceByIdAd(Long id);
   void removeAnnonceByIdAd(Long id);

   /*@Modifying
   @Query(value="UPDATE `annonce` SET `titre_ad`=?1, `region`=2?, `city`=?3, `description`=?4, `prix`=?5 WHERE id_ad=?6 ")
   int modify(String conname,String conbody,int columninfoId,int contentId);
*/

}
