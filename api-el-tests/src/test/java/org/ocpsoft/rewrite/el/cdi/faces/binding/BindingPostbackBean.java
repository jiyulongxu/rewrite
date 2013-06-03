package org.ocpsoft.rewrite.el.cdi.faces.binding;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.Parameter;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;

@Named
@RequestScoped
@Join(path = "/binding/{value}/", to = "/faces/binding.xhtml")
public class BindingPostbackBean
{

   @Parameter("value")
   @Deferred
   private String valueDefault;

   @Parameter("value")
   @Deferred
   @IgnorePostback
   private String valueIgnorePostback;

   public String getValueDefault()
   {
      return valueDefault;
   }

   public void setValueDefault(String valueDefault)
   {
      this.valueDefault = valueDefault;
   }

   public String getValueIgnorePostback()
   {
      return valueIgnorePostback;
   }

   public void setValueIgnorePostback(String valueIgnorePostback)
   {
      this.valueIgnorePostback = valueIgnorePostback;
   }

}
