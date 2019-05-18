package pe.edu.upc.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.demo.entity.Atencion;

@Repository
public interface AtencionRepository extends JpaRepository<Atencion, Integer>{

}
