<#include "page.ftl">
<@page title="${journal.title}" js=[] css=[]>


<div class="journal">
  <div class="title">
    <h1>${(journal.title)?default("no_title")}</h1>
    <span>
      作者:${(journal.author.name)?default("Anonymous")}
    </span>
  </div>
  <div class="journal-content">
    ${(journal.content)?default("no_content")}

  </div>

</div>

</@page>
