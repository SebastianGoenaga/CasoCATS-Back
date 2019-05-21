package edu.eci.arep.CasoCATS_Back.services;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import edu.eci.arep.CasoCATS_Back.model.Auction;
import edu.eci.arep.CasoCATS_Back.model.Item;
import edu.eci.arep.CasoCATS_Back.persistences.repositories.IAuctionRepository;
import edu.eci.arep.CasoCATS_Back.services.contracts.IAuctionServices;


@Component
public class AuctionServices implements IAuctionServices{
	
	@Autowired
	@Qualifier("AuctionPostgresRepository")
	private IAuctionRepository auctionRepository;
	
	@Override
	public List<Auction> list() throws SQLException {
		return auctionRepository.findAll();
	}

	@Override
	public void create(Auction auction) throws SQLException {
		
		auctionRepository.save(auction);
	}
	
	@Override
	public String createItem(Item item) {
		return auctionRepository.saveItem(item);
	}

	@Override
	public Auction get(String id) {
		return auctionRepository.find(id);
	}

	@Override
	public void deleteAuction(Auction auction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAuction(Auction auction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAuction(Auction auction) {
		// TODO Auto-generated method stub
		
	}

}
