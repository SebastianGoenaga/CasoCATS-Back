package edu.eci.arep.CasoCATS_Back.services.contracts;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.arep.CasoCATS_Back.model.Auction;
import edu.eci.arep.CasoCATS_Back.model.Item;

@Service
public interface IAuctionServices {
	List<Auction> list() throws SQLException;
    void create(Auction auction) throws SQLException;
    String createItem(Item item);
    Auction get(String id);
    void deleteAuction(Auction auction);
    void removeAuction(Auction auction);
	void updateAuction(Auction auction);
}
