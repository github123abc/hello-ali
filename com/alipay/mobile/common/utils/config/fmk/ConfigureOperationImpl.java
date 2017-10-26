package com.alipay.mobile.common.utils.config.fmk;

import java.util.Map;

public class ConfigureOperationImpl
{
	  private Map a;
	  
	  public int getIntValue(ConfigureItem arg2) {
	        return this.getIntValue(arg2, arg2.getIntValue());
	    }
	  
	  public int getIntValue(ConfigureItem arg3, int arg4) {
	        Object v0 = this.a.get(arg3.getConfigName());
	        //if(!TextUtils.isEmpty(((CharSequence)v0))) {
	            try {
	                arg4 = Integer.parseInt(((String)v0));
	            }
	            catch(NumberFormatException v0_1) {
	            }
	      //  }

	        return arg4;
	    }
}
