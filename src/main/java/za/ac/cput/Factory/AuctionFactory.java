package za.ac.cput.Factory;

import za.ac.cput.Domain.Auction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AuctionFactory {


    public static Auction createAuction(
            Long auctionID,
            Long productID,
            String userID,
            BigDecimal startingPrice,
            LocalDateTime endTime ) {

        if (auctionID == null || productID == null || userID == null || startingPrice == null || endTime == null) {
            throw new IllegalArgumentException("Invalid auction data");
        }

        return new Auction.Builder()
                .auctionID(auctionID)
                .productID(productID)
                .userId(userID)
                .startingPrice(startingPrice)
                .endTime(endTime)
                .build();
    }
}
