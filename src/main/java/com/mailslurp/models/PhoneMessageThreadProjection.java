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
 * PhoneMessageThreadProjection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class PhoneMessageThreadProjection {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  @javax.annotation.Nullable
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_ID = "phoneNumberId";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_ID)
  @javax.annotation.Nonnull
  private UUID phoneNumberId;

  public static final String SERIALIZED_NAME_OTHER_PHONE_NUMBER = "otherPhoneNumber";
  @SerializedName(SERIALIZED_NAME_OTHER_PHONE_NUMBER)
  @javax.annotation.Nullable
  private String otherPhoneNumber;

  /**
   * Gets or Sets lastMessageDirection
   */
  @JsonAdapter(LastMessageDirectionEnum.Adapter.class)
  public enum LastMessageDirectionEnum {
    OUTBOUND("OUTBOUND"),
    
    INBOUND("INBOUND");

    private String value;

    LastMessageDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LastMessageDirectionEnum fromValue(String value) {
      for (LastMessageDirectionEnum b : LastMessageDirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LastMessageDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LastMessageDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LastMessageDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LastMessageDirectionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      String value = jsonElement.getAsString();
      LastMessageDirectionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LAST_MESSAGE_DIRECTION = "lastMessageDirection";
  @SerializedName(SERIALIZED_NAME_LAST_MESSAGE_DIRECTION)
  @javax.annotation.Nonnull
  private LastMessageDirectionEnum lastMessageDirection;

  public static final String SERIALIZED_NAME_LAST_BODY = "lastBody";
  @SerializedName(SERIALIZED_NAME_LAST_BODY)
  @javax.annotation.Nonnull
  private String lastBody;

  public static final String SERIALIZED_NAME_LAST_CREATED = "lastCreated";
  @SerializedName(SERIALIZED_NAME_LAST_CREATED)
  @javax.annotation.Nonnull
  private OffsetDateTime lastCreated;

  public PhoneMessageThreadProjection() {
  }

  public PhoneMessageThreadProjection phoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PhoneMessageThreadProjection phoneNumberId(@javax.annotation.Nonnull UUID phoneNumberId) {
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


  public PhoneMessageThreadProjection otherPhoneNumber(@javax.annotation.Nullable String otherPhoneNumber) {
    this.otherPhoneNumber = otherPhoneNumber;
    return this;
  }

  /**
   * Get otherPhoneNumber
   * @return otherPhoneNumber
   */
  @javax.annotation.Nullable
  public String getOtherPhoneNumber() {
    return otherPhoneNumber;
  }

  public void setOtherPhoneNumber(@javax.annotation.Nullable String otherPhoneNumber) {
    this.otherPhoneNumber = otherPhoneNumber;
  }


  public PhoneMessageThreadProjection lastMessageDirection(@javax.annotation.Nonnull LastMessageDirectionEnum lastMessageDirection) {
    this.lastMessageDirection = lastMessageDirection;
    return this;
  }

  /**
   * Get lastMessageDirection
   * @return lastMessageDirection
   */
  @javax.annotation.Nonnull
  public LastMessageDirectionEnum getLastMessageDirection() {
    return lastMessageDirection;
  }

  public void setLastMessageDirection(@javax.annotation.Nonnull LastMessageDirectionEnum lastMessageDirection) {
    this.lastMessageDirection = lastMessageDirection;
  }


  public PhoneMessageThreadProjection lastBody(@javax.annotation.Nonnull String lastBody) {
    this.lastBody = lastBody;
    return this;
  }

  /**
   * Get lastBody
   * @return lastBody
   */
  @javax.annotation.Nonnull
  public String getLastBody() {
    return lastBody;
  }

  public void setLastBody(@javax.annotation.Nonnull String lastBody) {
    this.lastBody = lastBody;
  }


  public PhoneMessageThreadProjection lastCreated(@javax.annotation.Nonnull OffsetDateTime lastCreated) {
    this.lastCreated = lastCreated;
    return this;
  }

  /**
   * Get lastCreated
   * @return lastCreated
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getLastCreated() {
    return lastCreated;
  }

  public void setLastCreated(@javax.annotation.Nonnull OffsetDateTime lastCreated) {
    this.lastCreated = lastCreated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneMessageThreadProjection phoneMessageThreadProjection = (PhoneMessageThreadProjection) o;
    return Objects.equals(this.phoneNumber, phoneMessageThreadProjection.phoneNumber) &&
        Objects.equals(this.phoneNumberId, phoneMessageThreadProjection.phoneNumberId) &&
        Objects.equals(this.otherPhoneNumber, phoneMessageThreadProjection.otherPhoneNumber) &&
        Objects.equals(this.lastMessageDirection, phoneMessageThreadProjection.lastMessageDirection) &&
        Objects.equals(this.lastBody, phoneMessageThreadProjection.lastBody) &&
        Objects.equals(this.lastCreated, phoneMessageThreadProjection.lastCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, phoneNumberId, otherPhoneNumber, lastMessageDirection, lastBody, lastCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneMessageThreadProjection {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberId: ").append(toIndentedString(phoneNumberId)).append("\n");
    sb.append("    otherPhoneNumber: ").append(toIndentedString(otherPhoneNumber)).append("\n");
    sb.append("    lastMessageDirection: ").append(toIndentedString(lastMessageDirection)).append("\n");
    sb.append("    lastBody: ").append(toIndentedString(lastBody)).append("\n");
    sb.append("    lastCreated: ").append(toIndentedString(lastCreated)).append("\n");
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
    openapiFields.add("phoneNumber");
    openapiFields.add("phoneNumberId");
    openapiFields.add("otherPhoneNumber");
    openapiFields.add("lastMessageDirection");
    openapiFields.add("lastBody");
    openapiFields.add("lastCreated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("phoneNumberId");
    openapiRequiredFields.add("lastMessageDirection");
    openapiRequiredFields.add("lastBody");
    openapiRequiredFields.add("lastCreated");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PhoneMessageThreadProjection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!PhoneMessageThreadProjection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PhoneMessageThreadProjection is not found in the empty JSON string", PhoneMessageThreadProjection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PhoneMessageThreadProjection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PhoneMessageThreadProjection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PhoneMessageThreadProjection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if (!jsonObj.get("phoneNumberId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberId").toString()));
      }
      if ((jsonObj.get("otherPhoneNumber") != null && !jsonObj.get("otherPhoneNumber").isJsonNull()) && !jsonObj.get("otherPhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otherPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otherPhoneNumber").toString()));
      }
      if (!jsonObj.get("lastMessageDirection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastMessageDirection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastMessageDirection").toString()));
      }
      // validate the required field `lastMessageDirection`
      LastMessageDirectionEnum.validateJsonElement(jsonObj.get("lastMessageDirection"));
      if (!jsonObj.get("lastBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastBody").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PhoneMessageThreadProjection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PhoneMessageThreadProjection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PhoneMessageThreadProjection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PhoneMessageThreadProjection.class));

       return (TypeAdapter<T>) new TypeAdapter<PhoneMessageThreadProjection>() {
           @Override
           public void write(JsonWriter out, PhoneMessageThreadProjection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PhoneMessageThreadProjection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PhoneMessageThreadProjection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PhoneMessageThreadProjection
   * @throws IOException if the JSON string is invalid with respect to PhoneMessageThreadProjection
   */
  public static PhoneMessageThreadProjection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PhoneMessageThreadProjection.class);
  }

  /**
   * Convert an instance of PhoneMessageThreadProjection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

