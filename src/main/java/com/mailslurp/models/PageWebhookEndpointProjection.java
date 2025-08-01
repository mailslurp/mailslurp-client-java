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
import com.mailslurp.models.PageableObject;
import com.mailslurp.models.SortObject;
import com.mailslurp.models.WebhookEndpointProjection;
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
 * Paginated webhook endpoint with latest health status. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full entity use the projection ID with individual method calls.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class PageWebhookEndpointProjection {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  @javax.annotation.Nullable
  private List<WebhookEndpointProjection> content = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGEABLE = "pageable";
  @SerializedName(SERIALIZED_NAME_PAGEABLE)
  @javax.annotation.Nullable
  private PageableObject pageable;

  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  @javax.annotation.Nonnull
  private Long totalElements;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  @javax.annotation.Nonnull
  private Integer totalPages;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  @javax.annotation.Nullable
  private Boolean last;

  public static final String SERIALIZED_NAME_NUMBER_OF_ELEMENTS = "numberOfElements";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_ELEMENTS)
  @javax.annotation.Nullable
  private Integer numberOfElements;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  @javax.annotation.Nullable
  private Boolean first;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  @javax.annotation.Nullable
  private Integer size;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  @javax.annotation.Nullable
  private Integer number;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  @javax.annotation.Nullable
  private SortObject sort;

  public static final String SERIALIZED_NAME_EMPTY = "empty";
  @SerializedName(SERIALIZED_NAME_EMPTY)
  @javax.annotation.Nullable
  private Boolean empty;

  public PageWebhookEndpointProjection() {
  }

  public PageWebhookEndpointProjection content(@javax.annotation.Nullable List<WebhookEndpointProjection> content) {
    this.content = content;
    return this;
  }

  public PageWebhookEndpointProjection addContentItem(WebhookEndpointProjection contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nullable
  public List<WebhookEndpointProjection> getContent() {
    return content;
  }

  public void setContent(@javax.annotation.Nullable List<WebhookEndpointProjection> content) {
    this.content = content;
  }


  public PageWebhookEndpointProjection pageable(@javax.annotation.Nullable PageableObject pageable) {
    this.pageable = pageable;
    return this;
  }

  /**
   * Get pageable
   * @return pageable
   */
  @javax.annotation.Nullable
  public PageableObject getPageable() {
    return pageable;
  }

  public void setPageable(@javax.annotation.Nullable PageableObject pageable) {
    this.pageable = pageable;
  }


  public PageWebhookEndpointProjection totalElements(@javax.annotation.Nonnull Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
   */
  @javax.annotation.Nonnull
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(@javax.annotation.Nonnull Long totalElements) {
    this.totalElements = totalElements;
  }


  public PageWebhookEndpointProjection totalPages(@javax.annotation.Nonnull Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
   */
  @javax.annotation.Nonnull
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(@javax.annotation.Nonnull Integer totalPages) {
    this.totalPages = totalPages;
  }


  public PageWebhookEndpointProjection last(@javax.annotation.Nullable Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
   */
  @javax.annotation.Nullable
  public Boolean getLast() {
    return last;
  }

  public void setLast(@javax.annotation.Nullable Boolean last) {
    this.last = last;
  }


  public PageWebhookEndpointProjection numberOfElements(@javax.annotation.Nullable Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Get numberOfElements
   * @return numberOfElements
   */
  @javax.annotation.Nullable
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(@javax.annotation.Nullable Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }


  public PageWebhookEndpointProjection first(@javax.annotation.Nullable Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
   */
  @javax.annotation.Nullable
  public Boolean getFirst() {
    return first;
  }

  public void setFirst(@javax.annotation.Nullable Boolean first) {
    this.first = first;
  }


  public PageWebhookEndpointProjection size(@javax.annotation.Nullable Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable
  public Integer getSize() {
    return size;
  }

  public void setSize(@javax.annotation.Nullable Integer size) {
    this.size = size;
  }


  public PageWebhookEndpointProjection number(@javax.annotation.Nullable Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   */
  @javax.annotation.Nullable
  public Integer getNumber() {
    return number;
  }

  public void setNumber(@javax.annotation.Nullable Integer number) {
    this.number = number;
  }


  public PageWebhookEndpointProjection sort(@javax.annotation.Nullable SortObject sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
   */
  @javax.annotation.Nullable
  public SortObject getSort() {
    return sort;
  }

  public void setSort(@javax.annotation.Nullable SortObject sort) {
    this.sort = sort;
  }


  public PageWebhookEndpointProjection empty(@javax.annotation.Nullable Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
   */
  @javax.annotation.Nullable
  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(@javax.annotation.Nullable Boolean empty) {
    this.empty = empty;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageWebhookEndpointProjection pageWebhookEndpointProjection = (PageWebhookEndpointProjection) o;
    return Objects.equals(this.content, pageWebhookEndpointProjection.content) &&
        Objects.equals(this.pageable, pageWebhookEndpointProjection.pageable) &&
        Objects.equals(this.totalElements, pageWebhookEndpointProjection.totalElements) &&
        Objects.equals(this.totalPages, pageWebhookEndpointProjection.totalPages) &&
        Objects.equals(this.last, pageWebhookEndpointProjection.last) &&
        Objects.equals(this.numberOfElements, pageWebhookEndpointProjection.numberOfElements) &&
        Objects.equals(this.first, pageWebhookEndpointProjection.first) &&
        Objects.equals(this.size, pageWebhookEndpointProjection.size) &&
        Objects.equals(this.number, pageWebhookEndpointProjection.number) &&
        Objects.equals(this.sort, pageWebhookEndpointProjection.sort) &&
        Objects.equals(this.empty, pageWebhookEndpointProjection.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, pageable, totalElements, totalPages, last, numberOfElements, first, size, number, sort, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageWebhookEndpointProjection {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("pageable");
    openapiFields.add("totalElements");
    openapiFields.add("totalPages");
    openapiFields.add("last");
    openapiFields.add("numberOfElements");
    openapiFields.add("first");
    openapiFields.add("size");
    openapiFields.add("number");
    openapiFields.add("sort");
    openapiFields.add("empty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("totalElements");
    openapiRequiredFields.add("totalPages");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PageWebhookEndpointProjection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!PageWebhookEndpointProjection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageWebhookEndpointProjection is not found in the empty JSON string", PageWebhookEndpointProjection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageWebhookEndpointProjection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageWebhookEndpointProjection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PageWebhookEndpointProjection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        JsonArray jsonArraycontent = jsonObj.getAsJsonArray("content");
        if (jsonArraycontent != null) {
          // ensure the json data is an array
          if (!jsonObj.get("content").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `content` to be an array in the JSON string but got `%s`", jsonObj.get("content").toString()));
          }

          // validate the optional field `content` (array)
          for (int i = 0; i < jsonArraycontent.size(); i++) {
            WebhookEndpointProjection.validateJsonElement(jsonArraycontent.get(i));
          };
        }
      }
      // validate the optional field `pageable`
      if (jsonObj.get("pageable") != null && !jsonObj.get("pageable").isJsonNull()) {
        PageableObject.validateJsonElement(jsonObj.get("pageable"));
      }
      // validate the optional field `sort`
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) {
        SortObject.validateJsonElement(jsonObj.get("sort"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageWebhookEndpointProjection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageWebhookEndpointProjection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageWebhookEndpointProjection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageWebhookEndpointProjection.class));

       return (TypeAdapter<T>) new TypeAdapter<PageWebhookEndpointProjection>() {
           @Override
           public void write(JsonWriter out, PageWebhookEndpointProjection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageWebhookEndpointProjection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PageWebhookEndpointProjection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PageWebhookEndpointProjection
   * @throws IOException if the JSON string is invalid with respect to PageWebhookEndpointProjection
   */
  public static PageWebhookEndpointProjection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageWebhookEndpointProjection.class);
  }

  /**
   * Convert an instance of PageWebhookEndpointProjection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

