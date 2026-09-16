package za.ac.cput.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Bid;
import za.ac.cput.Repository.IBidRepository;
import za.ac.cput.Service.BidService;

import java.util.ArrayList;
import java.util.List;

@Service
public class BidServiceImpl implements BidService {

    private final IBidRepository bidRepository;

    @Autowired
    public BidServiceImpl(IBidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    @Override
    public Bid create(Bid bid) {
        return bidRepository.create(bid);
    }

    @Override
    public Bid read(String bidId) {
        return bidRepository.read(bidId);
    }

    @Override
    public Bid update(Bid bid) {
        return bidRepository.update(bid);
    }

    @Override
    public boolean delete(String bidId) {
        return bidRepository.delete(bidId);
    }

    @Override
    public List<Bid> getAllBids() {
        return bidRepository.getAll();
    }

    @Override
    public List<Bid> getAllBidsByAuctionId(String auctionId) {

        List<Bid> bids = bidRepository.getAll();
        List<Bid> result = new ArrayList<>();

        for (Bid bid : bids) {
            if (bid.getAuctionId().equals(auctionId)) {
                result.add(bid);
            }
        }

        return result;
    }

    @Override
    public List<Bid> getAllBidsByUserId(String userId) {

        List<Bid> bids = bidRepository.getAll();
        List<Bid> result = new ArrayList<>();

        for (Bid bid : bids) {
            if (bid.getUserId().equals(userId)) {
                result.add(bid);
            }
        }

        return result;
    }
}