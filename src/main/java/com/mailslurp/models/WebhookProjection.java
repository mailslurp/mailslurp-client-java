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
 * Representation of a webhook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class WebhookProjection {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nonnull
  private String url;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  @javax.annotation.Nullable
  private String password;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nullable
  private String username;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  @javax.annotation.Nullable
  private UUID inboxId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nonnull
  private UUID userId;

  /**
   * Gets or Sets eventName
   */
  @JsonAdapter(EventNameEnum.Adapter.class)
  public enum EventNameEnum {
    EMAIL_RECEIVED("EMAIL_RECEIVED"),
    
    NEW_AI_TRANSFORM_RESULT("NEW_AI_TRANSFORM_RESULT"),
    
    NEW_EMAIL("NEW_EMAIL"),
    
    NEW_CONTACT("NEW_CONTACT"),
    
    NEW_ATTACHMENT("NEW_ATTACHMENT"),
    
    EMAIL_OPENED("EMAIL_OPENED"),
    
    EMAIL_READ("EMAIL_READ"),
    
    DELIVERY_STATUS("DELIVERY_STATUS"),
    
    BOUNCE("BOUNCE"),
    
    BOUNCE_RECIPIENT("BOUNCE_RECIPIENT"),
    
    NEW_SMS("NEW_SMS"),
    
    NEW_GUEST_USER("NEW_GUEST_USER");

    private String value;

    EventNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventNameEnum fromValue(String value) {
      for (EventNameEnum b : EventNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventNameEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      String value = jsonElement.getAsString();
      EventNameEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  @javax.annotation.Nullable
  private EventNameEnum eventName;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_AI_TRANSFORM_ID = "aiTransformId";
  @SerializedName(SERIALIZED_NAME_AI_TRANSFORM_ID)
  @javax.annotation.Nullable
  private UUID aiTransformId;

  /**
   * Gets or Sets healthStatus
   */
  @JsonAdapter(HealthStatusEnum.Adapter.class)
  public enum HealthStatusEnum {
    HEALTHY("HEALTHY"),
    
    UNHEALTHY("UNHEALTHY");

    private String value;

    HealthStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HealthStatusEnum fromValue(String value) {
      for (HealthStatusEnum b : HealthStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HealthStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HealthStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HealthStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HealthStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      String value = jsonElement.getAsString();
      HealthStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_HEALTH_STATUS = "healthStatus";
  @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
  @javax.annotation.Nullable
  private HealthStatusEnum healthStatus;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_ID = "phoneNumberId";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_ID)
  @javax.annotation.Nullable
  private UUID phoneNumberId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public WebhookProjection() {
  }

  public WebhookProjection url(@javax.annotation.Nonnull String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nonnull String url) {
    this.url = url;
  }


  public WebhookProjection password(@javax.annotation.Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }


  public WebhookProjection username(@javax.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }


  public WebhookProjection inboxId(@javax.annotation.Nullable UUID inboxId) {
    this.inboxId = inboxId;
    return this;
  }

  /**
   * Get inboxId
   * @return inboxId
   */
  @javax.annotation.Nullable
  public UUID getInboxId() {
    return inboxId;
  }

  public void setInboxId(@javax.annotation.Nullable UUID inboxId) {
    this.inboxId = inboxId;
  }


  public WebhookProjection userId(@javax.annotation.Nonnull UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nonnull
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nonnull UUID userId) {
    this.userId = userId;
  }


  public WebhookProjection eventName(@javax.annotation.Nullable EventNameEnum eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Get eventName
   * @return eventName
   */
  @javax.annotation.Nullable
  public EventNameEnum getEventName() {
    return eventName;
  }

  public void setEventName(@javax.annotation.Nullable EventNameEnum eventName) {
    this.eventName = eventName;
  }


  public WebhookProjection updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public WebhookProjection createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookProjection aiTransformId(@javax.annotation.Nullable UUID aiTransformId) {
    this.aiTransformId = aiTransformId;
    return this;
  }

  /**
   * Get aiTransformId
   * @return aiTransformId
   */
  @javax.annotation.Nullable
  public UUID getAiTransformId() {
    return aiTransformId;
  }

  public void setAiTransformId(@javax.annotation.Nullable UUID aiTransformId) {
    this.aiTransformId = aiTransformId;
  }


  public WebhookProjection healthStatus(@javax.annotation.Nullable HealthStatusEnum healthStatus) {
    this.healthStatus = healthStatus;
    return this;
  }

  /**
   * Get healthStatus
   * @return healthStatus
   */
  @javax.annotation.Nullable
  public HealthStatusEnum getHealthStatus() {
    return healthStatus;
  }

  public void setHealthStatus(@javax.annotation.Nullable HealthStatusEnum healthStatus) {
    this.healthStatus = healthStatus;
  }


  public WebhookProjection phoneNumberId(@javax.annotation.Nullable UUID phoneNumberId) {
    this.phoneNumberId = phoneNumberId;
    return this;
  }

  /**
   * Get phoneNumberId
   * @return phoneNumberId
   */
  @javax.annotation.Nullable
  public UUID getPhoneNumberId() {
    return phoneNumberId;
  }

  public void setPhoneNumberId(@javax.annotation.Nullable UUID phoneNumberId) {
    this.phoneNumberId = phoneNumberId;
  }


  public WebhookProjection name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public WebhookProjection id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
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
    WebhookProjection webhookProjection = (WebhookProjection) o;
    return Objects.equals(this.url, webhookProjection.url) &&
        Objects.equals(this.password, webhookProjection.password) &&
        Objects.equals(this.username, webhookProjection.username) &&
        Objects.equals(this.inboxId, webhookProjection.inboxId) &&
        Objects.equals(this.userId, webhookProjection.userId) &&
        Objects.equals(this.eventName, webhookProjection.eventName) &&
        Objects.equals(this.updatedAt, webhookProjection.updatedAt) &&
        Objects.equals(this.createdAt, webhookProjection.createdAt) &&
        Objects.equals(this.aiTransformId, webhookProjection.aiTransformId) &&
        Objects.equals(this.healthStatus, webhookProjection.healthStatus) &&
        Objects.equals(this.phoneNumberId, webhookProjection.phoneNumberId) &&
        Objects.equals(this.name, webhookProjection.name) &&
        Objects.equals(this.id, webhookProjection.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, password, username, inboxId, userId, eventName, updatedAt, createdAt, aiTransformId, healthStatus, phoneNumberId, name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookProjection {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    aiTransformId: ").append(toIndentedString(aiTransformId)).append("\n");
    sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
    sb.append("    phoneNumberId: ").append(toIndentedString(phoneNumberId)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("password");
    openapiFields.add("username");
    openapiFields.add("inboxId");
    openapiFields.add("userId");
    openapiFields.add("eventName");
    openapiFields.add("updatedAt");
    openapiFields.add("createdAt");
    openapiFields.add("aiTransformId");
    openapiFields.add("healthStatus");
    openapiFields.add("phoneNumberId");
    openapiFields.add("name");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("updatedAt");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhookProjection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!WebhookProjection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookProjection is not found in the empty JSON string", WebhookProjection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookProjection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookProjection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookProjection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("inboxId") != null && !jsonObj.get("inboxId").isJsonNull()) && !jsonObj.get("inboxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inboxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inboxId").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("eventName") != null && !jsonObj.get("eventName").isJsonNull()) && !jsonObj.get("eventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventName").toString()));
      }
      // validate the optional field `eventName`
      if (jsonObj.get("eventName") != null && !jsonObj.get("eventName").isJsonNull()) {
        EventNameEnum.validateJsonElement(jsonObj.get("eventName"));
      }
      if ((jsonObj.get("aiTransformId") != null && !jsonObj.get("aiTransformId").isJsonNull()) && !jsonObj.get("aiTransformId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aiTransformId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aiTransformId").toString()));
      }
      if ((jsonObj.get("healthStatus") != null && !jsonObj.get("healthStatus").isJsonNull()) && !jsonObj.get("healthStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `healthStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("healthStatus").toString()));
      }
      // validate the optional field `healthStatus`
      if (jsonObj.get("healthStatus") != null && !jsonObj.get("healthStatus").isJsonNull()) {
        HealthStatusEnum.validateJsonElement(jsonObj.get("healthStatus"));
      }
      if ((jsonObj.get("phoneNumberId") != null && !jsonObj.get("phoneNumberId").isJsonNull()) && !jsonObj.get("phoneNumberId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberId").toString()));
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
       if (!WebhookProjection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookProjection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookProjection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookProjection.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookProjection>() {
           @Override
           public void write(JsonWriter out, WebhookProjection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookProjection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebhookProjection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhookProjection
   * @throws IOException if the JSON string is invalid with respect to WebhookProjection
   */
  public static WebhookProjection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookProjection.class);
  }

  /**
   * Convert an instance of WebhookProjection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

