

# EmailFeatureOverview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feature** | [**FeatureEnum**](#FeatureEnum) |  |  |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**notesNumbers** | **Map&lt;String, String&gt;** |  |  [optional] |
|**featureStatistics** | [**List&lt;EmailFeatureFamilyStatistics&gt;**](EmailFeatureFamilyStatistics) |  |  [optional] |
|**statuses** | [**Set&lt;StatusesEnum&gt;**](#Set&lt;StatusesEnum&gt;) |  |  |



## Enum: FeatureEnum

| Name | Value |
|---- | -----|
| AMP | &quot;amp&quot; |
| CSS_ACCENT_COLOR | &quot;css-accent-color&quot; |
| CSS_ALIGN_ITEMS | &quot;css-align-items&quot; |
| CSS_ANIMATION | &quot;css-animation&quot; |
| CSS_ASPECT_RATIO | &quot;css-aspect-ratio&quot; |
| CSS_AT_FONT_FACE | &quot;css-at-font-face&quot; |
| CSS_AT_IMPORT | &quot;css-at-import&quot; |
| CSS_AT_KEYFRAMES | &quot;css-at-keyframes&quot; |
| CSS_AT_MEDIA | &quot;css-at-media&quot; |
| CSS_AT_SUPPORTS | &quot;css-at-supports&quot; |
| CSS_BACKGROUND_BLEND_MODE | &quot;css-background-blend-mode&quot; |
| CSS_BACKGROUND_CLIP | &quot;css-background-clip&quot; |
| CSS_BACKGROUND_COLOR | &quot;css-background-color&quot; |
| CSS_BACKGROUND_IMAGE | &quot;css-background-image&quot; |
| CSS_BACKGROUND_ORIGIN | &quot;css-background-origin&quot; |
| CSS_BACKGROUND_POSITION | &quot;css-background-position&quot; |
| CSS_BACKGROUND_REPEAT | &quot;css-background-repeat&quot; |
| CSS_BACKGROUND_SIZE | &quot;css-background-size&quot; |
| CSS_BACKGROUND | &quot;css-background&quot; |
| CSS_BLOCK_INLINE_SIZE | &quot;css-block-inline-size&quot; |
| CSS_BORDER_IMAGE | &quot;css-border-image&quot; |
| CSS_BORDER_INLINE_BLOCK_INDIVIDUAL | &quot;css-border-inline-block-individual&quot; |
| CSS_BORDER_INLINE_BLOCK_LONGHAND | &quot;css-border-inline-block-longhand&quot; |
| CSS_BORDER_INLINE_BLOCK | &quot;css-border-inline-block&quot; |
| CSS_BORDER_RADIUS_LOGICAL | &quot;css-border-radius-logical&quot; |
| CSS_BORDER_RADIUS | &quot;css-border-radius&quot; |
| CSS_BORDER | &quot;css-border&quot; |
| CSS_BOX_SHADOW | &quot;css-box-shadow&quot; |
| CSS_BOX_SIZING | &quot;css-box-sizing&quot; |
| CSS_CAPTION_SIDE | &quot;css-caption-side&quot; |
| CSS_CLIP_PATH | &quot;css-clip-path&quot; |
| CSS_COLUMN_COUNT | &quot;css-column-count&quot; |
| CSS_COLUMN_LAYOUT_PROPERTIES | &quot;css-column-layout-properties&quot; |
| CSS_DIRECTION | &quot;css-direction&quot; |
| CSS_DISPLAY_FLEX | &quot;css-display-flex&quot; |
| CSS_DISPLAY_GRID | &quot;css-display-grid&quot; |
| CSS_DISPLAY_NONE | &quot;css-display-none&quot; |
| CSS_DISPLAY | &quot;css-display&quot; |
| CSS_FILTER | &quot;css-filter&quot; |
| CSS_FLEX_DIRECTION | &quot;css-flex-direction&quot; |
| CSS_FLEX_WRAP | &quot;css-flex-wrap&quot; |
| CSS_FLOAT | &quot;css-float&quot; |
| CSS_FONT_KERNING | &quot;css-font-kerning&quot; |
| CSS_FONT_WEIGHT | &quot;css-font-weight&quot; |
| CSS_FONT | &quot;css-font&quot; |
| CSS_GAP | &quot;css-gap&quot; |
| CSS_GRID_TEMPLATE | &quot;css-grid-template&quot; |
| CSS_HEIGHT | &quot;css-height&quot; |
| CSS_HYPHENS | &quot;css-hyphens&quot; |
| CSS_INLINE_SIZE | &quot;css-inline-size&quot; |
| CSS_JUSTIFY_CONTENT | &quot;css-justify-content&quot; |
| CSS_LEFT_RIGHT_TOP_BOTTOM | &quot;css-left-right-top-bottom&quot; |
| CSS_LETTER_SPACING | &quot;css-letter-spacing&quot; |
| CSS_LINE_HEIGHT | &quot;css-line-height&quot; |
| CSS_LIST_STYLE_IMAGE | &quot;css-list-style-image&quot; |
| CSS_LIST_STYLE_POSITION | &quot;css-list-style-position&quot; |
| CSS_LIST_STYLE_TYPE | &quot;css-list-style-type&quot; |
| CSS_LIST_STYLE | &quot;css-list-style&quot; |
| CSS_MARGIN_BLOCK_START_END | &quot;css-margin-block-start-end&quot; |
| CSS_MARGIN_INLINE_BLOCK | &quot;css-margin-inline-block&quot; |
| CSS_MARGIN_INLINE_START_END | &quot;css-margin-inline-start-end&quot; |
| CSS_MARGIN_INLINE | &quot;css-margin-inline&quot; |
| CSS_MARGIN | &quot;css-margin&quot; |
| CSS_MAX_BLOCK_SIZE | &quot;css-max-block-size&quot; |
| CSS_MAX_HEIGHT | &quot;css-max-height&quot; |
| CSS_MAX_WIDTH | &quot;css-max-width&quot; |
| CSS_MIN_HEIGHT | &quot;css-min-height&quot; |
| CSS_MIN_INLINE_SIZE | &quot;css-min-inline-size&quot; |
| CSS_MIN_WIDTH | &quot;css-min-width&quot; |
| CSS_MIX_BLEND_MODE | &quot;css-mix-blend-mode&quot; |
| CSS_OBJECT_FIT | &quot;css-object-fit&quot; |
| CSS_OBJECT_POSITION | &quot;css-object-position&quot; |
| CSS_OPACITY | &quot;css-opacity&quot; |
| CSS_OUTLINE_OFFSET | &quot;css-outline-offset&quot; |
| CSS_OUTLINE | &quot;css-outline&quot; |
| CSS_OVERFLOW_WRAP | &quot;css-overflow-wrap&quot; |
| CSS_OVERFLOW | &quot;css-overflow&quot; |
| CSS_PADDING_BLOCK_START_END | &quot;css-padding-block-start-end&quot; |
| CSS_PADDING_INLINE_BLOCK | &quot;css-padding-inline-block&quot; |
| CSS_PADDING_INLINE_START_END | &quot;css-padding-inline-start-end&quot; |
| CSS_PADDING | &quot;css-padding&quot; |
| CSS_POSITION | &quot;css-position&quot; |
| CSS_TAB_SIZE | &quot;css-tab-size&quot; |
| CSS_TABLE_LAYOUT | &quot;css-table-layout&quot; |
| CSS_TEXT_ALIGN_LAST | &quot;css-text-align-last&quot; |
| CSS_TEXT_ALIGN | &quot;css-text-align&quot; |
| CSS_TEXT_DECORATION_COLOR | &quot;css-text-decoration-color&quot; |
| CSS_TEXT_DECORATION_THICKNESS | &quot;css-text-decoration-thickness&quot; |
| CSS_TEXT_DECORATION | &quot;css-text-decoration&quot; |
| CSS_TEXT_EMPHASIS_POSITION | &quot;css-text-emphasis-position&quot; |
| CSS_TEXT_EMPHASIS | &quot;css-text-emphasis&quot; |
| CSS_TEXT_INDENT | &quot;css-text-indent&quot; |
| CSS_TEXT_OVERFLOW | &quot;css-text-overflow&quot; |
| CSS_TEXT_SHADOW | &quot;css-text-shadow&quot; |
| CSS_TEXT_TRANSFORM | &quot;css-text-transform&quot; |
| CSS_TEXT_UNDERLINE_OFFSET | &quot;css-text-underline-offset&quot; |
| CSS_TRANSFORM | &quot;css-transform&quot; |
| CSS_VERTICAL_ALIGN | &quot;css-vertical-align&quot; |
| CSS_VISIBILITY | &quot;css-visibility&quot; |
| CSS_WHITE_SPACE | &quot;css-white-space&quot; |
| CSS_WIDTH | &quot;css-width&quot; |
| CSS_WORD_BREAK | &quot;css-word-break&quot; |
| CSS_WRITING_MODE | &quot;css-writing-mode&quot; |
| CSS_Z_INDEX | &quot;css-z-index&quot; |
| HTML_ABBR | &quot;html-abbr&quot; |
| HTML_ADDRESS | &quot;html-address&quot; |
| HTML_ALIGN | &quot;html-align&quot; |
| HTML_ANCHOR_LINKS | &quot;html-anchor-links&quot; |
| HTML_ARIA_DESCRIBEDBY | &quot;html-aria-describedby&quot; |
| HTML_ARIA_HIDDEN | &quot;html-aria-hidden&quot; |
| HTML_ARIA_LABEL | &quot;html-aria-label&quot; |
| HTML_ARIA_LABELLEDBY | &quot;html-aria-labelledby&quot; |
| HTML_ARIA_LIVE | &quot;html-aria-live&quot; |
| HTML_AUDIO | &quot;html-audio&quot; |
| HTML_BACKGROUND | &quot;html-background&quot; |
| HTML_BASE | &quot;html-base&quot; |
| HTML_BLOCKQUOTE | &quot;html-blockquote&quot; |
| HTML_BODY | &quot;html-body&quot; |
| HTML_BUTTON_RESET | &quot;html-button-reset&quot; |
| HTML_BUTTON_SUBMIT | &quot;html-button-submit&quot; |
| HTML_CODE | &quot;html-code&quot; |
| HTML_DEL | &quot;html-del&quot; |
| HTML_DFN | &quot;html-dfn&quot; |
| HTML_DIALOG | &quot;html-dialog&quot; |
| HTML_DIR | &quot;html-dir&quot; |
| HTML_DIV | &quot;html-div&quot; |
| HTML_DOCTYPE | &quot;html-doctype&quot; |
| HTML_FORM | &quot;html-form&quot; |
| HTML_H1_H6 | &quot;html-h1-h6&quot; |
| HTML_HEIGHT | &quot;html-height&quot; |
| HTML_IMAGE_MAPS | &quot;html-image-maps&quot; |
| HTML_INPUT_CHECKBOX | &quot;html-input-checkbox&quot; |
| HTML_INPUT_HIDDEN | &quot;html-input-hidden&quot; |
| HTML_INPUT_RADIO | &quot;html-input-radio&quot; |
| HTML_INPUT_RESET | &quot;html-input-reset&quot; |
| HTML_INPUT_SUBMIT | &quot;html-input-submit&quot; |
| HTML_INPUT_TEXT | &quot;html-input-text&quot; |
| HTML_LANG | &quot;html-lang&quot; |
| HTML_LINK | &quot;html-link&quot; |
| HTML_LISTS | &quot;html-lists&quot; |
| HTML_LOADING_ATTRIBUTE | &quot;html-loading-attribute&quot; |
| HTML_MAILTO_LINKS | &quot;html-mailto-links&quot; |
| HTML_MARQUEE | &quot;html-marquee&quot; |
| HTML_METER | &quot;html-meter&quot; |
| HTML_OBJECT | &quot;html-object&quot; |
| HTML_P | &quot;html-p&quot; |
| HTML_PICTURE | &quot;html-picture&quot; |
| HTML_PRE | &quot;html-pre&quot; |
| HTML_PROGRESS | &quot;html-progress&quot; |
| HTML_REQUIRED | &quot;html-required&quot; |
| HTML_ROLE | &quot;html-role&quot; |
| HTML_RP | &quot;html-rp&quot; |
| HTML_RT | &quot;html-rt&quot; |
| HTML_RUBY | &quot;html-ruby&quot; |
| HTML_SELECT | &quot;html-select&quot; |
| HTML_SEMANTICS | &quot;html-semantics&quot; |
| HTML_SMALL | &quot;html-small&quot; |
| HTML_SPAN | &quot;html-span&quot; |
| HTML_SRCSET | &quot;html-srcset&quot; |
| HTML_STRIKE | &quot;html-strike&quot; |
| HTML_STRONG | &quot;html-strong&quot; |
| HTML_STYLE | &quot;html-style&quot; |
| HTML_SVG | &quot;html-svg&quot; |
| HTML_TABLE | &quot;html-table&quot; |
| HTML_TARGET | &quot;html-target&quot; |
| HTML_TEXTAREA | &quot;html-textarea&quot; |
| HTML_VALIGN | &quot;html-valign&quot; |
| HTML_VIDEO | &quot;html-video&quot; |
| HTML_WBR | &quot;html-wbr&quot; |
| HTML_WIDTH | &quot;html-width&quot; |
| IMAGE_AVIF | &quot;image-avif&quot; |
| IMAGE_BASE64 | &quot;image-base64&quot; |
| IMAGE_BMP | &quot;image-bmp&quot; |
| IMAGE_GIF | &quot;image-gif&quot; |
| IMAGE_ICO | &quot;image-ico&quot; |
| IMAGE_JPG | &quot;image-jpg&quot; |
| IMAGE_PNG | &quot;image-png&quot; |
| IMAGE_SVG | &quot;image-svg&quot; |
| IMAGE_WEBP | &quot;image-webp&quot; |
| UNSUPPORTED | &quot;unsupported&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| CSS | &quot;css&quot; |
| HTML | &quot;html&quot; |
| IMAGE | &quot;image&quot; |
| OTHERS | &quot;others&quot; |



## Enum: Set&lt;StatusesEnum&gt;

| Name | Value |
|---- | -----|
| SUPPORTED | &quot;SUPPORTED&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| NOT_SUPPORTED | &quot;NOT_SUPPORTED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



