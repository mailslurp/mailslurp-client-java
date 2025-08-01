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
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;

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
 * WaitForSingleSmsOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class WaitForSingleSmsOptions {
  public static final String SERIALIZED_NAME_PHONE_NUMBER_ID = "phoneNumberId";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_ID)
  @javax.annotation.Nonnull
  private UUID phoneNumberId;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  @javax.annotation.Nonnull
  private Long timeout;

  public static final String SERIALIZED_NAME_UNREAD_ONLY = "unreadOnly";
  @SerializedName(SERIALIZED_NAME_UNREAD_ONLY)
  @javax.annotation.Nullable
  private Boolean unreadOnly;

  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  @javax.annotation.Nullable
  private OffsetDateTime before;

  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  @javax.annotation.Nullable
  private OffsetDateTime since;

  /**
   * Gets or Sets sortDirection
   */
  @JsonAdapter(SortDirectionEnum.Adapter.class)
  public enum SortDirectionEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    SortDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortDirectionEnum fromValue(String value) {
      for (SortDirectionEnum b : SortDirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortDirectionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      String value = jsonElement.getAsString();
      SortDirectionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SORT_DIRECTION = "sortDirection";
  @SerializedName(SERIALIZED_NAME_SORT_DIRECTION)
  @javax.annotation.Nullable
  private SortDirectionEnum sortDirection;

  public static final String SERIALIZED_NAME_DELAY = "delay";
  @SerializedName(SERIALIZED_NAME_DELAY)
  @javax.annotation.Nullable
  private Long delay;

  public WaitForSingleSmsOptions() {
  }

  public WaitForSingleSmsOptions phoneNumberId(@javax.annotation.Nonnull UUID phoneNumberId) {
    this.phoneNumberId = phoneNumberId;
    return this;
  }

  /**
   * Get phoneNumberId
   * @return phoneNumberId
   */
  @javax.annotation.Nonnull
  public UUID getPhoneNumberId() {
    return phoneNumberId;
  }

  public void setPhoneNumberId(@javax.annotation.Nonnull UUID phoneNumberId) {
    this.phoneNumberId = phoneNumberId;
  }


  public WaitForSingleSmsOptions timeout(@javax.annotation.Nonnull Long timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Get timeout
   * @return timeout
   */
  @javax.annotation.Nonnull
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(@javax.annotation.Nonnull Long timeout) {
    this.timeout = timeout;
  }


  public WaitForSingleSmsOptions unreadOnly(@javax.annotation.Nullable Boolean unreadOnly) {
    this.unreadOnly = unreadOnly;
    return this;
  }

  /**
   * Get unreadOnly
   * @return unreadOnly
   */
  @javax.annotation.Nullable
  public Boolean getUnreadOnly() {
    return unreadOnly;
  }

  public void setUnreadOnly(@javax.annotation.Nullable Boolean unreadOnly) {
    this.unreadOnly = unreadOnly;
  }


  public WaitForSingleSmsOptions before(@javax.annotation.Nullable OffsetDateTime before) {
    this.before = before;
    return this;
  }

  /**
   * Get before
   * @return before
   */
  @javax.annotation.Nullable
  public OffsetDateTime getBefore() {
    return before;
  }

  public void setBefore(@javax.annotation.Nullable OffsetDateTime before) {
    this.before = before;
  }


  public WaitForSingleSmsOptions since(@javax.annotation.Nullable OffsetDateTime since) {
    this.since = since;
    return this;
  }

  /**
   * Get since
   * @return since
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSince() {
    return since;
  }

  public void setSince(@javax.annotation.Nullable OffsetDateTime since) {
    this.since = since;
  }


  public WaitForSingleSmsOptions sortDirection(@javax.annotation.Nullable SortDirectionEnum sortDirection) {
    this.sortDirection = sortDirection;
    return this;
  }

  /**
   * Get sortDirection
   * @return sortDirection
   */
  @javax.annotation.Nullable
  public SortDirectionEnum getSortDirection() {
    return sortDirection;
  }

  public void setSortDirection(@javax.annotation.Nullable SortDirectionEnum sortDirection) {
    this.sortDirection = sortDirection;
  }


  public WaitForSingleSmsOptions delay(@javax.annotation.Nullable Long delay) {
    this.delay = delay;
    return this;
  }

  /**
   * Get delay
   * @return delay
   */
  @javax.annotation.Nullable
  public Long getDelay() {
    return delay;
  }

  public void setDelay(@javax.annotation.Nullable Long delay) {
    this.delay = delay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaitForSingleSmsOptions waitForSingleSmsOptions = (WaitForSingleSmsOptions) o;
    return Objects.equals(this.phoneNumberId, waitForSingleSmsOptions.phoneNumberId) &&
        Objects.equals(this.timeout, waitForSingleSmsOptions.timeout) &&
        Objects.equals(this.unreadOnly, waitForSingleSmsOptions.unreadOnly) &&
        Objects.equals(this.before, waitForSingleSmsOptions.before) &&
        Objects.equals(this.since, waitForSingleSmsOptions.since) &&
        Objects.equals(this.sortDirection, waitForSingleSmsOptions.sortDirection) &&
        Objects.equals(this.delay, waitForSingleSmsOptions.delay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumberId, timeout, unreadOnly, before, since, sortDirection, delay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaitForSingleSmsOptions {\n");
    sb.append("    phoneNumberId: ").append(toIndentedString(phoneNumberId)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    unreadOnly: ").append(toIndentedString(unreadOnly)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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
    openapiFields.add("phoneNumberId");
    openapiFields.add("timeout");
    openapiFields.add("unreadOnly");
    openapiFields.add("before");
    openapiFields.add("since");
    openapiFields.add("sortDirection");
    openapiFields.add("delay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("phoneNumberId");
    openapiRequiredFields.add("timeout");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WaitForSingleSmsOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!WaitForSingleSmsOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WaitForSingleSmsOptions is not found in the empty JSON string", WaitForSingleSmsOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WaitForSingleSmsOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WaitForSingleSmsOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WaitForSingleSmsOptions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("phoneNumberId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberId").toString()));
      }
      if ((jsonObj.get("sortDirection") != null && !jsonObj.get("sortDirection").isJsonNull()) && !jsonObj.get("sortDirection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortDirection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortDirection").toString()));
      }
      // validate the optional field `sortDirection`
      if (jsonObj.get("sortDirection") != null && !jsonObj.get("sortDirection").isJsonNull()) {
        SortDirectionEnum.validateJsonElement(jsonObj.get("sortDirection"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WaitForSingleSmsOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WaitForSingleSmsOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WaitForSingleSmsOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WaitForSingleSmsOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<WaitForSingleSmsOptions>() {
           @Override
           public void write(JsonWriter out, WaitForSingleSmsOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WaitForSingleSmsOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WaitForSingleSmsOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WaitForSingleSmsOptions
   * @throws IOException if the JSON string is invalid with respect to WaitForSingleSmsOptions
   */
  public static WaitForSingleSmsOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WaitForSingleSmsOptions.class);
  }

  /**
   * Convert an instance of WaitForSingleSmsOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

