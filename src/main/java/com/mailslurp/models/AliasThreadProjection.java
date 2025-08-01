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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * A thread is a message thread created for a message received by an alias
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class AliasThreadProjection {
  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  @javax.annotation.Nonnull
  private UUID inboxId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nonnull
  private UUID userId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  @javax.annotation.Nonnull
  private List<String> to = new ArrayList<>();

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  @javax.annotation.Nullable
  private List<String> cc = new ArrayList<>();

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  @javax.annotation.Nullable
  private List<String> bcc = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALIAS_ID = "aliasId";
  @SerializedName(SERIALIZED_NAME_ALIAS_ID)
  @javax.annotation.Nonnull
  private UUID aliasId;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  @javax.annotation.Nullable
  private String subject;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public AliasThreadProjection() {
  }

  public AliasThreadProjection inboxId(@javax.annotation.Nonnull UUID inboxId) {
    this.inboxId = inboxId;
    return this;
  }

  /**
   * Inbox ID
   * @return inboxId
   */
  @javax.annotation.Nonnull
  public UUID getInboxId() {
    return inboxId;
  }

  public void setInboxId(@javax.annotation.Nonnull UUID inboxId) {
    this.inboxId = inboxId;
  }


  public AliasThreadProjection userId(@javax.annotation.Nonnull UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User ID
   * @return userId
   */
  @javax.annotation.Nonnull
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nonnull UUID userId) {
    this.userId = userId;
  }


  public AliasThreadProjection updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Updated at DateTime
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public AliasThreadProjection createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Created at DateTime
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AliasThreadProjection to(@javax.annotation.Nonnull List<String> to) {
    this.to = to;
    return this;
  }

  public AliasThreadProjection addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

  /**
   * To recipients
   * @return to
   */
  @javax.annotation.Nonnull
  public List<String> getTo() {
    return to;
  }

  public void setTo(@javax.annotation.Nonnull List<String> to) {
    this.to = to;
  }


  public AliasThreadProjection cc(@javax.annotation.Nullable List<String> cc) {
    this.cc = cc;
    return this;
  }

  public AliasThreadProjection addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

  /**
   * CC recipients
   * @return cc
   */
  @javax.annotation.Nullable
  public List<String> getCc() {
    return cc;
  }

  public void setCc(@javax.annotation.Nullable List<String> cc) {
    this.cc = cc;
  }


  public AliasThreadProjection bcc(@javax.annotation.Nullable List<String> bcc) {
    this.bcc = bcc;
    return this;
  }

  public AliasThreadProjection addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

  /**
   * BCC recipients
   * @return bcc
   */
  @javax.annotation.Nullable
  public List<String> getBcc() {
    return bcc;
  }

  public void setBcc(@javax.annotation.Nullable List<String> bcc) {
    this.bcc = bcc;
  }


  public AliasThreadProjection aliasId(@javax.annotation.Nonnull UUID aliasId) {
    this.aliasId = aliasId;
    return this;
  }

  /**
   * Alias ID
   * @return aliasId
   */
  @javax.annotation.Nonnull
  public UUID getAliasId() {
    return aliasId;
  }

  public void setAliasId(@javax.annotation.Nonnull UUID aliasId) {
    this.aliasId = aliasId;
  }


  public AliasThreadProjection subject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Thread subject
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(@javax.annotation.Nullable String subject) {
    this.subject = subject;
  }


  public AliasThreadProjection name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of thread
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public AliasThreadProjection id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * ID of email thread
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliasThreadProjection aliasThreadProjection = (AliasThreadProjection) o;
    return Objects.equals(this.inboxId, aliasThreadProjection.inboxId) &&
        Objects.equals(this.userId, aliasThreadProjection.userId) &&
        Objects.equals(this.updatedAt, aliasThreadProjection.updatedAt) &&
        Objects.equals(this.createdAt, aliasThreadProjection.createdAt) &&
        Objects.equals(this.to, aliasThreadProjection.to) &&
        Objects.equals(this.cc, aliasThreadProjection.cc) &&
        Objects.equals(this.bcc, aliasThreadProjection.bcc) &&
        Objects.equals(this.aliasId, aliasThreadProjection.aliasId) &&
        Objects.equals(this.subject, aliasThreadProjection.subject) &&
        Objects.equals(this.name, aliasThreadProjection.name) &&
        Objects.equals(this.id, aliasThreadProjection.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboxId, userId, updatedAt, createdAt, to, cc, bcc, aliasId, subject, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AliasThreadProjection {\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    aliasId: ").append(toIndentedString(aliasId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("inboxId");
    openapiFields.add("userId");
    openapiFields.add("updatedAt");
    openapiFields.add("createdAt");
    openapiFields.add("to");
    openapiFields.add("cc");
    openapiFields.add("bcc");
    openapiFields.add("aliasId");
    openapiFields.add("subject");
    openapiFields.add("name");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inboxId");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("updatedAt");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("aliasId");
    openapiRequiredFields.add("id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AliasThreadProjection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!AliasThreadProjection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AliasThreadProjection is not found in the empty JSON string", AliasThreadProjection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AliasThreadProjection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AliasThreadProjection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AliasThreadProjection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("inboxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inboxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inboxId").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("to") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("to").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be an array in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cc") != null && !jsonObj.get("cc").isJsonNull() && !jsonObj.get("cc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cc` to be an array in the JSON string but got `%s`", jsonObj.get("cc").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bcc") != null && !jsonObj.get("bcc").isJsonNull() && !jsonObj.get("bcc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bcc` to be an array in the JSON string but got `%s`", jsonObj.get("bcc").toString()));
      }
      if (!jsonObj.get("aliasId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aliasId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aliasId").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AliasThreadProjection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AliasThreadProjection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AliasThreadProjection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AliasThreadProjection.class));

       return (TypeAdapter<T>) new TypeAdapter<AliasThreadProjection>() {
           @Override
           public void write(JsonWriter out, AliasThreadProjection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AliasThreadProjection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AliasThreadProjection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AliasThreadProjection
   * @throws IOException if the JSON string is invalid with respect to AliasThreadProjection
   */
  public static AliasThreadProjection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AliasThreadProjection.class);
  }

  /**
   * Convert an instance of AliasThreadProjection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

