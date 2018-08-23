<div>
<#if lamas??>
    <h1>
        Lista lam:
    </h1>


   <#list lamas>
       <#items as lama>
<ul>
    <li>Lama Name: ${lama.name}
    </li>
     <#if (lama.dateOfBirth)??>
         <li>
             ${lama.dateOfBirth}
         </li>
     </#if>
    <#if (lama.photoURL)??>
        <li>
            <img width="200" src=" ${lama.photoURL}"/>
        </li>
    </#if>
</ul>
       </#items>
   </#list></#if>
</div>