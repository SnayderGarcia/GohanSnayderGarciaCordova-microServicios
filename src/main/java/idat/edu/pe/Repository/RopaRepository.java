package idat.edu.pe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.modelo.Ropa;

@Repository
public interface RopaRepository extends JpaRepository<Ropa, Integer>{

}
