package com.alipay.rdssecuritysdk.v3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RdsRequestMessage extends Message
{
	 public static final String DEFAULT_EXTRA1 = "";
	    public static final String DEFAULT_EXTRA2 = "";
	    public static final String DEFAULT_EXTRA3 = "";
	    public static final String DEFAULT_EXTRA4 = "";
	    public static final String DEFAULT_EXTRA5 = "";
	    public static final int TAG_EXTRA1 = 4;
	    public static final int TAG_EXTRA2 = 5;
	    public static final int TAG_EXTRA3 = 6;
	    public static final int TAG_EXTRA4 = 7;
	    public static final int TAG_EXTRA5 = 8;
	    public static final int TAG_NATIVE = 1;
	    public static final int TAG_SDK = 2;
	    public static final int TAG_TAOBAO = 3;
	    @ProtoField(tag=1) public RdsRequestMessage$Native _native;
	    @ProtoField(tag=4, type=Message.Datatype.STRING) public String extra1;
	    @ProtoField(tag=5, type=Message.Datatype.STRING) public String extra2;
	    @ProtoField(tag=6, type=Message.Datatype.STRING) public String extra3;
	    @ProtoField(tag=7, type=Message.Datatype.STRING) public String extra4;
	    @ProtoField(tag=8, type=Message.Datatype.STRING) public String extra5;
	    @ProtoField(tag=2) public RdsRequestMessage$Sdk sdk;
	    @ProtoField(tag=3) public RdsRequestMessage$Taobao taobao;

	    public RdsRequestMessage() {
	        super();
	    }

	    public RdsRequestMessage(RdsRequestMessage arg2) {
	        if(arg2 != null) {
	            this._native = arg2._native;
	            this.sdk = arg2.sdk;
	            this.taobao = arg2.taobao;
	            this.extra1 = arg2.extra1;
	            this.extra2 = arg2.extra2;
	            this.extra3 = arg2.extra3;
	            this.extra4 = arg2.extra4;
	            this.extra5 = arg2.extra5;
	        }

	        if(Boolean.FALSE.booleanValue()) {
	            //ClassVerifier.class.toString();
	        }
	    }

	    public final boolean equals(Object arg5) {
	        boolean v0 = true;
	        if((((RdsRequestMessage)arg5)) != this) {
	            if(!(arg5 instanceof RdsRequestMessage)) {
	                v0 = false;
	            }
	            else {
	                if((this.equals(this._native, ((RdsRequestMessage)arg5)._native)) && (this.equals(this
	                        .sdk, ((RdsRequestMessage)arg5).sdk)) && (this.equals(this.taobao, ((RdsRequestMessage)
	                        arg5).taobao)) && (this.equals(this.extra1, ((RdsRequestMessage)arg5).extra1))
	                         && (this.equals(this.extra2, ((RdsRequestMessage)arg5).extra2)) && (this.equals(
	                        this.extra3, ((RdsRequestMessage)arg5).extra3)) && (this.equals(this.extra4, ((
	                        RdsRequestMessage)arg5).extra4)) && (this.equals(this.extra5, ((RdsRequestMessage)
	                        arg5).extra5))) {
	                    return v0;
	                }

	                v0 = false;
	            }
	        }

	        return v0;
	    }

	    public final RdsRequestMessage fillTagValue(int arg1, Object arg2) {
	        switch(arg1) {
	            case 1: {
	                this._native = ((RdsRequestMessage$Native)arg2);
	                break;
	            }
	            case 2: {
	                this.sdk = ((RdsRequestMessage$Sdk)arg2);
	                break;
	            }
	            case 3: {
	                this.taobao = ((RdsRequestMessage$Taobao)arg2);
	                break;
	            }
	            case 4: {
	                this.extra1 = ((String)arg2);
	                break;
	            }
	            case 5: {
	                this.extra2 = ((String)arg2);
	                break;
	            }
	            case 6: {
	                this.extra3 = ((String)arg2);
	                break;
	            }
	            case 7: {
	                this.extra4 = ((String)arg2);
	                break;
	            }
	            case 8: {
	                this.extra5 = ((String)arg2);
	                break;
	            }
	        }

	        return this;
	    }

	    public final int hashCode() {
	        int v1 = 0;
	        int v0 = this.hashCode;
	        if(v0 == 0) {
	            v0 = this._native != null ? this._native.hashCode() : 0;
	            int v2 = v0 * 37;
	            v0 = this.sdk != null ? this.sdk.hashCode() : 0;
	            v2 = (v0 + v2) * 37;
	            v0 = this.taobao != null ? this.taobao.hashCode() : 0;
	            v2 = (v0 + v2) * 37;
	            v0 = this.extra1 != null ? this.extra1.hashCode() : 0;
	            v2 = (v0 + v2) * 37;
	            v0 = this.extra2 != null ? this.extra2.hashCode() : 0;
	            v2 = (v0 + v2) * 37;
	            v0 = this.extra3 != null ? this.extra3.hashCode() : 0;
	            v2 = (v0 + v2) * 37;
	            v0 = this.extra4 != null ? this.extra4.hashCode() : 0;
	            v0 = (v0 + v2) * 37;
	            if(this.extra5 != null) {
	                v1 = this.extra5.hashCode();
	            }

	            v0 += v1;
	            this.hashCode = v0;
	        }

	        return v0;
	    }
}
