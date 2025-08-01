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
import com.mailslurp.models.EmailFeatureVersionStatistics;
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
 * EmailFeaturePlatformStatistics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class EmailFeaturePlatformStatistics {
  /**
   * Gets or Sets platform
   */
  @JsonAdapter(PlatformEnum.Adapter.class)
  public enum PlatformEnum {
    ANDROID("android"),
    
    DESKTOP_APP("desktop-app"),
    
    DESKTOP_WEBMAIL("desktop-webmail"),
    
    IOS("ios"),
    
    MACOS("macos"),
    
    MOBILE_WEBMAIL("mobile-webmail"),
    
    OUTLOOK_COM("outlook-com"),
    
    WEBMAIL("webmail"),
    
    WINDOWS("windows"),
    
    WINDOWS_MAIL("windows-mail");

    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlatformEnum fromValue(String value) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlatformEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlatformEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlatformEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlatformEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      String value = jsonElement.getAsString();
      PlatformEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  @javax.annotation.Nonnull
  private PlatformEnum platform;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  @javax.annotation.Nonnull
  private List<EmailFeatureVersionStatistics> versions = new ArrayList<>();

  public EmailFeaturePlatformStatistics() {
  }

  public EmailFeaturePlatformStatistics platform(@javax.annotation.Nonnull PlatformEnum platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  @javax.annotation.Nonnull
  public PlatformEnum getPlatform() {
    return platform;
  }

  public void setPlatform(@javax.annotation.Nonnull PlatformEnum platform) {
    this.platform = platform;
  }


  public EmailFeaturePlatformStatistics versions(@javax.annotation.Nonnull List<EmailFeatureVersionStatistics> versions) {
    this.versions = versions;
    return this;
  }

  public EmailFeaturePlatformStatistics addVersionsItem(EmailFeatureVersionStatistics versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * Get versions
   * @return versions
   */
  @javax.annotation.Nonnull
  public List<EmailFeatureVersionStatistics> getVersions() {
    return versions;
  }

  public void setVersions(@javax.annotation.Nonnull List<EmailFeatureVersionStatistics> versions) {
    this.versions = versions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailFeaturePlatformStatistics emailFeaturePlatformStatistics = (EmailFeaturePlatformStatistics) o;
    return Objects.equals(this.platform, emailFeaturePlatformStatistics.platform) &&
        Objects.equals(this.versions, emailFeaturePlatformStatistics.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailFeaturePlatformStatistics {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
    openapiFields.add("platform");
    openapiFields.add("versions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("platform");
    openapiRequiredFields.add("versions");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmailFeaturePlatformStatistics
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!EmailFeaturePlatformStatistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailFeaturePlatformStatistics is not found in the empty JSON string", EmailFeaturePlatformStatistics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmailFeaturePlatformStatistics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailFeaturePlatformStatistics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmailFeaturePlatformStatistics.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      // validate the required field `platform`
      PlatformEnum.validateJsonElement(jsonObj.get("platform"));
      // ensure the json data is an array
      if (!jsonObj.get("versions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `versions` to be an array in the JSON string but got `%s`", jsonObj.get("versions").toString()));
      }

      JsonArray jsonArrayversions = jsonObj.getAsJsonArray("versions");
      // validate the required field `versions` (array)
      for (int i = 0; i < jsonArrayversions.size(); i++) {
        EmailFeatureVersionStatistics.validateJsonElement(jsonArrayversions.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailFeaturePlatformStatistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailFeaturePlatformStatistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailFeaturePlatformStatistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailFeaturePlatformStatistics.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailFeaturePlatformStatistics>() {
           @Override
           public void write(JsonWriter out, EmailFeaturePlatformStatistics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailFeaturePlatformStatistics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmailFeaturePlatformStatistics given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmailFeaturePlatformStatistics
   * @throws IOException if the JSON string is invalid with respect to EmailFeaturePlatformStatistics
   */
  public static EmailFeaturePlatformStatistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailFeaturePlatformStatistics.class);
  }

  /**
   * Convert an instance of EmailFeaturePlatformStatistics to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

