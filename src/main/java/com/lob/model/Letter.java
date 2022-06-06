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
import com.lob.model.LetterCustomEnvelope;
import com.lob.model.MailType;
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
 * Letter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Letter {
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
  
  

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  

  private String id;
  /**
  * Unique identifier prefixed with `ltr_`.
  * @return id
  **/
  
  @javax.annotation.Nullable
  
  public String getId() { return id; }

  public void setId (String id) throws IllegalArgumentException {
    if(!id.matches("^ltr_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid id provided");
    }

    this.id = id;
  }
  
  

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";

  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  

  private String templateId;
  /**
  * Unique identifier prefixed with `tmpl_`. ID of a saved [HTML template](#section/HTML-Templates).
  * @return templateId
  **/
  
  @javax.annotation.Nullable
  
  public String getTemplateId() { return templateId; }

  public void setTemplateId (String templateId) throws IllegalArgumentException {
    if(!templateId.matches("^tmpl_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid template_id provided");
    }

    this.templateId = templateId;
  }
  
  

  public static final String SERIALIZED_NAME_TEMPLATE_VERSION_ID = "template_version_id";

  @SerializedName(SERIALIZED_NAME_TEMPLATE_VERSION_ID)
  

  private String templateVersionId;
  /**
  * Unique identifier prefixed with `vrsn_`.
  * @return templateVersionId
  **/
  
  @javax.annotation.Nullable
  
  public String getTemplateVersionId() { return templateVersionId; }

  public void setTemplateVersionId (String templateVersionId) throws IllegalArgumentException {
    if(!templateVersionId.matches("^vrsn_[a-zA-Z0-9]+$")) {
      throw new IllegalArgumentException("Invalid template_version_id provided");
    }

    this.templateVersionId = templateVersionId;
  }
  
  

  /**
   * Gets or Sets _object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    LETTER("letter");

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
  

  private ObjectEnum _object = ObjectEnum.LETTER;
  /**
  * Get _object
  * @return _object
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public ObjectEnum getObject() {
      return _object;
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
  
  

  public static final String SERIALIZED_NAME_EXTRA_SERVICE = "extra_service";

  @SerializedName(SERIALIZED_NAME_EXTRA_SERVICE)
  

  private String extraService;
  /**
  * Add an extra service to your letter. See [pricing](https://www.lob.com/pricing/print-mail#compare) for extra costs incurred.   * registered - provides tracking and confirmation for international addresses   * `certified` - track and confirm delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages double-sided) is added to the beginning of your letter for address and barcode information. See here for templates: [#10 envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf) and [flat envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf) (used for letters over 6 pages single-sided or 12 pages double-sided). You will not be charged for this extra sheet.   * `certified_return_receipt` - request an electronic copy of the recipient's signature to prove delivery of your certified letter 
  * @return extraService
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Add an extra service to your letter. See [pricing](https://www.lob.com/pricing/print-mail#compare) for extra costs incurred.   * registered - provides tracking and confirmation for international addresses   * `certified` - track and confirm delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages double-sided) is added to the beginning of your letter for address and barcode information. See here for templates: [#10 envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf) and [flat envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf) (used for letters over 6 pages single-sided or 12 pages double-sided). You will not be charged for this extra sheet.   * `certified_return_receipt` - request an electronic copy of the recipient's signature to prove delivery of your certified letter ")
  
  public String getExtraService() {
      return extraService;
  }
  
  

  public static final String SERIALIZED_NAME_TRACKING_NUMBER = "tracking_number";

  @SerializedName(SERIALIZED_NAME_TRACKING_NUMBER)
  

  private String trackingNumber;
  /**
  * The tracking number, if applicable, will appear here when it becomes available. Dummy tracking numbers are not created in test mode.
  * @return trackingNumber
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "The tracking number, if applicable, will appear here when it becomes available. Dummy tracking numbers are not created in test mode.")
  
  public String getTrackingNumber() {
      return trackingNumber;
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

  public static final String SERIALIZED_NAME_RETURN_ADDRESS = "return_address";

  @SerializedName(SERIALIZED_NAME_RETURN_ADDRESS)
  
  private String returnAddress;
  public  String getReturnAddress() {
    return returnAddress;
  }

  public void setReturnAddress(String returnAddress) {
    ;
    this.returnAddress = returnAddress;
  }
  
  
  public void setReturnAddress(AddressEditable returnAddress) {
    Gson gson = new Gson();
    this.returnAddress = gson.toJson(returnAddress);
  }
  public static final String SERIALIZED_NAME_MAIL_TYPE = "mail_type";

  @SerializedName(SERIALIZED_NAME_MAIL_TYPE)
  

  private MailType mailType = MailType.FIRST_CLASS;
  /**
  * Get mailType
  * @return mailType
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public MailType getMailType() {
      return mailType;
  }
  
  

  public static final String SERIALIZED_NAME_COLOR = "color";

  @SerializedName(SERIALIZED_NAME_COLOR)
  

  private Boolean color;
  /**
  * Set this key to `true` if you would like to print in color. Set to `false` if you would like to print in black and white.
  * @return color
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Set this key to `true` if you would like to print in color. Set to `false` if you would like to print in black and white.")
  
  public Boolean getColor() {
      return color;
  }
  
  

  public static final String SERIALIZED_NAME_DOUBLE_SIDED = "double_sided";

  @SerializedName(SERIALIZED_NAME_DOUBLE_SIDED)
  

  private Boolean doubleSided = true;
  /**
  * Set this attribute to `true` for double sided printing, or `false` for for single sided printing. Defaults to `true`.
  * @return doubleSided
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Set this attribute to `true` for double sided printing, or `false` for for single sided printing. Defaults to `true`.")
  
  public Boolean getDoubleSided() {
      return doubleSided;
  }
  
  

  /**
   * Specifies the location of the address information that will show through the double-window envelope. To see how this will impact your letter design, view our letter template.   * &#x60;top_first_page&#x60; - (default) print address information at the top of your provided first page   * &#x60;insert_blank_page&#x60; - insert a blank address page at the beginning of your file (you will be charged for the extra page)   * &#x60;bottom_first_page_center&#x60; - **(deprecation planned within a few months)** print address information at the bottom center of your provided first page   * &#x60;bottom_first_page&#x60; - print address information at the bottom of your provided first page 
   */
  @JsonAdapter(AddressPlacementEnum.Adapter.class)
  public enum AddressPlacementEnum {
    TOP_FIRST_PAGE("top_first_page"),
    
    INSERT_BLANK_PAGE("insert_blank_page"),
    
    BOTTOM_FIRST_PAGE_CENTER("bottom_first_page_center"),
    
    BOTTOM_FIRST_PAGE("bottom_first_page");

    private String value;

    AddressPlacementEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressPlacementEnum fromValue(String value) {
      for (AddressPlacementEnum b : AddressPlacementEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AddressPlacementEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressPlacementEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressPlacementEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AddressPlacementEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ADDRESS_PLACEMENT = "address_placement";

  @SerializedName(SERIALIZED_NAME_ADDRESS_PLACEMENT)
  

  private AddressPlacementEnum addressPlacement = AddressPlacementEnum.TOP_FIRST_PAGE;
  /**
  * Specifies the location of the address information that will show through the double-window envelope. To see how this will impact your letter design, view our letter template.   * `top_first_page` - (default) print address information at the top of your provided first page   * `insert_blank_page` - insert a blank address page at the beginning of your file (you will be charged for the extra page)   * `bottom_first_page_center` - **(deprecation planned within a few months)** print address information at the bottom center of your provided first page   * `bottom_first_page` - print address information at the bottom of your provided first page 
  * @return addressPlacement
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Specifies the location of the address information that will show through the double-window envelope. To see how this will impact your letter design, view our letter template.   * `top_first_page` - (default) print address information at the top of your provided first page   * `insert_blank_page` - insert a blank address page at the beginning of your file (you will be charged for the extra page)   * `bottom_first_page_center` - **(deprecation planned within a few months)** print address information at the bottom center of your provided first page   * `bottom_first_page` - print address information at the bottom of your provided first page ")
  
  public AddressPlacementEnum getAddressPlacement() {
      return addressPlacement;
  }
  
  

  public static final String SERIALIZED_NAME_RETURN_ENVELOPE = "return_envelope";

  @SerializedName(SERIALIZED_NAME_RETURN_ENVELOPE)
  
  private String returnEnvelope;
  public  String getReturnEnvelope() {
    return returnEnvelope;
  }

  public void setReturnEnvelope(String returnEnvelope) {
    ;
    this.returnEnvelope = returnEnvelope;
  }
  
  
  public void setReturnEnvelope(Boolean returnEnvelope) {
    Gson gson = new Gson();
    this.returnEnvelope = gson.toJson(returnEnvelope);
  }
  public static final String SERIALIZED_NAME_PERFORATED_PAGE = "perforated_page";

  @SerializedName(SERIALIZED_NAME_PERFORATED_PAGE)
  

  private Integer perforatedPage;
  /**
  * Required if `return_envelope` is `true`. The number of the page that should be perforated for use with the return envelope. Must be greater than or equal to `1`. The blank page added by `address_placement=insert_blank_page` will be ignored when considering the perforated page number. To see how perforation will impact your letter design, view our [perforation guide](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_perf_template.pdf).
  * @return perforatedPage
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Required if `return_envelope` is `true`. The number of the page that should be perforated for use with the return envelope. Must be greater than or equal to `1`. The blank page added by `address_placement=insert_blank_page` will be ignored when considering the perforated page number. To see how perforation will impact your letter design, view our [perforation guide](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_perf_template.pdf).")
  
  public Integer getPerforatedPage() {
      return perforatedPage;
  }
  
  

  public static final String SERIALIZED_NAME_CUSTOM_ENVELOPE = "custom_envelope";

  @SerializedName(SERIALIZED_NAME_CUSTOM_ENVELOPE)
  

  private LetterCustomEnvelope customEnvelope;
  /**
  * Get customEnvelope
  * @return customEnvelope
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public LetterCustomEnvelope getCustomEnvelope() {
      return customEnvelope;
  }
  
  


  /*
  public Letter to(Address to) {
    
    this.to = to;
    return this;
  }
  */


  public void setTo(Address to) {
    this.to = to;
  }



  /*
  public Letter from(Address from) {
    
    this.from = from;
    return this;
  }
  */


  public void setFrom(Address from) {
    this.from = from;
  }



  /*
  public Letter carrier(CarrierEnum carrier) {
    
    this.carrier = carrier;
    return this;
  }
  */


  public void setCarrier(CarrierEnum carrier) {
    this.carrier = carrier;
  }



  /*
  public Letter thumbnails(List<Thumbnail> thumbnails) {
    
    this.thumbnails = thumbnails;
    return this;
  }
  */

  public Letter addThumbnailsItem(Thumbnail thumbnailsItem) {
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
  public Letter expectedDeliveryDate(LocalDate expectedDeliveryDate) {
    
    this.expectedDeliveryDate = expectedDeliveryDate;
    return this;
  }
  */


  public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
    this.expectedDeliveryDate = expectedDeliveryDate;
  }



  /*
  public Letter dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }
  */


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }



  /*
  public Letter dateModified(OffsetDateTime dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }
  */


  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }



  /*
  public Letter deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }
  */


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }



  /*
  public Letter id(String id) {
    
    this.id = id;
    return this;
  }
  */





  /*
  public Letter templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }
  */





  /*
  public Letter templateVersionId(String templateVersionId) {
    
    this.templateVersionId = templateVersionId;
    return this;
  }
  */





  /*
  public Letter _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }
  */


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }



  /*
  public Letter description(String description) {
    
    this.description = description;
    return this;
  }
  */


  public void setDescription(String description) {
    this.description = description;
  }



  /*
  public Letter metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }
  */

  public Letter putMetadataItem(String key, String metadataItem) {
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
  public Letter mergeVariables(Object mergeVariables) {
    
    this.mergeVariables = mergeVariables;
    return this;
  }
  */


  public void setMergeVariables(Object mergeVariables) {
    this.mergeVariables = mergeVariables;
  }



  /*
  public Letter sendDate(OffsetDateTime sendDate) {
    
    this.sendDate = sendDate;
    return this;
  }
  */


  public void setSendDate(OffsetDateTime sendDate) {
    this.sendDate = sendDate;
  }



  /*
  public Letter extraService(String extraService) {
    
    this.extraService = extraService;
    return this;
  }
  */


  public void setExtraService(String extraService) {
    this.extraService = extraService;
  }



  /*
  public Letter trackingNumber(String trackingNumber) {
    
    this.trackingNumber = trackingNumber;
    return this;
  }
  */


  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }



  /*
  public Letter trackingEvents(List<TrackingEventNormal> trackingEvents) {
    
    this.trackingEvents = trackingEvents;
    return this;
  }
  */

  public Letter addTrackingEventsItem(TrackingEventNormal trackingEventsItem) {
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
  public Letter returnAddress(String returnAddress) {
    
    this.returnAddress = returnAddress;
    return this;
  }
  */





  /*
  public Letter mailType(MailType mailType) {
    
    this.mailType = mailType;
    return this;
  }
  */


  public void setMailType(MailType mailType) {
    this.mailType = mailType;
  }



  /*
  public Letter color(Boolean color) {
    
    this.color = color;
    return this;
  }
  */


  public void setColor(Boolean color) {
    this.color = color;
  }



  /*
  public Letter doubleSided(Boolean doubleSided) {
    
    this.doubleSided = doubleSided;
    return this;
  }
  */


  public void setDoubleSided(Boolean doubleSided) {
    this.doubleSided = doubleSided;
  }



  /*
  public Letter addressPlacement(AddressPlacementEnum addressPlacement) {
    
    this.addressPlacement = addressPlacement;
    return this;
  }
  */


  public void setAddressPlacement(AddressPlacementEnum addressPlacement) {
    this.addressPlacement = addressPlacement;
  }



  /*
  public Letter returnEnvelope(Object returnEnvelope) {
    
    this.returnEnvelope = returnEnvelope;
    return this;
  }
  */





  /*
  public Letter perforatedPage(Integer perforatedPage) {
    
    this.perforatedPage = perforatedPage;
    return this;
  }
  */


  public void setPerforatedPage(Integer perforatedPage) {
    this.perforatedPage = perforatedPage;
  }



  /*
  public Letter customEnvelope(LetterCustomEnvelope customEnvelope) {
    
    this.customEnvelope = customEnvelope;
    return this;
  }
  */


  public void setCustomEnvelope(LetterCustomEnvelope customEnvelope) {
    this.customEnvelope = customEnvelope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Letter letter = (Letter) o;
    return Objects.equals(this.to, letter.to) &&
        Objects.equals(this.from, letter.from) &&
        Objects.equals(this.carrier, letter.carrier) &&
        Objects.equals(this.thumbnails, letter.thumbnails) &&
        Objects.equals(this.expectedDeliveryDate, letter.expectedDeliveryDate) &&
        Objects.equals(this.dateCreated, letter.dateCreated) &&
        Objects.equals(this.dateModified, letter.dateModified) &&
        Objects.equals(this.deleted, letter.deleted) &&
        Objects.equals(this.id, letter.id) &&
        Objects.equals(this.templateId, letter.templateId) &&
        Objects.equals(this.templateVersionId, letter.templateVersionId) &&
        Objects.equals(this._object, letter._object) &&
        Objects.equals(this.description, letter.description) &&
        Objects.equals(this.metadata, letter.metadata) &&
        Objects.equals(this.mergeVariables, letter.mergeVariables) &&
        Objects.equals(this.sendDate, letter.sendDate) &&
        Objects.equals(this.extraService, letter.extraService) &&
        Objects.equals(this.trackingNumber, letter.trackingNumber) &&
        Objects.equals(this.trackingEvents, letter.trackingEvents) &&
        Objects.equals(this.returnAddress, letter.returnAddress) &&
        Objects.equals(this.mailType, letter.mailType) &&
        Objects.equals(this.color, letter.color) &&
        Objects.equals(this.doubleSided, letter.doubleSided) &&
        Objects.equals(this.addressPlacement, letter.addressPlacement) &&
        Objects.equals(this.returnEnvelope, letter.returnEnvelope) &&
        Objects.equals(this.perforatedPage, letter.perforatedPage) &&
        Objects.equals(this.customEnvelope, letter.customEnvelope);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, carrier, thumbnails, expectedDeliveryDate, dateCreated, dateModified, deleted, id, templateId, templateVersionId, _object, description, metadata, mergeVariables, sendDate, extraService, trackingNumber, trackingEvents, returnAddress, mailType, color, doubleSided, addressPlacement, returnEnvelope, perforatedPage, customEnvelope);
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
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    expectedDeliveryDate: ").append(toIndentedString(expectedDeliveryDate)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateVersionId: ").append(toIndentedString(templateVersionId)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mergeVariables: ").append(toIndentedString(mergeVariables)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    extraService: ").append(toIndentedString(extraService)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    trackingEvents: ").append(toIndentedString(trackingEvents)).append("\n");
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    doubleSided: ").append(toIndentedString(doubleSided)).append("\n");
    sb.append("    addressPlacement: ").append(toIndentedString(addressPlacement)).append("\n");
    sb.append("    returnEnvelope: ").append(toIndentedString(returnEnvelope)).append("\n");
    sb.append("    perforatedPage: ").append(toIndentedString(perforatedPage)).append("\n");
    sb.append("    customEnvelope: ").append(toIndentedString(customEnvelope)).append("\n");
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

