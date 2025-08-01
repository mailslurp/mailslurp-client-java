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
import com.mailslurp.models.EmailFeatureNames;
import com.mailslurp.models.EmailFeatureOverview;
import com.mailslurp.models.EmailFeatureSupportStatusPercentage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
 * EmailFeatureSupportResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-30T22:25:17.446308831Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class EmailFeatureSupportResult {
  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  @javax.annotation.Nonnull
  private EmailFeatureNames names;

  /**
   * Gets or Sets detectedFeatures
   */
  @JsonAdapter(DetectedFeaturesEnum.Adapter.class)
  public enum DetectedFeaturesEnum {
    AMP("amp"),
    
    CSS_ACCENT_COLOR("css-accent-color"),
    
    CSS_ALIGN_ITEMS("css-align-items"),
    
    CSS_ANIMATION("css-animation"),
    
    CSS_ASPECT_RATIO("css-aspect-ratio"),
    
    CSS_AT_FONT_FACE("css-at-font-face"),
    
    CSS_AT_IMPORT("css-at-import"),
    
    CSS_AT_KEYFRAMES("css-at-keyframes"),
    
    CSS_AT_MEDIA("css-at-media"),
    
    CSS_AT_SUPPORTS("css-at-supports"),
    
    CSS_BACKGROUND_BLEND_MODE("css-background-blend-mode"),
    
    CSS_BACKGROUND_CLIP("css-background-clip"),
    
    CSS_BACKGROUND_COLOR("css-background-color"),
    
    CSS_BACKGROUND_IMAGE("css-background-image"),
    
    CSS_BACKGROUND_ORIGIN("css-background-origin"),
    
    CSS_BACKGROUND_POSITION("css-background-position"),
    
    CSS_BACKGROUND_REPEAT("css-background-repeat"),
    
    CSS_BACKGROUND_SIZE("css-background-size"),
    
    CSS_BACKGROUND("css-background"),
    
    CSS_BLOCK_INLINE_SIZE("css-block-inline-size"),
    
    CSS_BORDER_IMAGE("css-border-image"),
    
    CSS_BORDER_INLINE_BLOCK_INDIVIDUAL("css-border-inline-block-individual"),
    
    CSS_BORDER_INLINE_BLOCK_LONGHAND("css-border-inline-block-longhand"),
    
    CSS_BORDER_INLINE_BLOCK("css-border-inline-block"),
    
    CSS_BORDER_RADIUS_LOGICAL("css-border-radius-logical"),
    
    CSS_BORDER_RADIUS("css-border-radius"),
    
    CSS_BORDER("css-border"),
    
    CSS_BOX_SHADOW("css-box-shadow"),
    
    CSS_BOX_SIZING("css-box-sizing"),
    
    CSS_CAPTION_SIDE("css-caption-side"),
    
    CSS_CLIP_PATH("css-clip-path"),
    
    CSS_COLUMN_COUNT("css-column-count"),
    
    CSS_COLUMN_LAYOUT_PROPERTIES("css-column-layout-properties"),
    
    CSS_DIRECTION("css-direction"),
    
    CSS_DISPLAY_FLEX("css-display-flex"),
    
    CSS_DISPLAY_GRID("css-display-grid"),
    
    CSS_DISPLAY_NONE("css-display-none"),
    
    CSS_DISPLAY("css-display"),
    
    CSS_FILTER("css-filter"),
    
    CSS_FLEX_DIRECTION("css-flex-direction"),
    
    CSS_FLEX_WRAP("css-flex-wrap"),
    
    CSS_FLOAT("css-float"),
    
    CSS_FONT_KERNING("css-font-kerning"),
    
    CSS_FONT_WEIGHT("css-font-weight"),
    
    CSS_FONT("css-font"),
    
    CSS_GAP("css-gap"),
    
    CSS_GRID_TEMPLATE("css-grid-template"),
    
    CSS_HEIGHT("css-height"),
    
    CSS_HYPHENS("css-hyphens"),
    
    CSS_INLINE_SIZE("css-inline-size"),
    
    CSS_JUSTIFY_CONTENT("css-justify-content"),
    
    CSS_LEFT_RIGHT_TOP_BOTTOM("css-left-right-top-bottom"),
    
    CSS_LETTER_SPACING("css-letter-spacing"),
    
    CSS_LINE_HEIGHT("css-line-height"),
    
    CSS_LIST_STYLE_IMAGE("css-list-style-image"),
    
    CSS_LIST_STYLE_POSITION("css-list-style-position"),
    
    CSS_LIST_STYLE_TYPE("css-list-style-type"),
    
    CSS_LIST_STYLE("css-list-style"),
    
    CSS_MARGIN_BLOCK_START_END("css-margin-block-start-end"),
    
    CSS_MARGIN_INLINE_BLOCK("css-margin-inline-block"),
    
    CSS_MARGIN_INLINE_START_END("css-margin-inline-start-end"),
    
    CSS_MARGIN_INLINE("css-margin-inline"),
    
    CSS_MARGIN("css-margin"),
    
    CSS_MAX_BLOCK_SIZE("css-max-block-size"),
    
    CSS_MAX_HEIGHT("css-max-height"),
    
    CSS_MAX_WIDTH("css-max-width"),
    
    CSS_MIN_HEIGHT("css-min-height"),
    
    CSS_MIN_INLINE_SIZE("css-min-inline-size"),
    
    CSS_MIN_WIDTH("css-min-width"),
    
    CSS_MIX_BLEND_MODE("css-mix-blend-mode"),
    
    CSS_OBJECT_FIT("css-object-fit"),
    
    CSS_OBJECT_POSITION("css-object-position"),
    
    CSS_OPACITY("css-opacity"),
    
    CSS_OUTLINE_OFFSET("css-outline-offset"),
    
    CSS_OUTLINE("css-outline"),
    
    CSS_OVERFLOW_WRAP("css-overflow-wrap"),
    
    CSS_OVERFLOW("css-overflow"),
    
    CSS_PADDING_BLOCK_START_END("css-padding-block-start-end"),
    
    CSS_PADDING_INLINE_BLOCK("css-padding-inline-block"),
    
    CSS_PADDING_INLINE_START_END("css-padding-inline-start-end"),
    
    CSS_PADDING("css-padding"),
    
    CSS_POSITION("css-position"),
    
    CSS_TAB_SIZE("css-tab-size"),
    
    CSS_TABLE_LAYOUT("css-table-layout"),
    
    CSS_TEXT_ALIGN_LAST("css-text-align-last"),
    
    CSS_TEXT_ALIGN("css-text-align"),
    
    CSS_TEXT_DECORATION_COLOR("css-text-decoration-color"),
    
    CSS_TEXT_DECORATION_THICKNESS("css-text-decoration-thickness"),
    
    CSS_TEXT_DECORATION("css-text-decoration"),
    
    CSS_TEXT_EMPHASIS_POSITION("css-text-emphasis-position"),
    
    CSS_TEXT_EMPHASIS("css-text-emphasis"),
    
    CSS_TEXT_INDENT("css-text-indent"),
    
    CSS_TEXT_OVERFLOW("css-text-overflow"),
    
    CSS_TEXT_SHADOW("css-text-shadow"),
    
    CSS_TEXT_TRANSFORM("css-text-transform"),
    
    CSS_TEXT_UNDERLINE_OFFSET("css-text-underline-offset"),
    
    CSS_TRANSFORM("css-transform"),
    
    CSS_VERTICAL_ALIGN("css-vertical-align"),
    
    CSS_VISIBILITY("css-visibility"),
    
    CSS_WHITE_SPACE("css-white-space"),
    
    CSS_WIDTH("css-width"),
    
    CSS_WORD_BREAK("css-word-break"),
    
    CSS_WRITING_MODE("css-writing-mode"),
    
    CSS_Z_INDEX("css-z-index"),
    
    HTML_ABBR("html-abbr"),
    
    HTML_ADDRESS("html-address"),
    
    HTML_ALIGN("html-align"),
    
    HTML_ANCHOR_LINKS("html-anchor-links"),
    
    HTML_ARIA_DESCRIBEDBY("html-aria-describedby"),
    
    HTML_ARIA_HIDDEN("html-aria-hidden"),
    
    HTML_ARIA_LABEL("html-aria-label"),
    
    HTML_ARIA_LABELLEDBY("html-aria-labelledby"),
    
    HTML_ARIA_LIVE("html-aria-live"),
    
    HTML_AUDIO("html-audio"),
    
    HTML_BACKGROUND("html-background"),
    
    HTML_BASE("html-base"),
    
    HTML_BLOCKQUOTE("html-blockquote"),
    
    HTML_BODY("html-body"),
    
    HTML_BUTTON_RESET("html-button-reset"),
    
    HTML_BUTTON_SUBMIT("html-button-submit"),
    
    HTML_CODE("html-code"),
    
    HTML_DEL("html-del"),
    
    HTML_DFN("html-dfn"),
    
    HTML_DIALOG("html-dialog"),
    
    HTML_DIR("html-dir"),
    
    HTML_DIV("html-div"),
    
    HTML_DOCTYPE("html-doctype"),
    
    HTML_FORM("html-form"),
    
    HTML_H1_H6("html-h1-h6"),
    
    HTML_HEIGHT("html-height"),
    
    HTML_IMAGE_MAPS("html-image-maps"),
    
    HTML_INPUT_CHECKBOX("html-input-checkbox"),
    
    HTML_INPUT_HIDDEN("html-input-hidden"),
    
    HTML_INPUT_RADIO("html-input-radio"),
    
    HTML_INPUT_RESET("html-input-reset"),
    
    HTML_INPUT_SUBMIT("html-input-submit"),
    
    HTML_INPUT_TEXT("html-input-text"),
    
    HTML_LANG("html-lang"),
    
    HTML_LINK("html-link"),
    
    HTML_LISTS("html-lists"),
    
    HTML_LOADING_ATTRIBUTE("html-loading-attribute"),
    
    HTML_MAILTO_LINKS("html-mailto-links"),
    
    HTML_MARQUEE("html-marquee"),
    
    HTML_METER("html-meter"),
    
    HTML_OBJECT("html-object"),
    
    HTML_P("html-p"),
    
    HTML_PICTURE("html-picture"),
    
    HTML_PRE("html-pre"),
    
    HTML_PROGRESS("html-progress"),
    
    HTML_REQUIRED("html-required"),
    
    HTML_ROLE("html-role"),
    
    HTML_RP("html-rp"),
    
    HTML_RT("html-rt"),
    
    HTML_RUBY("html-ruby"),
    
    HTML_SELECT("html-select"),
    
    HTML_SEMANTICS("html-semantics"),
    
    HTML_SMALL("html-small"),
    
    HTML_SPAN("html-span"),
    
    HTML_SRCSET("html-srcset"),
    
    HTML_STRIKE("html-strike"),
    
    HTML_STRONG("html-strong"),
    
    HTML_STYLE("html-style"),
    
    HTML_SVG("html-svg"),
    
    HTML_TABLE("html-table"),
    
    HTML_TARGET("html-target"),
    
    HTML_TEXTAREA("html-textarea"),
    
    HTML_VALIGN("html-valign"),
    
    HTML_VIDEO("html-video"),
    
    HTML_WBR("html-wbr"),
    
    HTML_WIDTH("html-width"),
    
    IMAGE_AVIF("image-avif"),
    
    IMAGE_BASE64("image-base64"),
    
    IMAGE_BMP("image-bmp"),
    
    IMAGE_GIF("image-gif"),
    
    IMAGE_ICO("image-ico"),
    
    IMAGE_JPG("image-jpg"),
    
    IMAGE_PNG("image-png"),
    
    IMAGE_SVG("image-svg"),
    
    IMAGE_WEBP("image-webp"),
    
    UNSUPPORTED("unsupported");

    private String value;

    DetectedFeaturesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DetectedFeaturesEnum fromValue(String value) {
      for (DetectedFeaturesEnum b : DetectedFeaturesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DetectedFeaturesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DetectedFeaturesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DetectedFeaturesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DetectedFeaturesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      String value = jsonElement.getAsString();
      DetectedFeaturesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DETECTED_FEATURES = "detectedFeatures";
  @SerializedName(SERIALIZED_NAME_DETECTED_FEATURES)
  @javax.annotation.Nonnull
  private Set<DetectedFeaturesEnum> detectedFeatures = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_FEATURE_OVERVIEWS = "featureOverviews";
  @SerializedName(SERIALIZED_NAME_FEATURE_OVERVIEWS)
  @javax.annotation.Nonnull
  private List<EmailFeatureOverview> featureOverviews = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEATURE_PERCENTAGES = "featurePercentages";
  @SerializedName(SERIALIZED_NAME_FEATURE_PERCENTAGES)
  @javax.annotation.Nonnull
  private List<EmailFeatureSupportStatusPercentage> featurePercentages = new ArrayList<>();

  public EmailFeatureSupportResult() {
  }

  public EmailFeatureSupportResult names(@javax.annotation.Nonnull EmailFeatureNames names) {
    this.names = names;
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @javax.annotation.Nonnull
  public EmailFeatureNames getNames() {
    return names;
  }

  public void setNames(@javax.annotation.Nonnull EmailFeatureNames names) {
    this.names = names;
  }


  public EmailFeatureSupportResult detectedFeatures(@javax.annotation.Nonnull Set<DetectedFeaturesEnum> detectedFeatures) {
    this.detectedFeatures = detectedFeatures;
    return this;
  }

  public EmailFeatureSupportResult addDetectedFeaturesItem(DetectedFeaturesEnum detectedFeaturesItem) {
    if (this.detectedFeatures == null) {
      this.detectedFeatures = new LinkedHashSet<>();
    }
    this.detectedFeatures.add(detectedFeaturesItem);
    return this;
  }

  /**
   * Get detectedFeatures
   * @return detectedFeatures
   */
  @javax.annotation.Nonnull
  public Set<DetectedFeaturesEnum> getDetectedFeatures() {
    return detectedFeatures;
  }

  public void setDetectedFeatures(@javax.annotation.Nonnull Set<DetectedFeaturesEnum> detectedFeatures) {
    this.detectedFeatures = detectedFeatures;
  }


  public EmailFeatureSupportResult featureOverviews(@javax.annotation.Nonnull List<EmailFeatureOverview> featureOverviews) {
    this.featureOverviews = featureOverviews;
    return this;
  }

  public EmailFeatureSupportResult addFeatureOverviewsItem(EmailFeatureOverview featureOverviewsItem) {
    if (this.featureOverviews == null) {
      this.featureOverviews = new ArrayList<>();
    }
    this.featureOverviews.add(featureOverviewsItem);
    return this;
  }

  /**
   * Get featureOverviews
   * @return featureOverviews
   */
  @javax.annotation.Nonnull
  public List<EmailFeatureOverview> getFeatureOverviews() {
    return featureOverviews;
  }

  public void setFeatureOverviews(@javax.annotation.Nonnull List<EmailFeatureOverview> featureOverviews) {
    this.featureOverviews = featureOverviews;
  }


  public EmailFeatureSupportResult featurePercentages(@javax.annotation.Nonnull List<EmailFeatureSupportStatusPercentage> featurePercentages) {
    this.featurePercentages = featurePercentages;
    return this;
  }

  public EmailFeatureSupportResult addFeaturePercentagesItem(EmailFeatureSupportStatusPercentage featurePercentagesItem) {
    if (this.featurePercentages == null) {
      this.featurePercentages = new ArrayList<>();
    }
    this.featurePercentages.add(featurePercentagesItem);
    return this;
  }

  /**
   * Get featurePercentages
   * @return featurePercentages
   */
  @javax.annotation.Nonnull
  public List<EmailFeatureSupportStatusPercentage> getFeaturePercentages() {
    return featurePercentages;
  }

  public void setFeaturePercentages(@javax.annotation.Nonnull List<EmailFeatureSupportStatusPercentage> featurePercentages) {
    this.featurePercentages = featurePercentages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailFeatureSupportResult emailFeatureSupportResult = (EmailFeatureSupportResult) o;
    return Objects.equals(this.names, emailFeatureSupportResult.names) &&
        Objects.equals(this.detectedFeatures, emailFeatureSupportResult.detectedFeatures) &&
        Objects.equals(this.featureOverviews, emailFeatureSupportResult.featureOverviews) &&
        Objects.equals(this.featurePercentages, emailFeatureSupportResult.featurePercentages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, detectedFeatures, featureOverviews, featurePercentages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailFeatureSupportResult {\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    detectedFeatures: ").append(toIndentedString(detectedFeatures)).append("\n");
    sb.append("    featureOverviews: ").append(toIndentedString(featureOverviews)).append("\n");
    sb.append("    featurePercentages: ").append(toIndentedString(featurePercentages)).append("\n");
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
    openapiFields.add("names");
    openapiFields.add("detectedFeatures");
    openapiFields.add("featureOverviews");
    openapiFields.add("featurePercentages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("names");
    openapiRequiredFields.add("detectedFeatures");
    openapiRequiredFields.add("featureOverviews");
    openapiRequiredFields.add("featurePercentages");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmailFeatureSupportResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException { if (true) { return; }
      if (jsonElement == null) {
        if (!EmailFeatureSupportResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailFeatureSupportResult is not found in the empty JSON string", EmailFeatureSupportResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmailFeatureSupportResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailFeatureSupportResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmailFeatureSupportResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `names`
      EmailFeatureNames.validateJsonElement(jsonObj.get("names"));
      // ensure the required json array is present
      if (jsonObj.get("detectedFeatures") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("detectedFeatures").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `detectedFeatures` to be an array in the JSON string but got `%s`", jsonObj.get("detectedFeatures").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("featureOverviews").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `featureOverviews` to be an array in the JSON string but got `%s`", jsonObj.get("featureOverviews").toString()));
      }

      JsonArray jsonArrayfeatureOverviews = jsonObj.getAsJsonArray("featureOverviews");
      // validate the required field `featureOverviews` (array)
      for (int i = 0; i < jsonArrayfeatureOverviews.size(); i++) {
        EmailFeatureOverview.validateJsonElement(jsonArrayfeatureOverviews.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("featurePercentages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `featurePercentages` to be an array in the JSON string but got `%s`", jsonObj.get("featurePercentages").toString()));
      }

      JsonArray jsonArrayfeaturePercentages = jsonObj.getAsJsonArray("featurePercentages");
      // validate the required field `featurePercentages` (array)
      for (int i = 0; i < jsonArrayfeaturePercentages.size(); i++) {
        EmailFeatureSupportStatusPercentage.validateJsonElement(jsonArrayfeaturePercentages.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailFeatureSupportResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailFeatureSupportResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailFeatureSupportResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailFeatureSupportResult.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailFeatureSupportResult>() {
           @Override
           public void write(JsonWriter out, EmailFeatureSupportResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailFeatureSupportResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmailFeatureSupportResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmailFeatureSupportResult
   * @throws IOException if the JSON string is invalid with respect to EmailFeatureSupportResult
   */
  public static EmailFeatureSupportResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailFeatureSupportResult.class);
  }

  /**
   * Convert an instance of EmailFeatureSupportResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

