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
import com.lob.model.Address;
import com.lob.model.BankAccount;
import com.lob.model.Thumbnail;
import com.lob.model.TrackingEventNormal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
/**
 * Check
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Check {
  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  

  private String id;
  /**
  * Unique identifier prefixed with `chk_`.
  * @return id
  **/
  
  @javax.annotation.Nullable
  
  public String getId() { return id; }

  public void setId (String id) throws IllegalArgumentException {
    if(!id.matches("^chk_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid id provided");
    }

    this.id = id;
  }
  
  

  public static final String SERIALIZED_NAME_TO = "to";

  @SerializedName(SERIALIZED_NAME_TO)
  

  private Address to;
  /**
  * Get to
  * @return to
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public Address getTo() {
      return to;
  }
  
  

  public static final String SERIALIZED_NAME_FROM = "from";

  @SerializedName(SERIALIZED_NAME_FROM)
  

  private Address from;
  /**
  * Get from
  * @return from
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public Address getFrom() {
      return from;
  }
  
  

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
  
  

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;
  public Map<String, String> getMetadata() {     
    if (this.metadata == null) {
      this.metadata = new HashMap<String,String>();
    }
    return this.metadata; 
  }

  public static final String SERIALIZED_NAME_MERGE_VARIABLES = "merge_variables";

  @SerializedName(SERIALIZED_NAME_MERGE_VARIABLES)
  

  private Object mergeVariables;
  /**
  * You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{\"variable_name\": \"Harry\"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `\"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\\`, `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in [our guide to using html and merge variables](https://lob.com/resources/guides/general/using-html-and-merge-variables). Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account) setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.
  * @return mergeVariables
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{\"variable_name\": \"Harry\"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `\"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\\`, `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in [our guide to using html and merge variables](https://lob.com/resources/guides/general/using-html-and-merge-variables). Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account) setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.")
  
  public Object getMergeVariables() {
      return mergeVariables;
  }
  
  

  public static final String SERIALIZED_NAME_SEND_DATE = "send_date";

  @SerializedName(SERIALIZED_NAME_SEND_DATE)
  

  private OffsetDateTime sendDate;
  /**
  * A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC.
  * @return sendDate
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC.")
  
  public OffsetDateTime getSendDate() {
      return sendDate;
  }
  
  

  /**
   * Checks must be sent &#x60;usps_first_class&#x60;
   */
  @JsonAdapter(MailTypeEnum.Adapter.class)
  public enum MailTypeEnum {
    USPS_FIRST_CLASS("usps_first_class");

    private String value;

    MailTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MailTypeEnum fromValue(String value) {
      for (MailTypeEnum b : MailTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MailTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MailTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MailTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MailTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MAIL_TYPE = "mail_type";

  @SerializedName(SERIALIZED_NAME_MAIL_TYPE)
  

  private MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;
  /**
  * Checks must be sent `usps_first_class`
  * @return mailType
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Checks must be sent `usps_first_class`")
  
  public MailTypeEnum getMailType() {
      return mailType;
  }
  
  

  public static final String SERIALIZED_NAME_MEMO = "memo";

  @SerializedName(SERIALIZED_NAME_MEMO)
  

  private String memo;
  /**
  * Text to include on the memo line of the check.
  * @return memo
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Text to include on the memo line of the check.")
  
  public String getMemo() {
      return memo;
  }
  
  

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "check_number";

  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  

  private Integer checkNumber;
  /**
  * An integer that designates the check number. If `check_number` is not provided, checks created from a new `bank_account` will start at `10000` and increment with each check created with the `bank_account`. A provided `check_number` overrides the defaults. Subsequent checks created with the same `bank_account` will increment from the provided check number.
  * minimum: 1
  * maximum: 500000000
  * @return checkNumber
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "An integer that designates the check number. If `check_number` is not provided, checks created from a new `bank_account` will start at `10000` and increment with each check created with the `bank_account`. A provided `check_number` overrides the defaults. Subsequent checks created with the same `bank_account` will increment from the provided check number.")
  
  public Integer getCheckNumber() {
      return checkNumber;
  }
  
  

  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  

  private String message;
  /**
  * Max of 400 characters to be included at the bottom of the check page.
  * @return message
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Max of 400 characters to be included at the bottom of the check page.")
  
  public String getMessage() {
      return message;
  }
  
  

  public static final String SERIALIZED_NAME_AMOUNT = "amount";

  @SerializedName(SERIALIZED_NAME_AMOUNT)
  

  private Float amount;
  /**
  * The payment amount to be sent in US dollars.
  * maximum: 999999.99
  * @return amount
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "The payment amount to be sent in US dollars.")
  
  public Float getAmount() {
      return amount;
  }
  
  

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";

  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  

  private BankAccount bankAccount;
  /**
  * Get bankAccount
  * @return bankAccount
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public BankAccount getBankAccount() {
      return bankAccount;
  }
  
  

  public static final String SERIALIZED_NAME_CHECK_BOTTOM_TEMPLATE_ID = "check_bottom_template_id";

  @SerializedName(SERIALIZED_NAME_CHECK_BOTTOM_TEMPLATE_ID)
  

  private String checkBottomTemplateId;
  /**
  * Unique identifier prefixed with `tmpl_`. ID of a saved [HTML template](#section/HTML-Templates).
  * @return checkBottomTemplateId
  **/
  
  @javax.annotation.Nullable
  
  public String getCheckBottomTemplateId() { return checkBottomTemplateId; }

  public void setCheckBottomTemplateId (String checkBottomTemplateId) throws IllegalArgumentException {
    if(!checkBottomTemplateId.matches("^tmpl_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid check_bottom_template_id provided");
    }

    this.checkBottomTemplateId = checkBottomTemplateId;
  }
  
  

  public static final String SERIALIZED_NAME_ATTACHMENT_TEMPLATE_ID = "attachment_template_id";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TEMPLATE_ID)
  

  private String attachmentTemplateId;
  /**
  * Unique identifier prefixed with `tmpl_`. ID of a saved [HTML template](#section/HTML-Templates).
  * @return attachmentTemplateId
  **/
  
  @javax.annotation.Nullable
  
  public String getAttachmentTemplateId() { return attachmentTemplateId; }

  public void setAttachmentTemplateId (String attachmentTemplateId) throws IllegalArgumentException {
    if(!attachmentTemplateId.matches("^tmpl_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid attachment_template_id provided");
    }

    this.attachmentTemplateId = attachmentTemplateId;
  }
  
  

  public static final String SERIALIZED_NAME_CHECK_BOTTOM_TEMPLATE_VERSION_ID = "check_bottom_template_version_id";

  @SerializedName(SERIALIZED_NAME_CHECK_BOTTOM_TEMPLATE_VERSION_ID)
  

  private String checkBottomTemplateVersionId;
  /**
  * Unique identifier prefixed with `vrsn_`.
  * @return checkBottomTemplateVersionId
  **/
  
  @javax.annotation.Nullable
  
  public String getCheckBottomTemplateVersionId() { return checkBottomTemplateVersionId; }

  public void setCheckBottomTemplateVersionId (String checkBottomTemplateVersionId) throws IllegalArgumentException {
    if(!checkBottomTemplateVersionId.matches("^vrsn_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid check_bottom_template_version_id provided");
    }

    this.checkBottomTemplateVersionId = checkBottomTemplateVersionId;
  }
  
  

  public static final String SERIALIZED_NAME_ATTACHMENT_TEMPLATE_VERSION_ID = "attachment_template_version_id";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TEMPLATE_VERSION_ID)
  

  private String attachmentTemplateVersionId;
  /**
  * Unique identifier prefixed with `vrsn_`.
  * @return attachmentTemplateVersionId
  **/
  
  @javax.annotation.Nullable
  
  public String getAttachmentTemplateVersionId() { return attachmentTemplateVersionId; }

  public void setAttachmentTemplateVersionId (String attachmentTemplateVersionId) throws IllegalArgumentException {
    if(!attachmentTemplateVersionId.matches("^vrsn_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid attachment_template_version_id provided");
    }

    this.attachmentTemplateVersionId = attachmentTemplateVersionId;
  }
  
  

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  

  private String url;
  /**
  * A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.
  * @return url
  **/
  
  @javax.annotation.Nullable
  
  public String getUrl() { return url; }

  public void setUrl (String url) throws IllegalArgumentException {
    if(!url.matches("^https://(lob-assets|lob-assets-staging)\\.com/(letters|postcards|bank-accounts|checks|self-mailers|cards)/[a-z]{3,4}_[a-z0-9]{15,16}(\\.pdf|_thumb_[a-z]+_[0-9]+\\.png)\\?(version=[a-z0-9-]*&)?expires=[0-9]{10}&signature=[a-zA-Z0-9-_]+$")) {
      throw new IllegalArgumentException("Invalid url provided");
    }

    this.url = url;
  }
  
  

  /**
   * Gets or Sets carrier
   */
  @JsonAdapter(CarrierEnum.Adapter.class)
  public enum CarrierEnum {
    USPS("USPS");

    private String value;

    CarrierEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CarrierEnum fromValue(String value) {
      for (CarrierEnum b : CarrierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CarrierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CarrierEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CarrierEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CarrierEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CARRIER = "carrier";

  @SerializedName(SERIALIZED_NAME_CARRIER)
  

  private CarrierEnum carrier = CarrierEnum.USPS;
  /**
  * Get carrier
  * @return carrier
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public CarrierEnum getCarrier() {
      return carrier;
  }
  
  

  public static final String SERIALIZED_NAME_THUMBNAILS = "thumbnails";

  @SerializedName(SERIALIZED_NAME_THUMBNAILS)
  private List<Thumbnail> thumbnails = null;
  public List<Thumbnail> getThumbnails() {     
    if (this.thumbnails == null) {
      this.thumbnails = new ArrayList<Thumbnail>();
    }
    return this.thumbnails; 
  }

  public static final String SERIALIZED_NAME_EXPECTED_DELIVERY_DATE = "expected_delivery_date";

  @SerializedName(SERIALIZED_NAME_EXPECTED_DELIVERY_DATE)
  

  private LocalDate expectedDeliveryDate;
  /**
  * A date in YYYY-MM-DD format of the mailpiece's expected delivery date based on its `send_date`.
  * @return expectedDeliveryDate
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "A date in YYYY-MM-DD format of the mailpiece's expected delivery date based on its `send_date`.")
  
  public LocalDate getExpectedDeliveryDate() {
      return expectedDeliveryDate;
  }
  
  

  public static final String SERIALIZED_NAME_TRACKING_EVENTS = "tracking_events";

  @SerializedName(SERIALIZED_NAME_TRACKING_EVENTS)
  private List<TrackingEventNormal> trackingEvents = null;
  public List<TrackingEventNormal> getTrackingEvents() {     
    if (this.trackingEvents == null) {
      this.trackingEvents = new ArrayList<TrackingEventNormal>();
    }
    return this.trackingEvents; 
  }

  /**
   * Gets or Sets _object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    CHECK("check");

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
  

  private ObjectEnum _object = ObjectEnum.CHECK;
  /**
  * Get _object
  * @return _object
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public ObjectEnum getObject() {
      return _object;
  }
  
  

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";

  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  

  private OffsetDateTime dateCreated;
  /**
  * A timestamp in ISO 8601 format of the date the resource was created.
  * @return dateCreated
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "A timestamp in ISO 8601 format of the date the resource was created.")
  
  public OffsetDateTime getDateCreated() {
      return dateCreated;
  }
  
  

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";

  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  

  private OffsetDateTime dateModified;
  /**
  * A timestamp in ISO 8601 format of the date the resource was last modified.
  * @return dateModified
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "A timestamp in ISO 8601 format of the date the resource was last modified.")
  
  public OffsetDateTime getDateModified() {
      return dateModified;
  }
  
  

  public static final String SERIALIZED_NAME_DELETED = "deleted";

  @SerializedName(SERIALIZED_NAME_DELETED)
  

  private Boolean deleted;
  /**
  * Only returned if the resource has been successfully deleted.
  * @return deleted
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Only returned if the resource has been successfully deleted.")
  
  public Boolean getDeleted() {
      return deleted;
  }
  
  


  /*
  public Check id(String id) {
    
    this.id = id;
    return this;
  }
  */





  /*
  public Check to(Address to) {
    
    this.to = to;
    return this;
  }
  */


  public void setTo(Address to) {
    this.to = to;
  }



  /*
  public Check from(Address from) {
    
    this.from = from;
    return this;
  }
  */


  public void setFrom(Address from) {
    this.from = from;
  }



  /*
  public Check description(String description) {
    
    this.description = description;
    return this;
  }
  */


  public void setDescription(String description) {
    this.description = description;
  }



  /*
  public Check metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }
  */

  public Check putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String,String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }



  /*
  public Check mergeVariables(Object mergeVariables) {
    
    this.mergeVariables = mergeVariables;
    return this;
  }
  */


  public void setMergeVariables(Object mergeVariables) {
    this.mergeVariables = mergeVariables;
  }



  /*
  public Check sendDate(OffsetDateTime sendDate) {
    
    this.sendDate = sendDate;
    return this;
  }
  */


  public void setSendDate(OffsetDateTime sendDate) {
    this.sendDate = sendDate;
  }



  /*
  public Check mailType(MailTypeEnum mailType) {
    
    this.mailType = mailType;
    return this;
  }
  */


  public void setMailType(MailTypeEnum mailType) {
    this.mailType = mailType;
  }



  /*
  public Check memo(String memo) {
    
    this.memo = memo;
    return this;
  }
  */


  public void setMemo(String memo) {
    this.memo = memo;
  }



  /*
  public Check checkNumber(Integer checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }
  */


  public void setCheckNumber(Integer checkNumber) {
    this.checkNumber = checkNumber;
  }



  /*
  public Check message(String message) {
    
    this.message = message;
    return this;
  }
  */


  public void setMessage(String message) {
    this.message = message;
  }



  /*
  public Check amount(Float amount) {
    
    this.amount = amount;
    return this;
  }
  */


  public void setAmount(Float amount) {
    this.amount = amount;
  }



  /*
  public Check bankAccount(BankAccount bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }
  */


  public void setBankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }



  /*
  public Check checkBottomTemplateId(String checkBottomTemplateId) {
    
    this.checkBottomTemplateId = checkBottomTemplateId;
    return this;
  }
  */





  /*
  public Check attachmentTemplateId(String attachmentTemplateId) {
    
    this.attachmentTemplateId = attachmentTemplateId;
    return this;
  }
  */





  /*
  public Check checkBottomTemplateVersionId(String checkBottomTemplateVersionId) {
    
    this.checkBottomTemplateVersionId = checkBottomTemplateVersionId;
    return this;
  }
  */





  /*
  public Check attachmentTemplateVersionId(String attachmentTemplateVersionId) {
    
    this.attachmentTemplateVersionId = attachmentTemplateVersionId;
    return this;
  }
  */





  /*
  public Check url(String url) {
    
    this.url = url;
    return this;
  }
  */





  /*
  public Check carrier(CarrierEnum carrier) {
    
    this.carrier = carrier;
    return this;
  }
  */


  public void setCarrier(CarrierEnum carrier) {
    this.carrier = carrier;
  }



  /*
  public Check thumbnails(List<Thumbnail> thumbnails) {
    
    this.thumbnails = thumbnails;
    return this;
  }
  */

  public Check addThumbnailsItem(Thumbnail thumbnailsItem) {
    if (this.thumbnails == null) {
      this.thumbnails = new ArrayList<Thumbnail>();
    }
    this.thumbnails.add(thumbnailsItem);
    return this;
  }


  public void setThumbnails(List<Thumbnail> thumbnails) {
    this.thumbnails = thumbnails;
  }



  /*
  public Check expectedDeliveryDate(LocalDate expectedDeliveryDate) {
    
    this.expectedDeliveryDate = expectedDeliveryDate;
    return this;
  }
  */


  public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
    this.expectedDeliveryDate = expectedDeliveryDate;
  }



  /*
  public Check trackingEvents(List<TrackingEventNormal> trackingEvents) {
    
    this.trackingEvents = trackingEvents;
    return this;
  }
  */

  public Check addTrackingEventsItem(TrackingEventNormal trackingEventsItem) {
    if (this.trackingEvents == null) {
      this.trackingEvents = new ArrayList<TrackingEventNormal>();
    }
    this.trackingEvents.add(trackingEventsItem);
    return this;
  }


  public void setTrackingEvents(List<TrackingEventNormal> trackingEvents) {
    this.trackingEvents = trackingEvents;
  }



  /*
  public Check _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }
  */


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }



  /*
  public Check dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }
  */


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }



  /*
  public Check dateModified(OffsetDateTime dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }
  */


  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }



  /*
  public Check deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }
  */


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Check check = (Check) o;
    return Objects.equals(this.id, check.id) &&
        Objects.equals(this.to, check.to) &&
        Objects.equals(this.from, check.from) &&
        Objects.equals(this.description, check.description) &&
        Objects.equals(this.metadata, check.metadata) &&
        Objects.equals(this.mergeVariables, check.mergeVariables) &&
        Objects.equals(this.sendDate, check.sendDate) &&
        Objects.equals(this.mailType, check.mailType) &&
        Objects.equals(this.memo, check.memo) &&
        Objects.equals(this.checkNumber, check.checkNumber) &&
        Objects.equals(this.message, check.message) &&
        Objects.equals(this.amount, check.amount) &&
        Objects.equals(this.bankAccount, check.bankAccount) &&
        Objects.equals(this.checkBottomTemplateId, check.checkBottomTemplateId) &&
        Objects.equals(this.attachmentTemplateId, check.attachmentTemplateId) &&
        Objects.equals(this.checkBottomTemplateVersionId, check.checkBottomTemplateVersionId) &&
        Objects.equals(this.attachmentTemplateVersionId, check.attachmentTemplateVersionId) &&
        Objects.equals(this.url, check.url) &&
        Objects.equals(this.carrier, check.carrier) &&
        Objects.equals(this.thumbnails, check.thumbnails) &&
        Objects.equals(this.expectedDeliveryDate, check.expectedDeliveryDate) &&
        Objects.equals(this.trackingEvents, check.trackingEvents) &&
        Objects.equals(this._object, check._object) &&
        Objects.equals(this.dateCreated, check.dateCreated) &&
        Objects.equals(this.dateModified, check.dateModified) &&
        Objects.equals(this.deleted, check.deleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, to, from, description, metadata, mergeVariables, sendDate, mailType, memo, checkNumber, message, amount, bankAccount, checkBottomTemplateId, attachmentTemplateId, checkBottomTemplateVersionId, attachmentTemplateVersionId, url, carrier, thumbnails, expectedDeliveryDate, trackingEvents, _object, dateCreated, dateModified, deleted);
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
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mergeVariables: ").append(toIndentedString(mergeVariables)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    checkBottomTemplateId: ").append(toIndentedString(checkBottomTemplateId)).append("\n");
    sb.append("    attachmentTemplateId: ").append(toIndentedString(attachmentTemplateId)).append("\n");
    sb.append("    checkBottomTemplateVersionId: ").append(toIndentedString(checkBottomTemplateVersionId)).append("\n");
    sb.append("    attachmentTemplateVersionId: ").append(toIndentedString(attachmentTemplateVersionId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    expectedDeliveryDate: ").append(toIndentedString(expectedDeliveryDate)).append("\n");
    sb.append("    trackingEvents: ").append(toIndentedString(trackingEvents)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

