/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.mailslurp.clients.JSON;

/**
 * DNS lookup result. Includes record type, time to live, raw response, and name value for the name server response.
 */
@ApiModel(description = "DNS lookup result. Includes record type, time to live, raw response, and name value for the name server response.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T23:33:57.654989Z[Etc/UTC]")
public class DNSLookupResult {
  /**
   * Domain Name Server Record Types
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    A("A"),
    
    NS("NS"),
    
    MD("MD"),
    
    MF("MF"),
    
    CNAME("CNAME"),
    
    SOA("SOA"),
    
    MB("MB"),
    
    MG("MG"),
    
    MR("MR"),
    
    NULL("NULL"),
    
    WKS("WKS"),
    
    PTR("PTR"),
    
    HINFO("HINFO"),
    
    MINFO("MINFO"),
    
    MX("MX"),
    
    TXT("TXT"),
    
    RP("RP"),
    
    AFSDB("AFSDB"),
    
    X25("X25"),
    
    ISDN("ISDN"),
    
    RT("RT"),
    
    NSAP("NSAP"),
    
    NSAP_PTR("NSAP_PTR"),
    
    SIG("SIG"),
    
    KEY("KEY"),
    
    PX("PX"),
    
    GPOS("GPOS"),
    
    AAAA("AAAA"),
    
    LOC("LOC"),
    
    NXT("NXT"),
    
    EID("EID"),
    
    NIMLOC("NIMLOC"),
    
    SRV("SRV"),
    
    ATMA("ATMA"),
    
    NAPTR("NAPTR"),
    
    KX("KX"),
    
    CERT("CERT"),
    
    A6("A6"),
    
    DNAME("DNAME"),
    
    SINK("SINK"),
    
    OPT("OPT"),
    
    APL("APL"),
    
    DS("DS"),
    
    SSHFP("SSHFP"),
    
    IPSECKEY("IPSECKEY"),
    
    RRSIG("RRSIG"),
    
    NSEC("NSEC"),
    
    DNSKEY("DNSKEY"),
    
    DHCID("DHCID"),
    
    NSEC3("NSEC3"),
    
    NSEC3PARAM("NSEC3PARAM"),
    
    TLSA("TLSA"),
    
    SMIMEA("SMIMEA"),
    
    HIP("HIP"),
    
    NINFO("NINFO"),
    
    RKEY("RKEY"),
    
    TALINK("TALINK"),
    
    CDS("CDS"),
    
    CDNSKEY("CDNSKEY"),
    
    OPENPGPKEY("OPENPGPKEY"),
    
    CSYNC("CSYNC"),
    
    ZONEMD("ZONEMD"),
    
    SVCB("SVCB"),
    
    HTTPS("HTTPS"),
    
    SPF("SPF"),
    
    UINFO("UINFO"),
    
    UID("UID"),
    
    GID("GID"),
    
    UNSPEC("UNSPEC"),
    
    NID("NID"),
    
    L32("L32"),
    
    L64("L64"),
    
    LP("LP"),
    
    EUI48("EUI48"),
    
    EUI64("EUI64"),
    
    TKEY("TKEY"),
    
    TSIG("TSIG"),
    
    IXFR("IXFR"),
    
    AXFR("AXFR"),
    
    MAILB("MAILB"),
    
    MAILA("MAILA"),
    
    ANY("ANY"),
    
    URI("URI"),
    
    CAA("CAA"),
    
    AVC("AVC"),
    
    DOA("DOA"),
    
    AMTRELAY("AMTRELAY"),
    
    TA("TA"),
    
    DLV("DLV");

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

  public static final String SERIALIZED_NAME_RECORD_TYPE = "recordType";
  @SerializedName(SERIALIZED_NAME_RECORD_TYPE)
  private RecordTypeEnum recordType;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Long ttl;

  public static final String SERIALIZED_NAME_RECORD_ENTRIES = "recordEntries";
  @SerializedName(SERIALIZED_NAME_RECORD_ENTRIES)
  private List<String> recordEntries = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public DNSLookupResult() {
  }

  public DNSLookupResult recordType(RecordTypeEnum recordType) {
    
    this.recordType = recordType;
    return this;
  }

   /**
   * Domain Name Server Record Types
   * @return recordType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Domain Name Server Record Types")

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public DNSLookupResult ttl(Long ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getTtl() {
    return ttl;
  }


  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  public DNSLookupResult recordEntries(List<String> recordEntries) {
    
    this.recordEntries = recordEntries;
    return this;
  }

  public DNSLookupResult addRecordEntriesItem(String recordEntriesItem) {
    this.recordEntries.add(recordEntriesItem);
    return this;
  }

   /**
   * Get recordEntries
   * @return recordEntries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getRecordEntries() {
    return recordEntries;
  }


  public void setRecordEntries(List<String> recordEntries) {
    this.recordEntries = recordEntries;
  }


  public DNSLookupResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSLookupResult dnSLookupResult = (DNSLookupResult) o;
    return Objects.equals(this.recordType, dnSLookupResult.recordType) &&
        Objects.equals(this.ttl, dnSLookupResult.ttl) &&
        Objects.equals(this.recordEntries, dnSLookupResult.recordEntries) &&
        Objects.equals(this.name, dnSLookupResult.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, ttl, recordEntries, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSLookupResult {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    recordEntries: ").append(toIndentedString(recordEntries)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("recordType");
    openapiFields.add("ttl");
    openapiFields.add("recordEntries");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("recordType");
    openapiRequiredFields.add("ttl");
    openapiRequiredFields.add("recordEntries");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DNSLookupResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DNSLookupResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DNSLookupResult is not found in the empty JSON string", DNSLookupResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DNSLookupResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DNSLookupResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DNSLookupResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("recordType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recordType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recordType").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("recordEntries") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("recordEntries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `recordEntries` to be an array in the JSON string but got `%s`", jsonObj.get("recordEntries").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DNSLookupResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DNSLookupResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DNSLookupResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DNSLookupResult.class));

       return (TypeAdapter<T>) new TypeAdapter<DNSLookupResult>() {
           @Override
           public void write(JsonWriter out, DNSLookupResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DNSLookupResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DNSLookupResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DNSLookupResult
  * @throws IOException if the JSON string is invalid with respect to DNSLookupResult
  */
  public static DNSLookupResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DNSLookupResult.class);
  }

 /**
  * Convert an instance of DNSLookupResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

