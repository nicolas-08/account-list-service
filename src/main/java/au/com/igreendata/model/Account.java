package au.com.igreendata.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "account")
public class Account {

    private long id;
    private String accNumber;
    private String accName;
    private String accType;
    private Date accBalanceDate;
    private String accCurrency;
    private BigDecimal accOpenBalance;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "acc_num", nullable = true, length = 10)
    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    @Column(name = "acc_name", nullable = true, length = 10)
    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    @Column(name = "acc_type", nullable = true, length = 10)
    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "acc_balance_date", nullable = true, length = 10)
    public Date getAccBalanceDate() {
        return accBalanceDate;
    }

    public void setAccBalanceDate(Date accBalanceDate) {
        this.accBalanceDate = accBalanceDate;
    }

    @Column(name = "acc_currency", nullable = true, length = 10)
    public String getAccCurrency() {
        return accCurrency;
    }

    public void setAccCurrency(String accCurrency) {
        this.accCurrency = accCurrency;
    }

    @Column(name = "acc_open_balance", nullable = true, precision = 12)
    public BigDecimal getAccOpenBalance() {
        return accOpenBalance;
    }

    public void setAccOpenBalance(BigDecimal accOpenBalance) {
        this.accOpenBalance = accOpenBalance;
    }
}
