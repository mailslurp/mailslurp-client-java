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
 * Byte array request body
 */
@ApiModel(description = "Byte array request body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T23:33:57.654989Z[Etc/UTC]")
public class UploadAttachmentBytesRequest {
  public static final String SERIALIZED_NAME_SHORT = "short";
  @SerializedName(SERIALIZED_NAME_SHORT)
  private Integer _short;

  public static final String SERIALIZED_NAME_CHAR = "char";
  @SerializedName(SERIALIZED_NAME_CHAR)
  private String _char;

  public static final String SERIALIZED_NAME_INT = "int";
  @SerializedName(SERIALIZED_NAME_INT)
  private Integer _int;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private Long _long;

  public static final String SERIALIZED_NAME_FLOAT = "float";
  @SerializedName(SERIALIZED_NAME_FLOAT)
  private Float _float;

  public static final String SERIALIZED_NAME_DOUBLE = "double";
  @SerializedName(SERIALIZED_NAME_DOUBLE)
  private Double _double;

  public static final String SERIALIZED_NAME_DIRECT = "direct";
  @SerializedName(SERIALIZED_NAME_DIRECT)
  private Boolean direct;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public UploadAttachmentBytesRequest() {
  }

  public UploadAttachmentBytesRequest _short(Integer _short) {
    
    this._short = _short;
    return this;
  }

   /**
   * Get _short
   * @return _short
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getShort() {
    return _short;
  }


  public void setShort(Integer _short) {
    this._short = _short;
  }


  public UploadAttachmentBytesRequest _char(String _char) {
    
    this._char = _char;
    return this;
  }

   /**
   * Get _char
   * @return _char
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChar() {
    return _char;
  }


  public void setChar(String _char) {
    this._char = _char;
  }


  public UploadAttachmentBytesRequest _int(Integer _int) {
    
    this._int = _int;
    return this;
  }

   /**
   * Get _int
   * @return _int
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInt() {
    return _int;
  }


  public void setInt(Integer _int) {
    this._int = _int;
  }


  public UploadAttachmentBytesRequest _long(Long _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * @return _long
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLong() {
    return _long;
  }


  public void setLong(Long _long) {
    this._long = _long;
  }


  public UploadAttachmentBytesRequest _float(Float _float) {
    
    this._float = _float;
    return this;
  }

   /**
   * Get _float
   * @return _float
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getFloat() {
    return _float;
  }


  public void setFloat(Float _float) {
    this._float = _float;
  }


  public UploadAttachmentBytesRequest _double(Double _double) {
    
    this._double = _double;
    return this;
  }

   /**
   * Get _double
   * @return _double
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getDouble() {
    return _double;
  }


  public void setDouble(Double _double) {
    this._double = _double;
  }


  public UploadAttachmentBytesRequest direct(Boolean direct) {
    
    this.direct = direct;
    return this;
  }

   /**
   * Get direct
   * @return direct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDirect() {
    return direct;
  }


  public void setDirect(Boolean direct) {
    this.direct = direct;
  }


  public UploadAttachmentBytesRequest readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadAttachmentBytesRequest uploadAttachmentBytesRequest = (UploadAttachmentBytesRequest) o;
    return Objects.equals(this._short, uploadAttachmentBytesRequest._short) &&
        Objects.equals(this._char, uploadAttachmentBytesRequest._char) &&
        Objects.equals(this._int, uploadAttachmentBytesRequest._int) &&
        Objects.equals(this._long, uploadAttachmentBytesRequest._long) &&
        Objects.equals(this._float, uploadAttachmentBytesRequest._float) &&
        Objects.equals(this._double, uploadAttachmentBytesRequest._double) &&
        Objects.equals(this.direct, uploadAttachmentBytesRequest.direct) &&
        Objects.equals(this.readOnly, uploadAttachmentBytesRequest.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_short, _char, _int, _long, _float, _double, direct, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadAttachmentBytesRequest {\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
    sb.append("    _char: ").append(toIndentedString(_char)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    direct: ").append(toIndentedString(direct)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
    openapiFields.add("short");
    openapiFields.add("char");
    openapiFields.add("int");
    openapiFields.add("long");
    openapiFields.add("float");
    openapiFields.add("double");
    openapiFields.add("direct");
    openapiFields.add("readOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadAttachmentBytesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadAttachmentBytesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadAttachmentBytesRequest is not found in the empty JSON string", UploadAttachmentBytesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UploadAttachmentBytesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadAttachmentBytesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("char") != null && !jsonObj.get("char").isJsonNull()) && !jsonObj.get("char").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `char` to be a primitive type in the JSON string but got `%s`", jsonObj.get("char").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadAttachmentBytesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadAttachmentBytesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadAttachmentBytesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadAttachmentBytesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadAttachmentBytesRequest>() {
           @Override
           public void write(JsonWriter out, UploadAttachmentBytesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadAttachmentBytesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadAttachmentBytesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadAttachmentBytesRequest
  * @throws IOException if the JSON string is invalid with respect to UploadAttachmentBytesRequest
  */
  public static UploadAttachmentBytesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadAttachmentBytesRequest.class);
  }

 /**
  * Convert an instance of UploadAttachmentBytesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

