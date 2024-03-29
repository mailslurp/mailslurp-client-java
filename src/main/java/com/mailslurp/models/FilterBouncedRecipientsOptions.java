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
 * Options for filtering bounced email recipients
 */
@ApiModel(description = "Options for filtering bounced email recipients")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T23:33:57.654989Z[Etc/UTC]")
public class FilterBouncedRecipientsOptions {
  public static final String SERIALIZED_NAME_EMAIL_RECIPIENTS = "emailRecipients";
  @SerializedName(SERIALIZED_NAME_EMAIL_RECIPIENTS)
  private List<String> emailRecipients = new ArrayList<>();

  public FilterBouncedRecipientsOptions() {
  }

  public FilterBouncedRecipientsOptions emailRecipients(List<String> emailRecipients) {
    
    this.emailRecipients = emailRecipients;
    return this;
  }

  public FilterBouncedRecipientsOptions addEmailRecipientsItem(String emailRecipientsItem) {
    this.emailRecipients.add(emailRecipientsItem);
    return this;
  }

   /**
   * Get emailRecipients
   * @return emailRecipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getEmailRecipients() {
    return emailRecipients;
  }


  public void setEmailRecipients(List<String> emailRecipients) {
    this.emailRecipients = emailRecipients;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterBouncedRecipientsOptions filterBouncedRecipientsOptions = (FilterBouncedRecipientsOptions) o;
    return Objects.equals(this.emailRecipients, filterBouncedRecipientsOptions.emailRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailRecipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterBouncedRecipientsOptions {\n");
    sb.append("    emailRecipients: ").append(toIndentedString(emailRecipients)).append("\n");
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
    openapiFields.add("emailRecipients");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("emailRecipients");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilterBouncedRecipientsOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FilterBouncedRecipientsOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilterBouncedRecipientsOptions is not found in the empty JSON string", FilterBouncedRecipientsOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FilterBouncedRecipientsOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilterBouncedRecipientsOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FilterBouncedRecipientsOptions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("emailRecipients") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("emailRecipients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailRecipients` to be an array in the JSON string but got `%s`", jsonObj.get("emailRecipients").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilterBouncedRecipientsOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilterBouncedRecipientsOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilterBouncedRecipientsOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilterBouncedRecipientsOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<FilterBouncedRecipientsOptions>() {
           @Override
           public void write(JsonWriter out, FilterBouncedRecipientsOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilterBouncedRecipientsOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilterBouncedRecipientsOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilterBouncedRecipientsOptions
  * @throws IOException if the JSON string is invalid with respect to FilterBouncedRecipientsOptions
  */
  public static FilterBouncedRecipientsOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilterBouncedRecipientsOptions.class);
  }

 /**
  * Convert an instance of FilterBouncedRecipientsOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

