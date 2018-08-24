<div>
<#if lamas??>
    <h3>
        Lamas in our network:
    </h3>


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
            <img width="100" src="../../${lama.photoURL}"/>
        </li>
    </#if>
</ul>
       </#items>
   </#list></#if>
</div>