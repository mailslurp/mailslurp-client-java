

# AttachmentMetaData

Meta data associated with an attachment. Attachments are stored as byte blobs so the meta data is stored separately.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of attachment if given |  |
|**contentType** | **String** | Content type of attachment such as &#x60;image/png&#x60; |  |
|**contentLength** | **Long** | Size of attachment in bytes |  |
|**id** | **String** | ID of attachment. Can be used to with attachment controller endpoints to download attachment or with sending methods to attach to an email. |  |
|**contentId** | **String** | CID of attachment |  [optional] |



