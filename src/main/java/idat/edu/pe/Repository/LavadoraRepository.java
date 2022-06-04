package idat.edu.pe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.modelo.Lavadora;

@Repository
public interface LavadoraRepository extends JpaRepository<Lavadora, Integer>{

}
