

# AnalyzeDmarcReportResults

Aggregate analysis results for an uploaded DMARC XML report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**DmarcReportMetadata**](DmarcReportMetadata) |  |  |
|**recordCount** | **Integer** |  |  |
|**totalMessages** | **Integer** |  |  |
|**rejectCount** | **Integer** |  |  |
|**quarantineCount** | **Integer** |  |  |
|**noneCount** | **Integer** |  |  |
|**dkimAlignedCount** | **Integer** |  |  |
|**spfAlignedCount** | **Integer** |  |  |
|**fullyAlignedCount** | **Integer** |  |  |
|**failedAlignmentCount** | **Integer** |  |  |
|**topSources** | [**List&lt;DmarcReportSourceSummary&gt;**](DmarcReportSourceSummary) |  |  |
|**warnings** | **List&lt;String&gt;** |  |  |
|**errors** | **List&lt;String&gt;** |  |  |



