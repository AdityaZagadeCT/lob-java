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
import com.lob.model.MailType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
/**
 * LetterEditable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LetterEditable {
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
  
  

  public static final String SERIALIZED_NAME_COLOR = "color";

  @SerializedName(SERIALIZED_NAME_COLOR)
  

  private Boolean color;
  /**
  * Set this key to `true` if you would like to print in color. Set to `false` if you would like to print in black and white.
  * @return color
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Set this key to `true` if you would like to print in color. Set to `false` if you would like to print in black and white.")
  
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
  

  private String customEnvelope;
  /**
  * Get customEnvelope
  * @return customEnvelope
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "")
  
  public String getCustomEnvelope() {
      return customEnvelope;
  }
  
  

  public static final String SERIALIZED_NAME_TO = "to";

  @SerializedName(SERIALIZED_NAME_TO)
  
  private String to;
  public  String getTo() {
    return to;
  }
  

  public void setTo(String to) {
    
    
    this.to = to;
  }
  
  
  public void setTo(AddressEditable to) {
    Gson gson = new Gson();
    
    this.to = gson.toJson(to);
  }
  public static final String SERIALIZED_NAME_FROM = "from";

  @SerializedName(SERIALIZED_NAME_FROM)
  
  private String from;
  public  String getFrom() {
    return from;
  }
  

  public void setFrom(String from) {
    
    
    this.from = from;
  }
  
  
  public void setFrom(AddressEditable from) {
    Gson gson = new Gson();
    
    this.from = gson.toJson(from);
  }
  public static final String SERIALIZED_NAME_FILE = "file";

  @SerializedName(SERIALIZED_NAME_FILE)
  

  private String file;
  /**
  * PDF file containing the letter's formatting.
  * @return file
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "PDF file containing the letter's formatting.")
  
  public String getFile() {
      return file;
  }
  
  

  /**
   * Add an extra service to your letter:   * &#x60;certified&#x60; - track and confirm delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages double-sided) is added to the beginning of your letter for address and barcode information. See here for templates: [#10 envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf) and [flat envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf) (used for letters over 6 pages single-sided or 12 pages double-sided). You will not be charged for this extra sheet.   * &#x60;certified_return_receipt&#x60; - request an electronic copy of the recipient&#39;s signature to prove delivery of your certified letter   * &#x60;registered&#x60; - provides tracking and confirmation for international addresses 
   */
  @JsonAdapter(ExtraServiceEnum.Adapter.class)
  public enum ExtraServiceEnum {
    CERTIFIED("certified"),
    
    CERTIFIED_RETURN_RECEIPT("certified_return_receipt"),
    
    REGISTERED("registered"),
    
    NULL("null");

    private String value;

    ExtraServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExtraServiceEnum fromValue(String value) {
      for (ExtraServiceEnum b : ExtraServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExtraServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExtraServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExtraServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExtraServiceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXTRA_SERVICE = "extra_service";

  @SerializedName(SERIALIZED_NAME_EXTRA_SERVICE)
  

  private ExtraServiceEnum extraService;
  /**
  * Add an extra service to your letter:   * `certified` - track and confirm delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages double-sided) is added to the beginning of your letter for address and barcode information. See here for templates: [#10 envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf) and [flat envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf) (used for letters over 6 pages single-sided or 12 pages double-sided). You will not be charged for this extra sheet.   * `certified_return_receipt` - request an electronic copy of the recipient's signature to prove delivery of your certified letter   * `registered` - provides tracking and confirmation for international addresses 
  * @return extraService
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "Add an extra service to your letter:   * `certified` - track and confirm delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages double-sided) is added to the beginning of your letter for address and barcode information. See here for templates: [#10 envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf) and [flat envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf) (used for letters over 6 pages single-sided or 12 pages double-sided). You will not be charged for this extra sheet.   * `certified_return_receipt` - request an electronic copy of the recipient's signature to prove delivery of your certified letter   * `registered` - provides tracking and confirmation for international addresses ")
  
  public ExtraServiceEnum getExtraService() {
      return extraService;
  }
  
  

  public static final String SERIALIZED_NAME_CARDS = "cards";

  @SerializedName(SERIALIZED_NAME_CARDS)
  private List<String> cards = null;
  public List<String> getCards() {     
    if (this.cards == null) {
      this.cards = new ArrayList<String>();
    }
    return this.cards; 
  }

  public static final String SERIALIZED_NAME_BILLING_GROUP_ID = "billing_group_id";

  @SerializedName(SERIALIZED_NAME_BILLING_GROUP_ID)
  

  private String billingGroupId;
  /**
  * An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See [Billing Group API](https://lob.github.io/lob-openapi/#tag/Billing-Groups) for more information.
  * @return billingGroupId
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See [Billing Group API](https://lob.github.io/lob-openapi/#tag/Billing-Groups) for more information.")
  
  public String getBillingGroupId() {
      return billingGroupId;
  }
  
  


  /*
  public LetterEditable description(String description) {
    
    this.description = description;
    return this;
  }
  */


  public void setDescription(String description) {
    this.description = description;
  }



  /*
  public LetterEditable metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }
  */

  public LetterEditable putMetadataItem(String key, String metadataItem) {
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
  public LetterEditable mailType(MailType mailType) {
    
    this.mailType = mailType;
    return this;
  }
  */


  public void setMailType(MailType mailType) {
    this.mailType = mailType;
  }



  /*
  public LetterEditable mergeVariables(Object mergeVariables) {
    
    this.mergeVariables = mergeVariables;
    return this;
  }
  */


  public void setMergeVariables(Object mergeVariables) {
    this.mergeVariables = mergeVariables;
  }



  /*
  public LetterEditable sendDate(OffsetDateTime sendDate) {
    
    this.sendDate = sendDate;
    return this;
  }
  */


  public void setSendDate(OffsetDateTime sendDate) {
    this.sendDate = sendDate;
  }



  /*
  public LetterEditable color(Boolean color) {
    
    this.color = color;
    return this;
  }
  */


  public void setColor(Boolean color) {
    this.color = color;
  }



  /*
  public LetterEditable doubleSided(Boolean doubleSided) {
    
    this.doubleSided = doubleSided;
    return this;
  }
  */


  public void setDoubleSided(Boolean doubleSided) {
    this.doubleSided = doubleSided;
  }



  /*
  public LetterEditable addressPlacement(AddressPlacementEnum addressPlacement) {
    
    this.addressPlacement = addressPlacement;
    return this;
  }
  */


  public void setAddressPlacement(AddressPlacementEnum addressPlacement) {
    this.addressPlacement = addressPlacement;
  }



  /*
  public LetterEditable returnEnvelope(Object returnEnvelope) {
    
    this.returnEnvelope = returnEnvelope;
    return this;
  }
  */





  /*
  public LetterEditable perforatedPage(Integer perforatedPage) {
    
    this.perforatedPage = perforatedPage;
    return this;
  }
  */


  public void setPerforatedPage(Integer perforatedPage) {
    this.perforatedPage = perforatedPage;
  }



  /*
  public LetterEditable customEnvelope(String customEnvelope) {
    
    this.customEnvelope = customEnvelope;
    return this;
  }
  */


  public void setCustomEnvelope(String customEnvelope) {
    this.customEnvelope = customEnvelope;
  }



  /*
  public LetterEditable to(String to) {
    
    this.to = to;
    return this;
  }
  */





  /*
  public LetterEditable from(String from) {
    
    this.from = from;
    return this;
  }
  */





  /*
  public LetterEditable file(String file) {
    
    this.file = file;
    return this;
  }
  */


  public void setFile(String file) {
    this.file = file;
  }



  /*
  public LetterEditable extraService(ExtraServiceEnum extraService) {
    
    this.extraService = extraService;
    return this;
  }
  */


  public void setExtraService(ExtraServiceEnum extraService) {
    this.extraService = extraService;
  }



  /*
  public LetterEditable cards(List<String> cards) {
    
    this.cards = cards;
    return this;
  }
  */

  public LetterEditable addCardsItem(String cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<String>();
    }
    this.cards.add(cardsItem);
    return this;
  }


  public void setCards(List<String> cards) {
    this.cards = cards;
  }



  /*
  public LetterEditable billingGroupId(String billingGroupId) {
    
    this.billingGroupId = billingGroupId;
    return this;
  }
  */


  public void setBillingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LetterEditable letterEditable = (LetterEditable) o;
    return Objects.equals(this.description, letterEditable.description) &&
        Objects.equals(this.metadata, letterEditable.metadata) &&
        Objects.equals(this.mailType, letterEditable.mailType) &&
        Objects.equals(this.mergeVariables, letterEditable.mergeVariables) &&
        Objects.equals(this.sendDate, letterEditable.sendDate) &&
        Objects.equals(this.color, letterEditable.color) &&
        Objects.equals(this.doubleSided, letterEditable.doubleSided) &&
        Objects.equals(this.addressPlacement, letterEditable.addressPlacement) &&
        Objects.equals(this.returnEnvelope, letterEditable.returnEnvelope) &&
        Objects.equals(this.perforatedPage, letterEditable.perforatedPage) &&
        Objects.equals(this.customEnvelope, letterEditable.customEnvelope) &&
        Objects.equals(this.to, letterEditable.to) &&
        Objects.equals(this.from, letterEditable.from) &&
        Objects.equals(this.file, letterEditable.file) &&
        Objects.equals(this.extraService, letterEditable.extraService) &&
        Objects.equals(this.cards, letterEditable.cards) &&
        Objects.equals(this.billingGroupId, letterEditable.billingGroupId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, metadata, mailType, mergeVariables, sendDate, color, doubleSided, addressPlacement, returnEnvelope, perforatedPage, customEnvelope, to, from, file, extraService, cards, billingGroupId);
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
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    mergeVariables: ").append(toIndentedString(mergeVariables)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    doubleSided: ").append(toIndentedString(doubleSided)).append("\n");
    sb.append("    addressPlacement: ").append(toIndentedString(addressPlacement)).append("\n");
    sb.append("    returnEnvelope: ").append(toIndentedString(returnEnvelope)).append("\n");
    sb.append("    perforatedPage: ").append(toIndentedString(perforatedPage)).append("\n");
    sb.append("    customEnvelope: ").append(toIndentedString(customEnvelope)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    extraService: ").append(toIndentedString(extraService)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
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

