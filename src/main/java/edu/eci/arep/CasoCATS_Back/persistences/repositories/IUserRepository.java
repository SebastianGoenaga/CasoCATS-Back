package edu.eci.arep.CasoCATS_Back.persistences.repositories;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import edu.eci.arep.CasoCATS_Back.model.*;

@Repository
public interface IUserRepository extends DAO {
	Usuario getUserByEmail(String email) throws SQLException;

	Usuario getUserById(long idUser) throws SQLException;
	void updateJairitos(String email,int value) throws SQLException;
	void updateCongelados(String email,int value) throws SQLException;

}
