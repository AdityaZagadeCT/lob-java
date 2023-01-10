/*
 * Lob
 * The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. <p> Looking for our [previous documentation](https://lob.github.io/legacy-docs/)? 
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: lob-openapi@lob.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lob.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lob.model.BankTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.io.File;

/**
 * BankAccountWritable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BankAccountWritable {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  

  private String description;
  /**
  * An internal description that identifies this resource. Must be no longer than 255 characters. 
  * @return description
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "An internal description that identifies this resource. Must be no longer than 255 characters. ")
  
  public String getDescription() {
      return description;
  }
  
  

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";

  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  

  private String routingNumber;
  /**
  * Must be a [valid US routing number](https://www.frbservices.org/index.html).
  * @return routingNumber
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Must be a [valid US routing number](https://www.frbservices.org/index.html).")
  
  public String getRoutingNumber() {
      return routingNumber;
  }
  
  

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";

  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  

  private String accountNumber;
  /**
  * Get accountNumber
  * @return accountNumber
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public String getAccountNumber() {
      return accountNumber;
  }
  
  

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";

  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  

  private BankTypeEnum accountType;
  /**
  * Get accountType
  * @return accountType
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public BankTypeEnum getAccountType() {
      return accountType;
  }
  
  

  public static final String SERIALIZED_NAME_SIGNATORY = "signatory";

  @SerializedName(SERIALIZED_NAME_SIGNATORY)
  

  private String signatory;
  /**
  * The signatory associated with your account. This name will be printed on checks created with this bank account. If you prefer to use a custom signature image on your checks instead, please create your bank account from the [Dashboard](https://dashboard.lob.com/#/login).
  * @return signatory
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The signatory associated with your account. This name will be printed on checks created with this bank account. If you prefer to use a custom signature image on your checks instead, please create your bank account from the [Dashboard](https://dashboard.lob.com/#/login).")
  
  public String getSignatory() {
      return signatory;
  }
  
  

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;
  public Map<String, String> getMetadata() {
    if (this.metadata == null) {
      this.metadata = new HashMap<String,String>();
    }
    return this.metadata;
  }


  /*
  public BankAccountWritable description(String description) {
    
    this.description = description;
    return this;
  }
  */


  public void setDescription(String description) {
    this.description = description;
  }





  /*
  public BankAccountWritable routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }
  */


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }





  /*
  public BankAccountWritable accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }
  */


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }





  /*
  public BankAccountWritable accountType(BankTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }
  */


  public void setAccountType(BankTypeEnum accountType) {
    this.accountType = accountType;
  }





  /*
  public BankAccountWritable signatory(String signatory) {
    
    this.signatory = signatory;
    return this;
  }
  */


  public void setSignatory(String signatory) {
    this.signatory = signatory;
  }





  /*
  public BankAccountWritable metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }
  */

  public BankAccountWritable putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String,String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountWritable bankAccountWritable = (BankAccountWritable) o;
    return Objects.equals(this.description, bankAccountWritable.description) &&
        Objects.equals(this.routingNumber, bankAccountWritable.routingNumber) &&
        Objects.equals(this.accountNumber, bankAccountWritable.accountNumber) &&
        Objects.equals(this.accountType, bankAccountWritable.accountType) &&
        Objects.equals(this.signatory, bankAccountWritable.signatory) &&
        Objects.equals(this.metadata, bankAccountWritable.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, routingNumber, accountNumber, accountType, signatory, metadata);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    signatory: ").append(toIndentedString(signatory)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

