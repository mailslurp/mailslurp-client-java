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
 * UserInfoDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class UserInfoDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  @javax.annotation.Nonnull
  private String emailAddress;

  /**
   * Gets or Sets accountState
   */
  @JsonAdapter(AccountStateEnum.Adapter.class)
  public enum AccountStateEnum {
    FROZEN("FROZEN"),
    
    ACTIVE("ACTIVE");

    private String value;

    AccountStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountStateEnum fromValue(String value) {
      for (AccountStateEnum b : AccountStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      String value = jsonElement.getAsString();
      AccountStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_STATE = "accountState";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATE)
  @javax.annotation.Nonnull
  private AccountStateEnum accountState;

  /**
   * Gets or Sets subscriptionType
   */
  @JsonAdapter(SubscriptionTypeEnum.Adapter.class)
  public enum SubscriptionTypeEnum {
    PRO_MONTHLY("PRO_MONTHLY"),
    
    STARTER("STARTER"),
    
    PRO("PRO"),
    
    TEAM("TEAM"),
    
    ENTERPRISE("ENTERPRISE");

    private String value;

    SubscriptionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubscriptionTypeEnum fromValue(String value) {
      for (SubscriptionTypeEnum b : SubscriptionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubscriptionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriptionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriptionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubscriptionTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      String value = jsonElement.getAsString();
      SubscriptionTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SUBSCRIPTION_TYPE = "subscriptionType";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_TYPE)
  @javax.annotation.Nullable
  private SubscriptionTypeEnum subscriptionType;

  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    SOLO("SOLO"),
    
    CHILD_SOLO("CHILD_SOLO"),
    
    CHILD_TEAM("CHILD_TEAM"),
    
    CHILD_ADMIN("CHILD_ADMIN");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      String value = jsonElement.getAsString();
      AccountTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  @javax.annotation.Nonnull
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public UserInfoDto() {
  }

  public UserInfoDto id(@javax.annotation.Nonnull UUID id) {
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


  public UserInfoDto emailAddress(@javax.annotation.Nonnull String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  @javax.annotation.Nonnull
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(@javax.annotation.Nonnull String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public UserInfoDto accountState(@javax.annotation.Nonnull AccountStateEnum accountState) {
    this.accountState = accountState;
    return this;
  }

  /**
   * Get accountState
   * @return accountState
   */
  @javax.annotation.Nonnull
  public AccountStateEnum getAccountState() {
    return accountState;
  }

  public void setAccountState(@javax.annotation.Nonnull AccountStateEnum accountState) {
    this.accountState = accountState;
  }


  public UserInfoDto subscriptionType(@javax.annotation.Nullable SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Get subscriptionType
   * @return subscriptionType
   */
  @javax.annotation.Nullable
  public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(@javax.annotation.Nullable SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }


  public UserInfoDto accountType(@javax.annotation.Nonnull AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   */
  @javax.annotation.Nonnull
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(@javax.annotation.Nonnull AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public UserInfoDto createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoDto userInfoDto = (UserInfoDto) o;
    return Objects.equals(this.id, userInfoDto.id) &&
        Objects.equals(this.emailAddress, userInfoDto.emailAddress) &&
        Objects.equals(this.accountState, userInfoDto.accountState) &&
        Objects.equals(this.subscriptionType, userInfoDto.subscriptionType) &&
        Objects.equals(this.accountType, userInfoDto.accountType) &&
        Objects.equals(this.createdAt, userInfoDto.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emailAddress, accountState, subscriptionType, accountType, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    accountState: ").append(toIndentedString(accountState)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("emailAddress");
    openapiFields.add("accountState");
    openapiFields.add("subscriptionType");
    openapiFields.add("accountType");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("emailAddress");
    openapiRequiredFields.add("accountState");
    openapiRequiredFields.add("accountType");
    openapiRequiredFields.add("createdAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserInfoDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!UserInfoDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserInfoDto is not found in the empty JSON string", UserInfoDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserInfoDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserInfoDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserInfoDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      if (!jsonObj.get("accountState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountState").toString()));
      }
      // validate the required field `accountState`
      AccountStateEnum.validateJsonElement(jsonObj.get("accountState"));
      if ((jsonObj.get("subscriptionType") != null && !jsonObj.get("subscriptionType").isJsonNull()) && !jsonObj.get("subscriptionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionType").toString()));
      }
      // validate the optional field `subscriptionType`
      if (jsonObj.get("subscriptionType") != null && !jsonObj.get("subscriptionType").isJsonNull()) {
        SubscriptionTypeEnum.validateJsonElement(jsonObj.get("subscriptionType"));
      }
      if (!jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
      // validate the required field `accountType`
      AccountTypeEnum.validateJsonElement(jsonObj.get("accountType"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserInfoDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserInfoDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserInfoDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserInfoDto.class));

       return (TypeAdapter<T>) new TypeAdapter<UserInfoDto>() {
           @Override
           public void write(JsonWriter out, UserInfoDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserInfoDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserInfoDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserInfoDto
   * @throws IOException if the JSON string is invalid with respect to UserInfoDto
   */
  public static UserInfoDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserInfoDto.class);
  }

  /**
   * Convert an instance of UserInfoDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

