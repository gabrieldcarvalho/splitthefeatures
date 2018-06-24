package com.splitthefeatures.cousineapi.repository;

import com.splitthefeatures.cousineapi.domain.Cousine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public interface CousineRepository extends JpaRepository<Cousine, Long> {

    Optional<Cousine> findById(final Long id);

    List<Cousine> findAllByDescriptionContainingIgnoreCase(String description);

}
