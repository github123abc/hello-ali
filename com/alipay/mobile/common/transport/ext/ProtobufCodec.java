package com.alipay.mobile.common.transport.ext;
import java.lang.reflect.Type;

public interface ProtobufCodec
{
	Object deserialize(Type arg1, byte[] arg2);

    boolean isPBBean(Object arg1);

    boolean isPBBean(Class arg1);

    byte[] serialize(Object arg1);

    String toString(Object arg1);

}
