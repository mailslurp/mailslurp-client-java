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
import com.mailslurp.models.EmailFeatureCategoryName;
import com.mailslurp.models.EmailFeatureFamilyName;
import com.mailslurp.models.EmailFeaturePlatformName;
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
 * EmailFeatureNames
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class EmailFeatureNames {
  public static final String SERIALIZED_NAME_FAMILY = "family";
  @SerializedName(SERIALIZED_NAME_FAMILY)
  @javax.annotation.Nonnull
  private List<EmailFeatureFamilyName> family = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  @javax.annotation.Nonnull
  private List<EmailFeaturePlatformName> platform = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  @javax.annotation.Nonnull
  private List<EmailFeatureCategoryName> category = new ArrayList<>();

  public EmailFeatureNames() {
  }

  public EmailFeatureNames family(@javax.annotation.Nonnull List<EmailFeatureFamilyName> family) {
    this.family = family;
    return this;
  }

  public EmailFeatureNames addFamilyItem(EmailFeatureFamilyName familyItem) {
    if (this.family == null) {
      this.family = new ArrayList<>();
    }
    this.family.add(familyItem);
    return this;
  }

  /**
   * Get family
   * @return family
   */
  @javax.annotation.Nonnull
  public List<EmailFeatureFamilyName> getFamily() {
    return family;
  }

  public void setFamily(@javax.annotation.Nonnull List<EmailFeatureFamilyName> family) {
    this.family = family;
  }


  public EmailFeatureNames platform(@javax.annotation.Nonnull List<EmailFeaturePlatformName> platform) {
    this.platform = platform;
    return this;
  }

  public EmailFeatureNames addPlatformItem(EmailFeaturePlatformName platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  @javax.annotation.Nonnull
  public List<EmailFeaturePlatformName> getPlatform() {
    return platform;
  }

  public void setPlatform(@javax.annotation.Nonnull List<EmailFeaturePlatformName> platform) {
    this.platform = platform;
  }


  public EmailFeatureNames category(@javax.annotation.Nonnull List<EmailFeatureCategoryName> category) {
    this.category = category;
    return this;
  }

  public EmailFeatureNames addCategoryItem(EmailFeatureCategoryName categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @javax.annotation.Nonnull
  public List<EmailFeatureCategoryName> getCategory() {
    return category;
  }

  public void setCategory(@javax.annotation.Nonnull List<EmailFeatureCategoryName> category) {
    this.category = category;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailFeatureNames emailFeatureNames = (EmailFeatureNames) o;
    return Objects.equals(this.family, emailFeatureNames.family) &&
        Objects.equals(this.platform, emailFeatureNames.platform) &&
        Objects.equals(this.category, emailFeatureNames.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, platform, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailFeatureNames {\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
    openapiFields.add("family");
    openapiFields.add("platform");
    openapiFields.add("category");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("family");
    openapiRequiredFields.add("platform");
    openapiRequiredFields.add("category");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmailFeatureNames
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!EmailFeatureNames.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailFeatureNames is not found in the empty JSON string", EmailFeatureNames.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmailFeatureNames.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailFeatureNames` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmailFeatureNames.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("family").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `family` to be an array in the JSON string but got `%s`", jsonObj.get("family").toString()));
      }

      JsonArray jsonArrayfamily = jsonObj.getAsJsonArray("family");
      // validate the required field `family` (array)
      for (int i = 0; i < jsonArrayfamily.size(); i++) {
        EmailFeatureFamilyName.validateJsonElement(jsonArrayfamily.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("platform").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be an array in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }

      JsonArray jsonArrayplatform = jsonObj.getAsJsonArray("platform");
      // validate the required field `platform` (array)
      for (int i = 0; i < jsonArrayplatform.size(); i++) {
        EmailFeaturePlatformName.validateJsonElement(jsonArrayplatform.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("category").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be an array in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }

      JsonArray jsonArraycategory = jsonObj.getAsJsonArray("category");
      // validate the required field `category` (array)
      for (int i = 0; i < jsonArraycategory.size(); i++) {
        EmailFeatureCategoryName.validateJsonElement(jsonArraycategory.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailFeatureNames.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailFeatureNames' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailFeatureNames> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailFeatureNames.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailFeatureNames>() {
           @Override
           public void write(JsonWriter out, EmailFeatureNames value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailFeatureNames read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmailFeatureNames given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmailFeatureNames
   * @throws IOException if the JSON string is invalid with respect to EmailFeatureNames
   */
  public static EmailFeatureNames fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailFeatureNames.class);
  }

  /**
   * Convert an instance of EmailFeatureNames to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

