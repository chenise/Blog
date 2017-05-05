<#include "page.ftl">
<@page title="journalList" js=[] css=[]>
<table class="table">
  <thead>
    <tr>
      <th>
        Title
      </th>
      <th>
        PublishTime
      </th>
      <th>
        Author
      </th>
    </tr>
  </thead>
  <tbody>
  <#if resultList??>
    <#list resultList as journal>
      <tr>
        <td>
        <a href="readjournal?journal.journalId=${journal.journalId}">${journal.title}</a>
        </td>
        <td>
          ${journal.publishTime}
        </td>
        <td>
          ${journal.author.name}
        </td>
      </tr>
    </#list>
  </#if>
</tbody>
</table>
</@page>
