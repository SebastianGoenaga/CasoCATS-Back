package edu.eci.arep.CasoCATS_Back.persistences.repositories;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.eci.arep.CasoCATS_Back.model.*;

@Repository
public interface IUserRepository extends DAO<Usuario, Long>{
	Usuario getUserByCedula(long cedula) throws SQLException; 

	Usuario getUserById(long idUser) throws SQLException;
	
	List<Credito> getCreditosUserCedula(long cedula);
	
	

}
