package com.ali.user.mobile.rpc.vo.mobilegw.login;

import com.squareup.wire.ProtoEnum;

public enum LoginWthPwd implements ProtoEnum
{
	withpwd("withpwd", 0, 1),
	without("without", 1, 2),
	withtoken("withtoken", 2, 3),
	withinnertoken("withinnertoken", 3, 4),
	withmobilepwd("withmobilepwd", 4, 5),
	withsso("withsso", 5, 6),
	withsndpwd("withsndpwd", 6, 7),
	withchecktoken("withchecktoken", 7, 8),
	withface("withface", 8, 9),
	withmsg("withmsg", 9, 10),
	withlogintoken("withlogintoken", 10, 11),
	afterreg("afterreg", 11, 12),
	withauthtoken("withauthtoken", 12, 13),
	withtbsso("withtbsso", 13, 14),
	withonekeytoken("withonekeytoken", 14, 15),
	withsndmsg("withsndmsg", 15, 16),
	withopenauthtoken("withopenauthtoken", 16, 17),
	withcode("withcode", 17, 18);


	private int	value;
	private LoginWthPwd(String arg1, int arg2, int arg3) {
		this.value = arg3;
	}
	@Override
	public int getValue()
	{
		// TODO Auto-generated method stub
		return this.value;
	}

}
