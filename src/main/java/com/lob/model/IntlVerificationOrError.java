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
import com.lob.model.BulkError;
import com.lob.model.IntlComponents;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.io.File;

/**
 * A model used to represent an entry in a result list where the entry can either be a intl_verification or an Error. The SDK will perform necessary casting into the correct corresponding type. 
 */
@ApiModel(description = "A model used to represent an entry in a result list where the entry can either be a intl_verification or an Error. The SDK will perform necessary casting into the correct corresponding type. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IntlVerificationOrError {
  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  

  private String id;
  /**
  * Unique identifier prefixed with `intl_ver_`.
  * @return id
  **/
  
  @javax.annotation.Nullable
  
  public String getId() { return id; }

  public void setId (String id) throws IllegalArgumentException {
    if(!id.matches("^intl_ver_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid id provided");
    }

    this.id = id;
  }
  
  

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";

  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  

  private String recipient;
  /**
  * The intended recipient, typically a person's or firm's name.
  * @return recipient
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "The intended recipient, typically a person's or firm's name.")
  
  public String getRecipient() {
      return recipient;
  }
  
  

  public static final String SERIALIZED_NAME_PRIMARY_LINE = "primary_line";

  @SerializedName(SERIALIZED_NAME_PRIMARY_LINE)
  

  private String primaryLine;
  /**
  * Get primaryLine
  * @return primaryLine
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public String getPrimaryLine() {
      return primaryLine;
  }
  
  

  public static final String SERIALIZED_NAME_SECONDARY_LINE = "secondary_line";

  @SerializedName(SERIALIZED_NAME_SECONDARY_LINE)
  

  private String secondaryLine;
  /**
  * The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long. 
  * @return secondaryLine
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long. ")
  
  public String getSecondaryLine() {
      return secondaryLine;
  }
  
  

  public static final String SERIALIZED_NAME_LAST_LINE = "last_line";

  @SerializedName(SERIALIZED_NAME_LAST_LINE)
  

  private String lastLine;
  /**
  * Get lastLine
  * @return lastLine
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public String getLastLine() {
      return lastLine;
  }
  
  

  public static final String SERIALIZED_NAME_COUNTRY = "country";

  @SerializedName(SERIALIZED_NAME_COUNTRY)
  

  private String country;
  /**
  * Get country
  * @return country
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public String getCountry() {
      return country;
  }
  
  

  /**
   * Gets or Sets coverage
   */
  @JsonAdapter(CoverageEnum.Adapter.class)
  public enum CoverageEnum {
    SUBBUILDING("SUBBUILDING"),
    
    HOUSENUMBER_BUILDING("HOUSENUMBER/BUILDING"),
    
    STREET("STREET"),
    
    LOCALITY("LOCALITY"),
    
    SPARSE("SPARSE");

    private String value;

    CoverageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CoverageEnum fromValue(String value) {
      for (CoverageEnum b : CoverageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CoverageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CoverageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CoverageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CoverageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COVERAGE = "coverage";

  @SerializedName(SERIALIZED_NAME_COVERAGE)
  

  private CoverageEnum coverage;
  /**
  * Get coverage
  * @return coverage
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public CoverageEnum getCoverage() {
      return coverage;
  }
  
  

  /**
   * Gets or Sets deliverability
   */
  @JsonAdapter(DeliverabilityEnum.Adapter.class)
  public enum DeliverabilityEnum {
    DELIVERABLE("deliverable"),
    
    DELIVERABLE_MISSING_INFO("deliverable_missing_info"),
    
    UNDELIVERABLE("undeliverable"),
    
    NO_MATCH("no_match");

    private String value;

    DeliverabilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliverabilityEnum fromValue(String value) {
      for (DeliverabilityEnum b : DeliverabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeliverabilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliverabilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliverabilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliverabilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELIVERABILITY = "deliverability";

  @SerializedName(SERIALIZED_NAME_DELIVERABILITY)
  

  private DeliverabilityEnum deliverability;
  /**
  * Get deliverability
  * @return deliverability
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public DeliverabilityEnum getDeliverability() {
      return deliverability;
  }
  
  

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    LV4("LV4"),
    
    LV3("LV3"),
    
    LV2("LV2"),
    
    LV1("LV1"),
    
    LF4("LF4"),
    
    LF3("LF3"),
    
    LF2("LF2"),
    
    LF1("LF1"),
    
    LM4("LM4"),
    
    LM3("LM3"),
    
    LM2("LM2"),
    
    LU1("LU1");

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
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public StatusEnum getStatus() {
      return status;
  }
  
  

  public static final String SERIALIZED_NAME_COMPONENTS = "components";

  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  

  private IntlComponents components;
  /**
  * Get components
  * @return components
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public IntlComponents getComponents() {
      return components;
  }
  
  

  /**
   * Gets or Sets _object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    INTL_VERIFICATION("intl_verification");

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
  

  private ObjectEnum _object = ObjectEnum.INTL_VERIFICATION;
  /**
  * Get _object
  * @return _object
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public ObjectEnum getObject() {
      return _object;
  }
  
  

  public static final String SERIALIZED_NAME_ERROR = "error";

  @SerializedName(SERIALIZED_NAME_ERROR)
  

  private BulkError error;
  /**
  * Get error
  * @return error
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public BulkError getError() {
      return error;
  }
  
  


  /*
  public IntlVerificationOrError id(String id) {
    
    this.id = id;
    return this;
  }
  */





  /*
  public IntlVerificationOrError recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }
  */


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }





  /*
  public IntlVerificationOrError primaryLine(String primaryLine) {
    
    this.primaryLine = primaryLine;
    return this;
  }
  */


  public void setPrimaryLine(String primaryLine) {
    this.primaryLine = primaryLine;
  }





  /*
  public IntlVerificationOrError secondaryLine(String secondaryLine) {
    
    this.secondaryLine = secondaryLine;
    return this;
  }
  */


  public void setSecondaryLine(String secondaryLine) {
    this.secondaryLine = secondaryLine;
  }





  /*
  public IntlVerificationOrError lastLine(String lastLine) {
    
    this.lastLine = lastLine;
    return this;
  }
  */


  public void setLastLine(String lastLine) {
    this.lastLine = lastLine;
  }





  /*
  public IntlVerificationOrError country(String country) {
    
    this.country = country;
    return this;
  }
  */


  public void setCountry(String country) {
    this.country = country;
  }





  /*
  public IntlVerificationOrError coverage(CoverageEnum coverage) {
    
    this.coverage = coverage;
    return this;
  }
  */


  public void setCoverage(CoverageEnum coverage) {
    this.coverage = coverage;
  }





  /*
  public IntlVerificationOrError deliverability(DeliverabilityEnum deliverability) {
    
    this.deliverability = deliverability;
    return this;
  }
  */


  public void setDeliverability(DeliverabilityEnum deliverability) {
    this.deliverability = deliverability;
  }





  /*
  public IntlVerificationOrError status(StatusEnum status) {
    
    this.status = status;
    return this;
  }
  */


  public void setStatus(StatusEnum status) {
    this.status = status;
  }





  /*
  public IntlVerificationOrError components(IntlComponents components) {
    
    this.components = components;
    return this;
  }
  */


  public void setComponents(IntlComponents components) {
    this.components = components;
  }





  /*
  public IntlVerificationOrError _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }
  */


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }





  /*
  public IntlVerificationOrError error(BulkError error) {
    
    this.error = error;
    return this;
  }
  */


  public void setError(BulkError error) {
    this.error = error;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntlVerificationOrError intlVerificationOrError = (IntlVerificationOrError) o;
    return Objects.equals(this.id, intlVerificationOrError.id) &&
        Objects.equals(this.recipient, intlVerificationOrError.recipient) &&
        Objects.equals(this.primaryLine, intlVerificationOrError.primaryLine) &&
        Objects.equals(this.secondaryLine, intlVerificationOrError.secondaryLine) &&
        Objects.equals(this.lastLine, intlVerificationOrError.lastLine) &&
        Objects.equals(this.country, intlVerificationOrError.country) &&
        Objects.equals(this.coverage, intlVerificationOrError.coverage) &&
        Objects.equals(this.deliverability, intlVerificationOrError.deliverability) &&
        Objects.equals(this.status, intlVerificationOrError.status) &&
        Objects.equals(this.components, intlVerificationOrError.components) &&
        Objects.equals(this._object, intlVerificationOrError._object) &&
        Objects.equals(this.error, intlVerificationOrError.error);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recipient, primaryLine, secondaryLine, lastLine, country, coverage, deliverability, status, components, _object, error);
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    primaryLine: ").append(toIndentedString(primaryLine)).append("\n");
    sb.append("    secondaryLine: ").append(toIndentedString(secondaryLine)).append("\n");
    sb.append("    lastLine: ").append(toIndentedString(lastLine)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    deliverability: ").append(toIndentedString(deliverability)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

