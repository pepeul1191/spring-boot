  <#if jss?has_content>
    <#list jss as js>
      <script type='text/javascript' src="${constants["app.static-url"]}${js}.js"></script>
    </#list>
  </#if>
  <script>
    console.log('XD');
  </script>
  </body>
</html>