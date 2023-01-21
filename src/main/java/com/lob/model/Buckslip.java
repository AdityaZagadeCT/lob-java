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
import com.lob.model.BuckslipOrder;
import com.lob.model.Thumbnail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
/**
 * Buckslip
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Buckslip {
  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  

  private String id;
  /**
  * Unique identifier prefixed with `bck_`.
  * @return id
  **/
  
  @javax.annotation.Nonnull
  
  public String getId() { return id; }

  public void setId (String id) throws IllegalArgumentException {
    if(!id.matches("^bck_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid id provided");
    }

    this.id = id;
  }
  
  

  public static final String SERIALIZED_NAME_AUTO_REORDER = "auto_reorder";

  @SerializedName(SERIALIZED_NAME_AUTO_REORDER)
  

  private Boolean autoReorder = false;
  /**
  * True if the buckslips should be auto-reordered.
  * @return autoReorder
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "True if the buckslips should be auto-reordered.")
  
  public Boolean getAutoReorder() {
      return autoReorder;
  }
  
  

  public static final String SERIALIZED_NAME_REORDER_QUANTITY = "reorder_quantity";

  @SerializedName(SERIALIZED_NAME_REORDER_QUANTITY)
  

  private Integer reorderQuantity;
  /**
  * The number of buckslips to be reordered.
  * @return reorderQuantity
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(required = true, value = "The number of buckslips to be reordered.")
  
  public Integer getReorderQuantity() {
      return reorderQuantity;
  }
  
  

  public static final String SERIALIZED_NAME_THRESHOLD_AMOUNT = "threshold_amount";

  @SerializedName(SERIALIZED_NAME_THRESHOLD_AMOUNT)
  

  private Integer thresholdAmount = 0;
  /**
  * The threshold amount of the buckslip
  * @return thresholdAmount
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The threshold amount of the buckslip")
  
  public Integer getThresholdAmount() {
      return thresholdAmount;
  }
  
  

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  

  private URI url;
  /**
  * The signed link for the buckslip.
  * @return url
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The signed link for the buckslip.")
  
  public URI getUrl() {
      return url;
  }
  
  

  public static final String SERIALIZED_NAME_RAW_URL = "raw_url";

  @SerializedName(SERIALIZED_NAME_RAW_URL)
  

  private URI rawUrl;
  /**
  * The raw URL of the buckslip.
  * @return rawUrl
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The raw URL of the buckslip.")
  
  public URI getRawUrl() {
      return rawUrl;
  }
  
  

  public static final String SERIALIZED_NAME_FRONT_ORIGINAL_URL = "front_original_url";

  @SerializedName(SERIALIZED_NAME_FRONT_ORIGINAL_URL)
  

  private URI frontOriginalUrl;
  /**
  * The original URL of the front template.
  * @return frontOriginalUrl
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The original URL of the front template.")
  
  public URI getFrontOriginalUrl() {
      return frontOriginalUrl;
  }
  
  

  public static final String SERIALIZED_NAME_BACK_ORIGINAL_URL = "back_original_url";

  @SerializedName(SERIALIZED_NAME_BACK_ORIGINAL_URL)
  

  private URI backOriginalUrl;
  /**
  * The original URL of the back template.
  * @return backOriginalUrl
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The original URL of the back template.")
  
  public URI getBackOriginalUrl() {
      return backOriginalUrl;
  }
  
  

  public static final String SERIALIZED_NAME_THUMBNAILS = "thumbnails";

  @SerializedName(SERIALIZED_NAME_THUMBNAILS)
  private List<Thumbnail> thumbnails = new ArrayList<>();

  public static final String SERIALIZED_NAME_AVAILABLE_QUANTITY = "available_quantity";

  @SerializedName(SERIALIZED_NAME_AVAILABLE_QUANTITY)
  

  private BigDecimal availableQuantity = new BigDecimal("0");
  /**
  * The available quantity of buckslips.
  * @return availableQuantity
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The available quantity of buckslips.")
  
  public BigDecimal getAvailableQuantity() {
      return availableQuantity;
  }
  
  

  public static final String SERIALIZED_NAME_ALLOCATED_QUANTITY = "allocated_quantity";

  @SerializedName(SERIALIZED_NAME_ALLOCATED_QUANTITY)
  

  private BigDecimal allocatedQuantity = new BigDecimal("0");
  /**
  * The allocated quantity of buckslips.
  * @return allocatedQuantity
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The allocated quantity of buckslips.")
  
  public BigDecimal getAllocatedQuantity() {
      return allocatedQuantity;
  }
  
  

  public static final String SERIALIZED_NAME_ONHAND_QUANTITY = "onhand_quantity";

  @SerializedName(SERIALIZED_NAME_ONHAND_QUANTITY)
  

  private BigDecimal onhandQuantity = new BigDecimal("0");
  /**
  * The onhand quantity of buckslips.
  * @return onhandQuantity
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The onhand quantity of buckslips.")
  
  public BigDecimal getOnhandQuantity() {
      return onhandQuantity;
  }
  
  

  public static final String SERIALIZED_NAME_PENDING_QUANTITY = "pending_quantity";

  @SerializedName(SERIALIZED_NAME_PENDING_QUANTITY)
  

  private BigDecimal pendingQuantity = new BigDecimal("0");
  /**
  * The pending quantity of buckslips.
  * @return pendingQuantity
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The pending quantity of buckslips.")
  
  public BigDecimal getPendingQuantity() {
      return pendingQuantity;
  }
  
  

  public static final String SERIALIZED_NAME_PROJECTED_QUANTITY = "projected_quantity";

  @SerializedName(SERIALIZED_NAME_PROJECTED_QUANTITY)
  

  private BigDecimal projectedQuantity = new BigDecimal("0");
  /**
  * The sum of pending and onhand quantities of buckslips.
  * @return projectedQuantity
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The sum of pending and onhand quantities of buckslips.")
  
  public BigDecimal getProjectedQuantity() {
      return projectedQuantity;
  }
  
  

  public static final String SERIALIZED_NAME_BUCKSLIP_ORDERS = "buckslip_orders";

  @SerializedName(SERIALIZED_NAME_BUCKSLIP_ORDERS)
  private List<BuckslipOrder> buckslipOrders = new ArrayList<>();

  /**
   * Gets or Sets stock
   */
  @JsonAdapter(StockEnum.Adapter.class)
  public enum StockEnum {
    TEXT("text"),
    
    COVER("cover");

    private String value;

    StockEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StockEnum fromValue(String value) {
      for (StockEnum b : StockEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StockEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StockEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StockEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StockEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STOCK = "stock";

  @SerializedName(SERIALIZED_NAME_STOCK)
  

  private StockEnum stock;
  /**
  * Get stock
  * @return stock
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public StockEnum getStock() {
      return stock;
  }
  
  

  /**
   * Gets or Sets weight
   */
  @JsonAdapter(WeightEnum.Adapter.class)
  public enum WeightEnum {
    _80_("80#");

    private String value;

    WeightEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WeightEnum fromValue(String value) {
      for (WeightEnum b : WeightEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WeightEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WeightEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WeightEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WeightEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WEIGHT = "weight";

  @SerializedName(SERIALIZED_NAME_WEIGHT)
  

  private WeightEnum weight;
  /**
  * Get weight
  * @return weight
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public WeightEnum getWeight() {
      return weight;
  }
  
  

  /**
   * Gets or Sets finish
   */
  @JsonAdapter(FinishEnum.Adapter.class)
  public enum FinishEnum {
    GLOSS("gloss"),
    
    MATTE("matte");

    private String value;

    FinishEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FinishEnum fromValue(String value) {
      for (FinishEnum b : FinishEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FinishEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FinishEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FinishEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FinishEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FINISH = "finish";

  @SerializedName(SERIALIZED_NAME_FINISH)
  

  private FinishEnum finish;
  /**
  * Get finish
  * @return finish
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public FinishEnum getFinish() {
      return finish;
  }
  
  

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROCESSED("processed"),
    
    RENDERED("rendered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  

  private StatusEnum status;
  /**
  * Get status
  * @return status
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public StatusEnum getStatus() {
      return status;
  }
  
  

  /**
   * object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    BUCKSLIP("buckslip");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";

  @SerializedName(SERIALIZED_NAME_OBJECT)
  

  private ObjectEnum _object = ObjectEnum.BUCKSLIP;
  /**
  * object
  * @return _object
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "object")
  
  public ObjectEnum getObject() {
      return _object;
  }
  
  

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  

  private String description;
  /**
  * Description of the buckslip.
  * @return description
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(required = true, value = "Description of the buckslip.")
  
  public String getDescription() {
      return description;
  }
  
  

  /**
   * The size of the buckslip
   */
  @JsonAdapter(SizeEnum.Adapter.class)
  public enum SizeEnum {
    _8_75X3_75("8.75x3.75");

    private String value;

    SizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SizeEnum fromValue(String value) {
      for (SizeEnum b : SizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SizeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SizeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SIZE = "size";

  @SerializedName(SERIALIZED_NAME_SIZE)
  

  private SizeEnum size = SizeEnum._8_75X3_75;
  /**
  * The size of the buckslip
  * @return size
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "The size of the buckslip")
  
  public SizeEnum getSize() {
      return size;
  }
  
  


  /*
  public Buckslip id(String id) {
    
    this.id = id;
    return this;
  }
  */





  /*
  public Buckslip autoReorder(Boolean autoReorder) {
    
    this.autoReorder = autoReorder;
    return this;
  }
  */


  public void setAutoReorder(Boolean autoReorder) {
    this.autoReorder = autoReorder;
  }



  /*
  public Buckslip reorderQuantity(Integer reorderQuantity) {
    
    this.reorderQuantity = reorderQuantity;
    return this;
  }
  */


  public void setReorderQuantity(Integer reorderQuantity) {
    this.reorderQuantity = reorderQuantity;
  }



  /*
  public Buckslip thresholdAmount(Integer thresholdAmount) {
    
    this.thresholdAmount = thresholdAmount;
    return this;
  }
  */


  public void setThresholdAmount(Integer thresholdAmount) {
    this.thresholdAmount = thresholdAmount;
  }



  /*
  public Buckslip url(URI url) {
    
    this.url = url;
    return this;
  }
  */


  public void setUrl(URI url) {
    this.url = url;
  }



  /*
  public Buckslip rawUrl(URI rawUrl) {
    
    this.rawUrl = rawUrl;
    return this;
  }
  */


  public void setRawUrl(URI rawUrl) {
    this.rawUrl = rawUrl;
  }



  /*
  public Buckslip frontOriginalUrl(URI frontOriginalUrl) {
    
    this.frontOriginalUrl = frontOriginalUrl;
    return this;
  }
  */


  public void setFrontOriginalUrl(URI frontOriginalUrl) {
    this.frontOriginalUrl = frontOriginalUrl;
  }



  /*
  public Buckslip backOriginalUrl(URI backOriginalUrl) {
    
    this.backOriginalUrl = backOriginalUrl;
    return this;
  }
  */


  public void setBackOriginalUrl(URI backOriginalUrl) {
    this.backOriginalUrl = backOriginalUrl;
  }



  /*
  public Buckslip thumbnails(List<Thumbnail> thumbnails) {
    
    this.thumbnails = thumbnails;
    return this;
  }
  */

  public Buckslip addThumbnailsItem(Thumbnail thumbnailsItem) {
    this.thumbnails.add(thumbnailsItem);
    return this;
  }


  public void setThumbnails(List<Thumbnail> thumbnails) {
    this.thumbnails = thumbnails;
  }



  /*
  public Buckslip availableQuantity(BigDecimal availableQuantity) {
    
    this.availableQuantity = availableQuantity;
    return this;
  }
  */


  public void setAvailableQuantity(BigDecimal availableQuantity) {
    this.availableQuantity = availableQuantity;
  }



  /*
  public Buckslip allocatedQuantity(BigDecimal allocatedQuantity) {
    
    this.allocatedQuantity = allocatedQuantity;
    return this;
  }
  */


  public void setAllocatedQuantity(BigDecimal allocatedQuantity) {
    this.allocatedQuantity = allocatedQuantity;
  }



  /*
  public Buckslip onhandQuantity(BigDecimal onhandQuantity) {
    
    this.onhandQuantity = onhandQuantity;
    return this;
  }
  */


  public void setOnhandQuantity(BigDecimal onhandQuantity) {
    this.onhandQuantity = onhandQuantity;
  }



  /*
  public Buckslip pendingQuantity(BigDecimal pendingQuantity) {
    
    this.pendingQuantity = pendingQuantity;
    return this;
  }
  */


  public void setPendingQuantity(BigDecimal pendingQuantity) {
    this.pendingQuantity = pendingQuantity;
  }



  /*
  public Buckslip projectedQuantity(BigDecimal projectedQuantity) {
    
    this.projectedQuantity = projectedQuantity;
    return this;
  }
  */


  public void setProjectedQuantity(BigDecimal projectedQuantity) {
    this.projectedQuantity = projectedQuantity;
  }



  /*
  public Buckslip buckslipOrders(List<BuckslipOrder> buckslipOrders) {
    
    this.buckslipOrders = buckslipOrders;
    return this;
  }
  */

  public Buckslip addBuckslipOrdersItem(BuckslipOrder buckslipOrdersItem) {
    this.buckslipOrders.add(buckslipOrdersItem);
    return this;
  }


  public void setBuckslipOrders(List<BuckslipOrder> buckslipOrders) {
    this.buckslipOrders = buckslipOrders;
  }



  /*
  public Buckslip stock(StockEnum stock) {
    
    this.stock = stock;
    return this;
  }
  */


  public void setStock(StockEnum stock) {
    this.stock = stock;
  }



  /*
  public Buckslip weight(WeightEnum weight) {
    
    this.weight = weight;
    return this;
  }
  */


  public void setWeight(WeightEnum weight) {
    this.weight = weight;
  }



  /*
  public Buckslip finish(FinishEnum finish) {
    
    this.finish = finish;
    return this;
  }
  */


  public void setFinish(FinishEnum finish) {
    this.finish = finish;
  }



  /*
  public Buckslip status(StatusEnum status) {
    
    this.status = status;
    return this;
  }
  */


  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  /*
  public Buckslip _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }
  */


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }



  /*
  public Buckslip description(String description) {
    
    this.description = description;
    return this;
  }
  */


  public void setDescription(String description) {
    this.description = description;
  }



  /*
  public Buckslip size(SizeEnum size) {
    
    this.size = size;
    return this;
  }
  */


  public void setSize(SizeEnum size) {
    this.size = size;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Buckslip buckslip = (Buckslip) o;
    return Objects.equals(this.id, buckslip.id) &&
        Objects.equals(this.autoReorder, buckslip.autoReorder) &&
        Objects.equals(this.reorderQuantity, buckslip.reorderQuantity) &&
        Objects.equals(this.thresholdAmount, buckslip.thresholdAmount) &&
        Objects.equals(this.url, buckslip.url) &&
        Objects.equals(this.rawUrl, buckslip.rawUrl) &&
        Objects.equals(this.frontOriginalUrl, buckslip.frontOriginalUrl) &&
        Objects.equals(this.backOriginalUrl, buckslip.backOriginalUrl) &&
        Objects.equals(this.thumbnails, buckslip.thumbnails) &&
        Objects.equals(this.availableQuantity, buckslip.availableQuantity) &&
        Objects.equals(this.allocatedQuantity, buckslip.allocatedQuantity) &&
        Objects.equals(this.onhandQuantity, buckslip.onhandQuantity) &&
        Objects.equals(this.pendingQuantity, buckslip.pendingQuantity) &&
        Objects.equals(this.projectedQuantity, buckslip.projectedQuantity) &&
        Objects.equals(this.buckslipOrders, buckslip.buckslipOrders) &&
        Objects.equals(this.stock, buckslip.stock) &&
        Objects.equals(this.weight, buckslip.weight) &&
        Objects.equals(this.finish, buckslip.finish) &&
        Objects.equals(this.status, buckslip.status) &&
        Objects.equals(this._object, buckslip._object) &&
        Objects.equals(this.description, buckslip.description) &&
        Objects.equals(this.size, buckslip.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, autoReorder, reorderQuantity, thresholdAmount, url, rawUrl, frontOriginalUrl, backOriginalUrl, thumbnails, availableQuantity, allocatedQuantity, onhandQuantity, pendingQuantity, projectedQuantity, buckslipOrders, stock, weight, finish, status, _object, description, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    autoReorder: ").append(toIndentedString(autoReorder)).append("\n");
    sb.append("    reorderQuantity: ").append(toIndentedString(reorderQuantity)).append("\n");
    sb.append("    thresholdAmount: ").append(toIndentedString(thresholdAmount)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    rawUrl: ").append(toIndentedString(rawUrl)).append("\n");
    sb.append("    frontOriginalUrl: ").append(toIndentedString(frontOriginalUrl)).append("\n");
    sb.append("    backOriginalUrl: ").append(toIndentedString(backOriginalUrl)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
    sb.append("    allocatedQuantity: ").append(toIndentedString(allocatedQuantity)).append("\n");
    sb.append("    onhandQuantity: ").append(toIndentedString(onhandQuantity)).append("\n");
    sb.append("    pendingQuantity: ").append(toIndentedString(pendingQuantity)).append("\n");
    sb.append("    projectedQuantity: ").append(toIndentedString(projectedQuantity)).append("\n");
    sb.append("    buckslipOrders: ").append(toIndentedString(buckslipOrders)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("}");
    return sb.toString();
  }

    public Map<String, Object> toMap() {
      Map<String, Object> localMap = new HashMap<String, Object>();
      localMap.put("id", id);
      localMap.put("auto_reorder", autoReorder);
      localMap.put("reorder_quantity", reorderQuantity);
      localMap.put("threshold_amount", thresholdAmount);
      localMap.put("url", url);
      localMap.put("raw_url", rawUrl);
      localMap.put("front_original_url", frontOriginalUrl);
      localMap.put("back_original_url", backOriginalUrl);
      localMap.put("thumbnails", thumbnails);
      localMap.put("available_quantity", availableQuantity);
      localMap.put("allocated_quantity", allocatedQuantity);
      localMap.put("onhand_quantity", onhandQuantity);
      localMap.put("pending_quantity", pendingQuantity);
      localMap.put("projected_quantity", projectedQuantity);
      localMap.put("buckslip_orders", buckslipOrders);
      localMap.put("stock", stock);
      localMap.put("weight", weight);
      localMap.put("finish", finish);
      localMap.put("status", status);
      localMap.put("object", _object);
      localMap.put("description", description);
      localMap.put("size", size);
      return localMap;
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

