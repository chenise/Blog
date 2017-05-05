<#include "page.ftl">
<@page page title="" js=[] css=[]>


<div class="journal">
  <div class="title">
    <h1>${(journal.title)?defailt("no_title")}</h1>
  </div>
  <div class="journal-content">
    ${(journal.content)?default("no_content")}

  </div>

</div>

</@page>
