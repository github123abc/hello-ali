package com.alipay.mobile.common.transport.ext;

import java.lang.reflect.Type;

import sun.misc.BASE64Encoder;

import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class ProtobufCodecImpl implements ProtobufCodec
{
	public ProtobufCodecImpl() {
        super();
    }
	
	 private static String a(byte[] arg4) {
	        String v0 = "";
	        try {
	            if(arg4.length > TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.EXPORT_RES_DATA_LIMIT)) {
	                return "";
	            }

	            //v0 = Base64.encodeToString(arg4, 11);
	            v0=new BASE64Encoder().encode(arg4);
	        }
	        catch(Throwable v1) {
	           // LogCatUtil.warn("ProtobufCodec", "exportBase64RawResp fail", v1);
	        }

	        return v0;
	    }

	@Override
	public Object deserialize(Type arg8, byte[] arg9) {
        if(arg8 == null) {
            throw new IllegalArgumentException("type maybe null.");
        }

        if(!(arg8 instanceof Class)) {
            throw new IllegalArgumentException("type is not Class Type.");
        }

        try {
            return new Wire(new Class[0]).parseFrom(arg9,(Class)arg8);
        }
        catch(Throwable v1) {
            Throwable v2 = v1;
            String v1_1 = ProtobufCodecImpl.a(arg9);
            String v3 = "ProtobufCodec";
            StringBuilder v4 = new StringBuilder("deserialize fail. type is ").append(arg8.toString()).append(", ");
            //v1_1 = !TextUtils.isEmpty(((CharSequence)v1_1)) ? "pb data:[" + v1_1 + "]" : "";
            //LogCatUtil.error(v3, v4.append(v1_1).toString(), v2);
            throw new RuntimeException(v2);
        }
    }

	@Override
	public boolean isPBBean(Class arg5) {
        boolean v0_1;
        try {
            v0_1 = Message.class.isAssignableFrom(arg5);
        }
        catch(Throwable v0) {
            //LogCatUtil.warn("ProtobufCodec", "isPBBean class " + v0.toString());
            v0_1 = false;
        }

        return v0_1;
    }

	@Override
	 public boolean isPBBean(Object arg2) {
        return arg2 instanceof Message;
    }

	@Override
	public byte[] serialize(Object arg2) {
        byte[] v0 = (arg2 instanceof Message) ? ((Message)arg2).toByteArray() : null;
        return v0;
    }

	@Override
	 public String toString(Object arg2) {
        return "";
    }

}
