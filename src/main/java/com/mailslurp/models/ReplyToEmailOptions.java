/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
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
import java.util.UUID;

/**
 * Options for replying to email with API
 */
@ApiModel(description = "Options for replying to email with API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-11T22:05:12.115Z[GMT]")
public class ReplyToEmailOptions {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CHARSET = "charset";
  @SerializedName(SERIALIZED_NAME_CHARSET)
  private String charset;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_IS_H_T_M_L = "isHTML";
  @SerializedName(SERIALIZED_NAME_IS_H_T_M_L)
  private Boolean isHTML;

  public static final String SERIALIZED_NAME_REPLY_TO = "replyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private String replyTo;

  /**
   * When to send the email. Typically immediately
   */
  @JsonAdapter(SendStrategyEnum.Adapter.class)
  public enum SendStrategyEnum {
    SINGLE_MESSAGE("SINGLE_MESSAGE");

    private String value;

    SendStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SendStrategyEnum fromValue(String value) {
      for (SendStrategyEnum b : SendStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SendStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SendStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SendStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SendStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEND_STRATEGY = "sendStrategy";
  @SerializedName(SERIALIZED_NAME_SEND_STRATEGY)
  private SendStrategyEnum sendStrategy;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private UUID template;

  public static final String SERIALIZED_NAME_TEMPLATE_VARIABLES = "templateVariables";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VARIABLES)
  private Object templateVariables;

  public static final String SERIALIZED_NAME_USE_INBOX_NAME = "useInboxName";
  @SerializedName(SERIALIZED_NAME_USE_INBOX_NAME)
  private Boolean useInboxName;


  public ReplyToEmailOptions attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public ReplyToEmailOptions addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of uploaded attachments to send with the reply. Optional.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of uploaded attachments to send with the reply. Optional.")

  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public ReplyToEmailOptions body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Body of the reply email you want to send
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Body of the reply email you want to send")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public ReplyToEmailOptions charset(String charset) {
    
    this.charset = charset;
    return this;
  }

   /**
   * The charset that your message should be sent with. Optional. Default is UTF-8
   * @return charset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The charset that your message should be sent with. Optional. Default is UTF-8")

  public String getCharset() {
    return charset;
  }


  public void setCharset(String charset) {
    this.charset = charset;
  }


  public ReplyToEmailOptions from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The from header that should be used. Optional
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The from header that should be used. Optional")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public ReplyToEmailOptions isHTML(Boolean isHTML) {
    
    this.isHTML = isHTML;
    return this;
  }

   /**
   * Is the reply HTML
   * @return isHTML
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the reply HTML")

  public Boolean getIsHTML() {
    return isHTML;
  }


  public void setIsHTML(Boolean isHTML) {
    this.isHTML = isHTML;
  }


  public ReplyToEmailOptions replyTo(String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * The replyTo header that should be used. Optional
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The replyTo header that should be used. Optional")

  public String getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }


  public ReplyToEmailOptions sendStrategy(SendStrategyEnum sendStrategy) {
    
    this.sendStrategy = sendStrategy;
    return this;
  }

   /**
   * When to send the email. Typically immediately
   * @return sendStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When to send the email. Typically immediately")

  public SendStrategyEnum getSendStrategy() {
    return sendStrategy;
  }


  public void setSendStrategy(SendStrategyEnum sendStrategy) {
    this.sendStrategy = sendStrategy;
  }


  public ReplyToEmailOptions template(UUID template) {
    
    this.template = template;
    return this;
  }

   /**
   * Template ID to use instead of body. Will use template variable map to fill defined variable slots.
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template ID to use instead of body. Will use template variable map to fill defined variable slots.")

  public UUID getTemplate() {
    return template;
  }


  public void setTemplate(UUID template) {
    this.template = template;
  }


  public ReplyToEmailOptions templateVariables(Object templateVariables) {
    
    this.templateVariables = templateVariables;
    return this;
  }

   /**
   * Template variables if using a template
   * @return templateVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template variables if using a template")

  public Object getTemplateVariables() {
    return templateVariables;
  }


  public void setTemplateVariables(Object templateVariables) {
    this.templateVariables = templateVariables;
  }


  public ReplyToEmailOptions useInboxName(Boolean useInboxName) {
    
    this.useInboxName = useInboxName;
    return this;
  }

   /**
   * Optionally use inbox name as display name for sender email address
   * @return useInboxName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optionally use inbox name as display name for sender email address")

  public Boolean getUseInboxName() {
    return useInboxName;
  }


  public void setUseInboxName(Boolean useInboxName) {
    this.useInboxName = useInboxName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplyToEmailOptions replyToEmailOptions = (ReplyToEmailOptions) o;
    return Objects.equals(this.attachments, replyToEmailOptions.attachments) &&
        Objects.equals(this.body, replyToEmailOptions.body) &&
        Objects.equals(this.charset, replyToEmailOptions.charset) &&
        Objects.equals(this.from, replyToEmailOptions.from) &&
        Objects.equals(this.isHTML, replyToEmailOptions.isHTML) &&
        Objects.equals(this.replyTo, replyToEmailOptions.replyTo) &&
        Objects.equals(this.sendStrategy, replyToEmailOptions.sendStrategy) &&
        Objects.equals(this.template, replyToEmailOptions.template) &&
        Objects.equals(this.templateVariables, replyToEmailOptions.templateVariables) &&
        Objects.equals(this.useInboxName, replyToEmailOptions.useInboxName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, body, charset, from, isHTML, replyTo, sendStrategy, template, templateVariables, useInboxName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyToEmailOptions {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    isHTML: ").append(toIndentedString(isHTML)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    sendStrategy: ").append(toIndentedString(sendStrategy)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    useInboxName: ").append(toIndentedString(useInboxName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

