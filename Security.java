package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    private String name;
    private String category;
    private double purchasePrice;
    
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;
    private int quantity;

    public Security() {
        // Default constructor
    }

    public Security(Portfolio portfolio, String name, String category, double purchasePrice, Date purchaseDate, int quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    // Getters and setters for all instance variables
    public Long getSecurityId() {
        return securityId;
    }

    // Omitting setter for securityId as it should not be manually set

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
