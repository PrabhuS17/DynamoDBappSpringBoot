package io.currency.currencyrate;

import java.math.BigDecimal;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="RateInfo")
public class RateInfo {

  public RateInfo() {
    super();
  }

  @DynamoDBHashKey(attributeName = "source")
  private String source;
  
  @DynamoDBAttribute(attributeName = "destination")
  private String destination;
  
  @DynamoDBAttribute(attributeName = "rate")
  private BigDecimal rate;

  public RateInfo(String source, String destination, BigDecimal rate) {
    super();
    this.source = source;
    this.destination = destination;
    this.rate = rate;
  }

  /**
   * @return the source
   */
  public String getSource() {
    return source;
  }

  /**
   * @param source the source to set
   */
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * @return the destination
   */
  public String getDestination() {
    return destination;
  }

  /**
   * @param destination the destination to set
   */
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * @return the rate
   */
  public BigDecimal getRate() {
    return rate;
  }

  /**
   * @param rate the rate to set
   */
  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }
  
}
