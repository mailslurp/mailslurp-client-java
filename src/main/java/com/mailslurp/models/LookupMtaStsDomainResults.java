/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails and SMS from dynamically allocated email addresses and phone numbers. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mailslurp.models.DNSLookupOptions;
import com.mailslurp.models.DNSLookupResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mailslurp.clients.JSON;

/**
 * LookupMtaStsDomainResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class LookupMtaStsDomainResults {
  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  @javax.annotation.Nonnull
  private Boolean valid;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  @javax.annotation.Nonnull
  private DNSLookupOptions query;

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  @javax.annotation.Nonnull
  private List<DNSLookupResult> records = new ArrayList<>();

  public static final String SERIALIZED_NAME_WELL_KNOWN_QUERY = "wellKnownQuery";
  @SerializedName(SERIALIZED_NAME_WELL_KNOWN_QUERY)
  @javax.annotation.Nonnull
  private String wellKnownQuery;

  public static final String SERIALIZED_NAME_WELL_KNOWN_PRESENT = "wellKnownPresent";
  @SerializedName(SERIALIZED_NAME_WELL_KNOWN_PRESENT)
  @javax.annotation.Nonnull
  private Boolean wellKnownPresent;

  public static final String SERIALIZED_NAME_WELL_KNOWN_VALUE = "wellKnownValue";
  @SerializedName(SERIALIZED_NAME_WELL_KNOWN_VALUE)
  @javax.annotation.Nonnull
  private String wellKnownValue;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  @javax.annotation.Nonnull
  private List<String> errors = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  @javax.annotation.Nonnull
  private List<String> warnings = new ArrayList<>();

  public LookupMtaStsDomainResults() {
  }

  public LookupMtaStsDomainResults valid(@javax.annotation.Nonnull Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  @javax.annotation.Nonnull
  public Boolean getValid() {
    return valid;
  }

  public void setValid(@javax.annotation.Nonnull Boolean valid) {
    this.valid = valid;
  }


  public LookupMtaStsDomainResults query(@javax.annotation.Nonnull DNSLookupOptions query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @javax.annotation.Nonnull
  public DNSLookupOptions getQuery() {
    return query;
  }

  public void setQuery(@javax.annotation.Nonnull DNSLookupOptions query) {
    this.query = query;
  }


  public LookupMtaStsDomainResults records(@javax.annotation.Nonnull List<DNSLookupResult> records) {
    this.records = records;
    return this;
  }

  public LookupMtaStsDomainResults addRecordsItem(DNSLookupResult recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

  /**
   * Get records
   * @return records
   */
  @javax.annotation.Nonnull
  public List<DNSLookupResult> getRecords() {
    return records;
  }

  public void setRecords(@javax.annotation.Nonnull List<DNSLookupResult> records) {
    this.records = records;
  }


  public LookupMtaStsDomainResults wellKnownQuery(@javax.annotation.Nonnull String wellKnownQuery) {
    this.wellKnownQuery = wellKnownQuery;
    return this;
  }

  /**
   * Get wellKnownQuery
   * @return wellKnownQuery
   */
  @javax.annotation.Nonnull
  public String getWellKnownQuery() {
    return wellKnownQuery;
  }

  public void setWellKnownQuery(@javax.annotation.Nonnull String wellKnownQuery) {
    this.wellKnownQuery = wellKnownQuery;
  }


  public LookupMtaStsDomainResults wellKnownPresent(@javax.annotation.Nonnull Boolean wellKnownPresent) {
    this.wellKnownPresent = wellKnownPresent;
    return this;
  }

  /**
   * Get wellKnownPresent
   * @return wellKnownPresent
   */
  @javax.annotation.Nonnull
  public Boolean getWellKnownPresent() {
    return wellKnownPresent;
  }

  public void setWellKnownPresent(@javax.annotation.Nonnull Boolean wellKnownPresent) {
    this.wellKnownPresent = wellKnownPresent;
  }


  public LookupMtaStsDomainResults wellKnownValue(@javax.annotation.Nonnull String wellKnownValue) {
    this.wellKnownValue = wellKnownValue;
    return this;
  }

  /**
   * Get wellKnownValue
   * @return wellKnownValue
   */
  @javax.annotation.Nonnull
  public String getWellKnownValue() {
    return wellKnownValue;
  }

  public void setWellKnownValue(@javax.annotation.Nonnull String wellKnownValue) {
    this.wellKnownValue = wellKnownValue;
  }


  public LookupMtaStsDomainResults errors(@javax.annotation.Nonnull List<String> errors) {
    this.errors = errors;
    return this;
  }

  public LookupMtaStsDomainResults addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @javax.annotation.Nonnull
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(@javax.annotation.Nonnull List<String> errors) {
    this.errors = errors;
  }


  public LookupMtaStsDomainResults warnings(@javax.annotation.Nonnull List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public LookupMtaStsDomainResults addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Get warnings
   * @return warnings
   */
  @javax.annotation.Nonnull
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(@javax.annotation.Nonnull List<String> warnings) {
    this.warnings = warnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupMtaStsDomainResults lookupMtaStsDomainResults = (LookupMtaStsDomainResults) o;
    return Objects.equals(this.valid, lookupMtaStsDomainResults.valid) &&
        Objects.equals(this.query, lookupMtaStsDomainResults.query) &&
        Objects.equals(this.records, lookupMtaStsDomainResults.records) &&
        Objects.equals(this.wellKnownQuery, lookupMtaStsDomainResults.wellKnownQuery) &&
        Objects.equals(this.wellKnownPresent, lookupMtaStsDomainResults.wellKnownPresent) &&
        Objects.equals(this.wellKnownValue, lookupMtaStsDomainResults.wellKnownValue) &&
        Objects.equals(this.errors, lookupMtaStsDomainResults.errors) &&
        Objects.equals(this.warnings, lookupMtaStsDomainResults.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, query, records, wellKnownQuery, wellKnownPresent, wellKnownValue, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupMtaStsDomainResults {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    wellKnownQuery: ").append(toIndentedString(wellKnownQuery)).append("\n");
    sb.append("    wellKnownPresent: ").append(toIndentedString(wellKnownPresent)).append("\n");
    sb.append("    wellKnownValue: ").append(toIndentedString(wellKnownValue)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("valid");
    openapiFields.add("query");
    openapiFields.add("records");
    openapiFields.add("wellKnownQuery");
    openapiFields.add("wellKnownPresent");
    openapiFields.add("wellKnownValue");
    openapiFields.add("errors");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("valid");
    openapiRequiredFields.add("query");
    openapiRequiredFields.add("records");
    openapiRequiredFields.add("wellKnownQuery");
    openapiRequiredFields.add("wellKnownPresent");
    openapiRequiredFields.add("wellKnownValue");
    openapiRequiredFields.add("errors");
    openapiRequiredFields.add("warnings");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LookupMtaStsDomainResults
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!LookupMtaStsDomainResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LookupMtaStsDomainResults is not found in the empty JSON string", LookupMtaStsDomainResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LookupMtaStsDomainResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LookupMtaStsDomainResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LookupMtaStsDomainResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `query`
      DNSLookupOptions.validateJsonElement(jsonObj.get("query"));
      // ensure the json data is an array
      if (!jsonObj.get("records").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `records` to be an array in the JSON string but got `%s`", jsonObj.get("records").toString()));
      }

      JsonArray jsonArrayrecords = jsonObj.getAsJsonArray("records");
      // validate the required field `records` (array)
      for (int i = 0; i < jsonArrayrecords.size(); i++) {
        DNSLookupResult.validateJsonElement(jsonArrayrecords.get(i));
      };
      if (!jsonObj.get("wellKnownQuery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wellKnownQuery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wellKnownQuery").toString()));
      }
      if (!jsonObj.get("wellKnownValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wellKnownValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wellKnownValue").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("errors") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("warnings") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("warnings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LookupMtaStsDomainResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LookupMtaStsDomainResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LookupMtaStsDomainResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LookupMtaStsDomainResults.class));

       return (TypeAdapter<T>) new TypeAdapter<LookupMtaStsDomainResults>() {
           @Override
           public void write(JsonWriter out, LookupMtaStsDomainResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LookupMtaStsDomainResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LookupMtaStsDomainResults given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LookupMtaStsDomainResults
   * @throws IOException if the JSON string is invalid with respect to LookupMtaStsDomainResults
   */
  public static LookupMtaStsDomainResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LookupMtaStsDomainResults.class);
  }

  /**
   * Convert an instance of LookupMtaStsDomainResults to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

