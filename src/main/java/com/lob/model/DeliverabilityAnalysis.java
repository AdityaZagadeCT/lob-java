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
import com.lob.model.DpvFootnote;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.io.File;

/**
 * A nested object containing a breakdown of the deliverability of an address.
 */
@ApiModel(description = "A nested object containing a breakdown of the deliverability of an address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliverabilityAnalysis {
  /**
   * Result of Delivery Point Validation (DPV), which determines whether or not the address is deliverable by the USPS. Possible values are: * &#x60;Y&#x60; –– The address is deliverable by the USPS. * &#x60;S&#x60; –– The address is deliverable by removing the provided secondary unit designator. This information may be incorrect or unnecessary. * &#x60;D&#x60; –– The address is deliverable to the building&#39;s default address but is missing a secondary unit designator and/or number.   There is a chance the mail will not reach the intended recipient. * &#x60;N&#x60; –– The address is not deliverable according to the USPS, but parts of the address are valid (such as the street and ZIP code). * &#x60;&#39;&#39;&#x60; –– This address is not deliverable. No matching street could be found within the city or ZIP code. 
   */
  @JsonAdapter(DpvConfirmationEnum.Adapter.class)
  public enum DpvConfirmationEnum {
    Y("Y"),
    
    S("S"),
    
    D("D"),
    
    N("N"),
    
    EMPTY("");

    private String value;

    DpvConfirmationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DpvConfirmationEnum fromValue(String value) {
      for (DpvConfirmationEnum b : DpvConfirmationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DpvConfirmationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DpvConfirmationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DpvConfirmationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DpvConfirmationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DPV_CONFIRMATION = "dpv_confirmation";

  @SerializedName(SERIALIZED_NAME_DPV_CONFIRMATION)
  

  private DpvConfirmationEnum dpvConfirmation;
  /**
  * Result of Delivery Point Validation (DPV), which determines whether or not the address is deliverable by the USPS. Possible values are: * `Y` –– The address is deliverable by the USPS. * `S` –– The address is deliverable by removing the provided secondary unit designator. This information may be incorrect or unnecessary. * `D` –– The address is deliverable to the building's default address but is missing a secondary unit designator and/or number.   There is a chance the mail will not reach the intended recipient. * `N` –– The address is not deliverable according to the USPS, but parts of the address are valid (such as the street and ZIP code). * `''` –– This address is not deliverable. No matching street could be found within the city or ZIP code. 
  * @return dpvConfirmation
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Result of Delivery Point Validation (DPV), which determines whether or not the address is deliverable by the USPS. Possible values are: * `Y` –– The address is deliverable by the USPS. * `S` –– The address is deliverable by removing the provided secondary unit designator. This information may be incorrect or unnecessary. * `D` –– The address is deliverable to the building's default address but is missing a secondary unit designator and/or number.   There is a chance the mail will not reach the intended recipient. * `N` –– The address is not deliverable according to the USPS, but parts of the address are valid (such as the street and ZIP code). * `''` –– This address is not deliverable. No matching street could be found within the city or ZIP code. ")
  
  public DpvConfirmationEnum getDpvConfirmation() {
      return dpvConfirmation;
  }
  
  

  /**
   * indicates whether or not the address is [CMRA-authorized](https://en.wikipedia.org/wiki/Commercial_mail_receiving_agency). Possible values are: * &#x60;Y&#x60; –– Address is CMRA-authorized. * &#x60;N&#x60; –– Address is not CMRA-authorized. * &#x60;&#39;&#39;&#x60; –– A DPV match is not made (&#x60;deliverability_analysis[dpv_confirmation]&#x60; is &#x60;N&#x60; or an empty string). 
   */
  @JsonAdapter(DpvCmraEnum.Adapter.class)
  public enum DpvCmraEnum {
    Y("Y"),
    
    N("N"),
    
    EMPTY("");

    private String value;

    DpvCmraEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DpvCmraEnum fromValue(String value) {
      for (DpvCmraEnum b : DpvCmraEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DpvCmraEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DpvCmraEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DpvCmraEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DpvCmraEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DPV_CMRA = "dpv_cmra";

  @SerializedName(SERIALIZED_NAME_DPV_CMRA)
  

  private DpvCmraEnum dpvCmra;
  /**
  * indicates whether or not the address is [CMRA-authorized](https://en.wikipedia.org/wiki/Commercial_mail_receiving_agency). Possible values are: * `Y` –– Address is CMRA-authorized. * `N` –– Address is not CMRA-authorized. * `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). 
  * @return dpvCmra
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "indicates whether or not the address is [CMRA-authorized](https://en.wikipedia.org/wiki/Commercial_mail_receiving_agency). Possible values are: * `Y` –– Address is CMRA-authorized. * `N` –– Address is not CMRA-authorized. * `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). ")
  
  public DpvCmraEnum getDpvCmra() {
      return dpvCmra;
  }
  
  

  /**
   * indicates that an address was once deliverable, but has become vacant and is no longer receiving deliveries. Possible values are: * &#x60;Y&#x60; –– Address is vacant. * &#x60;N&#x60; –– Address is not vacant. * &#x60;&#39;&#39;&#x60; –– A DPV match is not made (&#x60;deliverability_analysis[dpv_confirmation]&#x60; is &#x60;N&#x60; or an empty string). 
   */
  @JsonAdapter(DpvVacantEnum.Adapter.class)
  public enum DpvVacantEnum {
    Y("Y"),
    
    N("N"),
    
    EMPTY("");

    private String value;

    DpvVacantEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DpvVacantEnum fromValue(String value) {
      for (DpvVacantEnum b : DpvVacantEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DpvVacantEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DpvVacantEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DpvVacantEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DpvVacantEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DPV_VACANT = "dpv_vacant";

  @SerializedName(SERIALIZED_NAME_DPV_VACANT)
  

  private DpvVacantEnum dpvVacant;
  /**
  * indicates that an address was once deliverable, but has become vacant and is no longer receiving deliveries. Possible values are: * `Y` –– Address is vacant. * `N` –– Address is not vacant. * `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). 
  * @return dpvVacant
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "indicates that an address was once deliverable, but has become vacant and is no longer receiving deliveries. Possible values are: * `Y` –– Address is vacant. * `N` –– Address is not vacant. * `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). ")
  
  public DpvVacantEnum getDpvVacant() {
      return dpvVacant;
  }
  
  

  /**
   * Corresponds to the USPS field &#x60;dpv_no_stat&#x60;. Indicates that an address has been vacated in the recent past, and is no longer receiving deliveries. If it&#39;s been unoccupied for 90+ days, or temporarily vacant, this will be flagged. Possible values are: * &#x60;Y&#x60; –– Address is active. * &#x60;N&#x60; –– Address is not active. * &#x60;&#39;&#39;&#x60; –– A DPV match is not made (&#x60;deliverability_analysis[dpv_confirmation]&#x60; is &#x60;N&#x60; or an empty string). 
   */
  @JsonAdapter(DpvActiveEnum.Adapter.class)
  public enum DpvActiveEnum {
    Y("Y"),
    
    N("N"),
    
    EMPTY("");

    private String value;

    DpvActiveEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DpvActiveEnum fromValue(String value) {
      for (DpvActiveEnum b : DpvActiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DpvActiveEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DpvActiveEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DpvActiveEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DpvActiveEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DPV_ACTIVE = "dpv_active";

  @SerializedName(SERIALIZED_NAME_DPV_ACTIVE)
  

  private DpvActiveEnum dpvActive;
  /**
  * Corresponds to the USPS field `dpv_no_stat`. Indicates that an address has been vacated in the recent past, and is no longer receiving deliveries. If it's been unoccupied for 90+ days, or temporarily vacant, this will be flagged. Possible values are: * `Y` –– Address is active. * `N` –– Address is not active. * `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). 
  * @return dpvActive
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Corresponds to the USPS field `dpv_no_stat`. Indicates that an address has been vacated in the recent past, and is no longer receiving deliveries. If it's been unoccupied for 90+ days, or temporarily vacant, this will be flagged. Possible values are: * `Y` –– Address is active. * `N` –– Address is not active. * `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). ")
  
  public DpvActiveEnum getDpvActive() {
      return dpvActive;
  }
  
  

  public static final String SERIALIZED_NAME_DPV_FOOTNOTES = "dpv_footnotes";

  @SerializedName(SERIALIZED_NAME_DPV_FOOTNOTES)
  private List<DpvFootnote> dpvFootnotes = new ArrayList<>();
  public List<DpvFootnote> getDpvFootnotes() {
    if (this.dpvFootnotes == null) {
      this.dpvFootnotes = new ArrayList<DpvFootnote>();
    }
    return this.dpvFootnotes;
  }

  public static final String SERIALIZED_NAME_EWS_MATCH = "ews_match";

  @SerializedName(SERIALIZED_NAME_EWS_MATCH)
  

  private Boolean ewsMatch;
  /**
  * indicates whether or not an address has been flagged in the [Early Warning System](https://docs.informatica.com/data-engineering/data-engineering-quality/10-4-0/address-validator-port-reference/postal-carrier-certification-data-ports/early-warning-system-return-code.html), meaning the address is under development and not yet ready to receive mail. However, it should become available in a few months. 
  * @return ewsMatch
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "indicates whether or not an address has been flagged in the [Early Warning System](https://docs.informatica.com/data-engineering/data-engineering-quality/10-4-0/address-validator-port-reference/postal-carrier-certification-data-ports/early-warning-system-return-code.html), meaning the address is under development and not yet ready to receive mail. However, it should become available in a few months. ")
  
  public Boolean getEwsMatch() {
      return ewsMatch;
  }
  
  

  /**
   * indicates whether this address has been converted by [LACS&lt;sup&gt;Link&lt;/sup&gt;](https://postalpro.usps.com/address-quality/lacslink). LACS&lt;sup&gt;Link&lt;/sup&gt; corrects outdated addresses into their modern counterparts. Possible values are: * &#x60;Y&#x60; –– New address produced with a matching record in LACS&lt;sup&gt;Link&lt;/sup&gt;. * &#x60;N&#x60; –– New address could not be produced with a matching record in LACS&lt;sup&gt;Link&lt;/sup&gt;. * &#x60;&#39;&#39;&#x60; –– A DPV match is not made (&#x60;deliverability_analysis[dpv_confirmation]&#x60; is &#x60;N&#x60; or an empty string). 
   */
  @JsonAdapter(LacsIndicatorEnum.Adapter.class)
  public enum LacsIndicatorEnum {
    Y("Y"),
    
    N("N"),
    
    EMPTY("");

    private String value;

    LacsIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LacsIndicatorEnum fromValue(String value) {
      for (LacsIndicatorEnum b : LacsIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LacsIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LacsIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LacsIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LacsIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LACS_INDICATOR = "lacs_indicator";

  @SerializedName(SERIALIZED_NAME_LACS_INDICATOR)
  

  private LacsIndicatorEnum lacsIndicator;
  /**
  * indicates whether this address has been converted by [LACS<sup>Link</sup>](https://postalpro.usps.com/address-quality/lacslink). LACS<sup>Link</sup> corrects outdated addresses into their modern counterparts. Possible values are: * `Y` –– New address produced with a matching record in LACS<sup>Link</sup>. * `N` –– New address could not be produced with a matching record in LACS<sup>Link</sup>. * `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). 
  * @return lacsIndicator
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "indicates whether this address has been converted by [LACS<sup>Link</sup>](https://postalpro.usps.com/address-quality/lacslink). LACS<sup>Link</sup> corrects outdated addresses into their modern counterparts. Possible values are: * `Y` –– New address produced with a matching record in LACS<sup>Link</sup>. * `N` –– New address could not be produced with a matching record in LACS<sup>Link</sup>. * `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). ")
  
  public LacsIndicatorEnum getLacsIndicator() {
      return lacsIndicator;
  }
  
  

  public static final String SERIALIZED_NAME_LACS_RETURN_CODE = "lacs_return_code";

  @SerializedName(SERIALIZED_NAME_LACS_RETURN_CODE)
  

  private String lacsReturnCode;
  /**
  * A code indicating how `deliverability_analysis[lacs_indicator]` was determined. Possible values are: * `A` — A new address was produced because a match was found in LACS<sup>Link</sup>. * `92` — A LACS<sup>Link</sup> record was matched after dropping secondary information. * `14` — A match was found in LACS<sup>Link</sup>, but could not be converted to a deliverable address. * `00` — A match was not found in LACS<sup>Link</sup>, and no new address was produced. * `''` — LACS<sup>Link</sup> was not attempted. 
  * @return lacsReturnCode
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "A code indicating how `deliverability_analysis[lacs_indicator]` was determined. Possible values are: * `A` — A new address was produced because a match was found in LACS<sup>Link</sup>. * `92` — A LACS<sup>Link</sup> record was matched after dropping secondary information. * `14` — A match was found in LACS<sup>Link</sup>, but could not be converted to a deliverable address. * `00` — A match was not found in LACS<sup>Link</sup>, and no new address was produced. * `''` — LACS<sup>Link</sup> was not attempted. ")
  
  public String getLacsReturnCode() {
      return lacsReturnCode;
  }
  
  

  /**
   * A return code that indicates whether the address was matched and corrected by [Suite&lt;sup&gt;Link&lt;/sup&gt;](https://postalpro.usps.com/address-quality-solutions/suitelink). Suite&lt;sup&gt;Link&lt;/sup&gt; attempts to provide secondary information to business addresses. Possible values are: * &#x60;A&#x60; –– A Suite&lt;sup&gt;Link&lt;/sup&gt; match was found and secondary information was added. * &#x60;00&#x60; –– A Suite&lt;sup&gt;Link&lt;/sup&gt; match could not be found and no secondary information was added. * &#x60;&#39;&#39;&#x60; –– Suite&lt;sup&gt;Link&lt;/sup&gt; lookup was not attempted. 
   */
  @JsonAdapter(SuiteReturnCodeEnum.Adapter.class)
  public enum SuiteReturnCodeEnum {
    A("A"),
    
    _00("00"),
    
    EMPTY("");

    private String value;

    SuiteReturnCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SuiteReturnCodeEnum fromValue(String value) {
      for (SuiteReturnCodeEnum b : SuiteReturnCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SuiteReturnCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SuiteReturnCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SuiteReturnCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SuiteReturnCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUITE_RETURN_CODE = "suite_return_code";

  @SerializedName(SERIALIZED_NAME_SUITE_RETURN_CODE)
  

  private SuiteReturnCodeEnum suiteReturnCode;
  /**
  * A return code that indicates whether the address was matched and corrected by [Suite<sup>Link</sup>](https://postalpro.usps.com/address-quality-solutions/suitelink). Suite<sup>Link</sup> attempts to provide secondary information to business addresses. Possible values are: * `A` –– A Suite<sup>Link</sup> match was found and secondary information was added. * `00` –– A Suite<sup>Link</sup> match could not be found and no secondary information was added. * `''` –– Suite<sup>Link</sup> lookup was not attempted. 
  * @return suiteReturnCode
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "A return code that indicates whether the address was matched and corrected by [Suite<sup>Link</sup>](https://postalpro.usps.com/address-quality-solutions/suitelink). Suite<sup>Link</sup> attempts to provide secondary information to business addresses. Possible values are: * `A` –– A Suite<sup>Link</sup> match was found and secondary information was added. * `00` –– A Suite<sup>Link</sup> match could not be found and no secondary information was added. * `''` –– Suite<sup>Link</sup> lookup was not attempted. ")
  
  public SuiteReturnCodeEnum getSuiteReturnCode() {
      return suiteReturnCode;
  }
  
  


  /*
  public DeliverabilityAnalysis dpvConfirmation(DpvConfirmationEnum dpvConfirmation) {
    
    this.dpvConfirmation = dpvConfirmation;
    return this;
  }
  */


  public void setDpvConfirmation(DpvConfirmationEnum dpvConfirmation) {
    this.dpvConfirmation = dpvConfirmation;
  }





  /*
  public DeliverabilityAnalysis dpvCmra(DpvCmraEnum dpvCmra) {
    
    this.dpvCmra = dpvCmra;
    return this;
  }
  */


  public void setDpvCmra(DpvCmraEnum dpvCmra) {
    this.dpvCmra = dpvCmra;
  }





  /*
  public DeliverabilityAnalysis dpvVacant(DpvVacantEnum dpvVacant) {
    
    this.dpvVacant = dpvVacant;
    return this;
  }
  */


  public void setDpvVacant(DpvVacantEnum dpvVacant) {
    this.dpvVacant = dpvVacant;
  }





  /*
  public DeliverabilityAnalysis dpvActive(DpvActiveEnum dpvActive) {
    
    this.dpvActive = dpvActive;
    return this;
  }
  */


  public void setDpvActive(DpvActiveEnum dpvActive) {
    this.dpvActive = dpvActive;
  }





  /*
  public DeliverabilityAnalysis dpvFootnotes(List<DpvFootnote> dpvFootnotes) {
    
    this.dpvFootnotes = dpvFootnotes;
    return this;
  }
  */

  public DeliverabilityAnalysis addDpvFootnotesItem(DpvFootnote dpvFootnotesItem) {
    this.dpvFootnotes.add(dpvFootnotesItem);
    return this;
  }


  public void setDpvFootnotes(List<DpvFootnote> dpvFootnotes) {
    this.dpvFootnotes = dpvFootnotes;
  }





  /*
  public DeliverabilityAnalysis ewsMatch(Boolean ewsMatch) {
    
    this.ewsMatch = ewsMatch;
    return this;
  }
  */


  public void setEwsMatch(Boolean ewsMatch) {
    this.ewsMatch = ewsMatch;
  }





  /*
  public DeliverabilityAnalysis lacsIndicator(LacsIndicatorEnum lacsIndicator) {
    
    this.lacsIndicator = lacsIndicator;
    return this;
  }
  */


  public void setLacsIndicator(LacsIndicatorEnum lacsIndicator) {
    this.lacsIndicator = lacsIndicator;
  }





  /*
  public DeliverabilityAnalysis lacsReturnCode(String lacsReturnCode) {
    
    this.lacsReturnCode = lacsReturnCode;
    return this;
  }
  */


  public void setLacsReturnCode(String lacsReturnCode) {
    this.lacsReturnCode = lacsReturnCode;
  }





  /*
  public DeliverabilityAnalysis suiteReturnCode(SuiteReturnCodeEnum suiteReturnCode) {
    
    this.suiteReturnCode = suiteReturnCode;
    return this;
  }
  */


  public void setSuiteReturnCode(SuiteReturnCodeEnum suiteReturnCode) {
    this.suiteReturnCode = suiteReturnCode;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliverabilityAnalysis deliverabilityAnalysis = (DeliverabilityAnalysis) o;
    return Objects.equals(this.dpvConfirmation, deliverabilityAnalysis.dpvConfirmation) &&
        Objects.equals(this.dpvCmra, deliverabilityAnalysis.dpvCmra) &&
        Objects.equals(this.dpvVacant, deliverabilityAnalysis.dpvVacant) &&
        Objects.equals(this.dpvActive, deliverabilityAnalysis.dpvActive) &&
        Objects.equals(this.dpvFootnotes, deliverabilityAnalysis.dpvFootnotes) &&
        Objects.equals(this.ewsMatch, deliverabilityAnalysis.ewsMatch) &&
        Objects.equals(this.lacsIndicator, deliverabilityAnalysis.lacsIndicator) &&
        Objects.equals(this.lacsReturnCode, deliverabilityAnalysis.lacsReturnCode) &&
        Objects.equals(this.suiteReturnCode, deliverabilityAnalysis.suiteReturnCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpvConfirmation, dpvCmra, dpvVacant, dpvActive, dpvFootnotes, ewsMatch, lacsIndicator, lacsReturnCode, suiteReturnCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    dpvConfirmation: ").append(toIndentedString(dpvConfirmation)).append("\n");
    sb.append("    dpvCmra: ").append(toIndentedString(dpvCmra)).append("\n");
    sb.append("    dpvVacant: ").append(toIndentedString(dpvVacant)).append("\n");
    sb.append("    dpvActive: ").append(toIndentedString(dpvActive)).append("\n");
    sb.append("    dpvFootnotes: ").append(toIndentedString(dpvFootnotes)).append("\n");
    sb.append("    ewsMatch: ").append(toIndentedString(ewsMatch)).append("\n");
    sb.append("    lacsIndicator: ").append(toIndentedString(lacsIndicator)).append("\n");
    sb.append("    lacsReturnCode: ").append(toIndentedString(lacsReturnCode)).append("\n");
    sb.append("    suiteReturnCode: ").append(toIndentedString(suiteReturnCode)).append("\n");
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

