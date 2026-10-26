

# SendEmailBodyPart

Email body alternatives for a multipart MIME message, in the supplied order. A non-empty list overrides body and template; each part's contentType determines its format independently of isHTML. Template variables apply to each part. Null or an empty list uses the normal body/template behavior. Tracking pixels are added only to text/html alternatives.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentType** | **String** |  |  |
|**contentBody** | **String** |  |  |



