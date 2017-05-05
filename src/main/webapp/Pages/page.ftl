<#macro page title js=[] css=[]>
<#include "baseMacro.ftl">
  <@baseMacro base_title=title base_js=js base_css=css>

  <div>
    <div class="row">
      <div class="content">

        <#nested>

      </div>

    </div>

  </div>


</@baseMacro>
</#macro>
