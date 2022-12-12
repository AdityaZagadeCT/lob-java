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
import com.lob.model.ZipCodeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
/**
 * A nested object containing a breakdown of each component of an address.
 */
@ApiModel(description = "A nested object containing a breakdown of each component of an address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsComponents {
  public static final String SERIALIZED_NAME_PRIMARY_NUMBER = "primary_number";

  @SerializedName(SERIALIZED_NAME_PRIMARY_NUMBER)
  

  private String primaryNumber;
  /**
  * The numeric or alphanumeric part of an address preceding the street name. Often the house, building, or PO Box number.
  * @return primaryNumber
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The numeric or alphanumeric part of an address preceding the street name. Often the house, building, or PO Box number.")
  
  public String getPrimaryNumber() {
      return primaryNumber;
  }
  
  

  /**
   * Geographic direction preceding a street name (&#x60;N&#x60;, &#x60;S&#x60;, &#x60;E&#x60;, &#x60;W&#x60;, &#x60;NE&#x60;, &#x60;SW&#x60;, &#x60;SE&#x60;, &#x60;NW&#x60;). 
   */
  @JsonAdapter(StreetPredirectionEnum.Adapter.class)
  public enum StreetPredirectionEnum {
    N("N"),
    
    S("S"),
    
    E("E"),
    
    W("W"),
    
    NE("NE"),
    
    SW("SW"),
    
    SE("SE"),
    
    NW("NW"),
    
    EMPTY("");

    private String value;

    StreetPredirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StreetPredirectionEnum fromValue(String value) {
      for (StreetPredirectionEnum b : StreetPredirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StreetPredirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StreetPredirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StreetPredirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StreetPredirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STREET_PREDIRECTION = "street_predirection";

  @SerializedName(SERIALIZED_NAME_STREET_PREDIRECTION)
  

  private StreetPredirectionEnum streetPredirection;
  /**
  * Geographic direction preceding a street name (`N`, `S`, `E`, `W`, `NE`, `SW`, `SE`, `NW`). 
  * @return streetPredirection
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Geographic direction preceding a street name (`N`, `S`, `E`, `W`, `NE`, `SW`, `SE`, `NW`). ")
  
  public StreetPredirectionEnum getStreetPredirection() {
      return streetPredirection;
  }
  
  

  public static final String SERIALIZED_NAME_STREET_NAME = "street_name";

  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  

  private String streetName;
  /**
  * The name of the street.
  * @return streetName
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The name of the street.")
  
  public String getStreetName() {
      return streetName;
  }
  
  

  public static final String SERIALIZED_NAME_STREET_SUFFIX = "street_suffix";

  @SerializedName(SERIALIZED_NAME_STREET_SUFFIX)
  

  private String streetSuffix;
  /**
  * The standard USPS abbreviation for the street suffix (`ST`, `AVE`, `BLVD`, etc). 
  * @return streetSuffix
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The standard USPS abbreviation for the street suffix (`ST`, `AVE`, `BLVD`, etc). ")
  
  public String getStreetSuffix() {
      return streetSuffix;
  }
  
  

  /**
   * Geographic direction following a street name (&#x60;N&#x60;, &#x60;S&#x60;, &#x60;E&#x60;, &#x60;W&#x60;, &#x60;NE&#x60;, &#x60;SW&#x60;, &#x60;SE&#x60;, &#x60;NW&#x60;). 
   */
  @JsonAdapter(StreetPostdirectionEnum.Adapter.class)
  public enum StreetPostdirectionEnum {
    N("N"),
    
    S("S"),
    
    E("E"),
    
    W("W"),
    
    NE("NE"),
    
    SW("SW"),
    
    SE("SE"),
    
    NW("NW"),
    
    EMPTY("");

    private String value;

    StreetPostdirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StreetPostdirectionEnum fromValue(String value) {
      for (StreetPostdirectionEnum b : StreetPostdirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StreetPostdirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StreetPostdirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StreetPostdirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StreetPostdirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STREET_POSTDIRECTION = "street_postdirection";

  @SerializedName(SERIALIZED_NAME_STREET_POSTDIRECTION)
  

  private StreetPostdirectionEnum streetPostdirection;
  /**
  * Geographic direction following a street name (`N`, `S`, `E`, `W`, `NE`, `SW`, `SE`, `NW`). 
  * @return streetPostdirection
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Geographic direction following a street name (`N`, `S`, `E`, `W`, `NE`, `SW`, `SE`, `NW`). ")
  
  public StreetPostdirectionEnum getStreetPostdirection() {
      return streetPostdirection;
  }
  
  

  public static final String SERIALIZED_NAME_SECONDARY_DESIGNATOR = "secondary_designator";

  @SerializedName(SERIALIZED_NAME_SECONDARY_DESIGNATOR)
  

  private String secondaryDesignator;
  /**
  * The standard USPS abbreviation describing the `components[secondary_number]` (`STE`, `APT`, `BLDG`, etc). 
  * @return secondaryDesignator
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The standard USPS abbreviation describing the `components[secondary_number]` (`STE`, `APT`, `BLDG`, etc). ")
  
  public String getSecondaryDesignator() {
      return secondaryDesignator;
  }
  
  

  public static final String SERIALIZED_NAME_SECONDARY_NUMBER = "secondary_number";

  @SerializedName(SERIALIZED_NAME_SECONDARY_NUMBER)
  

  private String secondaryNumber;
  /**
  * Number of the apartment/unit/etc. 
  * @return secondaryNumber
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Number of the apartment/unit/etc. ")
  
  public String getSecondaryNumber() {
      return secondaryNumber;
  }
  
  

  public static final String SERIALIZED_NAME_PMB_DESIGNATOR = "pmb_designator";

  @SerializedName(SERIALIZED_NAME_PMB_DESIGNATOR)
  

  private String pmbDesignator;
  /**
  * Designator of a [CMRA-authorized](https://en.wikipedia.org/wiki/Commercial_mail_receiving_agency) private mailbox. 
  * @return pmbDesignator
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Designator of a [CMRA-authorized](https://en.wikipedia.org/wiki/Commercial_mail_receiving_agency) private mailbox. ")
  
  public String getPmbDesignator() {
      return pmbDesignator;
  }
  
  

  public static final String SERIALIZED_NAME_PMB_NUMBER = "pmb_number";

  @SerializedName(SERIALIZED_NAME_PMB_NUMBER)
  

  private String pmbNumber;
  /**
  * Number of a [CMRA-authorized](https://en.wikipedia.org/wiki/Commercial_mail_receiving_agency) private mailbox. 
  * @return pmbNumber
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Number of a [CMRA-authorized](https://en.wikipedia.org/wiki/Commercial_mail_receiving_agency) private mailbox. ")
  
  public String getPmbNumber() {
      return pmbNumber;
  }
  
  

  public static final String SERIALIZED_NAME_EXTRA_SECONDARY_DESIGNATOR = "extra_secondary_designator";

  @SerializedName(SERIALIZED_NAME_EXTRA_SECONDARY_DESIGNATOR)
  

  private String extraSecondaryDesignator;
  /**
  * An extra (often unnecessary) secondary designator provided with the input address. 
  * @return extraSecondaryDesignator
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "An extra (often unnecessary) secondary designator provided with the input address. ")
  
  public String getExtraSecondaryDesignator() {
      return extraSecondaryDesignator;
  }
  
  

  public static final String SERIALIZED_NAME_EXTRA_SECONDARY_NUMBER = "extra_secondary_number";

  @SerializedName(SERIALIZED_NAME_EXTRA_SECONDARY_NUMBER)
  

  private String extraSecondaryNumber;
  /**
  * An extra (often unnecessary) secondary number provided with the input address. 
  * @return extraSecondaryNumber
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "An extra (often unnecessary) secondary number provided with the input address. ")
  
  public String getExtraSecondaryNumber() {
      return extraSecondaryNumber;
  }
  
  

  public static final String SERIALIZED_NAME_CITY = "city";

  @SerializedName(SERIALIZED_NAME_CITY)
  

  private String city;
  /**
  * Get city
  * @return city
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public String getCity() {
      return city;
  }
  
  

  public static final String SERIALIZED_NAME_STATE = "state";

  @SerializedName(SERIALIZED_NAME_STATE)
  

  private String state;
  /**
  * The [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) two letter code for the state. 
  * @return state
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) two letter code for the state. ")
  
  public String getState() {
      return state;
  }
  
  

  public static final String SERIALIZED_NAME_ZIP_CODE = "zip_code";

  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  

  private String zipCode;
  /**
  * The 5-digit ZIP code
  * @return zipCode
  **/
  
  @javax.annotation.Nonnull
  
  public String getZipCode() { return zipCode; }

  public void setZipCode (String zipCode) throws IllegalArgumentException {
    if(!zipCode.matches("^\\d{5}$")) {
      throw new IllegalArgumentException("Invalid zip_code provided");
    }

    this.zipCode = zipCode;
  }
  
  

  public static final String SERIALIZED_NAME_ZIP_CODE_PLUS4 = "zip_code_plus_4";

  @SerializedName(SERIALIZED_NAME_ZIP_CODE_PLUS4)
  

  private String zipCodePlus4;
  /**
  * Get zipCodePlus4
  * @return zipCodePlus4
  **/
  
  @javax.annotation.Nonnull
  
  public String getZipCodePlus4() { return zipCodePlus4; }

  public void setZipCodePlus4 (String zipCodePlus4) throws IllegalArgumentException {
    if(!zipCodePlus4.matches("^(\\d{4})?$")) {
      throw new IllegalArgumentException("Invalid zip_code_plus_4 provided");
    }

    this.zipCodePlus4 = zipCodePlus4;
  }
  
  

  public static final String SERIALIZED_NAME_ZIP_CODE_TYPE = "zip_code_type";

  @SerializedName(SERIALIZED_NAME_ZIP_CODE_TYPE)
  

  private ZipCodeType zipCodeType;
  /**
  * Get zipCodeType
  * @return zipCodeType
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "")
  
  public ZipCodeType getZipCodeType() {
      return zipCodeType;
  }
  
  

  public static final String SERIALIZED_NAME_DELIVERY_POINT_BARCODE = "delivery_point_barcode";

  @SerializedName(SERIALIZED_NAME_DELIVERY_POINT_BARCODE)
  

  private String deliveryPointBarcode;
  /**
  * A 12-digit identifier that uniquely identifies a delivery point (location where mail can be sent and received). It consists of the 5-digit ZIP code (`zip_code`), 4-digit ZIP+4 add-on (`zip_code_plus_4`), 2-digit delivery point, and 1-digit delivery point check digit. 
  * @return deliveryPointBarcode
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "A 12-digit identifier that uniquely identifies a delivery point (location where mail can be sent and received). It consists of the 5-digit ZIP code (`zip_code`), 4-digit ZIP+4 add-on (`zip_code_plus_4`), 2-digit delivery point, and 1-digit delivery point check digit. ")
  
  public String getDeliveryPointBarcode() {
      return deliveryPointBarcode;
  }
  
  

  /**
   * Uses USPS&#39;s [Residential Delivery Indicator (RDI)](https://www.usps.com/nationalpremieraccounts/rdi.htm) to identify whether an address is classified as residential or business. Possible values are: * &#x60;residential&#x60; –– The address is residential or a PO Box. * &#x60;commercial&#x60; –– The address is commercial. * &#x60;&#39;&#39;&#x60; –– Not enough information provided to be determined. 
   */
  @JsonAdapter(AddressTypeEnum.Adapter.class)
  public enum AddressTypeEnum {
    RESIDENTIAL("residential"),
    
    COMMERCIAL("commercial"),
    
    EMPTY("");

    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressTypeEnum fromValue(String value) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AddressTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AddressTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "address_type";

  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  

  private AddressTypeEnum addressType;
  /**
  * Uses USPS's [Residential Delivery Indicator (RDI)](https://www.usps.com/nationalpremieraccounts/rdi.htm) to identify whether an address is classified as residential or business. Possible values are: * `residential` –– The address is residential or a PO Box. * `commercial` –– The address is commercial. * `''` –– Not enough information provided to be determined. 
  * @return addressType
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Uses USPS's [Residential Delivery Indicator (RDI)](https://www.usps.com/nationalpremieraccounts/rdi.htm) to identify whether an address is classified as residential or business. Possible values are: * `residential` –– The address is residential or a PO Box. * `commercial` –– The address is commercial. * `''` –– Not enough information provided to be determined. ")
  
  public AddressTypeEnum getAddressType() {
      return addressType;
  }
  
  

  /**
   * A description of the type of address. Populated if a DPV match is made (&#x60;deliverability_analysis[dpv_confirmation]&#x60; is &#x60;Y&#x60;, &#x60;S&#x60;, or &#x60;D&#x60;). For more detailed information about each record type, see [US Verification Details](#tag/US-Verification-Types). 
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    STREET("street"),
    
    HIGHRISE("highrise"),
    
    FIRM("firm"),
    
    PO_BOX("po_box"),
    
    RURAL_ROUTE("rural_route"),
    
    GENERAL_DELIVERY("general_delivery"),
    
    EMPTY("");

    private String value;

    RecordTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RecordTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecordTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecordTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RecordTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RECORD_TYPE = "record_type";

  @SerializedName(SERIALIZED_NAME_RECORD_TYPE)
  

  private RecordTypeEnum recordType;
  /**
  * A description of the type of address. Populated if a DPV match is made (`deliverability_analysis[dpv_confirmation]` is `Y`, `S`, or `D`). For more detailed information about each record type, see [US Verification Details](#tag/US-Verification-Types). 
  * @return recordType
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "A description of the type of address. Populated if a DPV match is made (`deliverability_analysis[dpv_confirmation]` is `Y`, `S`, or `D`). For more detailed information about each record type, see [US Verification Details](#tag/US-Verification-Types). ")
  
  public RecordTypeEnum getRecordType() {
      return recordType;
  }
  
  

  public static final String SERIALIZED_NAME_DEFAULT_BUILDING_ADDRESS = "default_building_address";

  @SerializedName(SERIALIZED_NAME_DEFAULT_BUILDING_ADDRESS)
  

  private Boolean defaultBuildingAddress;
  /**
  * Designates whether or not the address is the default address for a building containing multiple delivery points. 
  * @return defaultBuildingAddress
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "Designates whether or not the address is the default address for a building containing multiple delivery points. ")
  
  public Boolean getDefaultBuildingAddress() {
      return defaultBuildingAddress;
  }
  
  

  public static final String SERIALIZED_NAME_COUNTY = "county";

  @SerializedName(SERIALIZED_NAME_COUNTY)
  

  private String county;
  /**
  * County name of the address city.
  * @return county
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "County name of the address city.")
  
  public String getCounty() {
      return county;
  }
  
  

  public static final String SERIALIZED_NAME_COUNTY_FIPS = "county_fips";

  @SerializedName(SERIALIZED_NAME_COUNTY_FIPS)
  

  private String countyFips;
  /**
  * A 5-digit [FIPS county code](https://en.wikipedia.org/wiki/FIPS_county_code) which uniquely identifies `components[county]`. It consists of a 2-digit state code and a 3-digit county code. 
  * @return countyFips
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "A 5-digit [FIPS county code](https://en.wikipedia.org/wiki/FIPS_county_code) which uniquely identifies `components[county]`. It consists of a 2-digit state code and a 3-digit county code. ")
  
  public String getCountyFips() {
      return countyFips;
  }
  
  

  public static final String SERIALIZED_NAME_CARRIER_ROUTE = "carrier_route";

  @SerializedName(SERIALIZED_NAME_CARRIER_ROUTE)
  

  private String carrierRoute;
  /**
  * A 4-character code assigned to a mail delivery route within a ZIP code. 
  * @return carrierRoute
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "A 4-character code assigned to a mail delivery route within a ZIP code. ")
  
  public String getCarrierRoute() {
      return carrierRoute;
  }
  
  

  /**
   * The type of &#x60;components[carrier_route]&#x60;. For more detailed information about each carrier route type, see [US Verification Details](#tag/US-Verification-Types). 
   */
  @JsonAdapter(CarrierRouteTypeEnum.Adapter.class)
  public enum CarrierRouteTypeEnum {
    CITY_DELIVERY("city_delivery"),
    
    RURAL_ROUTE("rural_route"),
    
    HIGHWAY_CONTRACT("highway_contract"),
    
    PO_BOX("po_box"),
    
    GENERAL_DELIVERY("general_delivery"),
    
    EMPTY("");

    private String value;

    CarrierRouteTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CarrierRouteTypeEnum fromValue(String value) {
      for (CarrierRouteTypeEnum b : CarrierRouteTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CarrierRouteTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CarrierRouteTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CarrierRouteTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CarrierRouteTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CARRIER_ROUTE_TYPE = "carrier_route_type";

  @SerializedName(SERIALIZED_NAME_CARRIER_ROUTE_TYPE)
  

  private CarrierRouteTypeEnum carrierRouteType;
  /**
  * The type of `components[carrier_route]`. For more detailed information about each carrier route type, see [US Verification Details](#tag/US-Verification-Types). 
  * @return carrierRouteType
  **/
  
  @javax.annotation.Nonnull
  
  @ApiModelProperty(required = true, value = "The type of `components[carrier_route]`. For more detailed information about each carrier route type, see [US Verification Details](#tag/US-Verification-Types). ")
  
  public CarrierRouteTypeEnum getCarrierRouteType() {
      return carrierRouteType;
  }
  
  

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";

  @SerializedName(SERIALIZED_NAME_LATITUDE)
  

  private Float latitude;
  /**
  * A positive or negative decimal indicating the geographic latitude of the address, specifying the north-to-south position of a location. This should be used with `longitude` to pinpoint locations on a map. Will not be returned for undeliverable addresses or military addresses (state is `AA`, `AE`, or `AP`). 
  * @return latitude
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "A positive or negative decimal indicating the geographic latitude of the address, specifying the north-to-south position of a location. This should be used with `longitude` to pinpoint locations on a map. Will not be returned for undeliverable addresses or military addresses (state is `AA`, `AE`, or `AP`). ")
  
  public Float getLatitude() {
      return latitude;
  }
  
  

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";

  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  

  private Float longitude;
  /**
  * A positive or negative decimal indicating the geographic longitude of the address, specifying the north-to-south position of a location. This should be used with `latitude` to pinpoint locations on a map. Will not be returned for undeliverable addresses or military addresses (state is `AA`, `AE`, or `AP`). 
  * @return longitude
  **/
  
  @javax.annotation.Nullable
  
  @ApiModelProperty(value = "A positive or negative decimal indicating the geographic longitude of the address, specifying the north-to-south position of a location. This should be used with `latitude` to pinpoint locations on a map. Will not be returned for undeliverable addresses or military addresses (state is `AA`, `AE`, or `AP`). ")
  
  public Float getLongitude() {
      return longitude;
  }
  
  


  /*
  public UsComponents primaryNumber(String primaryNumber) {
    
    this.primaryNumber = primaryNumber;
    return this;
  }
  */


  public void setPrimaryNumber(String primaryNumber) {
    this.primaryNumber = primaryNumber;
  }



  /*
  public UsComponents streetPredirection(StreetPredirectionEnum streetPredirection) {
    
    this.streetPredirection = streetPredirection;
    return this;
  }
  */


  public void setStreetPredirection(StreetPredirectionEnum streetPredirection) {
    this.streetPredirection = streetPredirection;
  }



  /*
  public UsComponents streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }
  */


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }



  /*
  public UsComponents streetSuffix(String streetSuffix) {
    
    this.streetSuffix = streetSuffix;
    return this;
  }
  */


  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }



  /*
  public UsComponents streetPostdirection(StreetPostdirectionEnum streetPostdirection) {
    
    this.streetPostdirection = streetPostdirection;
    return this;
  }
  */


  public void setStreetPostdirection(StreetPostdirectionEnum streetPostdirection) {
    this.streetPostdirection = streetPostdirection;
  }



  /*
  public UsComponents secondaryDesignator(String secondaryDesignator) {
    
    this.secondaryDesignator = secondaryDesignator;
    return this;
  }
  */


  public void setSecondaryDesignator(String secondaryDesignator) {
    this.secondaryDesignator = secondaryDesignator;
  }



  /*
  public UsComponents secondaryNumber(String secondaryNumber) {
    
    this.secondaryNumber = secondaryNumber;
    return this;
  }
  */


  public void setSecondaryNumber(String secondaryNumber) {
    this.secondaryNumber = secondaryNumber;
  }



  /*
  public UsComponents pmbDesignator(String pmbDesignator) {
    
    this.pmbDesignator = pmbDesignator;
    return this;
  }
  */


  public void setPmbDesignator(String pmbDesignator) {
    this.pmbDesignator = pmbDesignator;
  }



  /*
  public UsComponents pmbNumber(String pmbNumber) {
    
    this.pmbNumber = pmbNumber;
    return this;
  }
  */


  public void setPmbNumber(String pmbNumber) {
    this.pmbNumber = pmbNumber;
  }



  /*
  public UsComponents extraSecondaryDesignator(String extraSecondaryDesignator) {
    
    this.extraSecondaryDesignator = extraSecondaryDesignator;
    return this;
  }
  */


  public void setExtraSecondaryDesignator(String extraSecondaryDesignator) {
    this.extraSecondaryDesignator = extraSecondaryDesignator;
  }



  /*
  public UsComponents extraSecondaryNumber(String extraSecondaryNumber) {
    
    this.extraSecondaryNumber = extraSecondaryNumber;
    return this;
  }
  */


  public void setExtraSecondaryNumber(String extraSecondaryNumber) {
    this.extraSecondaryNumber = extraSecondaryNumber;
  }



  /*
  public UsComponents city(String city) {
    
    this.city = city;
    return this;
  }
  */


  public void setCity(String city) {
    this.city = city;
  }



  /*
  public UsComponents state(String state) {
    
    this.state = state;
    return this;
  }
  */


  public void setState(String state) {
    this.state = state;
  }



  /*
  public UsComponents zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }
  */





  /*
  public UsComponents zipCodePlus4(String zipCodePlus4) {
    
    this.zipCodePlus4 = zipCodePlus4;
    return this;
  }
  */





  /*
  public UsComponents zipCodeType(ZipCodeType zipCodeType) {
    
    this.zipCodeType = zipCodeType;
    return this;
  }
  */


  public void setZipCodeType(ZipCodeType zipCodeType) {
    this.zipCodeType = zipCodeType;
  }



  /*
  public UsComponents deliveryPointBarcode(String deliveryPointBarcode) {
    
    this.deliveryPointBarcode = deliveryPointBarcode;
    return this;
  }
  */


  public void setDeliveryPointBarcode(String deliveryPointBarcode) {
    this.deliveryPointBarcode = deliveryPointBarcode;
  }



  /*
  public UsComponents addressType(AddressTypeEnum addressType) {
    
    this.addressType = addressType;
    return this;
  }
  */


  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }



  /*
  public UsComponents recordType(RecordTypeEnum recordType) {
    
    this.recordType = recordType;
    return this;
  }
  */


  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }



  /*
  public UsComponents defaultBuildingAddress(Boolean defaultBuildingAddress) {
    
    this.defaultBuildingAddress = defaultBuildingAddress;
    return this;
  }
  */


  public void setDefaultBuildingAddress(Boolean defaultBuildingAddress) {
    this.defaultBuildingAddress = defaultBuildingAddress;
  }



  /*
  public UsComponents county(String county) {
    
    this.county = county;
    return this;
  }
  */


  public void setCounty(String county) {
    this.county = county;
  }



  /*
  public UsComponents countyFips(String countyFips) {
    
    this.countyFips = countyFips;
    return this;
  }
  */


  public void setCountyFips(String countyFips) {
    this.countyFips = countyFips;
  }



  /*
  public UsComponents carrierRoute(String carrierRoute) {
    
    this.carrierRoute = carrierRoute;
    return this;
  }
  */


  public void setCarrierRoute(String carrierRoute) {
    this.carrierRoute = carrierRoute;
  }



  /*
  public UsComponents carrierRouteType(CarrierRouteTypeEnum carrierRouteType) {
    
    this.carrierRouteType = carrierRouteType;
    return this;
  }
  */


  public void setCarrierRouteType(CarrierRouteTypeEnum carrierRouteType) {
    this.carrierRouteType = carrierRouteType;
  }



  /*
  public UsComponents latitude(Float latitude) {
    
    this.latitude = latitude;
    return this;
  }
  */


  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }



  /*
  public UsComponents longitude(Float longitude) {
    
    this.longitude = longitude;
    return this;
  }
  */


  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsComponents usComponents = (UsComponents) o;
    return Objects.equals(this.primaryNumber, usComponents.primaryNumber) &&
        Objects.equals(this.streetPredirection, usComponents.streetPredirection) &&
        Objects.equals(this.streetName, usComponents.streetName) &&
        Objects.equals(this.streetSuffix, usComponents.streetSuffix) &&
        Objects.equals(this.streetPostdirection, usComponents.streetPostdirection) &&
        Objects.equals(this.secondaryDesignator, usComponents.secondaryDesignator) &&
        Objects.equals(this.secondaryNumber, usComponents.secondaryNumber) &&
        Objects.equals(this.pmbDesignator, usComponents.pmbDesignator) &&
        Objects.equals(this.pmbNumber, usComponents.pmbNumber) &&
        Objects.equals(this.extraSecondaryDesignator, usComponents.extraSecondaryDesignator) &&
        Objects.equals(this.extraSecondaryNumber, usComponents.extraSecondaryNumber) &&
        Objects.equals(this.city, usComponents.city) &&
        Objects.equals(this.state, usComponents.state) &&
        Objects.equals(this.zipCode, usComponents.zipCode) &&
        Objects.equals(this.zipCodePlus4, usComponents.zipCodePlus4) &&
        Objects.equals(this.zipCodeType, usComponents.zipCodeType) &&
        Objects.equals(this.deliveryPointBarcode, usComponents.deliveryPointBarcode) &&
        Objects.equals(this.addressType, usComponents.addressType) &&
        Objects.equals(this.recordType, usComponents.recordType) &&
        Objects.equals(this.defaultBuildingAddress, usComponents.defaultBuildingAddress) &&
        Objects.equals(this.county, usComponents.county) &&
        Objects.equals(this.countyFips, usComponents.countyFips) &&
        Objects.equals(this.carrierRoute, usComponents.carrierRoute) &&
        Objects.equals(this.carrierRouteType, usComponents.carrierRouteType) &&
        Objects.equals(this.latitude, usComponents.latitude) &&
        Objects.equals(this.longitude, usComponents.longitude);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryNumber, streetPredirection, streetName, streetSuffix, streetPostdirection, secondaryDesignator, secondaryNumber, pmbDesignator, pmbNumber, extraSecondaryDesignator, extraSecondaryNumber, city, state, zipCode, zipCodePlus4, zipCodeType, deliveryPointBarcode, addressType, recordType, defaultBuildingAddress, county, countyFips, carrierRoute, carrierRouteType, latitude, longitude);
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
    sb.append("    primaryNumber: ").append(toIndentedString(primaryNumber)).append("\n");
    sb.append("    streetPredirection: ").append(toIndentedString(streetPredirection)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    streetPostdirection: ").append(toIndentedString(streetPostdirection)).append("\n");
    sb.append("    secondaryDesignator: ").append(toIndentedString(secondaryDesignator)).append("\n");
    sb.append("    secondaryNumber: ").append(toIndentedString(secondaryNumber)).append("\n");
    sb.append("    pmbDesignator: ").append(toIndentedString(pmbDesignator)).append("\n");
    sb.append("    pmbNumber: ").append(toIndentedString(pmbNumber)).append("\n");
    sb.append("    extraSecondaryDesignator: ").append(toIndentedString(extraSecondaryDesignator)).append("\n");
    sb.append("    extraSecondaryNumber: ").append(toIndentedString(extraSecondaryNumber)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    zipCodePlus4: ").append(toIndentedString(zipCodePlus4)).append("\n");
    sb.append("    zipCodeType: ").append(toIndentedString(zipCodeType)).append("\n");
    sb.append("    deliveryPointBarcode: ").append(toIndentedString(deliveryPointBarcode)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    defaultBuildingAddress: ").append(toIndentedString(defaultBuildingAddress)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    countyFips: ").append(toIndentedString(countyFips)).append("\n");
    sb.append("    carrierRoute: ").append(toIndentedString(carrierRoute)).append("\n");
    sb.append("    carrierRouteType: ").append(toIndentedString(carrierRouteType)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

