package au.com.igreendata.repository;

import au.com.igreendata.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long>{
    @Query("select m from Account m where m.id= :id")
    List<Account> findByParms(@Param("id") String id);
}
