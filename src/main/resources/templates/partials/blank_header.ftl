<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  <link rel="shortcut icon" href="${constants["app.static-url"]}favicon.ico" type="image/x-icon">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta charset="UTF-8">
	<title>${title}</title>
  <#if csss?has_content>
    <#list csss as css>
      <link rel="stylesheet" type="text/css" href="${constants["app.static-url"]}${css}.css"/>
    </#list>
  </#if>
  <script type="text/javascript">
    const BASE_URL = "${constants["app.base-url"]}";
    const STATIC_URL = "${constants["app.static-url"]}";
  </script>
<body>
