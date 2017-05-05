<#include "baseMacro.ftl">
<@baseMacro base_title="登陆" >



      <div class="xxx">
        <form  method="post" action="checkLogin">
          <div class="form-group">
            <div class="form-text">
              username
            </div>
              <input type="text" class="form-wrap" name="user.name">
            <div class="form-text">
              password
            </div>

              <input type="password" class="form-wrap" id="inputPassword3" name="user.password" placeholder="">

            <button type="submit" class="btn  btn-primary">登陆</button>

          </div>


        </form>

      </div>
</@baseMacro>
