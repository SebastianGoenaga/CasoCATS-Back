package edu.eci.arep.CasoCATS_Back.persistences.repositories;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.eci.arep.CasoCATS_Back.model.*;



@Repository
public interface IAuctionRepository extends DAO<Auction, String> {
	List<User> getBidders(String idSubasta);
	Item getItem(String idSubasta) throws SQLException;
	String saveItem(Item item);
	void Bid(String idsubasta, int newPrice,String user) throws SQLException;
}
