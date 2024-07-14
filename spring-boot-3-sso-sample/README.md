# spring-boot-3-sso-sample

## get start

> Login username: cxhello password: 123456 
> 
> Basic Auth username: oidc-client password: secret

## get code

> http://localhost:8083/oauth2/authorize?response_type=code&client_id=oidc-client&scope=profile%20openid&redirect_uri=https://cxhello.top
> 
> https://cxhello.top/?code=g8gDApzIrW_RthbIDDQ6KdN9aqdDHDQGyUdmcphudyqzBcx5uKyZaZmtaV-4jllGZtm7-ukomeB0OMSPREGpNcAS65ib7Jtsq2MqabIRqTF3xbTPSPCfzvNp-49ApRgx

## get token

```shell
curl -X POST --location 'http://localhost:8083/oauth2/token' \
--header 'Authorization: Basic b2lkYy1jbGllbnQ6c2VjcmV0' \
--form 'grant_type="authorization_code"' \
--form 'code="g8gDApzIrW_RthbIDDQ6KdN9aqdDHDQGyUdmcphudyqzBcx5uKyZaZmtaV-4jllGZtm7-ukomeB0OMSPREGpNcAS65ib7Jtsq2MqabIRqTF3xbTPSPCfzvNp-49ApRgx"' \
--form 'redirect_uri="https://cxhello.top"'
```