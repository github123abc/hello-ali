package com.ali.user.mobile.rpc.vo.mobilegw.login;

import com.squareup.wire.ProtoEnum;

public enum LoginType implements ProtoEnum
{

	alipay("alipay", 0, 1),
	taobao("taobao", 1, 2);
	private String	s;
	private int	a;
	private int	b;
	private int value;
	LoginType(String s,int a,int value)
	{
		this.s = s;
		this.a = a;
		this.value = value;
	}
	@Override
	public int getValue()
	{
		return this.value;
	}

}
