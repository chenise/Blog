<#compress>
  <#macro baseMacro base_title base_js=[] base_css=[]>
    <#assign  static_css_path="">
    <#assign  static_js_path="">

  <!DOCTYPE html>
  <html lang="zh-CN">
    <head>
      <meta charset="utf-8">
      <title>${base_title}</title>

      <!--公共css-->
    <link rel="stylesheet" href="dist/css/layout.css">

    <!--遍历传入的CSS-->
    <#if base_css??>
     <#list base_css as c>
        <link rel="stylesheet" href="${static_css_path}${c}">
     </#list>
    </#if>

    </head>
    <body>
      <div class="container">
          <#include "nav.ftl">

          <#nested>


          <#include "footer.ftl">

      </div>

    </body>

<!--公共js
    //  <script src="http://apps.bdimg.com/libs/jquery/1.11.3/jquery.min.js"></script>
//遍历公共js  -->
  <#if base_js??>
   <#list base_js as j>
    <script src="${static_js_path}${j}"></script>
   </#list>
  </#if>
</html>











  </#macro>
</#compress>
