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
import com.mailslurp.models.TemplateVariable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.mailslurp.clients.JSON;

/**
 * Email template
 */
@ApiModel(description = "Email template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T23:33:57.654989Z[Etc/UTC]")
public class TemplateDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<TemplateVariable> variables = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public TemplateDto() {
  }

  public TemplateDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of template
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of template")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TemplateDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Template name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Template name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TemplateDto variables(List<TemplateVariable> variables) {
    
    this.variables = variables;
    return this;
  }

  public TemplateDto addVariablesItem(TemplateVariable variablesItem) {
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Variables available in template that can be replaced with values
   * @return variables
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Variables available in template that can be replaced with values")

  public List<TemplateVariable> getVariables() {
    return variables;
  }


  public void setVariables(List<TemplateVariable> variables) {
    this.variables = variables;
  }


  public TemplateDto content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Content of the template
   * @return content
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Content of the template")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public TemplateDto createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created at time
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Created at time")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
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
    TemplateDto templateDto = (TemplateDto) o;
    return Objects.equals(this.id, templateDto.id) &&
        Objects.equals(this.name, templateDto.name) &&
        Objects.equals(this.variables, templateDto.variables) &&
        Objects.equals(this.content, templateDto.content) &&
        Objects.equals(this.createdAt, templateDto.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, variables, content, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("variables");
    openapiFields.add("content");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("variables");
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("createdAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateDto is not found in the empty JSON string", TemplateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("variables").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `variables` to be an array in the JSON string but got `%s`", jsonObj.get("variables").toString()));
      }

      JsonArray jsonArrayvariables = jsonObj.getAsJsonArray("variables");
      // validate the required field `variables` (array)
      for (int i = 0; i < jsonArrayvariables.size(); i++) {
        TemplateVariable.validateJsonObject(jsonArrayvariables.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateDto>() {
           @Override
           public void write(JsonWriter out, TemplateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateDto
  * @throws IOException if the JSON string is invalid with respect to TemplateDto
  */
  public static TemplateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateDto.class);
  }

 /**
  * Convert an instance of TemplateDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

