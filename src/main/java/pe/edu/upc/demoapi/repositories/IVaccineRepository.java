package pe.edu.upc.demoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoapi.entities.Vaccine;


import java.time.LocalDate;
import java.util.List;

@Repository
public interface IVaccineRepository extends JpaRepository<Vaccine, Integer> {
    @Query("from Vaccine v where v.dateVaccine =:fecha")
    List<Vaccine> findBydateVaccine(@Param("fecha") LocalDate fecha);
}
