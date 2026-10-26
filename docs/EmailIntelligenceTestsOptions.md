

# EmailIntelligenceTestsOptions

Optional test toggles for email intelligence scoring.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkRandomLocalPart** | **Boolean** | Check local-part randomness for email inputs. |  [optional] |
|**checkFreeProvider** | **Boolean** | Check if domain is a known free email provider. |  [optional] |
|**checkHttpsWebsite** | **Boolean** | Check if the domain has a reachable HTTPS website. |  [optional] |
|**checkDns** | **Boolean** | Check DNS records (A, MX, SOA) for the domain. |  [optional] |
|**checkDomainAgeHint** | **Boolean** | Derive a domain age hint from DNS SOA serial when possible. |  [optional] |



